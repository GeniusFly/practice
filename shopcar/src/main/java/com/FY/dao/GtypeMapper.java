package com.FY.dao;

import java.util.List;

import com.FY.entity.Gtype;

public interface GtypeMapper {
	// Ôö
	public void addGtype(Gtype gtype);

	// É¾
	public void deleteGtype(int typeid);

	// ¸Ä
	public void updateGtype(Gtype gtype);

	// ²é
	public List<Gtype> getGtypeList();

}
