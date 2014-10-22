import java.util.Scanner;


/* j'ai fait un changement ici : saloua */


public class BornEntre {
	
	
	public String nomEntree;
	
	public Distributeur distrib;
	
	
	
	public String DonnerTicket(){
	
		String ticket=distrib.creerTicket(nomEntree);
		
		return ticket;
		
		

		
		
	}


	

}
