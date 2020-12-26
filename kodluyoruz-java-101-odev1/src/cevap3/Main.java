package cevap3;

public class Main {

	public static void main(String[] args) {
		
		Array array=new Array(10);
		int[] array1=array.arrayFill();
		
		System.out.println("Dizide bulunan elemanlar \n");
		array.print();
		System.out.println("\n");
		double ortalama=array.findAverage(array1);
		System.out.println("Dizide ki sayıların ortalaması= "+ ortalama);
		

	}

}
