package cevap5;

public class Array {

	private int size = 100;
	private int[] data;

	public Array(int newSize) {
		this.size = newSize;
		this.data = new int[this.size];
	}

	private int random() {
		return (int) (Math.random() * 110);
	}

	public int[] array() {
		for (int i = 0; i < this.size; i++) {
			this.data[i] = random();
		}

		return this.data;
	}

	public void tekcift(int[] arrayy) {

		for (int i = 0; i < this.size; i++) {
			if (this.data[i] % 2 == 0) {
				System.out.println("Çift:" + data[i]);
			}

			if (this.data[i] % 2 != 0) {
				System.out.println("Tek:" + data[i]);
			}
		}
		
	}

	public void printArray(int[] arrayPrint) {

		for (int i = 0; i < this.size; i++) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println();
	}

}
