package task_5;

import task_2.Item;
import task_4.Order;

import java.util.HashMap;

public class OrderManager
{
    private Integer tableNumber;
    private HashMap<String, Order> orders;

    OrderManager(Integer tableNumber)
    {
        this.tableNumber=tableNumber;
        orders=new HashMap<String, Order>();
    }

    /*
    −перегрузка метода добавления заказа.
    В качестве параметров принимает строку – адрес и ссылку на заказ.
     */
    public void addOrder(String address, Order order){
        orders.put(address, order);
    }

    /*
    −перегрузка метода получения заказа.
     В качестве параметра принимает строку – адрес.
     */
    public Order getOrder(String address){
        return orders.get(address);
    }

    /*
    −перегрузка метода удаления заказа.
    В качестве параметра принимает строку – адрес заказа.
     */
    public void removeOrder(String address){
        orders.remove(address);
    }

    /*
    −перегрузка метода добавления позиции к заказу.
    В качестве параметра принимает адрес и Item.
     */
    public void addItemToOrder(String address, Item item){
        getOrder(address).addItem(item);
    }

    /*
    −возвращающий массив имеющихся на данный момент интернет-заказов.
     */
    public Order [] getOrdersArray(){
        //Order [] ordersArray = new Order[orders.size()];
        return orders.values().toArray(new Order[0]);

    }

    /*
    −возвращающий суммарную сумму имеющихся на данный момент интернет-заказов.
     */
    public double getOrdersTotal(){
        double total=0.0;

        Order[] ordersArray=getOrdersArray();
        for(int i=0;i<orders.size(); i++    ){
            total+=ordersArray[i].getOrderCost();
        }
        return total;
    }

    /*
    −возвращающий общее среди всех интернет-
    заказов количество заказанных порций заданного блюда по его имени.
    Принимает имя блюда в качестве параметра.
    Методы должны работать с интерфейсными ссылками Order и Item.
     */
    public int getItemCountByNameTotal(String name){
        int count=0;
        Order[] ordersArray=getOrdersArray();
        for(int i=0;i<orders.size(); i++    ){
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
