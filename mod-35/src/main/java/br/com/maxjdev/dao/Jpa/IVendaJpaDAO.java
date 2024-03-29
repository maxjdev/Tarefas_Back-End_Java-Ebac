package br.com.maxjdev.dao.Jpa;

import br.com.maxjdev.Domain.Jpa.VendaJpa;
import br.com.maxjdev.exceptions.DAOException;
import br.com.maxjdev.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author maxjdev
 */
public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public VendaJpa consultarComCollection(Long id);
}

