public class hw2
{
	private String ID;

	private String Description;
	
	private int Total;

	private double Price;

	public void Set(String ID, String Description, int Total, double Price)
	{
		this.ID = ID;
		this.Description = Description;
		this.Total = Total;
		this.Price = Price;
	}

	public String GetID()
	{
		return ID;
	}

	public String GetDescript()
	{
		return Description;
	}

	public double GetPrice()
	{
		if (Price < 0.0)
            Price = 0.0;
		
		return Price;
	}

	public int GetTotal()
	{
		if (Total < 0)
		Total = 0;
		
		return Total;
	}

	public double GetInvoiceAmount()
	{
		return (Price*Total); 
	}
}
