package vn.zelecshop.entity;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Automatic get-setter and constructor
@AllArgsConstructor
@NoArgsConstructor
@Data

//Setting entity
@Entity
@Table(name = "account")
@NamedQuery(name = "Account.findAll", query = "select a from Account a where a.roleId = 2")
public class Account implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid", columnDefinition = "nvarchar(255)")
	private String userid;
	
	@Column(name = "password", columnDefinition = "nvarchar(255)")
	private String password;
	
	@Column(name = "name", columnDefinition = "nvarchar(255)")
	private String name;
	
	@Column(name = "dob", columnDefinition = "nvarchar(255)")
	private String dob;
	
	@Column(name = "gender", columnDefinition = "nvarchar(15)")
	private String gender;
	
	@Column(name = "email", columnDefinition = "nvarchar(255)")
	@Email(message = "Email must be in the right form")
	private String email;
	
	@Column(name = "phonenum", columnDefinition = "nvarchar(255)")
	private String phonenum;
	
	@Column(name = "address", columnDefinition = "nvarchar(255)")
	private String address;
	
	@Column(name = "isDeactivated", columnDefinition = "boolean")
	private boolean isDeactivated;
	
	
	@Column(name = "roleId", columnDefinition = "int")
	private Integer roleId;
}