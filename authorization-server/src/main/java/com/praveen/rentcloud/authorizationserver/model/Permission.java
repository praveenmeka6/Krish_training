package com.praveen.rentcloud.authorizationserver.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "permission")
public class Permission implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}
