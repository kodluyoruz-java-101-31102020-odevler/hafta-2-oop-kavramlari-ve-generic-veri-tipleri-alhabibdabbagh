package cevap3;

public class Array {
	private int size = 10;
	private int[] data;

	public Array(int newSize) {
		this.size = newSize;
		this.data = new int[this.size];
	}

	public int[] arrayFill() {
		for (int i = 0; i < this.size; i++) {
			this.data[i] = random();
		}
		return this.data;
	}

	private int random() {
		return (int) (Math.random() * 100);
	}

	public void print() {

		for (int i = 0; i < this.size; i++) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println();
	}

	public double findAverage(int[] arrayAverage) {
		double toplam = 0;
		double average = 0;
		for (int i = 0; i < this.size; i++) {
			toplam += data[i];

		}
		average = toplam / this.size;

		return average;
	}

}
