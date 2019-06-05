public class RestaurantTest
{
    public static void main(String args[])
    {
        ChineseFood CF = new ChineseFood();
        ChineseFood C = new ChineseFood('S', "bubble tea", 2, 20.90, "Pork fried rice", "New York, New York");
        
        C.summary();
        
        Pizza P = new Pizza();
        Pizza PZ = new Pizza('M', "Sprite", 3, 15.00, "Bacon Pizza", "Chicago, IL");
        
        System.out.println();
        System.out.println("Testing out Pizza accessors!");
        System.out.printf("Type of pizza: %s", PZ.GetFood());
        System.out.println();
        System.out.printf("Pizza size: %s", PZ.GetSize());
        System.out.println();
        System.out.printf("Pizza soda: %s", PZ.GetSoda());
        System.out.println();
        System.out.printf("Pizza Quanitity: %d", PZ.GetQuanitity());
        System.out.println();
        System.out.printf("Pizza price: %.2f", PZ.GetPrice());
        System.out.println();
        System.out.printf("Pizza Location: %s", PZ.GetLocation());
        System.out.println();
        
        McDonalds M = new McDonalds();
        
        System.out.println("\nTesting McDonalds Default Constructors: ");
        M.summary();
        
        Chipotle CI = new Chipotle('S', "Apple Juice", 1, 10.50, "Burrito Bowl", "Las Vegas, Neveda");
        
        System.out.println("\nBefore testing Chipotle set functions");
        CI.summary();
        
        System.out.println("\nTesting Chipotle's set functions...");
        CI.SetSize('L');
        CI.SetWaterCup("Orange Juice");
        CI.SetQuanitity(3);
        CI.SetPrice(31.50);
        CI.SetFood("Tacos");
        CI.summary();
        System.out.println();
        
        
    }
}
