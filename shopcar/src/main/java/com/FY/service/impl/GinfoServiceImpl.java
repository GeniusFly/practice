package com.FY.service.impl;

import com.FY.entity.Ginfo;
import com.FY.service.GinfoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.FY.dao.GinfoMapper;

@Service
@Transactional  //采用这个方式的时候，下面的注释代码不用写
public class GinfoServiceImpl implements GinfoService{
	@Autowired
	private GinfoMapper ginfoMapper=null;
	
	/*public void setGtypeMapper(GtypeMapper gtypeMapper) {
		this.gtypeMapper = gtypeMapper;
	}*/


	public void addGinfo(Ginfo ginfo) {
		ginfoMapper.addGinfo(ginfo);
		
	}

	public void deleteGinfo(int id) {
		// TODO Auto-generated method stub
		ginfoMapper.deleteGinfo(id);
	}
		
	public void updateGinfo(Ginfo ginfo) {
		// TODO Auto-generated method stub
		ginfoMapper.updateGinfo(ginfo);
	}
		
	public List<Ginfo> getGinfoList() {
		// TODO Auto-generated method stub
		return ginfoMapper.getGinfoList();
	}


	
	
}
