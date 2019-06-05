public class Invoice
{
	public static void main(String[] args)
	{
		hw2 Invoice = new hw2();

		Invoice.Set("1234", "Hammer", 4, 9.50);
		System.out.printf("You ordered %s, %n description is %s, %n Price is %s, %n Total is %d, %n Invoice Amount is $%.2f, %n ", Invoice.GetID(), Invoice.GetDescript(), Invoice.GetPrice(), Invoice.GetTotal(), Invoice.GetInvoiceAmount());
	}
}
