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
    System.out.print(创Digite numero de empleados:创);
    numeroEmpleados = Integer.valueOf (br.readLine()).intValue()
    for(int=0;i<numeroEmpleados;i++){
    	System.out.print(\nDigite la cedula del empleado:创);
    	cedula = br.readLine ();
    	System.out.print (创\nDigite el apellido del empleado:创);
    	apellido = br.readline();
    	System.out.print(创\nDigite el nombre del empleado:创);
        nombre = br.readLine();
    System.out.print(创\Digite numero de horas del empleado:创);
        horas= Double.valueOf(br.readLine()).doubleValue();
        System.out.print(创\nDigite sueldo por hora del empleado:创�);
        sueldo = Double.valueOf(br.readline()).doubleValue();
        
        Empleado unEmpleado = new Empleado (cedula, apellido, nombre, horas, sueldo);
        
                            losEmpleados[i] = unEmpleado;
}  

    for (int=o;i<numeroEmpleados;i++)
    	total = total + losEmpleados[i].CalcularSalario();
    
    System.out.orintln(创\nla nomina total es: 创+total);
     
                 }
}
