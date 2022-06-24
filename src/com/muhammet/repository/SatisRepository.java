package com.muhammet.repository;

public class SatisRepository {
	
	public void save() {
		MusteriRepository dbMusteri = new MusteriRepository();
		dbMusteri.paketGuvenliDegiken = 56;
		dbMusteri.save();
		dbMusteri.defaultErisimDegiskeni=655;
	}

}
