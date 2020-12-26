package cevap2;

import java.util.Scanner;

public class Hesaplama {
	public static Scanner scanner = new Scanner(System.in);

	public static void calculation(int processSelection) {

		switch (processSelection) {
		case 1:
			System.out.println("Toplama işleminizin sonucu:" + Hesaplama.collectionProcess());
			break;
		case 2:
			System.out.println("Çıkarma işleminizin sonucu:" + Hesaplama.extractionProcess1());
			break;
		case 3:
			System.out.println("Çarpma işleminizin sonucu:" + Hesaplama.multiplicationProcess());
			break;
		case 4:
			System.out.println("Bölme işleminizin sonucu:" + Hesaplama.divisionProcess());
			break;

		default:
			System.out.println("Geçersiz işlem tipi!");
			break;
		}
	}

	public static double collectionProcess() {

		System.out.println("Birinci sayıyı giriniz:");
		double sayi1 = scanner.nextDouble();
		System.out.println("İkinci sayıyı giriniz:");
		double sayi2 = scanner.nextDouble();
		double toplam = sayi1 + sayi2;
		return toplam;
	}

	public static double extractionProcess1() {

		System.out.println("Birinci sayıyı giriniz:");
		double number1 = scanner.nextDouble();
		System.out.println("İkinci sayıyı giriniz:");
		double number2 = scanner.nextDouble();
		return number1 - number2;
	}

	public static double multiplicationProcess() {

		System.out.println("Birinci sayıyı giriniz:");
		double number1 = scanner.nextDouble();
		System.out.println("İkinci sayıyı giriniz:");
		double number2 = scanner.nextDouble();
		return number1 * number2;
	}

	public static double divisionProcess() {

		try {
			System.out.println("Birinci sayıyı giriniz:");
			double dividing = scanner.nextDouble();
			System.out.println("İkinci sayıyı giriniz:");
			double divisive = scanner.nextDouble();
			return dividing / divisive;

		} catch (ArithmeticException e) {
			System.out.println("Hiçbir sayı 0 a bölünemez!!");
		}
		return 0;

	}
}
