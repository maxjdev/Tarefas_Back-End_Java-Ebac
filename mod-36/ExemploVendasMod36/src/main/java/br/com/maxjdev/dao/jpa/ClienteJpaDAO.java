package br.com.maxjdev.dao.jpa;

import br.com.maxjdev.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.maxjdev.domain.jpa.ClienteJpa;

/**
 * @author maxjdev
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
