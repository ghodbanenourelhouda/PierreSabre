package histoire;

import personnages.*;


public class HistoireTP4 {
	public static void main(String[] args) {
		Humain humain = new Humain ("Prof" , "kombucha" , 54 ) ;
		humain.direBonjour();
		humain.acheter(" une boisson" , 12 );
		humain.perdreArgent(12);
		humain.boire();
		humain.acheter("un jeu" , 2);
		humain.perdreArgent(2);
		humain.acheter("un kimono", 50);
		Commercant commercant = new Commercant ("Marco", "thé" ,20);
		commercant.direBonjour();
		commercant.seFaireExtorquer();
		commercant.recevoir(15);
		commercant.boire();
		Yakuza yakuza = new Yakuza ("Yaku Le Noir ", "whisky", 30 , "Clan des Noirs" , 0);
		yakuza.direBonjour();
		Commercant victime = new Commercant ("Marco" , "thé" , 15); 
		yakuza.extorquer(victime);
		Ronin ronin = new Ronin ("Roro", "shochu", 60 , 1);
		ronin.direBonjour();
		Commercant beneficiaire = new Commercant ("Marco" , "thé" , 15);
		ronin.donner(beneficiaire);
		
	

	}

}
