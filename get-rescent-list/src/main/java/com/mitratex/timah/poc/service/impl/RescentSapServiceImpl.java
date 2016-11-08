package com.mitratex.timah.poc.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mitratex.timah.poc.dao.impl.RescentSapDaoImpl;
import com.mitratex.timah.poc.domain.RescentSap;
import com.mitratex.timah.poc.service.RescentSapService;

@Service
public class RescentSapServiceImpl implements RescentSapService{
	
	 private static final Logger LOG = LoggerFactory.getLogger(RescentSapServiceImpl.class);

     private RescentSapDaoImpl rescentSapDao = new RescentSapDaoImpl();

	@Override
	public List<Map<String, String>> getRescentSapList() {
		// TODO Auto-generated method stub
		return null;
	}



	/*@Override
	public List<Map<String,String>> getRescentSapList() {
		// TODO Auto-generated method stub
		 LOG.info(" [Get Rescent SAP] ");
		 
		// List<RescentSap> rescentSapList = rescentSapDao.getRescentSapLists();
		 
		// return rescentSapList;
		
		return null;
	}*/

}
