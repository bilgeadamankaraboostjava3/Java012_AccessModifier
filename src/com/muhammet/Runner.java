package com.muhammet;

import com.muhammet.repository.MusteriRepository;

public class Runner {

	/**
	 * Access Modifier -> Eriþim Belirteçleri
	 * private -> Class içine açýk diðer kýsýmlara kapalý eriþim demektir.
	 * protected -> Class ve Paket düzeyinde eriþime açýk diðer eriþimlere kapalý demektir.
	 * public -> Tüm heryere açýk olan eriþim.
	 * default-> Protected gibi paket içine açýk paket dýþýna kapalý eriþim demeketir.
	 */
	
	public static void main(String[] args) {
		
		MusteriRepository dbMuteri = new MusteriRepository();
		dbMuteri.update();
		
		dbMuteri.save();
		dbMuteri.save();
		dbMuteri.save();
		dbMuteri.save();
		dbMuteri.save();
		dbMuteri.save();
		
		System.out.println("Kayýt edilen müþteri sayýyý.....: "+ dbMuteri.sayacOku());
		

	}

}
