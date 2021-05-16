package za.ac.cput.assignment_2;
import java.util.Map;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
class ShoppingMapTest
{


    Map<Integer,ShoppingMap> shoppingItemsMap = new HashMap<>();

    @Test
    //Adds
    public void testAdd()
    {
for (int i = 0 ; i< 1 ; i++)
       {
        String itemName = (String) "Bread";
        int itemId = i;
        ShoppingMap Bread = new ShoppingMap(itemName,i);
        shoppingItemsMap.put(i,Bread);
        shoppingItemsMap.get(i);

       }
        assertEquals(1 ,shoppingItemsMap.size());
        System.out.println(shoppingItemsMap.toString());
    }

    //Removes
    @Test
    public void testRemove()
    {
        for(int i = 0;i<1; i++)
        {
            String itemName = "Milk";
            int itemId = i  ;

            ShoppingMap Milk =  new ShoppingMap(itemName,i);
            shoppingItemsMap.put(i,Milk);
            shoppingItemsMap.remove(i,Milk);

        }
        Assertions.assertEquals(0 ,shoppingItemsMap.size());
        System.out.println("New list of shoppingItes: " +shoppingItemsMap.size() );

    }
    
    //Searches
    @Test
    public void testSearch()
    {

        {
            String itemName = "Bread" + 1 ;
            int itemId = 1 ;
            ShoppingMap Bread = new ShoppingMap(itemName,itemId);
            shoppingItemsMap.put(1,Bread);
        }
        assertTrue(shoppingItemsMap.containsKey(1));
        System.out.println("Item found : " + shoppingItemsMap.containsKey(1));
    }
}