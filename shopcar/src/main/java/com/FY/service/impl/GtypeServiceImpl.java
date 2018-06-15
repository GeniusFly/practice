package com.FY.service.impl;

import com.FY.entity.Gtype;
import com.FY.service.GtypeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.FY.dao.GtypeMapper;;

@Service
@Transactional  //采用这个方式的时候，下面的注释代码不用写
public class GtypeServiceImpl implements GtypeService{
	@Autowired
	private GtypeMapper gtypeMapper=null;
	
	/*public void setGtypeMapper(GtypeMapper gtypeMapper) {
		this.gtypeMapper = gtypeMapper;
	}*/


	public void addGtype(Gtype gtype) {
		gtypeMapper.addGtype(gtype);
		
	}


	public void deleteGtype(int typeid) {
		// TODO Auto-generated method stub
		gtypeMapper.deleteGtype(typeid);
	}
	

	public void updateGtype(Gtype gtype) {
		// TODO Auto-generated method stub
		gtypeMapper.updateGtype(gtype);
	}

	
	public List<Gtype> getGtypeList() {
		// TODO Auto-generated method stub
		return gtypeMapper.getGtypeList();
	}



	
	
	
}
