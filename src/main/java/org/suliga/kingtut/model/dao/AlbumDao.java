package org.suliga.kingtut.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.suliga.kingtut.model.Album;

public interface AlbumDao extends CrudRepository<Album, Long> {
	public List<Album> findAll();
}
