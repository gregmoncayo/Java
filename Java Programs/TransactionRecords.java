import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="transactionRecords")
public class TransactionRecords
{
    // stores TransactionRecord objects
    @XmlElement(name="transactionRecord")
    
    public List<transactionRecord> T = new ArrayList<>();
    
    public List<transactionRecord> getTransactionRecords()
    {
        return T;
    }
    
    public void setTransactionRecords(List<transactionRecord> T)
    {
        this.T = T;
    }
    
    
}
