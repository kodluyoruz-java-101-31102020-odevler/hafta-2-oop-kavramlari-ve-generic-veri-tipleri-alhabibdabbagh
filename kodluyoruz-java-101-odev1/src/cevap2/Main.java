package cevap2;

public class Main {

	public static void main(String[] args) {

		Print.showTransactions();
		
		System.out.println("-------------------------------------");

		int processSelection = Print.chooseTransactionType();

		Hesaplama.calculation(processSelection);

	}

}
