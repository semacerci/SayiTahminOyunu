package oyun;

import java.util.Random;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scr = new Scanner(System.in);
		int bulunacakSayi = rnd.nextInt(100);
		System.out.println("0 ile 100 arasýnda sayý tahmin oyunu baþlýyooooo.");
		for (int i = 0; i < 10; i++) {
			System.out.println("Tahmin Et");
			int deger = scr.nextInt();
			int tahminSayisi = i + 1;
			if (deger < 0 || deger > 100) {
				System.out.println("1 HAKKINI KAYBETTÝN. KALAN TAHMÝN: " + String.valueOf(10-tahminSayisi));
				continue;
			}else if(tahminSayisi==0) {
				System.out.println("buraya kadarmýþ!");
			}

			if (bulunacakSayi > deger) {
				System.out.println("IIIh Çýk. Kaldý: " + String.valueOf(10-tahminSayisi));
			} else if (bulunacakSayi < deger) {
				System.out.println("Yok bee in biraz. Kaldý: " + String.valueOf(10-tahminSayisi));
			} else {
				System.out.println("BULDUN! Bravo " + tahminSayisi + ". tahmininde baþardýn.");
				break;
                
			}
			
		}

	}
}
