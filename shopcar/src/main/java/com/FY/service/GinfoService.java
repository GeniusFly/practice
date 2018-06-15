package com.FY.service;

import java.util.List;

import com.FY.entity.Ginfo;
import com.FY.entity.Gtype;

public interface GinfoService {
	public void addGinfo(Ginfo ginfo);
	public void deleteGinfo(int id);
	public void updateGinfo(Ginfo ginfo);
	public List<Ginfo> getGinfoList();
}
