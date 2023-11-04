package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza (String nom, String boisson, int argent , String clan , int reputation) {
		super(nom , boisson, argent );
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public  void extorquer(Commercant victime) {
		int argentVictime = victime.getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
	    victime.seFaireExtorquer();
	    gagner(argentVictime);
	    parler("J’ai piqué les " + argentVictime + " sous de " + victime.getNom() + " ce qui me fait " + argent + " sous dans ma poche."
	    		+ " Hi ! Hi !");
	    reputation = reputation + 1;
	    
	}
	
    public int getReputation() {
		
		return reputation ;
	}

	public String getClan() {
		return clan;
	}
	
	
	public void perdre() {
		parler("J’ai perdu mon duel et mes " + getArgent() + " sous,snif... J'ai déshonoré le clan de " + getClan() );
		perdreArgent(argent);
		reputation = reputation - 1;
		
		
	}
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre" + getNom() + " du clan de " + getClan() + " ? Je l'ai dépouillé de ses " + gain + " sous.");
		gagnerArgent(gain);
		reputation = reputation + 1;
		
	}
	
	

}
