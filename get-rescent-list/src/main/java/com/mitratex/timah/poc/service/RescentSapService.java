package com.mitratex.timah.poc.service;

import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mitratex.timah.poc.domain.Employee;
import com.mitratex.timah.poc.domain.RescentSap;

@Path("/sap")
public interface RescentSapService {
	
	@GET
    @Path("/getRescentSapList/")
	@Produces({MediaType.APPLICATION_JSON})
	List<Map<String,String>> getRescentSapList() ;
	/*String getRescentSapList() ;*/

}
