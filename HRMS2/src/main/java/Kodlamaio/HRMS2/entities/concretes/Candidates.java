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
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="id",referencedColumnName = "id")
@Entity
@Table(name = "candidates")
public class Candidates extends Users{
		
	@NotBlank
	@NotNull
	@Column(name = "first_name")
	private String first_name;
	
	@NotBlank
	@NotNull
	@Column(name = "last_name")
	private String last_name;
	
	@NotBlank
	@NotNull
	@Column(name = "identify_number")
	private String identify_number;
	
	@NotBlank
	@NotNull
	@Column(name = "birth_of_year")
	private int birth_of_year;
}
