package org.suliga.kingtut.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.suliga.kingtut.model.Band;

public interface BandDao extends CrudRepository<Band, Long> {
	public List<Band> findAll();
}
