package edu.usal.dao.implementacion;

import java.io.*;
import java.util.*;

import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dao.interfaces.ClienteDAO;

public class ClienteDAOimplSerializacion implements ClienteDAO {

	@Override
	public void AgregarCliente(Cliente cliente) throws IOException {
		
		List<Cliente> cliente2 = new ArrayList<Cliente>();
		try {
			
			cliente2 = GetAll();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		cliente2.add(cliente);
		
		FileOutputStream archsalida = new FileOutputStream(new File("profesor.txt"));
		ObjectOutputStream ouStream = new ObjectOutputStream(archsalida);
		ouStream.writeObject(cliente2);
		ouStream.close();
	
		
	}

	@Override
	public void EliminarCliente(Cliente cliente) {
		
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
