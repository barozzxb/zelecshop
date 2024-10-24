package vn.zelecshop.entity;

import java.io.Serializable;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name="product")
@NamedQuery(name="product.findAll", query="select p from Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pid")
	private String pid;
	
	@Column(name = "pname")
	private String pname;
	
	@Column(name = "pquantity")
	private int pquantity;
	
	@Column(name = "pprice")
	private int pprice;
	
	@Column(name = "pinfo", columnDefinition = "nvarchar(5000)")
	private String pinfo;
	
	@Column(name = "ppicture", columnDefinition = "nvarchar(5000)")
	private String ppicture;
	
	@Column(name = "pmanufacturer")
	private String pmanufacturer;
	
	@Column(name = "prating")
	private int prating;

	@Column(name = "gid")
	private String gid;
}