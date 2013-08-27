
public class formato {

		int edad, numerotelefonico;
		String sexo, nombrepersona;
			
	formato (String nombrepersona, int edad){
		this.nombrepersona= nombrepersona;
		this.edad= edad;            
}
	
	formato (String nombrepersona, int edad, String sexo){  

		this.nombrepersona= nombrepersona;
		this.edad= edad;
		this.sexo= sexo;                          
			
}
	
	String comprobar () {
		
		if(edad <= 17){
		return "Menor de Edad";	}
	
		else { 
		return "Mayor de Edad";  }

}

	public static void main (String N2 [] ) {
		formato N1=new formato ("JUAN DAVID  RIVERA",23);
		System.out.println(N1.comprobar());
		N1.comprobar(23,"juan david rivera");
}
	
	
	void comprobar (int edad, String nombrepersona){
		
		if (edad >=0 && edad <=7){
		System.out.println("nombrepersona"+ "usted es niño"); 
		}
	     
	     else if (edad >7 && edad <=15){
	     System.out.println("nombrepersona"+ "usted es puber"); 
	      }

          else if(edad >15 && edad <=18){
          System.out.println("nombrepersona"+ "usted es adolescente"); 
          }  
         else if (edad > 18 && edad <=25 ){
	     System.out.println("nombrepersona"+ "usted es joven");
         }
         else if(edad > 25 && edad <=50){
        	 System.out.println("nombrepersona"+ );
         }
}