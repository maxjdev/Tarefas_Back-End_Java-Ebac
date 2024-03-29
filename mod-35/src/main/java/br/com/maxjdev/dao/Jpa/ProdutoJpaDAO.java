package br.com.maxjdev.dao.Jpa;

import br.com.maxjdev.Domain.Jpa.ProdutoJpa;
import br.com.maxjdev.dao.generic.jpa.GenericJpaDAO;

/**
 * @author maxjdev
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class, "Postgre1");
    }

}

