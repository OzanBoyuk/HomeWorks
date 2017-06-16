public class HomeWork2_2 {

	public static void main(String[] args) {

		String metin = "Java, Sun Microsystems mühendislerinden James Gosling tarafýndan "
				+ "geliþtirilmeye baþlanmýþ açýk kodlu, nesneye yönelik, zeminden baðýmsýz, yüksek verimli,"
				+ " çok iþlevli, yüksek seviye, adým adým iþletilen (yorumlanan-interpreted) bir dildir."
				+ "Java, Sun Microsystems'den James Gosling tarafýndan geliþtirilen bir programlama dilidir "
				+ "Sun Microsystem'in þu anda Oracle Corporation ile baðlý ortaklýðý bulunmaktadýr) ve 1995 "
				+ "yýlýnda Sun Microsystems'in çekirdek bileþeni olarak piyasaya sürülmüþtür. Bu dil C ve"
				+ "C++'dan birçok sözdizim türetmesine raðmen bu türevler daha basit nesne modeli ve daha"
				+ "az düþük seviye olanaklar içerir. Java uygulamalarý bilgisayar mimarisine baðlý olmadan"
				+ "herhangi bir Java Virtual Machine (JVM)'de çalýþabilen tipik bytecode'dur (sýnýf dosyasý)."
				+ "Java'nýn sýk kullanýlan sloganlarýndan biri olan, çevirisi bir defa yaz, her yerde çalýþtýr"
				+ "olan write once, run anywhere (WORA),[1] Java'nýn derlenmiþ Java kodunun Java'yý destekleyen "
				+ "bütün platformlarda tekrar derlenmeye ihtiyacý olmadan çalýþabileceðini ima eder.[2] 2016 yýlýnda"
				+ "bildirilen 9 milyon geliþtiricisi ile, özellikle istemci sunucu web uygulamalarý için olmak üzere,"
				+ "kullanýmda olan en popüler programlama dillerinden birisidir.[3][4][5][6]"
				+ "Java ilk çýktýðýnda daha çok küçük cihazlarda kullanýlmak için tasarlanmýþ ortak bir "
				+ "düzlem dili olarak düþünülmüþtü. Ancak düzlem baðýmsýzlýðý özelliði ve tekbiçim kütüphane desteði C ve C++'tan"
				+ "çok daha üstün ve güvenli bir yazýlým geliþtirme ve iþletme ortamý sunduðundan, hemen her yerde kullanýlmaya baþlanmýþtýr."
				+ "Þu anda özellikle kurumsal alanda ve mobil cihazlarda son derece popüler olan Java özellikle J2SE 1.4 ve 5 sürümü ile masaüstü uygulamalarda da yaygýnlaþmaya baþlamýþtýr."
				+ "Java'nýn ilk sürümü olan Java 1.0 (1995) Java Platform 1 olarak adlandýrýldý ve tasarlama amacýna uygun olarak küçük boyutlu ve kýsýtlý özelliklere sahipti. Daha sonra düzlemin "
				+ "gücü gözlendi ve tasarýmýnda büyük deðiþiklikler ve eklemeler yapýldý. Bu büyük deðiþikliklerden dolayý geliþtirilen yeni düzleme Java Platform 2 adý verildi ama sürüm numarasý"
				+ "2 yapýlmadý, 1.2 olarak devam etti. 2004 sonbaharýnda çýkan Java 5, geçmiþ 1.2, 1.3 ve 1.4 sürümlerinin ardýndan en çok geliþme ve deðiþikliði barýndýran sürüm oldu. Java SE 8"
				+ "ise Java teknolojisinin günümüz sürümüdür. 13 Kasým 2006'da"
				+ "Java düzlemi GPL ruhsatýyla açýk kodlu hale gelmiþtir.";

		String password = "trabzon";
		char[] diziPassword = new char[password.length()];
		String[] splitMetin;
		int index = 0;
		String subString1 = "";
		String subString2 = "";
		String temp ="";

		for (int i = 0; i < password.length(); i++) {//paraloyý karakter tipinde bir diziye aldým. Ýndis indis
													//karakterlerini okumak için

			diziPassword[i] = password.toLowerCase().charAt(i);

		}

		splitMetin = metin.split(" "); //metini bosluga göre ayýrýp bir diziye aldým

		for (int i = 0; i < splitMetin.length; i++) {//o dizide dolasýyorum
		
			for (int j = 0; j < splitMetin[i].length(); j++) {//Dizinin her elemanýný karakter karakter dolasýyorum
		
				if (index==diziPassword.length) {
					break;
				}
				
				char kelimeninKarakteri = splitMetin[i].toLowerCase().charAt(j);//o kelimenin herbir  karakteri
				
				if (diziPassword[index]==kelimeninKarakteri) {
			
					subString1 = splitMetin[i].substring(0,splitMetin[i].indexOf(splitMetin[i].toLowerCase().charAt(j)));
					subString2 = splitMetin[i].substring(splitMetin[i].indexOf(splitMetin[i].toLowerCase().charAt(j)),splitMetin[i].length());
					temp = subString1+diziPassword[index]+subString2;
					splitMetin[i] = temp;
					index++;
					
					
					
				}
				
				
				
			}
			
			

		}
		
		System.out.println("Sonuc dizi hali:");
		for (int i = 0; i < splitMetin.length; i++) {

			System.out.println(""+splitMetin[i]);

		}
		
		System.out.println("\nSonuc metin hali :");
		String sonuc="";
		for (int i = 0; i < splitMetin.length; i++) {

			sonuc = sonuc + " " +splitMetin[i];

		}
		System.out.println(sonuc);

	}

}
