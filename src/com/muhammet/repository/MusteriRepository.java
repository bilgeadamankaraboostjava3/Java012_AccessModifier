package com.muhammet.repository;

public class MusteriRepository {

	private int sayac = 0;
	
	protected int paketGuvenliDegiken= 8;
	
	int defaultErisimDegiskeni = 54;
	
	
	public void save() {
		System.out.println("DB ye M��teri kay�t edildi.");
		sayac++;
	}
	public void update() {
		// DB -> DataBase -> veritaban� -> verileri tuttu�umuz yer
		System.out.println("M��teri bilgileri d�zenlendi. ");
	}
	
	public int sayacOku() {
		return sayac;
	}
	
	private void Deneme() {
		
	}
	
	/**
	 * **** s�n�f dahil bir class i�inde private kullanabilirsiniz.
	 * @author MuhammetAli
	 *
	 */
	private class Musteri{
		public int id;
		public String ad;
	}
	
	public class ErisimeAcikMusteri{
		public  int id;
	}
	
}
