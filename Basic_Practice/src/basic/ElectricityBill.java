package basic;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total number of the units: ");
		int totalUnits = sc.nextInt();
		double totalAmount = 0;
		if (totalUnits <= 50) {
			totalAmount = totalUnits * 0.50;
		} else if (totalUnits <= 150) {
			totalAmount = totalUnits * 0.75;
		} else if (totalUnits <= 250) {
			totalAmount = totalUnits * 1.20;
		} else {
			totalAmount = totalUnits * 1.50;
		}
		double surCharge = 0.00;
		surCharge = totalAmount * 1.20;
		System.out.println("total amount of the bill is : " + surCharge);
	}
}
