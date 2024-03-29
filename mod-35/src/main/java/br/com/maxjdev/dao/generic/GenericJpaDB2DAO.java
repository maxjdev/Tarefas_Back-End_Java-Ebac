package br.com.maxjdev.dao.generic;

import br.com.maxjdev.dao.Jpa.Persistente;
import br.com.maxjdev.dao.generic.jpa.GenericJpaDAO;

import java.io.Serializable;

/**
 * @author maxjdev
 */
public abstract class GenericJpaDB2DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB2DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre2");
    }

}
