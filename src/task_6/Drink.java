package task_6;

import task_2.Item;

public final class Drink implements Item
{
    private float price;
    private String name;
    private String description;

    Drink(String name, String description)
    {
        this.price=0;
        this.name=name;
        this.description=description;
    }

    Drink(float price, String name, String description)
    {
        this.price=price;
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
        return price;
    }
}