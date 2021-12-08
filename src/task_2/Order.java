package task_2;

import java.util.Collections;
import java.util.HashMap;

public class Order
{
    private Integer orderNumber;
    private Integer tableNumber;
    private int size;
    private int capacity;

    private boolean isClosed;

    private Item[]orderItemsArray;

    Order(Integer orderNumber, Integer tableNumber)
    {
        this.orderNumber = orderNumber;
        this.tableNumber = tableNumber;

        orderItemsArray=new Item[0];
        capacity = 5;
        size = 0;
    }

    Order(Integer orderNumber, Integer tableNumber, Item[] items)
    {
        this.orderNumber = orderNumber;
        this.tableNumber = tableNumber;
        int n = items.length;
        orderItemsArray=new Item[n];
        for(int i=0; i<n; i++){
            orderItemsArray[i]=items[i];
        }
        size =n;
        capacity =n+5;

    }


    public boolean add(Item item)
    {
        if(size == capacity){
            capacity +=5;
            Item[] resizedOrderItemsArray=new Item[capacity];
            for(int i=0; i<size; i++){
                resizedOrderItemsArray[i] = orderItemsArray[i];
            }
            orderItemsArray=resizedOrderItemsArray;
        }
        orderItemsArray[size]=item;
        size++;

        return true;
    }


    public boolean remove(String itemName)
    {
        for(int i=size-1; i>0; i--){
            if( orderItemsArray[i].getName().equals(itemName)){
                for(int j=i; j<size-1; j++){
                    orderItemsArray[j]=orderItemsArray[j+1];
                }
                size--;
                return true;
            }
        }

        return false;
    }
/*
    public int removeAll(String dishName)
    {
        return 0 ;
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
        return new  Dish[0];
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
*/
}
