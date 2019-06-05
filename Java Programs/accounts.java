import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="accounts")

public class accounts
{
    @XmlElement(name = "accounts")
    
    private List<Account> accounts = new ArrayList<>();
    
    public List<Account> getAccounts()
    {
        return accounts;
    }
    
    public void setAccounts(List<Account> accounts)
    {
        this.accounts = accounts;
    }
}
