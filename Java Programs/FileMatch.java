import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.xml.bind.JAXB;

public class FileMatch
{
    public static void main(String[] args)
    {
        CreateExampleTransFile();
        funct();
    }
    
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
    
    public static void CreateExampleTransFile()
    {
        BufferedWriter output = null;
        TransactionRecords transactionRecords = new TransactionRecords();
        TransactionRecord record = null;
        try
        {
            output = Files.newBufferedWriter(Paths.get("trans.xml"));
            record = new TransactionRecord(100, 27.14);
            transactionRecords.getTransactionRecords().add(record);
            record = new TransactionRecord(300, 62.11);
            transactionRecords.getTransactionRecords().add(record);
            record = new TransactionRecord(400, 100.56);
            transactionRecords.getTransactionRecords().add(record);
            record = new TransactionRecord(900, 82.17);
            transactionRecords.getTransactionRecords().add(record);
            JAXB.marshal(transactionRecords, output);
            output.close();
        }
        catch (IOException e)
        {
            System.err.println("Error Writing tras.xml: " + e.getMessage());
        }
    }
}
