package Com.nt.Beans;

import java.util.Arrays;
import java.util.Random;

public class Flipcart 
{
	private BlueDart bluedart;
	static
	{
		System.out.println("Static: Flipcart is a static block");
	}
	public Flipcart()
	{
		System.out.println("Flipcart:0 param constructor");
	}
	public Flipcart(BlueDart bluedart)
	{
		this.bluedart=bluedart;
		System.out.println("Flipcart:1 param Constructor");
	}
	public void setBluedart(BlueDart bluedart) 
	{
		this.bluedart = bluedart;
	}
	public void Shooping(String items[])
	{
		float billAmt= 0.0f;
		int orderId;
		billAmt=items.length*500;
		System.out.println(Arrays.toString(items)+"Bill Amount is:"+billAmt);
		orderId=new Random().nextInt(5000);
		bluedart.deliver(orderId);
		
	}

}
