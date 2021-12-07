package task_2;

import java.util.HashMap;

public class TablesOrderManager
{
    private Integer tableNumber;
    private HashMap<Integer, Order> orders;

    TablesOrderManager(Integer tableNumber)
    {
        this.tableNumber=tableNumber;
        orders=new HashMap<Integer, Order>();
    }

    public void addOrder(Order newOrder)
    {
        //найти макс номер позиции, увелич на 1 и положить в пару в put
        //orderItems.put(newOrder);
        //Integer lastItemNumber = Collections.max(orderItems.keySet());
        Integer lastOrderNumber = 0;
        for(Integer key : orders.keySet())
        {
            if(key>lastOrderNumber)
            {
                lastOrderNumber = key;
            }
        }
        this.orders.put(lastOrderNumber+1, newOrder);

    }

    public void removeOrder(Integer orderNumber)
    {
        orders.remove(orderNumber);
    }
}
