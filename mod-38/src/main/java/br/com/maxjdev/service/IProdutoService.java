package br.com.maxjdev.service;

import java.util.List;

import br.com.maxjdev.domain.Produto;
import br.com.maxjdev.services.generic.IGenericService;

/**
 * @author maxjdev
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
