import java.util.Scanner;

public  class PrdInfo{
	void prdInfo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product details:");
		System.out.println("enter product name:");
		String prdnm= sc.nextLine();
		
		System.out.println("enter product ID:");
		String prdid=sc.nextLine();
		
		System.out.println("enter product Quantity:");
		int quantity=sc.nextInt();
		
		System.out.println("enter product price:");
		float price=sc.nextFloat();

       System.out.println("enter GST:");
		int gst=sc.nextInt();
		
		float tax=(price*quantity*gst)/100;
		System.out.println("Tax price:"+tax);
		
		float final_price=(price*quantity)+tax;
		System.out.println("Final price of product will be:"+final_price);
		
		if(final_price>500)
		{
			System.out.println("product is expensive");

		}
		else {
			System.out.println("product is affordable");
			
		}

	}
	public static void main(String[] args)
	{
		PrdInfo p =new PrdInfo();
		p.prdInfo();
	}
}