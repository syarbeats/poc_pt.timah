package com.mitratex.timah.poc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mitratex.timah.poc.domain.RescentSap;

@Repository
public interface RescentSapDao {

	List<RescentSap> getRescentSapLists();

}
