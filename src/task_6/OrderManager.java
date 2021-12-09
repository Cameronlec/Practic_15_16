package task_6;

import task_2.Item;
import task_4.Order;

import java.util.HashMap;

public class OrderManager
{
    //private Integer tableNumber;
    private HashMap<Integer, Order> restaurantOrders;
    private HashMap<String, Order> internetOrders;

    OrderManager()
    {
//        this.tableNumber=tableNumber;
        restaurantOrders = new HashMap<Integer, Order>();
        internetOrders =new HashMap<String, Order>();
    }

    public void addOrder(Integer tableNumber, Order order) throws OrderAlreadyAddedException {
        if(restaurantOrders.containsKey(tableNumber)){
            throw new OrderAlreadyAddedException("Ошибка добавления заказа", "К данному столику уже привязан заказ");
        }

        restaurantOrders.put(tableNumber, order);
    }

    public void addOrder(String address, Order order) throws OrderAlreadyAddedException {
        if(internetOrders.containsKey(address)){
            throw new OrderAlreadyAddedException("Ошибка добавления заказа", "К данному адресу уже привязан заказ");
        }
        internetOrders.put(address, order);
    }

    public Order getOrder(String address){
        return internetOrders.get(address);
    }

    public void removeOrder(String address){
        internetOrders.remove(address);
    }

    public void addItemToOrder(String address, Item item){
        getOrder(address).addItem(item);
    }

    public Order [] getOrdersArray(){
        //Order [] ordersArray = new Order[orders.size()];
        return internetOrders.values().toArray(new Order[0]);

    }

    public double getOrdersTotal(){
        double total=0.0;

        Order[] ordersArray=getOrdersArray();
        for(int i = 0; i< internetOrders.size(); i++    ){
            total+=ordersArray[i].getOrderCost();
        }
        return total;
    }

    public int getItemCountByNameTotal(String name){
        int count=0;
        Order[] ordersArray=getOrdersArray();
        for(int i = 0; i< internetOrders.size(); i++    ){
            count+=ordersArray[i].getItemCountByName(name);
        }

        return  count;
    }


//    public void addOrder(Order newOrder)
//    {
//        //найти макс номер позиции, увелич на 1 и положить в пару в put
//        //orderItems.put(newOrder);
//        //Integer lastItemNumber = Collections.max(orderItems.keySet());
//        Integer lastOrderNumber = 0;
//        for(Integer key : orders.keySet())
//        {
//            if(key>lastOrderNumber)
//            {
//                lastOrderNumber = key;
//            }
//        }
//        this.orders.put(lastOrderNumber+1, newOrder);
//
//    }

//    public void removeOrder(Integer orderNumber)
//    {
//        orders.remove(orderNumber);
//    }
}
