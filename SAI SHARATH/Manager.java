
public class Manager {
	
			List<Item> item=new ArrayList<Item>();
			Item.add("desert",1,"choco Ice cream",20);
			Item.add("desert",2,"venilla Ice cream",20);
			Item.add("starter",3,"tanduri",250);
			Item.add("starter",4,"chicken lollipop",230);
			Item.add("main course",5,"biryani",250);
		
			public void getMenu()
			{
			Iterator itr=items.iterator();
			System.out.println("Deserts");	System.out.println("ItemId:"+"\t"+"Item Name"+"\t"+"Item Cost");
		
			while(itr.hasNext())
			{
		
				Item item=(Order)itr.next();
				if(item.getItemType().equals("desert"))
				{									System.out.println(item.getItemId()+"\t"+item.getItemName()+	"\t"+item.getItemCost());
				}
		
			}
			System.out.println("Starter");	System.out.println("ItemId:"+"\t"+"Item Name"+"\t"+"Item Cost");
		
			while(itr.hasNext())
			{
		
				Item item=(Order)itr.next();
				if(item.getItemType().equals("starter"))
				{									System.out.println(item.getItemId()+"\t"+item.getItemName()+	"\t"+item.getItemCost());
				}
		
			}
			System.out.println("Main Course");	System.out.println("ItemId:"+"\t"+"Item Name"+"\t"+"Item Cost");
		
			while(itr.hasNext())
			{
		
				Item item=(Order)itr.next();
				if(item.getItemType().equals("main course"))
				{									System.out.println(item.getItemId()+"\t"+item.getItemName()+	"\t"+item.getItemCost());
				}
		
			}
			}
			public Item getItem(int orderId)
			{
				Iterator itr=items.iterator();	
				Item ordereditem=null; 
		
				while(itr.hasNext())
				{
					Item item=(Order)itr.next();
					if(item.getItemId==orderId)
					{
						ordereditem=item;
						break;		
					}
				}
				return ordereditem;
			}	
			public List<Item> placeOrder(Order order)
			{
				
				
				return order.getOrder();
			}

}
