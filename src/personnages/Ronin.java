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
}
