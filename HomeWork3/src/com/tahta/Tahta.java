package com.tahta;

import java.util.Random;

import com.oyuncu.Oyuncu;

public class Tahta {

	private int[][] oyuncuMatris;
	private Oyuncu[] oyuncular = null;

	public Tahta(int xDuzlemi, int yDuzlemi) {
		oyuncuMatris = new int[xDuzlemi][yDuzlemi];

		Random r = new Random();

		for (int i = 0; i < oyuncuMatris.length; i++) {
			for (int j = 0; j < oyuncuMatris.length; j++) {
				oyuncuMatris[i][j] = r.nextInt(3 * 3) + 1;
			}
		}
	}
	
	public Tahta(int xDuzlemi, int yDuzlemi,Oyuncu oyuncular []) {
		oyuncuMatris = new int[xDuzlemi][yDuzlemi];

		Random r = new Random();

		for (int i = 0; i < oyuncuMatris.length; i++) {
			for (int j = 0; j < oyuncuMatris.length; j++) {
				oyuncuMatris[i][j] = r.nextInt(3 * 3) + 1;
			}
		}
	}

	public int[][] getOyuncuMatris() {
		return oyuncuMatris;
	}

	public void setOyuncuMatris(int[][] oyuncuMatris) {
		this.oyuncuMatris = oyuncuMatris;
	}

	public Oyuncu[] getOyuncular() {
		return oyuncular;
	}

	public void setOyuncular(Oyuncu oyuncular[]) {

		this.oyuncular = oyuncular;

		for (int i = 0; i < oyuncular.length; i++) {
			int oyuncuX = oyuncular[i].getX();
			int oyuncuY = oyuncular[i].getY();
			//oyuncular[i].setX(oyuncuX); // oyuncunun X koordinatý
			//oyuncular[i].setY(oyuncuY); // oyuncunun Y koordinatý

			getOyuncuMatris()[oyuncuX][oyuncuY] = 0;

		}
	}

	public boolean oyunBittiMi() {
		int toplam = 0;

		for (int i = 0; i < getOyuncuMatris().length; i++) {
			for (int j = 0; j < getOyuncuMatris().length; j++) {
				toplam = toplam + getOyuncuMatris()[i][j];
			}

		}

		if (toplam == 0) {
			return true;
		} else {
			return false;
		}

	}

	public void oyunuOynat(Oyuncu oyuncu, String yon) {

		oyuncu.hareketEt(yon, getOyuncuMatris().length-1, getOyuncuMatris().length-1);
		int puan = getOyuncuMatris()[oyuncu.getX()][oyuncu.getY()];
		int oyuncuX = oyuncu.getX();
		int oyuncuY = oyuncu.getY();
		getOyuncuMatris()[oyuncuX][oyuncuY] = 0;
		oyuncu.puanEkle(puan);

	}

	public void tahtayaYazdir() {

		int sayac = 0;
		int oyuncuX = 0;
		int oyuncuY = 0;
		
		for (int i = 0; i < getOyuncuMatris().length; i++) {
			for (int j = 0; j < getOyuncuMatris().length; j++) {
				
				if (sayac != 2) {
					oyuncuX = oyuncular[sayac].getX();
					oyuncuY = oyuncular[sayac].getY();

				}
			
				if (oyuncuX == i && oyuncuY == j) {
					if (sayac < oyuncular.length) {
						System.out.print(oyuncular[sayac].oyuncuAdi);
						sayac++;
					} else {
						continue;
					}

				} else {
					System.out.print(getOyuncuMatris()[i][j]);
				}

			}
			System.out.println();
		}

		System.out.println();
		System.out.println(oyuncular[0].getOyuncuAdi() + ":" + oyuncular[0].getToplamPuan());
		System.out.println(oyuncular[1].getOyuncuAdi() + ":" + oyuncular[1].getToplamPuan());
	}
}
