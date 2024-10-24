package vn.zelecshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "genre")
@NamedQuery(name = "Genre.findAll", query = "select g from Genre g")
public class Genre {

	@Id
	@Column(name="gid", columnDefinition = "NVARCHAR(255)")
	private String gid;
	
	@Column(name="gname", columnDefinition = "NVARCHAR(255)")
	private String gname;
	
	@Column(name="gdescription", columnDefinition = "NVARCHAR(5000)")
	private String gdescription;
}
