package br.com.maxjdev.services;

import br.com.maxjdev.domain.Cliente;
import br.com.maxjdev.exceptions.DAOException;
import br.com.maxjdev.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {
	Cliente buscarPorCPF(Long cpf) throws DAOException;
}
