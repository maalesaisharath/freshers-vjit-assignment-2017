import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Restaurant {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*List<Customer> customers=new ArrayList<Customer>();
		

		List<Item> item=new ArrayList<Item>();
		List<Host> host=new ArrayList<Host>();
		List<BusBoy> busBoys=new ArrayList<BusBoy>();
		List<Manager> manager=new ArrayList<Manager>();
		List<Server> server=new ArrayList<Server>();
		List<ExecutiveChef> executiveChef=new 	ArrayList<ExecutiveChef>();
		List<LineCook> lineCook=new ArrayList<LineCook>();
		
		List<Bill> bill=new ArrayList<Bill>();*/
		
		
		
	
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		Host host=new Host();
		/*Manager manager=new Manager();
		
		Order order=new Order();
		ExecutiveChef chef=new ExecutiveChef();*/
		
		int itemId;
		int numberOfItems;
		int quantity;
		
		//allocating table for customer
		System.out.println("Customer enters into the Restaurant");
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
			for(int i=0;i<numberOfItems;i++)
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
			Bill bill=new Bill(order,manager.getMainCourseMenu(),manager.getDesertMenu(),manager.getStartereMenu());
			bill.getBill();
			
			
			System.out.println("Enter the Feedback \n Provide your comments");
			Feedback feedBack = new Feedback();
			String comments = bufferedReader.readLine();
			feedBack.feedBackForm(comments);
			System.out.println("Thank you for providing feedback");
			
			//calling busBoy for cleaning the table
			busBoy.tableCleaning();
		}
	}
	

}
