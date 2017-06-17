package com.fbellotti.api_ws_spring.example.remote;

import com.fbellotti.api_ws_spring.dao.CrudDao;
import com.fbellotti.api_ws_spring.example.model.Customer;
import com.fbellotti.api_ws_spring.remote.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;

/**
 * @author <a href="http://fbellotti.com">Florian BELLOTTI</a>
 */
@Component
public class CustomerCrudServiceImpl extends CrudServiceImpl<Customer> implements CustomerCrudService {

  @Autowired
  public CustomerCrudServiceImpl(CrudDao<Customer> daoCrud) {
    super(daoCrud);
  }
}
