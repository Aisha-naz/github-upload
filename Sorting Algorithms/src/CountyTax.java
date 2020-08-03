public class CountyTax
{
	private double tax;
	private String county;
	
	public CountyTax()
	{
		tax = 0;
		county = "";
	}
	
	public CountyTax(double newTax, String newCounty)
	{
		tax = newTax;
		county = newCounty;
	}
	
	public void setTax(double newTax)
	{
		tax = newTax;
	}
	
	public void setCounty(String newCounty)
	{
		county = newCounty;
	}
	
	public double getTax()
	{
		return tax;
	}
	
	public String getCounty()
	{
		return county;
	}
}