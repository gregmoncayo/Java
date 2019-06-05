import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.security.SecureRandom;

public class insertElements
{
    public static void main(String[] args)
    {
        SecureRandom random = new SecureRandom();
        List<Integer> l = new LinkedList<>();
        
        for (int i = 0; i < 25; i++)
        {
            l.add(random.nextInt(100));
        }
        
        Collections.sort(l);
        
        System.out.printf("%s%n ", l);
    }
}
