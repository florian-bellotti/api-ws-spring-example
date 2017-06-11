package com.fbellotti.api_ws_spring.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author <a href="http://fbellotti.com">Florian BELLOTTI</a>
 */
@XmlRootElement(name="address")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {

  private String postal;
  private String city;

  public Address() {}

  public Address(String postal, String city) {
    this.postal = postal;
    this.city = city;
  }

  public String getPostal() {
    return postal;
  }

  public String getCity() {
    return city;
  }

}