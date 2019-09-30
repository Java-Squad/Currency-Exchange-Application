import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

interface Hai
{
	public void currency();
}

class Hello implements Hai
{
@Override
	public void currency() 
	
	{
		// TODO Auto-generated method stub
		System.out.print("Enter the amount: ");
		Scanner sc=new Scanner(System.in);
		double amount=sc.nextDouble();
		System.out.println(" ");
		System.out.println("1.US 2.INDIA 3.CANADA ");
		System.out.println(" ");
		System.out.print("Select your country: ");
		int country=sc.nextInt();
		switch(country)
		{
		case 1:
			if(country==1)
			{
			System.out.println(" ");
			System.out.println("Selected US");
			System.out.println(" “);
           System.out.println("1.CANADA 2.JAPAN 3.UK 4.CHINA 5.GERMANY 6.KOREA 7.ITALY 8.FRANCE 9.INDIA");
			System.out.println(" ");
			System.out.print("Select your country to exchnage: ");
			int n=sc.nextInt();
			System.out.println(" ");
			
			if(n==1)
			{
				try
				{
			double exchange=(amount*0.00935297);
	NumberFormat f1=NumberFormat.getCurrencyInstance(Locale.CANADA);
	String s1=f1.format(exchange);
	System.out.print("US to Canada: "+s1);
					
				}
				catch(NumberFormatException e)
				{
					System.out.println(" ");
				}
				
			}
			
			if(n==2)
			{
				try
				{
					//System.out.println("US to Japan Exchange");
					double exchange=(amount*1.31506);
	NumberFormat f2=NumberFormat.getCurrencyInstance(Locale.JAPAN);
					String s2=f2.format(exchange);
					System.out.print("US to Japan: "+s2);
					
				}
				catch(NumberFormatException e)
				{
					System.out.println(" ");
				}
				
			}
			
			if(n==3)
			{
				try
				{
					//System.out.println("US to Japan Exchange");
					double exchange=(amount*0.815267);
		NumberFormat f3=NumberFormat.getCurrencyInstance(Locale.UK);
					String s3=f3.format(exchange);
					System.out.print("US to UK: "+s3);
					
				}
				catch(NumberFormatException e)
				{
					System.out.println(" ");
				}
				
			}
			
			if(n==4)
			{
				try
				{
					//System.out.println("US to Japan Exchange");
					double exchange=(amount*0.815267);
	NumberFormat f4=NumberFormat.getCurrencyInstance(Locale.CHINESE);
					String s4=f4.format(exchange);
					System.out.print("US to CHINESE: "+s4);
					
				}
				catch(NumberFormatException e)
				{
					System.out.println(" ");
				}
				
			}
			
			if(n==5)
			{
				try
				{
					//System.out.println("US to Japan Exchange");
					double exchange=(amount*0.899831);
	NumberFormat f5=NumberFormat.getCurrencyInstance(Locale.GERMAN);
					String s5=f5.format(exchange);
					System.out.print("US to GERMANY: "+s5);
					
				}
				catch(NumberFormatException e)
				{
					System.out.println(" ");
				}
				
			}
			
			if(n==6)
			{
				try
				{
					//System.out.println("US to Japan Exchange");
					double exchange=(amount*900.03);
	     NumberFormat f6=NumberFormat.getCurrencyInstance(Locale.KOREA);
					String s6=f6.format(exchange);
					System.out.print("US to KOREA: "+s6);
					
				}
				catch(NumberFormatException e)
				{
					System.out.println(" ");
				}
				
			}
			if(n==7)
			{
				try
				{
					//System.out.println("US to Japan Exchange");
					double exchange=(amount*1742.32);
	NumberFormat f7=NumberFormat.getCurrencyInstance(Locale.ITALIAN);
					String s7=f7.format(exchange);
					System.out.print("US to ITALY: "+s7);
					
				}
				catch(NumberFormatException e)
				{
					System.out.println(" ");
				}
				
			}
			
			if(n==8)
			{
				try
				{
					//System.out.println("US to Japan Exchange");
					double exchange=(amount*0.899831);
	NumberFormat f8=NumberFormat.getCurrencyInstance(Locale.FRANCE);
					String s8=f8.format(exchange);
					System.out.print("US to FRANCE: "+s8);
					
				}
				catch(NumberFormatException e)
				{
					System.out.println(" ");
				}
			}
				if(n==9)
				{
					try
					{
						//System.out.println("US to Japan Exchange");
						double exchange=(amount*71.6816);
						Locale indialocale=new Locale("en","IN");
	         NumberFormat format2=NumberFormat.getCurrencyInstance(indialocale);
				        String india=format2.format(exchange);
						System.out.print("US to India: "+india);
						
					}
					catch(NumberFormatException e)
					{
						System.out.println(" ");
					}
			
			break;
		
				
		}
    
			}
		case 2:if(country==2)
		{
		System.out.println(" ");
		System.out.println("Selected INDIA");
		System.out.println(" ");
		System.out.println("1.CANADA 2.JAPAN 3.UK 4.CHINA 5.GERMANY 6.KOREA 7.ITALY 8.FRANCE 9.US");
		System.out.println(" ");
		System.out.print("Select your country to exchnage: ");
		int n=sc.nextInt();
		System.out.println(" ");
		
		if(n==1)
		{
			try
			{
				double exchange=(amount*54.5090);
				NumberFormat f1=NumberFormat.getCurrencyInstance(Locale.CANADA);
				String s1=f1.format(exchange);
				System.out.print("India to Canada: "+s1);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		
		if(n==2)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*1.49153);
		NumberFormat f2=NumberFormat.getCurrencyInstance(Locale.JAPAN);
				String s2=f2.format(exchange);
				System.out.print("INDIA to Japan: "+s2);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		
		if(n==3)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*0.0113775);
			NumberFormat f3=NumberFormat.getCurrencyInstance(Locale.UK);
				String s3=f3.format(exchange);
				System.out.print("INDIA to UK: "+s3);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		
		if(n==4)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*0.0992678);
		NumberFormat f4=NumberFormat.getCurrencyInstance(Locale.CHINESE);
				String s4=f4.format(exchange);
				System.out.print("INDIA to CHINESE: "+s4);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		
		if(n==5)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*0.0125428);
		NumberFormat f5=NumberFormat.getCurrencyInstance(Locale.GERMAN);
				String s5=f5.format(exchange);
				System.out.print("INDIA to GERMANY: "+s5);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		
		if(n==6)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*12.5521);
		NumberFormat f6=NumberFormat.getCurrencyInstance(Locale.KOREA);
				String s6=f6.format(exchange);
				System.out.print("INDIA to KOREA: "+s6);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		if(n==7)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*24.2863);
		NumberFormat f7=NumberFormat.getCurrencyInstance(Locale.ITALIAN);
				String s7=f7.format(exchange);
				System.out.print("INDIA to ITALY: "+s7);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		
		if(n==8)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*0.0125428);
		NumberFormat f8=NumberFormat.getCurrencyInstance(Locale.FRANCE);
				String s8=f8.format(exchange);
				System.out.print("INDIA to FRANCE: "+s8);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
		}
			if(n==9)
			{
				try
				{
					//System.out.println("US to Japan Exchange");
					double exchange=(amount*0.0139506);
                         NumberFormat format2=NumberFormat.getCurrencyInstance(Locale.US);
			        String india=format2.format(exchange);
					System.out.print("INDIA to US: "+india);
					
				}
				catch(NumberFormatException e)
				{
					System.out.println(" ");
				}
		
		break;
	
			
	}
}
	
		case 3:if(country==3)
		{
		System.out.println(" ");
		System.out.println("Selected CANADA");
		System.out.println(" “);
        System.out.println("1.INDIA 2.JAPAN 3.UK 4.CHINA 5.GERMANY 6.KOREA 7.ITALY 8.FRANCE 9.US");
		System.out.println(" ");
		System.out.print("Select your country to exchnage: ");
		int n=sc.nextInt();
		System.out.println(" ");
		
		if(n==1)
		{
			try
			{   
				double exchange=(amount*54.5090);
				Locale indialocale=new Locale("en","IN");
		     NumberFormat format2=NumberFormat.getCurrencyInstance(indialocale);
		        String india=format2.format(exchange);
				System.out.print("CANADA to INDIA: "+india);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		
		if(n==2)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*81.3020);
	NumberFormat f2=NumberFormat.getCurrencyInstance(Locale.JAPAN);
				String s2=f2.format(exchange);
				System.out.print("CANADA to JAPAN: "+s2);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		
		if(n==3)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*0.620177);
				NumberFormat f3=NumberFormat.getCurrencyInstance(Locale.UK);
				String s3=f3.format(exchange);
				System.out.print("CANADA to UK: "+s3);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		
		if(n==4)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*5.40922);
	NumberFormat f4=NumberFormat.getCurrencyInstance(Locale.CHINESE);
				String s4=f4.format(exchange);
				System.out.print("CANADA to CHINESE: "+s4);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		
		if(n==5)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*0.683332);
		NumberFormat f5=NumberFormat.getCurrencyInstance(Locale.GERMAN);
				String s5=f5.format(exchange);
				System.out.print("CANADA to GERMANY: "+s5);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		
		if(n==6)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*683.976);
		NumberFormat f6=NumberFormat.getCurrencyInstance(Locale.KOREA);
				String s6=f6.format(exchange);
				System.out.print("CANADA to KOREA: "+s6);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		if(n==7)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*1323.12);
		NumberFormat f7=NumberFormat.getCurrencyInstance(Locale.ITALIAN);
				String s7=f7.format(exchange);
				System.out.print("CANADA to ITALY: "+s7);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
			
		}
		
		if(n==8)
		{
			try
			{
				//System.out.println("US to Japan Exchange");
				double exchange=(amount*0.683332);
		NumberFormat f8=NumberFormat.getCurrencyInstance(Locale.FRANCE);
				String s8=f8.format(exchange);
				System.out.print("CANADA to FRANCE: "+s8);
				
			}
			catch(NumberFormatException e)
			{
				System.out.println(" ");
			}
		}
			if(n==9)
			{
				try
				{
					//System.out.println("US to Japan Exchange");
					double exchange=(amount*0.899831);
			        NumberFormat format2=NumberFormat.getCurrencyInstance(Locale.US);
			        String india=format2.format(exchange);
					System.out.print("CANADA to US: "+india);
					
				}
				catch(NumberFormatException e)
				{
					System.out.println(" ");
				}
		
		break;
	
			
	}
}
			

}				
}
}
public class Currency extends Hello {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("                                        Satya Currency Exchange Company Pvt.ltd");
		System.out.println("   ");
		System.out.println("************************************************************************************************************************************  ");
		System.out.println("   ");

		System.out.println("   ");
		Currency c=new Currency();
		c.currency();
		

	}

}
