package org.suliga.kingtut.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Song {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int lenSeconds;
	@OneToOne
	private Album album;
}
