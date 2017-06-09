import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		
		//System.out.println("sds");
		int satir = 0 ;
		
		System.out.print("Satir girin (tek sayi olsun) :");
		
		Scanner sc = new Scanner(System.in);
		satir = sc.nextInt();
		
	/*	X Harfi
	 * for (int i = satir; i > 0; i--) {
			for (int j = 0; j < satir; j++) {
				if (j== satir-i || j==i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		} */
		
		/* H harfi
		for (int i = satir; i > 0; i--) {
			for (int j = 0; j < satir ; j++) {
				
				if (i == Math.floor(satir/2)+1) {
					System.out.print("*");
				}else {
					if (j== 0 || j== satir-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		*/
		
		
		
		
	}
	
}
