package Test;

import Consultorio.Medico;
import Consultorio.Paciente;

public class TestConsultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Medico medico1 = new Medico("Laura", "Fernandez", "Cirugia");
			System.out.println("Medico: "+medico1.nombreCompleto());
			
			System.out.println("");
			
			Paciente paciente1 = new Paciente("Facundo", "Lacava", 1.78f, 86f);
			System.out.println("Paciente: "+paciente1.traerNombreCompleto());
			System.out.println("IMC: "+paciente1.getIMC());
			
			
	}

}
