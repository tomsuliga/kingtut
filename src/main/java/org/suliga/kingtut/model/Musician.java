package org.suliga.kingtut.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Musician {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToMany
	private List<Band> bands;
	@Enumerated(value=EnumType.STRING)
	@OneToMany
	private List<Instrument> instruments;
	@Embedded
	private Address currentAddress;
}
