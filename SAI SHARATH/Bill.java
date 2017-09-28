import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Bill {
	
	Order order;
	Item items;
	List<Item> mainCourse;

	List<Item> deserts;

	List<Item> starters;

	
	public Bill(Order order, List<Item> mainCourse, List<Item> deserts,
			List<Item> starters) {
		super();
		this.order = order;
		this.mainCourse = mainCourse;
		this.deserts = deserts;
		this.starters = starters;
	}


	public double getBill()
	{
		int quantity=0;
		double price=0.0;
		double totalBill =0;
		List<Item> OrderItems=order.getOrderItems();
		
	

		while(( OrderItems)!=null)
			for(int i=0;i<OrderItems.size();i++)
		{
	
			//Item item=(Item)itr.next();								
			//System.out.println(item.getItemId()+"\t"+item.getItemName()+	"\t"+item.getItemCost());
			System.out.println("inside bill inside iterator");
			quantity= items.getQuantity();
			price=items.getItemCost();
			totalBill = quantity*price;
	
		}
		
		System.out.println("The totalbill is"+totalBill);
		return totalBill;

		
//		double totalBill = 0;
//		
//		quantity=item.getQuantity();
//		price=item.getItemCost();
//		
//		totalBill=quantity*price;
//		
		
		
		
	}

}
