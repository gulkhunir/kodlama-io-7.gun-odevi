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
@Table(name="employers")
public class Employers extends Users{
	
	@NotBlank
	@NotNull
	@Column(name="company_name")
	private String company_name;
	
	@NotBlank
	@NotNull
	@Column(name="web_address")
	private String web_address;
	
	@NotBlank
	@NotNull
	@Column(name="phone_number")
	private int phone_number;
}
