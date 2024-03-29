package br.com.maxjdev.dao.Jpa;

import br.com.maxjdev.Domain.Jpa.ClienteJpa;
import br.com.maxjdev.Domain.Jpa.ClienteJpa2;
import br.com.maxjdev.exceptions.DAOException;
import br.com.maxjdev.exceptions.MaisDeUmRegistroException;
import br.com.maxjdev.exceptions.TableException;
import br.com.maxjdev.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

/**
 * @author maxjdev
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

    public ClienteJpaDB3DAO() {
        super(ClienteJpa2.class);
    }

    @Override
    public ClienteJpa cadastrar(ClienteJpa entity) throws TipoChaveNaoEncontradaException, DAOException {
        return null;
    }

    @Override
    public void excluir(ClienteJpa entity) throws DAOException {

    }

    @Override
    public ClienteJpa alterar(ClienteJpa entity) throws TipoChaveNaoEncontradaException, DAOException {
        return null;
    }

    @Override
    public ClienteJpa consultar(Long id) throws MaisDeUmRegistroException, TableException, DAOException {
        return null;
    }

    @Override
    public Collection<ClienteJpa> buscarTodos() throws DAOException {
        return null;
    }
}
