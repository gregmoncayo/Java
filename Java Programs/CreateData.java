import javax.xml.bind.JAXB;

public class CreateDate
{
    public static void funct()
    {
        BufferedWriter output = null;
        accounts a = new accounts();
        accounts record = null;
        
        try
        {
            output = Files.newBufferedWriter(Paths.get("oldmast.xml"));
            record = new Account(100, "Alan", "Jones", 348.17);
            accounts.getAccounts().add(record);
            record = new Account(300, "Mary", "Smith", 27.19);
            accounts.getAccounts().add(record);
            record = new Account(500, "Sam", "Sharp", 0.0);
            accounts.getAccounts().add(record);
            record = new Account(700, "Suzy", "Green", -14.22);
            accounts.getAccounts().add(record);
            JAXB.marshal(accounts, output);
            output.close();
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
