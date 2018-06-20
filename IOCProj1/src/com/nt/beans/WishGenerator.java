package com.nt.beans;
import java.sql.Date;
public class WishGenerator 
{
		static{
			System.out.println("WishGenerator:static block");
		}
		
		private WishGenerator() {
			System.out.println("(private)WishGenerator:0-param constructor");
		}
		private  Date date;
		public void setDate1(Date date){
			System.out.println("WishGenerator::setDate(-)");
			this.date=date;
		}
		public String   generateWishMessage(String user){
			System.out.println("WishGenerator::generateWishMessage(-)");
			int hour=0; 
			hour=date.getHours(); 
			if(hour<=12)
				 return "GM::"+user;
			else if(hour<=16)
				return "GA::"+user;
			else if(hour<=20)
				return "GE::"+user;
			else 
				return "GN::"+user;
		}
	}