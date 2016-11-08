package com.mitratex.timah.poc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.mitratex.timah.poc.dao.RescentSapDao;
import com.mitratex.timah.poc.domain.RescentSap;

public class RescentSapDaoImpl implements RescentSapDao{

	@Override
	public List<RescentSap> getRescentSapLists() {
		// TODO Auto-generated method stub
		
		List<RescentSap> rescentSapList = new ArrayList<RescentSap>();
		
		RescentSap rescentSap;
		
		rescentSap = new RescentSap();
		rescentSap.setRescent("0100000000");
		rescentSap.setPosition("General Manager Produksi Merangkap Kepala Unit Laut Bangka PT Timah (Persero) Tbk");
		rescentSapList.add(rescentSap);
		
		rescentSap = new RescentSap();
		rescentSap.setRescent("0100000001");
		rescentSap.setPosition("General Manager Wilayah Produksi Kepulauan Riau & Riau PT TIMAH (Persero) Tbk");
		rescentSapList.add(rescentSap);
		
		rescentSap = new RescentSap();
		rescentSap.setRescent("0100000002");
		rescentSap.setPosition("Kepala Keteknikan & Sarana Kepulauan Riau & Riau pada Wilayah Produksi Kepulauan Riau");
		rescentSapList.add(rescentSap);
		
		
		return rescentSapList;
	}

}
