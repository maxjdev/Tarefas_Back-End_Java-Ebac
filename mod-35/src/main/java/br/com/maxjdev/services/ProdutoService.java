package br.com.maxjdev.services;

import br.com.maxjdev.Domain.Produto;
import br.com.maxjdev.dao.IProdutoDAO;
import br.com.maxjdev.services.generic.GenericService;

/**
 * @author maxjdev
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
