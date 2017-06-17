package com.fbellotti.api_ws_spring.example.remote;

import com.fbellotti.api_ws_spring.example.model.Customer;
import com.fbellotti.api_ws_spring.remote.CrudService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author <a href="http://fbellotti.com">Florian BELLOTTI</a>
 */
@Path("/customer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface CustomerCrudService extends CrudService<Customer> {
}
