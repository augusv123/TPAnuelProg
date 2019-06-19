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



	public ClienteDAOimplArchivo() throws IOException {
		archivo = new File("clientes.txt");






	}

	@Override
	public void AgregarCliente(Cliente cliente) throws IOException {


		archivoWriter = new FileWriter(archivo, true);
		archivoBufferedWriter = new BufferedWriter(archivoWriter);

		
		String str = SaveCliente(cliente);
		
		archivoBufferedWriter.write(str);
		archivoBufferedWriter.flush();
		archivoBufferedWriter.close();

			
	}
	
	private String SaveCliente(Cliente cliente){
		
		return cliente.getNombreYApellido() + ";" + cliente.getDni() +";"+ "\n";
		
		
	}
	
	@Override
	public boolean EliminarCliente(String dni) throws IOException {
		archivo = new File("clientes.txt");

		archivoReader = new FileReader(archivo );
		archivoBufferedReader = new BufferedReader(archivoReader);


		archivoWriter = new FileWriter("tempFile.txt", false);
		archivoBufferedWriter = new BufferedWriter(archivoWriter);

		String linea = archivoBufferedReader.readLine();

		boolean encontrado = false;
		while (linea!= null){

			String[] lineaArray  =  linea.split(";");
			String dniActual = lineaArray[1];

			if(dni.equals(dniActual)){
					encontrado= true;
			}
			else{
				archivoBufferedWriter.write(linea);
				archivoBufferedWriter.newLine();
			}

			linea = archivoBufferedReader.readLine();
		}
		archivoBufferedWriter.flush();
		archivoBufferedWriter.close();

		if(encontrado== true){
			archivoReader = new FileReader("tempFile.txt" );
			archivoBufferedReader = new BufferedReader(archivoReader);


			archivoWriter = new FileWriter("clientes.txt", false);
			archivoBufferedWriter = new BufferedWriter(archivoWriter);

			String linea2 = archivoBufferedReader.readLine();


			while (linea2!= null){

				archivoBufferedWriter.write(linea2);
				archivoBufferedWriter.newLine();


				linea2 = archivoBufferedReader.readLine();
			}
			archivoBufferedWriter.flush();
			archivoBufferedWriter.close();
		}




	return encontrado;
	}
	
	@Override
	public List<Cliente> GetAll() throws IOException{

		archivo = new File("clientes.txt");

		archivoReader = new FileReader(archivo );
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
