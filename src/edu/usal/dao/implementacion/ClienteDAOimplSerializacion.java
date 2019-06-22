package edu.usal.dao.implementacion;

import java.io.*;
import java.util.*;

import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dao.interfaces.ClienteDAO;

public class ClienteDAOimplSerializacion implements ClienteDAO {



	public ClienteDAOimplSerializacion () throws IOException {


	}

	@Override
	public void AgregarCliente(Cliente cliente) throws IOException {
		FileOutputStream f = new FileOutputStream(new File("clientesS.txt"),true);
		ObjectOutputStream o = new ObjectOutputStream(f);

		o.writeObject(cliente);

		o.close();
		f.close();


	}


	@Override
	public boolean EliminarCliente(String dni) {
		return false;
	}



	@Override
	public List<Cliente> GetAll() throws IOException {
		
		FileInputStream fileis = new FileInputStream(new File("cliente.txt"));
		ObjectInputStream oiStream = new ObjectInputStream(fileis);
		List<Cliente> listadocliente = new ArrayList<Cliente>();
			
				try {					
					List<Cliente> readObject = (List<Cliente>) oiStream.readObject();
					listadocliente = readObject;

				}catch(ClassNotFoundException ex) {
					ex.printStackTrace();

			}finally {		
				oiStream.close();
			}
		
			return listadocliente;
	}  

	@Override
	public void ModificarCliente(Cliente cliente) {

		
	}

}
