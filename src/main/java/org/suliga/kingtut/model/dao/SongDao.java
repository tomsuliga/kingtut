package org.suliga.kingtut.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.suliga.kingtut.model.Song;

public interface SongDao extends CrudRepository<Song, Long> {
	public List<Song> findAll();
}