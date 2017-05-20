package org.suliga.kingtut.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Album {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToMany
	private List<Song> songs;
	@OneToOne
	private Band band;
}
