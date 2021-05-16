package za.ac.cput.assignment_2;

//*  Author
//   Name         : Themba Khanyile
//   StudentNumber:217238173

public class ShoppingMap extends CollectionModel
{
    
        private String itemName;
        private int    itemId;

    public ShoppingMap(String itemName, int itemId)
    {
        this.itemName = itemName;
        this.itemId = itemId;
    }

    public static void add(ShoppingMap l) {
    }

    public static void put(ShoppingMap l) {
    }
    public static void remove(ShoppingMap l) {
    }
    public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public int getItemId() {
            return itemId;
        }

        public void setItemId(int itemId) {
            this.itemId = itemId;
        }

        @Override
        public String toString() {
            return "map{" +
                    "itemName='" + itemName + '\'' +
                    ", itemId=" + itemId +
                    '}';
        }
}

