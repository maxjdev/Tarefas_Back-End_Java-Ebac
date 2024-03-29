package br.com.maxjdev.dao.jpa;

import br.com.maxjdev.dao.generic.jpa.GenericJpaDB3DAO;
import br.com.maxjdev.domain.jpa.ClienteJpa2;

/**
 * @author maxjdev
 *
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}
