package edu.usal.dao.factory;

import edu.usal.negocio.dao.interfaces.ClienteDAO;
import edu.usal.dao.implementacion.*;

import java.io.IOException;

public class ClienteFactory {

	public static ClienteDAO GetImplementation(String source) throws IOException {
		
		if (source.equals("Archivo")) {
			return new ClienteDAOimplArchivo();
		}
		else if(source.equals("Serializacion")) {
			
			return new ClienteDAOimplSerializacion();
		}
		return null;
	}
	
	
}
