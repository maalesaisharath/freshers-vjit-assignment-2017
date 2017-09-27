import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Menu {
	
		
			
			//main course.........
			List<Item> mainCourse=new ArrayList<Item>();
			
			//deserts.........
			List<Item> deserts=new ArrayList<Item>();
			
			//starters..
			List<Item> starters=new ArrayList<Item>();

			public void getMenu()
			{
				Item item=new Item();
				
				item.setItemId(1);
				item.setItemName("biryani");
				item.setItemCost(250);
				mainCourse.add(item);
				
				item.setItemId(2);
				item.setItemName("fried rice");
				item.setItemCost(250);
				mainCourse.add(item);
				
				item.setItemId(1);
				item.setItemName("choco Ice cream");
				item.setItemCost(20);
				deserts.add(item);
				
				item.setItemId(2);
				item.setItemName("venilla Ice cream");
				item.setItemCost(20);
				deserts.add(item);
				
				item.setItemId(1);
				item.setItemName("tanduri");
				item.setItemCost(260);
				starters.add(item);
				
				item.setItemId(2);
				item.setItemName("chicken lollipop");
				item.setItemCost(260);
				starters.add(item);
				
				getSingleMenu(mainCourse,"Main Course");
				getSingleMenu(deserts,"Deserts");
				getSingleMenu(starters,"Starters");
				
				
				
			}
			
			public void getSingleMenu(List<Item> items,String type)
			{
			
				Iterator itr=items.iterator();
				System.out.println(type);	
				System.out.println("ItemId:"+"\t"+"Item Name"+"\t"+"Item Cost");
			
				while(itr.hasNext())
				{
			
					Item item=(Item)itr.next();								
					System.out.println(item.getItemId()+"\t"+item.getItemName()+	"\t"+item.getItemCost());
			
				}

			}
			
			public List<Item> getMainCourse() {
				return mainCourse;
			}

			public List<Item> getDeserts() {
				return deserts;
			}

			public List<Item> getStarters() {
				return starters;
			}
			
			
			

}
