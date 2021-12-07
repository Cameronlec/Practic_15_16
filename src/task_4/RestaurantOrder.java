package task_4;

import task_2.Dish;
import task_2.Item;

import java.util.HashMap;

public class RestaurantOrder implements Order
{
    private Integer orderNumber;
    private Integer tableNumber;
    private int size;
    private Dish[] dishes;
    private boolean isClosed;
    private HashMap<Integer, Item> orderItems;

    RestaurantOrder(Integer orderNumber, Integer tableNumber)
    {
        this.orderNumber = orderNumber;
        this.tableNumber = tableNumber;
        orderItems = new HashMap<Integer, Item>();
    }

    RestaurantOrder(Integer orderNumber, Integer tableNumber, HashMap<Integer, Item> orderItems )
    {
        this.orderNumber = orderNumber;
        this.tableNumber = tableNumber;
        HashMap<Integer, Item> deepCopy = new HashMap<Integer, Item>();
        for(Integer key : orderItems.keySet())
        {
            deepCopy.put(key, orderItems.get(key));
        }
        this.orderItems = deepCopy;
    }

    public boolean add(Dish dish)
    {
        //найти макс номер позиции, увелич на 1 и положить в пару в put
        //orderItems.put(dish);
        //Integer lastItemNumber = Collections.max(orderItems.keySet());
        Integer lastItemNumber = 0;
        for(Integer key : orderItems.keySet())
        {
            if(key>lastItemNumber)
            {
                lastItemNumber = key;
            }
        }
        this.orderItems.put(lastItemNumber+1, dish);
        return true;
    }

    public boolean remove(String dishName)
    {
        orderItems.remove(dishName);
        return true;
    }

    public int removeAll(String dishName)
    {
        return 0;
    }

    public int dishQuantity()
    {
        return 0;
    }

    public int dishQuantity(String dishName)
    {
        return 0;
    }

    public Dish[] getDishes()
    {
        return new Dish[0];
    }

    public double costTotal()
    {
        return 0.0;
    }

    public String[] dishesNames()
    {
        return new String[0];
    }

    public Dish[] sortedDishesByCostDesc()
    {
        return new Dish[0];
    }

    @Override
    public boolean addItem(Item addingItem) {
        return false;
    }

    @Override
    public boolean deleteItemByName(String removingItemName) {
        return false;
    }

    @Override
    public int deleteAllItemsWithName(String itemName) {
        return 0;
    }

    @Override
    public int getItemsCount() {
        return 0;
    }

    @Override
    public Item[] getItemsArray() {
        return new Item[0];
    }

    @Override
    public double getOrderCost() {
        return 0;
    }

    @Override
    public int getItemCountByName(String itemName) {
        return 0;
    }

    @Override
    public String[] getItemsNames() {
        return new String[0];
    }

    @Override
    public Item[] getItemsArrayOrderedByCostDesc() {
        return new Item[0];
    }
}
