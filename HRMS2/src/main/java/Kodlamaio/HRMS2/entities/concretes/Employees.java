package Kodlamaio.HRMS2.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="id",referencedColumnName = "id")
@Table(name="employees")
@Entity
public class Employees extends Users{
	
	@NotBlank
	@NotNull
	@Column(name = "first_name")
	private String first_name;
	
	@NotBlank
	@NotNull
	@Column(name = "last_name")
	private String last_name;

}
