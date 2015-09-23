package TotalTuition;

import java.util.Scanner;

public class Tuitionbillmain {
	static Scanner inputs = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please insert your Tuition cost:");
		double tuitioncost = inputs.nextDouble();
		System.out.println("Please insert your percentage increasees for tuition as a decimal:");
		double percentin = inputs.nextDouble();
		System.out.println("Please insert your APR as a decimal:");
		double apr = inputs.nextDouble();
		System.out.println("Please insert your payment term in years:");
		double term = inputs.nextDouble();
		TuitionBill newbill = new TuitionBill(tuitioncost, percentin, apr, term);
		System.out.println("Your full tuition bill is " + (newbill.fullTuition()));

	}

}
