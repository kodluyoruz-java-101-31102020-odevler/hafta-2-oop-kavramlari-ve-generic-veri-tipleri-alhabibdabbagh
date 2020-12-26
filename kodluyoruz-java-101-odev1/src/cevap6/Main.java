package cevap6;

public class Main {

	public static void main(String[] args) {
		PDFDocument pdf=new PDFDocument("PDFDocument sınıfı nesnesi oluşturuldu..");
		WordDocument word=new WordDocument("WordDocument sınıfı nesnesi yaratıldı..");
		Printer.printPDFDocument(pdf);
		Printer.printWordDocument(word);

	}

}
