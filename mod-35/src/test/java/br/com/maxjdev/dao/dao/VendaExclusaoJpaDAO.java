package java.br.com.maxjdev.dao.dao;

import br.com.maxjdev.Domain.Jpa.VendaJpa;
import br.com.maxjdev.dao.Jpa.IVendaJpaDAO;
import br.com.maxjdev.dao.generic.jpa.GenericJpaDAO;
import br.com.maxjdev.exceptions.DAOException;
import br.com.maxjdev.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author maxjdev
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

    public VendaExclusaoJpaDAO() {
        super(VendaJpa.class, "Postgre1");
    }

    @Override
    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public VendaJpa consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

}

