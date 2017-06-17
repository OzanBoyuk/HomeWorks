package com.oyuncu;

import com.tahta.Tahta;

public class Oyuncu {
	
	//private Tahta tahta = new Tahta(3,3);
	public String oyuncuAdi = "";
	public String getOyuncuAdi() {
		return oyuncuAdi;
	}

	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}

	private int x = 0;
	private int y = 0;
	private int toplamPuan = 0;

	public Oyuncu(String oyuncuAdi, int x, int y) {
		this.oyuncuAdi = oyuncuAdi;
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getToplamPuan() {
		return toplamPuan;
	}

	public void setToplamPuan(int toplamPuan) {
		this.toplamPuan = toplamPuan;
	}
	
	public void puanEkle(int puan)
	{
		toplamPuan = toplamPuan + puan;
	}
	
	public void hareketEt(String yon,int tahtaX,int tahtaY)
	{
		
		
		if (yon.equals("b")) {
			if (getY() == 0 ) {
				setX(getX());//yerinde kalacak
				setY(getY());
				System.out.println("Bu yöne hareket edemezsin ! Yerinde kaldýn.");
			}else {
				setX(getX());//1 br batýya
				setY(getY()-1);
			}
		}else 	if (yon.equals("d")) {
			if (getY() == tahtaY ) {//tahta nýn x veya y boyutunu verir
				setX(getX());//yerinde kalacak
				setY(getY());
				System.out.println("Bu yöne hareket edemezsin ! Yerinde kaldýn.");
			}else {
				setX(getX());//1 br batýya
				setY(getY()+1);
			}
		}if (yon.equals("k")) {
			if (getX() == 0 ) {
				setX(getX());//yerinde kalacak
				setY(getY());
				System.out.println("Bu yöne hareket edemezsin ! Yerinde kaldýn.");
			}else {
				setX(getX()-1);//1 br batýya
				setY(getY());
			}
		}else 	if (yon.equals("g")) {
			if (getX() == tahtaX ) {//tahta nýn x veya y boyutunu verir
				setX(getX());//yerinde kalacak
				setY(getY());
				System.out.println("Bu yöne hareket edemezsin ! Yerinde kaldýn.");
			}else {
				setX(getX()+1);//1 br batýya
				setY(getY());
			}
		}
		
	}
}
