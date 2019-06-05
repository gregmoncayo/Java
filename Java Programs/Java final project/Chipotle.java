public class Chipotle extends restaurant
{
    private char size;
    private String watercup;
    private int quanitity;
    
    public Chipotle()
    {
        size = '\n';
        watercup = "\n";
        quanitity = 0;
        food = "burrito";
        location = "Aspen, Colorado";
    }
    
    public Chipotle(char size, String watercup, int quanitity, double price, String food, String location)
    {
        this.size = size;
        this.watercup = watercup;
        this.quanitity = quanitity;
        this.price = price;
        this.food = food;
        this.location = location;
    }
    
    public char GetSize()
    {
        return size;
    }
    
    public String GetWaterCup()
    {
        return watercup;
    }
    
    public int GetQuanitity()
    {
        return quanitity;
    }
    
    public void SetSize(char size)
    {
        this.size = size;
    }
    
    public void SetWaterCup(String watercup)
    {
        this.watercup = watercup;
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
        System.out.println("Chipotle order summary: ");
        System.out.println("---------------------------");
        System.out.printf("\nOrder: %s", food);
        System.out.printf("\nSize: %s", size);
        System.out.printf("\nDrink: %s", watercup);
        System.out.printf("\nQuanitity: %d", quanitity);
        System.out.printf("\nPrice: $%.2f", price);
        System.out.printf("\nLocation: %s", location);
    }
}
