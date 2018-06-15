package com.FY.dao;

import java.util.List;

import com.FY.entity.Ginfo;

public interface GinfoMapper {
	// Ôö
	public void addGinfo(Ginfo ginfo);

	// É¾
	public void deleteGinfo(int id);

	// ¸Ä
	public void updateGinfo(Ginfo ginfo);

	// ²é
	public List<Ginfo> getGinfoList();
}
