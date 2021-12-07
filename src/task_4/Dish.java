package task_4;

import task_2.Item;

public final class Dish implements Item
{
    private double cost;
    private String name;
    private String description;

    Dish(String name, String description)
    {
        this.cost =0;
        this.name=name;
        this.description=description;
    }

    Dish(float price, String name, String description)
    {
        this.cost =price;
        this.name=name;
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
