import java.util.Scanner;
import java.util.ArrayList;

public class Test {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Personnage> input = new ArrayList<Personnage>();
		String classe;
		String test;
		do {
		do {
		System.out.println("Veuillez saisir une classe Guerrier ou Magicien");
		classe = sc.nextLine();
		} while (!(classe.toUpperCase().equals("GUERRIER") || classe.toUpperCase().equals("MAGICIEN")));
		if (classe.toUpperCase().equals("GUERRIER")) {
			input.add(Wawa());
		} else {
			input.add(Mago());
		}
		for(int i = 0; i<input.size(); i++) {
			System.out.println(input.get(i).getNom());
		}
		System.out.println("Voulez vous continuer ? tapez Y");
		test = sc.nextLine();
		}while(test.toUpperCase().equals("Y"));
			
	}
	public static Guerrier Wawa() {
		Guerrier X = new Guerrier();
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nom pour votre guerrier");
		X.setNom(sc.nextLine());
		do {
			System.out.println("Veuillez saisir un niveau pour votre guerrier entre 1 et 100");
			String input = sc.nextLine();
			try {	
				X.setVie(Integer.parseInt(input));
			}
			catch(NumberFormatException e)
			{
				System.out.printf("\"%s\" n'est pas valide.\n", input);
			}	           
         } while (X.getVie() > 100 || X.getVie() < 0);
		  System.out.println("Veuillez saisir une image");
          X.setImage(sc.nextLine());
          Arme A = new Arme();
          System.out.println("Veuillez saisir un nom pour votre Arme");
          A.setNom(sc.nextLine());
          do {
              System.out.println("Veuillez saisir un niveau d'attaque pour l'éppé de votre guerrier");
              String input = sc.nextLine();
              try {
                  A.setLvl(Integer.parseInt(input));
              }
              catch(NumberFormatException e)
              {
                  System.out.printf("\"%s\" n'est pas valide.\n", input);
              }
          } while (A.getLvl() < 0);
          X.setArme(A);
          System.out.println("Veuillez saisir un nom pour votre bouclier");
          X.setBouclier(sc.nextLine());
          System.out.println("Vous êtes un guerrier vous appelant " + X.getNom() + " avec un niveau de vie de " + X.getVie() + " votre éppé " + A.getNom() + " posséde un niveau de " + A.getLvl() + " et le nom de votre bouclier est " + X.getBouclier());
		return X;
		
		
	}
	public static Magicien Mago() {
		Magicien Y = new Magicien();
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nom pour votre magicien");
		Y.setNom(sc.nextLine());
		do {
			System.out.println("Veuillez saisir un niveau pour votre magicien entre 1 et 100");
			String input = sc.nextLine();
			try {	
				Y.setVie(Integer.parseInt(input));
			}
			catch(NumberFormatException e)
			{
				System.out.printf("\"%s\" n'est pas valide.\n", input);
			}	           
         } while (Y.getVie() > 100 || Y.getVie() < 0);
		  System.out.println("Veuillez saisir une image");
          Y.setImage(sc.nextLine());
          Sort B = new Sort();
          System.out.println("Veuillez saisir un nom pour votre Sort");
          B.setNom(sc.nextLine());
          do {
              System.out.println("Veuillez saisir un niveau d'attaque pour le sort de votre magicien");
              String input = sc.nextLine();
              try {
                  B.setLvl(Integer.parseInt(input));
              }
              catch(NumberFormatException e)
              {
                  System.out.printf("\"%s\" n'est pas valide.\n", input);
              }
          } while (B.getLvl() < 0);
          Y.setSort(B);
          System.out.println("Veuillez saisir un nom pour votre philtre");
          Y.setPhiltre(sc.nextLine());
          System.out.println("Vous êtes un magicien vous appelant " + Y.getNom() + " avec un niveau de vie de " + Y.getVie() + " votre sort " + B.getNom() + " posséde un niveau de " + B.getLvl() + " et le nom de votre philtre est " + Y.getPhiltre());
		
		return Y;
	}
	
}
