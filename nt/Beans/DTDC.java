package Com.nt.Beans;

public class DTDC 
{
	static 
	{
		System.out.println("Static block");
	}
	public void deliver(int oid)
	{
		System.out.println("DTDC:"+oid);
	}
}
