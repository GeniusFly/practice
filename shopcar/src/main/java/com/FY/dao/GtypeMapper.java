package com.FY.dao;

import java.util.List;

import com.FY.entity.Gtype;

public interface GtypeMapper {
	// ��
	public void addGtype(Gtype gtype);

	// ɾ
	public void deleteGtype(int typeid);

	// ��
	public void updateGtype(Gtype gtype);

	// ��
	public List<Gtype> getGtypeList();

}
