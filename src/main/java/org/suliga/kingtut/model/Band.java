package org.suliga.kingtut.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Band {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToMany
	private List<Album> albums;
	@OneToMany
	private List<Musician> musicians;
}
