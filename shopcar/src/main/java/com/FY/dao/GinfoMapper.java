package com.FY.dao;

import java.util.List;

import com.FY.entity.Ginfo;

public interface GinfoMapper {
	// ��
	public void addGinfo(Ginfo ginfo);

	// ɾ
	public void deleteGinfo(int id);

	// ��
	public void updateGinfo(Ginfo ginfo);

	// ��
	public List<Ginfo> getGinfoList();
}
