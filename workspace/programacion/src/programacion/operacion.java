package programacion;

public class operacion {
	int x,y; 
	public static void main (String m[]){ 
	operacion t=new operacion();
	t.x=3;
	t.y=3;
	t.suma();
	t.resta();
	t.multiplicacion();
	t.division();

      
	}
	public void suma (){
	int r; 
	r= x+y;
	System.out.println("la suma es"+"             = "+r); 
	}
	
	public void resta (){
	int d; 
	d= x-y;
	System.out.println("la resta es"+"            = "+d); 
	}

	public void multiplicacion (){
	int m; 
	m= x*y;
	System.out.println("la multiplicacion es"+"   = "+m); 
	}
	
	public void division (){
	int s; 
	s= x/y;
	System.out.println("la division es"+"         = "+s); 
	}	
	
}

