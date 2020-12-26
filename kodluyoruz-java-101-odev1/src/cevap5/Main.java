package cevap5;

public class Main {

	public static void main(String[] args) {
		
		Array array=new Array(30);
		int [] newDizi=array.array();
		System.out.println("**********************************");
		System.out.println("Dizide ki elemanlar:");
		array.printArray(newDizi);
		System.out.println("**********************************");
		array.tekcift(newDizi);
	
		
	}

}
