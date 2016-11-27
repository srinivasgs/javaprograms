package programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class Ticketer {

	/**
	 * Create a new ticketer by setting the initial amount of available tickets.
	 * A ticket should consist of a unique string.
	 *
	 * @param initialAmountOfTickets
	 *            Number of tickets this ticketer will contain initially
	 */

	private int ticketCount = 0;

	public Ticketer(int initialAmountOfTickets) {
		ticketCount = initialAmountOfTickets;

	}

	/**
	 * Buys a certain number of tickets. If the number of available tickets is
	 * smaller than the number of tickets to buy, then all the remaining tickets
	 * are sold.
	 * <p>
	 * This method should return empty if there are no tickets available.
	 * <p>
	 *
	 * @param numberOfTickets
	 *            The number of tickets to buy
	 * @return The purchased tickets
	 */
	public Set<String> buy(int numberOfTickets) {

		Set<String> tickets = new HashSet<String>();

		if (ticketCount >= numberOfTickets) {
			while (numberOfTickets > 0) {
				String ticketId = UUID.randomUUID().toString();
				tickets.add(ticketId);
				numberOfTickets--;
				ticketCount--;
	   }

		}

		return tickets;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter number of tickets");
			if (sc.hasNextInt()) {
				int count = sc.nextInt();
				Ticketer ticObj = new Ticketer(200);
				Set<String> ticSet = ticObj.buy(count);

				if (ticSet.size() == 0)
					System.out.println("Sold out");
				else {
					for (String ticket : ticSet) {
						System.out.println("Ticket number : " + ticket);
					}
				}
			}
		} catch (Exception e) {
		} finally {
			sc.close();
		}

	}

}
