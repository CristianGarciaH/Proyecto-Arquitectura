package nomina;

import java.io.BufferedReader;

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
    System.out.print(´´Digite numero de empleados:´´);
    numeroEmpleados = Integer.valueOf (br.readLine()).intValue()
    for(int=0;i<numeroEmpleados;i++){
    	System.out.print(\nDigite la cedula del empleado:´´);
    	cedula = br.readLine ();
    	System.out.print (´´\nDigite el apellido del empleado:´´);
    	apellido = br.readline();
    	System.out.print(´´\nDigite el nombre del empleado:´´);
        nombre = br.readLine();
    System.out.print(´´\Digite numero de horas del empleado:´´);
        horas= Double.valueOf(br.readLine()).doubleValue();
        System.out.print(´´\nDigite sueldo por hora del empleado:´´´);
        sueldo = Double.valueOf(br.readline()).doubleValue();
        
        Empleado unEmpleado = new Empleado (cedula, apellido, nombre, horas, sueldo);
        
                            losEmpleados[i] = unEmpleado;
}  

    for (int=o;i<numeroEmpleados;i++)
    	total = total + losEmpleados[i].CalcularSalario();
    
    System.out.orintln(´´\nla nomina total es: ´´+total);
     
                 }
}
