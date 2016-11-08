package com.mitratex.timah.poc.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mitratex.timah.poc.domain.Employee;


@Path("/employee")
@Produces({MediaType.APPLICATION_JSON})
public interface EmployeeService {

    /*@GET
    @Path("/getEmployee/")
    public Employee getEmployee(@QueryParam("position") String position,
    							@QueryParam("rescent") String rescent);*/
    @GET
    @Path("/getEmployee/")
    List<Map<String, String>> getEmployee(@QueryParam("position") String position,
    							@QueryParam("rescent") String rescent);
    
}