package personnages;

public class Ronin extends Humain {
	private int honneur = 1 ;
	public Ronin (String nom, String boisson, int argent , int honneur) {
		super (nom , boisson , argent);
		this.honneur = honneur;
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (10 * argent) / 100;
		beneficiaire.gagnerArgent(don);
	    parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		perdreArgent(don);
		beneficiaire.parler( don + " sous ! Je te remercie généreux donateur! ");
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2 ;
		int rep = adversaire.getReputation();
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!") ;
		if(force>= rep) {
			gagnerArgent(adversaire.getArgent());
			honneur = honneur + 1;
			parler("Je t’ai eu petit yakusa!") ;
			adversaire.perdre();
			adversaire.perdreArgent(adversaire.getArgent());
		
		} else {
			int perte = getArgent();
			argent = 0 ;
			honneur = honneur - 1 ;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(perte);
			adversaire.gagnerArgent(perte);
			
			
		}
	
		
	}
}
