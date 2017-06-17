package com.fbellotti.api_ws_spring.example.model;

import org.springframework.data.annotation.Id;

import javax.xml.bind.annotation.*;

/**
 * @author <a href="http://fbellotti.com">Florian BELLOTTI</a>
 */
@XmlRootElement(name="customer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {

  @Id
  private String identifier;
  private String firstName;
  private String lastName;
  private Address address;

  public Customer() {}

  public Customer(String firstName, String lastName, Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public Address getAddress() {
    return address;
  }

  public String getIdentifier() {
    return identifier;
  }
}