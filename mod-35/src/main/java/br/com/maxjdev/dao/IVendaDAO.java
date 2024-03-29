package br.com.maxjdev.dao;

import br.com.maxjdev.Domain.Venda;
import br.com.maxjdev.dao.generic.IGenericDAO;
import br.com.maxjdev.exceptions.DAOException;
import br.com.maxjdev.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author maxjdev
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
