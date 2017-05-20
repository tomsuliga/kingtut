package org.suliga.kingtut.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.suliga.kingtut.model.Musician;

public interface MusicianDao extends CrudRepository<Musician, Long> {
	public List<Musician> findAll();
}
