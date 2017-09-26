import java.util.*;
import java.io.BufferedReader;
import java.io.*;
public class Restaurant
{
public static void main(String args[])
{
	
	List<Customer> customers=new ArrayList<Customer>();
	

	List<Item> item=new ArrayList<Item>();
	List<Host> host=new ArrayList<Host>();
	List<BusBoy> busBoys=new ArrayList<BusBoy>();
	List<Manager> manager=new ArrayList<Manager>();
	List<Server> server=new ArrayList<Server>();
	List<ExecutiveChef> executiveChef=new 	ArrayList<ExecutiveChef>();
	List<LineCook> lineCook=new ArrayList<LineCook>();
	
	List<Bill> bill=new ArrayList<Bill>();
	Item.add("desert",1,"choco Ice cream",20);
	Item.add("desert",2,"venilla Ice cream",20);
	Item.add("starter",1,"tanduri",250);
	Item.add("starter",4,"chicken lollipop",230);
	Item.add("main course",5,"biryani",250);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	List<Host> gethost=new ArrayList<Host>();
	BusBoy busBoy=new BusBoy();
	ListManager manager=new Manager();
	List<Item> OrderItems=new ArrayList<Item>();
	Order order=new Order();
	ExecutiveChef chef=new ExecutiveChef();
	
	int itemId;
	if(host.getAllocationStatus()==true)
	{
		busBoy.getWater();
		manager.getMenu();
		System.out.println("Enter number of Items:");
		int numberOfItems=Integer.parseInt(br.readLine());
		for(int i=0;i<numberOfItems;i++)
		{
		System.out.println("Enter number of Items:");
		itemId=Integer.parseInt(br.readLine());	
		OrderItems.add(manager.getItem(itemId));
		}
		order.addOrder(OrderItems);	
		
		chef.getOrder(manager.placeOrder(order));
		chef.placeOrderToLineCooks();
		manager.getBill(OrderItems);
		
				
	}
}
	



	
		
}}