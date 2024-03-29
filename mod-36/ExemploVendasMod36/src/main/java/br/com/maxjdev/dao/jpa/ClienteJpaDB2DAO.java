package br.com.maxjdev.dao.jpa;

import br.com.maxjdev.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.maxjdev.domain.jpa.ClienteJpa;

/**
 * @author maxjdev
 *
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
