package cevap1;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String password="Fatma.4885";
		String girilenSifre;
		
		System.out.println("Şifrenizi giriniz;");
		girilenSifre=scanner.next();
		
		if(girilenSifre.equals(password)) {
			System.out.println("Giriş Başarılı");
		}
		System.out.println("Giriş Başarısız..");
		
		

		scanner.close();
	}

}
