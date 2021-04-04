import java.util.Scanner;

public class CostumerSales {
	
	public static void main(String[] args) {
		float firstProduct;
		float secondProduct;
		float thirdProduct;
		float fourthProduct;
		float fifthProduct;
		float totalPrice;
		int percentage;
		float valueOfDiscount;
		float cost;

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Price of first product: ");
		firstProduct = reader.nextFloat();
	    
		System.out.print("Price of second product: ");
		secondProduct = reader.nextFloat();
		
		System.out.print("Price of third product: ");
		thirdProduct = reader.nextFloat();
		
		System.out.print("Price of fourth product: ");
		fourthProduct = reader.nextFloat();
		
		System.out.print("Price of fifth product: ");
		fifthProduct = reader.nextFloat();	
		
		totalPrice = firstProduct + secondProduct + thirdProduct + fourthProduct + fifthProduct;
		System.out.println("Total price of products: " + totalPrice);

		if(totalPrice >= 15 && totalPrice < 55)
			percentage = 15;
		else if (totalPrice >= 55 && totalPrice < 90)
			percentage = 25;
		else if (totalPrice >= 90)
			percentage = 27;
		else
			percentage = 0;
		
		valueOfDiscount = (totalPrice*percentage)/100;
		cost = totalPrice - valueOfDiscount;
		cost = (float) (Math.ceil(cost * 1000) / 1000);
		
		System.out.println("Sale Percentage: " + percentage);
		System.out.println("Sale Value: " + valueOfDiscount);
		System.out.println("Price with sale: " + cost);
	}


}