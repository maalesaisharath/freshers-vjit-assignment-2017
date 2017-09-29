import java.util.List;


public class Manager {
	
	Menu menu=new Menu();
	
			public void getMenu()
			{
				menu.getMenu();
			}
			public void placeOrder(Order order)
			{
				ExecutiveChef executiveChef=new ExecutiveChef();
				executiveChef.placeOrder(order);
			}
			public void getBill(Order order)
			{
				double totalCost=0;
				Bill bill=new Bill(order,menu.getMainCourse(),menu.getDeserts(),menu.getStarters());
				List<Item> itemsBill=bill.getBill();
				System.out.println("*******************Bill*****************");
				System.out.println("ItemId:"+"\t"+"Item Name"+"\t"+"Quatity"+"\t"+"Cost");
				for(Item item : itemsBill)
				{
					System.out.println(item.getItemId()+"\t"+item.getItemName()+"\t"+item.getQuantity()+"\t"+item.getItemCost());
					totalCost=totalCost+item.getItemCost();
				}
				System.out.println("Total Cost:\t\t\t\t"+totalCost);
				
			}

}
