package edu.usal.dao.main;

import java.io.IOException;
import java.util.*;

import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dao.interfaces.ClienteDAO;
import edu.usal.dao.factory.ClienteFactory;


public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombreYApellido("Lucas Anezin");
		cliente1.setDni("41614594");
		
		ClienteDAO impDAO = ClienteFactory.GetImplementation("Archivo");
		
		try {
				
			cliente1.setNombreYApellido("Lucas Anezin");
			impDAO.AgregarCliente(cliente1);
			
			List <Cliente> lista = impDAO.GetAll();
			
			for(Cliente Profesor : lista) {
				System.out.println(cliente1.getNombreYApellido()+ " " +cliente1.getDni());
			}
			
			
		}catch(IOException e) {
			
			e.printStackTrace();	
		}
		
		
		

	}

}
