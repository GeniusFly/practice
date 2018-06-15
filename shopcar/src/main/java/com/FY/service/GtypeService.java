package com.FY.service;

import java.util.List;

import com.FY.entity.Gtype;

public interface GtypeService {
	public void addGtype(Gtype gtype);
	public void deleteGtype(int typeid);
	public void updateGtype(Gtype gtype);
	public List<Gtype> getGtypeList();
	
}
