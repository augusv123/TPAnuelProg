package edu.usal.negocio.dao.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import edu.usal.negocio.dominio.Cliente;

public interface ClienteDAO{

	public void AgregarCliente(Cliente cliente) throws IOException;
	
	public void EliminarCliente(Cliente cliente);
	
	List<Cliente> GetAll() throws IOException;
	
	void ModificarCliente(Cliente cliente);
	
}
