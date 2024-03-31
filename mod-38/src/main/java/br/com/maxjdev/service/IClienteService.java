package br.com.maxjdev.service;

import java.util.List;

import br.com.maxjdev.domain.Cliente;
import br.com.maxjdev.exceptions.DAOException;
import br.com.maxjdev.services.generic.IGenericService;

/**
 * @author maxjdev
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
