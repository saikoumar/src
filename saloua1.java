import java.util.Scanner;


public class BornEntre {
	
	
	public String nomEntree;
	
	public Distributeur distrib;
	
	
	
	public String DonnerTicket(){
	
		String ticket=distrib.creerTicket(nomEntree);
		
		return ticket;
		
		

		
		
	}


	

}
