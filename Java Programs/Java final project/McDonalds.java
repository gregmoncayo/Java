public class McDonalds extends restaurant
{
    private char size;
    private String drink;
    private int quanitity;
    
    public McDonalds()
    {
        size = 'L';
        drink = "Sweet Tea";
        quanitity = 1;
        price = 5.20;
        food = "Big Mac";
        location = "Miami, FL";
    }
    
    public McDonalds(char size, String drink, int quanitity, double price, String food, String location)
    {
        this.size = size;
        this.drink = drink;
        this.quanitity = quanitity;
        this.price = price;
        this.food = food;
        this.location = location;
    }
    
    public char GetSize()
    {
        return size;
    }
    
    public String GetDrink()
    {
        return drink;
    }
    
    public int GetQuanitity()
    {
        return quanitity;
    }
    
    public void SetSize(char size)
    {
        this.size = size;
    }
    
    public void SetDrink(String drink)
    {
        this.drink = drink;
    }
    
    public void SetQuanitity(int quanitity)
    {
        this.quanitity = quanitity;
    }
    
    public void SetFood(String food)
    {
        this.food = food;
    }
    
    public void SetLocation(String location)
    {
        this.location = location;
    }
    
    public void SetPrice(double price)
    {
        this.price = price;
    }
    
    public void summary()
    {
        
        System.out.println("McDonald's order summary: ");
        System.out.println("---------------------------");
        System.out.printf("Order: %s", food);
        System.out.printf("\nSize: %s", size);
        System.out.printf("\nDrink: %s", drink);
        System.out.printf("\nQuanitity: %d", quanitity);
        System.out.printf("\nPrice: $%.2f", price);
        System.out.printf("\nLocation: %s", location);
        System.out.println();
    }
}
