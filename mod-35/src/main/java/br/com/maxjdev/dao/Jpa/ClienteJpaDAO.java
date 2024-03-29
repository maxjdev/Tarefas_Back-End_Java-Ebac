package br.com.maxjdev.dao.Jpa;

import br.com.maxjdev.Domain.Jpa.ClienteJpa;
import br.com.maxjdev.dao.generic.jpa.GenericJpaDAO;

/**
 * @author maxjdev
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO<C> {

    public ClienteJpaDAO() {
        super();
    }

}
