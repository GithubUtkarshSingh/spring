package Com.nt.Beans;

public class FirstFlight
{
  static {
	  System.out.println("Static block of FirstFlight");
  }
  public void deliver(int oid)
  {
	  System.out.println("FirstFlight:It is the Process which is created by Main Flipcart"+oid);
  }
}
