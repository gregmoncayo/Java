public class ChineseFood extends restaurant
{
    private char size;
    private String tea;
    private int quanitity;
    
    public ChineseFood()
    {
        size = '\n';
        tea = "\n";
        quanitity = 0;
    }
    
    public ChineseFood(char size, String tea, int quanitity, double price, String food, String location)
    {
        this.size = size;
        this.tea = tea;
        this.quanitity = quanitity;
        this.price = price;
        this.food = food;
        this.location = location;
    }
    
    public char GetSize()
    {
        return size;
    }
    
    public String GetTea()
    {
        return tea;
    }
    
    public int GetQuanitity()
    {
        return quanitity;
    }
    
    public void SetSize(char size)
    {
        this.size = size;
    }
    
    public void SetTea(String tea)
    {
        this.tea = tea;
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
        System.out.println("Panda Express order summary: ");
        System.out.println("---------------------------");
        System.out.printf("Order: %s", food);
        System.out.printf("\nSize: %s", size);
        System.out.printf("\nDrink: %s", tea);
        System.out.printf("\nQuanitity: %d", quanitity);
        System.out.printf("\nPrice: $%.2f", price);
        System.out.printf("\nLocation: %s", location);
        System.out.println();
    }
}
