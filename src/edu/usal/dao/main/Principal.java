package edu.usal.dao.main;

import java.io.IOException;
import java.util.*;

import edu.usal.dao.implementacion.ClienteDAOimplSerializacion;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dao.interfaces.ClienteDAO;
import edu.usal.dao.factory.ClienteFactory;


public class Principal {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cliente cliente1 = new Cliente();
		Cliente c2 = new Cliente("augusto", "38794821");
		cliente1.setNombreYApellido("Lucas Anezin");
		cliente1.setDni("88");
		Scanner sc = new Scanner(System.in);
		ClienteDAO impDAO = ClienteFactory.GetImplementation("Archivo");
		ClienteDAOimplSerializacion cd = new ClienteDAOimplSerializacion();
		
		try {
				
			cliente1.setNombreYApellido("julian");
			impDAO.AgregarCliente(cliente1);



			
			List <Cliente> lista = impDAO.GetAll();

			for( Cliente cliente : lista) {
				System.out.println(cliente.toString());
			}

			System.out.println(impDAO.EliminarCliente("123"));
			
		}catch(IOException e) {
			
			e.printStackTrace();	
		}






		
		
		

	}

}
