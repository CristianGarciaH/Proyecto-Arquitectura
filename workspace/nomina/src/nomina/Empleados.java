package nomina;

public class Empleados {
	int numeroEmpleados;
	String[] cedulas   = new String[50];
	String[] apellidos = new String[50];
	String[] nombres   = new String[50];
	double[] HorasTrabajadas = new double[50];
	double[] SueldoXHora     = new double[50];  
    String cedula,nombre,apellido;
    double horas,sueldo;
    double Total =0;
    BufferedReader br = new BufferedReader (
                     new InputStreamReader ( System.in));
    System.out.print(��Digite numero de empleados:��);
    numeroEmpleados = Integer.valueOf (br.readLine()).intValue()
    for(int=0;i<numeroEmpleados;i++){
    	System.out.print(\nDigite la cedula del empleado:��);
    	cedula = br readLine ();
    	
    
}  
