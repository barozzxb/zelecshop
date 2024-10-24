package vn.zelecshop.entity;

import java.io.Serializable;
<<<<<<< HEAD
import java.math.BigDecimal;
=======


>>>>>>> master

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
=======

>>>>>>> master
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Product")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_quantity")
    private int ProductQuantity;

    @Column(name = "product_price")
    private BigDecimal ProductPrice;

    @Column(name = "product_info", columnDefinition = "text")
    private String ProductInfo;

    @Column(name = "product_picture", columnDefinition = "varchar(255)")
    private String ProductPicture;

    @Column(name = "p_manufacture")
    private String PManufacture;

    @Column(name = "p_rating")
    private int PRating;
}
=======

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
	
	@Column(name = "pinfo", columnDefinition = "nvarchar(MAX)")
	private String pinfo;
	
	@Column(name = "ppicture", columnDefinition = "nvarchar(5000)")
	private String ppicture;
	
	@Column(name = "pmanufacture")
	private String pmanufacture;
	
	@Column(name = "prating")
	private int praiting;

	
}
>>>>>>> master
