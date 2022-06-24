package com.muhammet.repository;

public class MusteriRepository {

	private int sayac = 0;
	
	protected int paketGuvenliDegiken= 8;
	
	int defaultErisimDegiskeni = 54;
	
	
	public void save() {
		System.out.println("DB ye Müþteri kayýt edildi.");
		sayac++;
	}
	public void update() {
		// DB -> DataBase -> veritabaný -> verileri tuttuðumuz yer
		System.out.println("Müþteri bilgileri düzenlendi. ");
	}
	
	public int sayacOku() {
		return sayac;
	}
	
	private void Deneme() {
		
	}
	
	/**
	 * **** sýnýf dahil bir class içinde private kullanabilirsiniz.
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
