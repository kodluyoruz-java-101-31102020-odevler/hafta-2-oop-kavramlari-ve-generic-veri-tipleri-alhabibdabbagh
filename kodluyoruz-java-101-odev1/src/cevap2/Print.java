package cevap2;

import java.util.Scanner;

public class Print {

	public static Scanner scanner = new Scanner(System.in);

	public static void showTransactions() {

		System.out.println("Yapabileceğiniz İşlemler");
		System.out.println("1- Toplama işlemi yapmak için");
		System.out.println("2- Çıkarma işlemi yapmak için");
		System.out.println("3- Çarpma işlemi yapmak için");
		System.out.println("4- Bölme işlemi yapmak için");
		System.out.println("1-2-3-4 Haricinde girilen sayılar geçersiz sayılacaktır!!");
	}

	public static int chooseTransactionType() {

		System.out.println("İşlem tipini giriniz");
		String operationChoice = scanner.nextLine();
		return Integer.parseInt(operationChoice);
	}

}
