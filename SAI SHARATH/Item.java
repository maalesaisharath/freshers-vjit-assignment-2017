
public class Item {
		private int itemId;
		private String itemName;
		private double itemCost;
		private int quantity;
		public Item()
		{
		}
		public Item(int itemId, int quantity) {
			this.itemId = itemId;
			this.quantity = quantity;
		}
		public int getItemId() {
			return itemId;
		}
		public void setItemId(int itemId) {
			this.itemId = itemId;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public double getItemCost() {
			return itemCost;
		}
		public void setItemCost(double itemCost) {
			this.itemCost = itemCost;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
}
