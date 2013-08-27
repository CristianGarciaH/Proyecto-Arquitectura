
public class mayormediomenor {
	static double A=6,B=21,C=14,T=0;
	public static void main (String T[ ]){
	
		if (A % 2 == 0)
                 System.out.println ("a Es par");
		
        else
                 System.out.println ("a Es impar");
		System.out.println("La raíz cuadrada de " + A + " es " + Math.sqrt(A));
		
		   if(Math.sqrt(A)*Math.sqrt(A)==A)
			System.out.println("la raiz de a es exacta");
		   else 
			   System.out.println("la raiz de a no es exacta"); 
		
		
		 if (B % 2 == 0)
             System.out.println ("b Es par");
        else
             System.out.println ("b Es impar");
		 System.out.println("La raíz cuadrada de " + B + " es " + Math.sqrt(B));
		 
		 if(Math.sqrt(A)*Math.sqrt(A)==A)
				System.out.println("la raiz de b es exacta");
			   else 
				   System.out.println("la raiz de b no es exacta"); 
		 
		 
		 
		 if (C % 2 == 0)
             System.out.println ("c Es par");
        else
             System.out.println ("c Es impar");
		 System.out.println("La raíz cuadrada de " + C + " es " + Math.sqrt(C));
		 
		 if(Math.sqrt(A)*Math.sqrt(A)==A)
				System.out.println("la raiz de c es exacta");
			   else 
				   System.out.println("la raiz de c no es exacta"); 
		 
		
		
		if (A>B)
			if(A>C)
				if(B>C)
					System.out.println("   a mayor "+A+",   b medio "+B+",   c menor " +C);
				else 
					System.out.println("a mayor "+A+",   c medio " +C+",   b menor " + B);
			else
				System.out.println("   c mayor "+C+",   b medio "+B+",   a menor "+A);
		else
			if (B>C)
				if(A>C)
					System.out.println("   b mayor "+B+",   a medio "+A+",   c menor "+C);
				else 
					System.out.println("   b mayor "+B +",   c medio "+C+",   a menor "+A);
			else 
				System.out.println("   c mayor "+C+",   b medio "+B+",   a menor"+A);
	}
	
}
