import java.util.ArrayList;
import java.util.List;


public class Menu {
	
		
			Item item=new Item();
			//main course.........
			List<Item> mainCourse=new ArrayList<Item>();
			
			item.setItemId(1);
			item.setItemName("biryani");
			item.setItemCost(250);
			mainCourse.add(item);
			
			item.setItemId(2);
			item.setItemName("fried rice");
			item.setItemCost(250);
			mainCourse.add(item);
		
			//deserts.........
			List<Item> deserts=new ArrayList<Item>();
			
			item.setItemId(1);
			item.setItemName("choco Ice cream");
			item.setItemCost(20);
			deserts.add(item);
			
			item.setItemId(2);
			item.setItemName("venilla Ice cream");
			item.setItemCost(20);
			deserts.add(item);
			
			//starters..
			List<Item> starters=new ArrayList<Item>();
			
			item.setItemId(1);
			item.setItemName("tanduri");
			item.setItemCost(260);
			starters.add(item);
			
			item.setItemId(1);
			item.setItemName("chicken lollipop");
			item.setItemCost(260);
			starters.add(item);
	

}
