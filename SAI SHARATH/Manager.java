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
			public List<Item> getMainCourseMenu()
			{
				return menu.getMainCourse();
			}
			public List<Item> getStartereMenu()
			{
				return menu.getStarters();
			}
			public List<Item> getDesertMenu()
			{
				return menu.getDeserts();
			}
			
			

}
