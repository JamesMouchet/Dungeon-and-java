
public class Verif {
	public void test() {
		int level = -1;
		do {
			System.out.println("Veuillez saisir un niveau pour votre guerrier entre 1 et 100");
			String input = sc.nextLine();
			try {	
				level = Integer.parseInt(input);
			}
			catch(NumberFormatException e)
			{
				System.out.printf("\"%s\" n'est pas valide.\n", input);
			}	           
         } while (level > 100 || level < 0);
	}
}
