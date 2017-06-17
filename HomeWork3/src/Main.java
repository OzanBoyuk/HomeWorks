import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.oyuncu.Oyuncu;
import com.tahta.Tahta;

public class Main {

	private static Tahta tahta = null;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String yon = "";
		
		////////////////////////
		int dizi [] = new int[4]; // rastgele koordinatlar için ilk 2 indis A 2nýn koordinatý
		Random r = new Random();
		tahta = new Tahta(4,4); 
		Set<Integer> sayi = new TreeSet<Integer>();
		
		while (sayi.size() < 4) {
			sayi.add(r.nextInt(tahta.getOyuncuMatris().length));
		}
		
		Iterator<Integer> i = sayi.iterator();
		int sayac = 0;
		 while (i.hasNext()) {
		        
			dizi[sayac] = i.next();
			sayac++;
		    }
		 
		
		 //////////////////////////////// Buraya kadar oyuncularýn tahtaya random atanmasý saglandý.
		
		Oyuncu oyuncuA = new Oyuncu("A",dizi[0],dizi[1]);
		Oyuncu oyuncuB = new Oyuncu("B",dizi[2],dizi[3]);
		
		Oyuncu [] oyuncular ={oyuncuA,oyuncuB};
	
	
		tahta.setOyuncular(oyuncular);
		
		tahta.tahtayaYazdir();
		
		int sira = 1 ;
		
		while (true) {
			if (sira==1) {
				System.out.print("A oyna : yön gir->");
				 yon = sc.nextLine();
				
				
				if ( yon.equals("b")|| yon.equals("d") || yon.equals("g") || yon.equals("k")) {
				
					//oyuncuA.hareketEt(yon, tahta.getOyuncuMatris().length, tahta.getOyuncuMatris().length);
					tahta.oyunuOynat(oyuncuA,yon);
					if (tahta.oyunBittiMi()==true) {
						tahta.tahtayaYazdir();
						break;
					}
					tahta.tahtayaYazdir();
					sira = 2 ;
					
					
				}else {//geçersiz yön girilmiþse
					
					System.out.println("Geçersiz bir yön girdiniz, yerinizde kaldiniz.");
					tahta.tahtayaYazdir();
					sira=2;
					
				}
			}else if(sira==2) {
				System.out.print("B oyna : yön gir->");
				 yon = sc.nextLine();
				
				
				if ( yon.equals("b")|| yon.equals("d") || yon.equals("g") || yon.equals("k")) {
				
					//oyuncuA.hareketEt(yon, tahta.getOyuncuMatris().length, tahta.getOyuncuMatris().length);
					tahta.oyunuOynat(oyuncuB,yon);
					if (tahta.oyunBittiMi()==true) {
						tahta.tahtayaYazdir();
						break;
					}
					tahta.tahtayaYazdir();
					sira = 1 ;
					
					
				}else {//geçersiz yön girilmiþse
					
					System.out.println("Geçersiz bir yön girdiniz, yerinizde kaldiniz.");
					tahta.tahtayaYazdir();
					sira=1;
					
				}
			}
		}
		
		System.out.println("Oyun sonucu\n"+"A toplam puan = " + oyuncuA.getToplamPuan() + "\n"+
		"B toplam puan = " + oyuncuB.getToplamPuan());
	
		sc.close();
	}
	
}
