package com.muhammet;

import com.muhammet.repository.MusteriRepository;

public class Runner {

	/**
	 * Access Modifier -> Eri�im Belirte�leri
	 * private -> Class i�ine a��k di�er k�s�mlara kapal� eri�im demektir.
	 * protected -> Class ve Paket d�zeyinde eri�ime a��k di�er eri�imlere kapal� demektir.
	 * public -> T�m heryere a��k olan eri�im.
	 * default-> Protected gibi paket i�ine a��k paket d���na kapal� eri�im demeketir.
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
		
		System.out.println("Kay�t edilen m��teri say�y�.....: "+ dbMuteri.sayacOku());
		

	}

}
