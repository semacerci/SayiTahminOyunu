package oyun;

import java.util.Random;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scr = new Scanner(System.in);
		int bulunacakSayi = rnd.nextInt(100);
		System.out.println("0 ile 100 aras�nda say� tahmin oyunu ba�l�yooooo.");
		for (int i = 0; i < 10; i++) {
			System.out.println("Tahmin Et");
			int deger = scr.nextInt();
			int tahminSayisi = i + 1;
			if (deger < 0 || deger > 100) {
				System.out.println("1 HAKKINI KAYBETT�N. KALAN TAHM�N: " + String.valueOf(10-tahminSayisi));
				continue;
			}else if(tahminSayisi==0) {
				System.out.println("buraya kadarm��!");
			}

			if (bulunacakSayi > deger) {
				System.out.println("IIIh ��k. Kald�: " + String.valueOf(10-tahminSayisi));
			} else if (bulunacakSayi < deger) {
				System.out.println("Yok bee in biraz. Kald�: " + String.valueOf(10-tahminSayisi));
			} else {
				System.out.println("BULDUN! Bravo " + tahminSayisi + ". tahmininde ba�ard�n.");
				break;
                
			}
			
		}

	}
}
