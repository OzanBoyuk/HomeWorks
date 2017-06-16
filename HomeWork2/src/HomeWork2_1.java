
public class HomeWork2_1 {

	public static void main(String[] args) {
		
		String metin = "Java, Sun Microsystems m�hendislerinden James Gosling taraf�ndan "+
		"geli�tirilmeye ba�lanm�� a��k kodlu, nesneye y�nelik, zeminden ba��ms�z, y�ksek verimli," +
		" �ok i�levli, y�ksek seviye, ad�m ad�m i�letilen (yorumlanan-interpreted) bir dildir."+
		"Java, Sun Microsystems'den James Gosling taraf�ndan geli�tirilen bir programlama dilidir "+
		"Sun Microsystem'in �u anda Oracle Corporation ile ba�l� ortakl��� bulunmaktad�r) ve 1995 "+
		"y�l�nda Sun Microsystems'in �ekirdek bile�eni olarak piyasaya s�r�lm��t�r. Bu dil C ve"+
		"C++'dan bir�ok s�zdizim t�retmesine ra�men bu t�revler daha basit nesne modeli ve daha"+
		"az d���k seviye olanaklar i�erir. Java uygulamalar� bilgisayar mimarisine ba�l� olmadan"+
		"herhangi bir Java Virtual Machine (JVM)'de �al��abilen tipik bytecode'dur (s�n�f dosyas�)."+
		"Java'n�n s�k kullan�lan sloganlar�ndan biri olan, �evirisi bir defa yaz, her yerde �al��t�r" +
	    "olan write once, run anywhere (WORA),[1] Java'n�n derlenmi� Java kodunun Java'y� destekleyen "+
	    "b�t�n platformlarda tekrar derlenmeye ihtiyac� olmadan �al��abilece�ini ima eder.[2] 2016 y�l�nda"+
	    "bildirilen 9 milyon geli�tiricisi ile, �zellikle istemci sunucu web uygulamalar� i�in olmak �zere,"+
	    "kullan�mda olan en pop�ler programlama dillerinden birisidir.[3][4][5][6]"+
	    "Java ilk ��kt���nda daha �ok k���k cihazlarda kullan�lmak i�in tasarlanm�� ortak bir "+
	    "d�zlem dili olarak d���n�lm��t�. Ancak d�zlem ba��ms�zl��� �zelli�i ve tekbi�im k�t�phane deste�i C ve C++'tan"+
	    "�ok daha �st�n ve g�venli bir yaz�l�m geli�tirme ve i�letme ortam� sundu�undan, hemen her yerde kullan�lmaya ba�lanm��t�r."+
	    "�u anda �zellikle kurumsal alanda ve mobil cihazlarda son derece pop�ler olan Java �zellikle J2SE 1.4 ve 5 s�r�m� ile masa�st� uygulamalarda da yayg�nla�maya ba�lam��t�r."+
	    "Java'n�n ilk s�r�m� olan Java 1.0 (1995) Java Platform 1 olarak adland�r�ld� ve tasarlama amac�na uygun olarak k���k boyutlu ve k�s�tl� �zelliklere sahipti. Daha sonra d�zlemin "+
		"g�c� g�zlendi ve tasar�m�nda b�y�k de�i�iklikler ve eklemeler yap�ld�. Bu b�y�k de�i�ikliklerden dolay� geli�tirilen yeni d�zleme Java Platform 2 ad� verildi ama s�r�m numaras�"+
		"2 yap�lmad�, 1.2 olarak devam etti. 2004 sonbahar�nda ��kan Java 5, ge�mi� 1.2, 1.3 ve 1.4 s�r�mlerinin ard�ndan en �ok geli�me ve de�i�ikli�i bar�nd�ran s�r�m oldu. Java SE 8"+
		"ise Java teknolojisinin g�n�m�z s�r�m�d�r. 13 Kas�m 2006'da"+
		"Java d�zlemi GPL ruhsat�yla a��k kodlu hale gelmi�tir.";

		String splitDizi [] = metin.split(" ");
		int kelimeSayaci = 0 ;
		
		for (int i = 0; i < splitDizi.length; i++) {
			if (splitDizi[i].toUpperCase().contains("JAVA")) {
				kelimeSayaci+=1;
			}
			System.out.println(splitDizi[i]);
		}

		System.out.println("Java kelime say�s� : "+kelimeSayaci);
		
	}
	
	

		
	
		
		








	
}

