package task_1;

public final class Drink
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

    public float getPrice() {
        return price;
    }
}
