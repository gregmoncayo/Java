import java.security.SecureRandom;
import java.io.*;
public class randomSentences
{
    private static final SecureRandom randomNum = new SecureRandom();

        public static void main(String[] args)
    {
        String[] article = new String[]{"the", "a", "one", "some", "any"};
        String[] noun = new String[]{"boy", "girl", "dog", "town", "car"};
        String[] verb = new String[]{"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = new String[]{"to", "from", "over", "under", "on"};
        StringBuilder buffer = new StringBuilder();
        int a;
        int b;
        int c;
        int d;

        for (int i = 0; i < 20; i++)
        {
            a = randomNum.nextInt(5);
            buffer.append(article[a]).append(" ");
            b = randomNum.nextInt(5);
            buffer.append(article[b]).append(" ");
            c = randomNum.nextInt(5);
            buffer.append(article[c]).append(" ");
            d = randomNum.nextInt(5);
            buffer.append(article[d]).append(".");
            buffer.setCharAt(0, Character.toUpperCase(buffer.charAt(0)));
            System.out.printf("Random Sentence: %s%n ", buffer.toString());
            buffer.delete(0, buffer.length());
        }
    }
}
