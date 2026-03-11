public class  Multicatch
{
	public static void main(String[] args) 
	{ 
		try{
			int a=args.length;
			System.out.println("a="+a);
			int b =42/a;
			int c[]={1};
			c[42]=88;
		}
		catch(ArithmeticException e){
			System.out.println("divide by 0 VJIT:" +e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of Bounds:" +e);
		}
		catch(Exception e)
		{
			System.out.println("divide by 0 VJIT:" +e);
			System.out.println("Array index out of Bounds:" +e);
	}
	System.out.println("after try/catch blocks");
}
}