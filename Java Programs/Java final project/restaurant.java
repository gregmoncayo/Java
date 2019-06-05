public abstract class restaurant
{
    protected double price;
    protected String food;
    protected String location;
    
    public restaurant()
    {
        price = 0.0;
        food = null;
    }
    
    public restaurant(String food, double price, String location)
    {
        this.food = food;
        this.price = price;
        this.location = location;
    }
    
    public void summary()
    {
        System.out.println("Summary ");
        System.out.println("---------");
        System.out.printf("%sOrder: %s", food);
        System.out.printf("%sTotal: %.2f $", price);
        System.out.printf("%sLocation: %s", location);
    }
}


