import java.util.List;


public class Order {
	
		int orderId;
		List<Item> OrderItems;
		public Order(int orderId, List<Item> orderItems) {
			super();
			this.orderId = orderId;
			OrderItems = orderItems;
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public List<Item> getOrderItems() {
			return OrderItems;
		}
		public void setOrderItems(List<Item> orderItems) {
			OrderItems = orderItems;
		}
		
			
		

}
