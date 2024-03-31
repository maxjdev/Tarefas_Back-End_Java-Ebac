package br.com.maxjdev.dao;

import java.util.List;

import br.com.maxjdev.dao.generic.IGenericDAO;
import br.com.maxjdev.domain.Produto;

/**
 * @author maxjdev
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
