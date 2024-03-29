package br.com.maxjdev.dao.jpa;

import br.com.maxjdev.dao.generic.jpa.IGenericJapDAO;
import br.com.maxjdev.domain.jpa.Persistente;

/**
 * @author maxjdev
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
