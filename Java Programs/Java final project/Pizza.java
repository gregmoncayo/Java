public class Pizza extends restaurant
{
    private char size;
    private String soda;
    private int quanitity;
    
    public Pizza()
    {
        size = '\n';
        soda = "\n";
        quanitity = 0;
        food = "\n";
        location = "\n";
    }
    
    public Pizza(char size, String soda, int quanitity, double price, String food, String location)
    {
        this.size = size;
        this.soda = soda;
        this.quanitity = quanitity;
        this.price = price;
        this.food = food;
        this.location = location;
    }
    
    public double GetPrice()
    {
        return price;
    }
    
    public String GetFood()
    {
        return food;
    }
    
    public String GetLocation()
    {
        return location;
    }
    
    public char GetSize()
    {
        return size;
    }
    
    public String GetSoda()
    {
        return soda;
    }
    
    public int GetQuanitity()
    {
        return quanitity;
    }
    
    public void SetSize(char size)
    {
        this.size = size;
    }
    
    public void SetSoda(String soda)
    {
        this.soda = soda;
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
        System.out.println("NY Pizza order summary: ");
        System.out.println("---------------------------");
        System.out.printf("%sOrder: %s", food);
        System.out.printf("\n%sSize: ", size);
        System.out.printf("\n%sDrink: %s", soda);
        System.out.printf("\n%sQuanitity: %d", quanitity);
        System.out.printf("\n%sPrice: $%.2f", price);
        System.out.printf("%sLocation: %s", location);
    }
}
