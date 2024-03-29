package br.com.maxjdev.dao.Jpa;

import br.com.maxjdev.Domain.Jpa.ClienteJpa;
import br.com.maxjdev.dao.generic.GenericJpaDB2DAO;

/**
 * @author maxjdev
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }
}
