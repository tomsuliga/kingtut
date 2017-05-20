package org.suliga.kingtut.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public enum Instrument {
	VOICE, GUITAR, BASS, DRUMS, KEYBOARD;
	@Id
	@GeneratedValue
	private Long id;
}
