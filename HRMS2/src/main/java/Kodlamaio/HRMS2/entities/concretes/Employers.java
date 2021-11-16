package Kodlamaio.HRMS2.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="id")
@Entity
@Table(name="employers")
public class Employers extends Users{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="web_address")
	private String web_address;
	
	@Column(name="phone_number")
	private int phone_number;
}
