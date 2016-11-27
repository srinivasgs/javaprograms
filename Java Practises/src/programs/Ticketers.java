package programs;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Ticketers {



    /**
     * Create a new ticketer by setting the initial amount of available tickets.
     * A ticket should consist of a unique string.
     *
     * @param initialAmountOfTickets Number of tickets this ticketer will contain initially
     */
	
	private int ticketCount = 0;
    public Ticketers(int initialAmountOfTickets) {
    	ticketCount = initialAmountOfTickets;

    }

    /**
     * Buys a certain number of tickets. If the number of available tickets is smaller than the
     * number of tickets to buy, then all the remaining tickets are sold.
     * <p>
     * This method should return empty if there are no tickets available.
     * <p>
     *
     * @param numberOfTickets The number of tickets to buy
     * @return The purchased tickets
     */
    public Set<String> buy(int numberOfTickets) {

    	
    	Set<String> tickets = new HashSet<String>();
    	
    	if(ticketCount >= numberOfTickets){
    		while(numberOfTickets > 0){
        		String ticketId = UUID.randomUUID().toString();
        		tickets.add(ticketId);
        		ticketCount--;
        	}
        	
    	}
    	
    	return tickets;
    }

    public static void main(){
    	Ticketers ticObj = new Ticketers(500);
    	Set<String> ticSet = ticObj.buy(3);
    	
    	System.out.println(" No of tickets : "+ ticObj);
    	
    	if(ticSet == null)
    		System.out.println("Sold out");
    	else{
    		for(String ticket:ticSet){
        		System.out.println("Ticket number : "+ticket);
        	}
    	}
    	
    }
    


}
