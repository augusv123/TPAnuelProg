package edu.usal.dao.implementacion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dao.interfaces.*;

public class ClienteDAOimplArchivo implements ClienteDAO {
	
	private File archivo;
	private FileWriter archivoWriter;
	private FileReader archivoReader;
	private BufferedWriter archivoBufferedWriter;
	private BufferedReader archivoBufferedReader;

	@Override
	public void AgregarCliente(Cliente cliente) throws IOException {
		
		List<Cliente> cliente2 = new ArrayList<Cliente>();
		try {
			
			cliente2 = GetAll();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		cliente2.add(cliente);
		
		archivo = new File("Cliente.txt");
		archivoWriter = new FileWriter(archivo, true);
		archivoBufferedWriter = new BufferedWriter(archivoWriter);
		
		String str = SaveCliente(cliente);
		
		archivoBufferedWriter.write(str);
		archivoBufferedWriter.close();
		archivoWriter.close();
			
	}
	
	private String SaveCliente(Cliente cliente){
		
		return cliente.getNombreYApellido() + ";" + cliente.getDni() +";"+ "\n";
		
		
	}
	
	@Override
	public void EliminarCliente(String dni) throws IOException {
		FileReader fr = new FileReader("cliente.txt");
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter("Cliente.txt");
		BufferedWriter bw = new BufferedWriter(fw);


		String aux=  null;
		while(  br.readLine()!= null){
				aux = br.readLine();
				if(aux.equals(dni)){
					System.out.println("Se encontro");
				}
				else{
					System.out.println("no se encontro");
				}
		}


	}
	
	@Override
	public List<Cliente> GetAll() throws IOException{
		
		
		archivo = new File("cliente.txt");
		archivoReader = new FileReader(archivo);
		archivoBufferedReader = new BufferedReader(archivoReader);
		
		String linea;
		List<Cliente> listadoCliente = new ArrayList<Cliente>();
		
		while((linea = archivoBufferedReader.readLine()) != null) {
			
			listadoCliente.add(ParseCliente(linea));
			
		}
		
			return listadoCliente;

	}
	
	private Cliente ParseCliente(String linea) {
		String[] atributos = linea.split(";");
		
		Cliente cliente = new Cliente();
		cliente.setNombreYApellido(atributos[0]);
		cliente.setDni(atributos[1]); 

		return cliente;

	}
	
	@Override
	public void ModificarCliente(Cliente cliente) {

	}

	
	
}
