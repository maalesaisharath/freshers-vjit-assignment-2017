import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Restaurant {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		Host host=new Host();
		int itemId;
		int numberOfItems;
		int quantity;
		String feedback;
		for(int i=0;i<6;i++)
		{
					//allocating table for customer
					System.out.println("Customer "+i+" enters into the Restaurant");
					if(host.getAllocationStatus()==true)
					{
						BusBoy busBoy=new BusBoy();
						busBoy.getWater();
						Manager manager=new Manager();
						System.out.println("Manager brings the menu");
						manager.getMenu();
						System.out.println("Enter number of Items:");
						numberOfItems=Integer.parseInt(bufferedReader.readLine());
						List<Item> OrderItems=new ArrayList<Item>();
						for(int j=0;j<numberOfItems;j++)
						{
						System.out.println("Enter the Item Id:");
						itemId=Integer.parseInt(bufferedReader.readLine());	
						System.out.println("Enter the quantity:");
						quantity=Integer.parseInt(bufferedReader.readLine());	
						OrderItems.add(new Item(itemId,quantity));
						}
						Order order=new Order(1,OrderItems);
						manager.placeOrder(order);
						Server server=new Server();
						server.serveFood();
						System.out.println("Customer requests a bill");
						manager.getBill(order);
						System.out.println("Enter the Feedback \n Provide your comments");
						Feedback feedBack = new Feedback();
						String comments = bufferedReader.readLine();
						feedBack.feedBackForm(comments);
						System.out.println("Thank you for providing feedback");
						System.out.println("Customer Pays bill");
						System.out.println("Customer leaves");
						System.out.println("Payment has registered");
						busBoy.tableCleaning();
						System.out.println("\n");
						
					}
				host.numberOfAllocatedTables--;
		}
	}
	

}
