
public class condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double a=5, b=65, c=20;
			if(Math.sqrt(b)*Math.sqrt(b)==(b))
			System.out.println(b+"es exacto");
			else
				System.out.println(b+"no es exacto");
			
			
			 if (a%2==0)
				 System.out.println(a+" es impar");
			 else
				 System.out.println(a+" es par");
			 if (b%2==0)
				 System.out.println(b+"es par");
			 else
				 System.out.println(b+"es impar");
			 if (c%2==0)
				 System.out.println(c+"es par");
			 else
				 System.out.println(c+"es impar");
				if(a>b)
					if(a>c)
						if(b>c)
				System.out.println(" "+a+b+c);
					else
					System.out.println(""+a+c+b);
						else
						System.out.println(""+c+a+b);
						else	
						if (b>c)
							System.out.println(""+b+a+c);
								if (a>c)
									System.out.println(""+b+c+a);
							else
								System.out.println(""+c+b+a);
				
				}

}
