import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Restaurant {

	public static void main(String[] args) {
		/*List<Customer> customers=new ArrayList<Customer>();
		

		List<Item> item=new ArrayList<Item>();
		List<Host> host=new ArrayList<Host>();
		List<BusBoy> busBoys=new ArrayList<BusBoy>();
		List<Manager> manager=new ArrayList<Manager>();
		List<Server> server=new ArrayList<Server>();
		List<ExecutiveChef> executiveChef=new 	ArrayList<ExecutiveChef>();
		List<LineCook> lineCook=new ArrayList<LineCook>();
		
		List<Bill> bill=new ArrayList<Bill>();*/
		
		
		
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Host host=new Host();
		/*Manager manager=new Manager();
		List<Item> OrderItems=new ArrayList<Item>();
		Order order=new Order();
		ExecutiveChef chef=new ExecutiveChef();*/
		
		int itemId;
		if(host.getAllocationStatus()==true)
		{
			BusBoy busBoy=new BusBoy();
			busBoy.getWater();
			manager.getMenu();
			System.out.println("Enter number of Items:");
			int numberOfItems=Integer.parseInt(br.readLine());
			for(int i=0;i<numberOfItems;i++)
			{
			System.out.println("Enter number of Items:");
			itemId=Integer.parseInt(br.readLine());	
			OrderItems.add(manager.getItem(itemId)))
			}
			order.addOrder(OrderItems);	
			
			chef.getOrder(manager.placeOrder(order));
			chef.placeOrderToLineCooks();
			manager.getBill(OrderItems);
			
					
		}
	}
		

	}

}
