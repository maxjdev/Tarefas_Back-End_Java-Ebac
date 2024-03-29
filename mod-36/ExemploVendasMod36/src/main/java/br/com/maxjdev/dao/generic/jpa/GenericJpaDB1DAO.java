package br.com.maxjdev.dao.generic.jpa;

import br.com.maxjdev.domain.jpa.Persistente;

import java.io.Serializable;

/**
 * @author maxjdev
 *
 */
public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB1DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre1");
	}

}
