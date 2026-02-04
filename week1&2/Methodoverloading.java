class  Methodoverloading
{
	float sum(float a,float b)
		{
		return a+b;
	}
	double sum(double a,double b,double c)
	{
		return a+b+c;
	}	
	public static void main(String[] args)
		{
		
		Methodoverloading obj= new Methodoverloading();
		
		float result1=obj.sum(20,30);
		System.out.println("result :" +result1);
		
		double result2=obj.sum(10,20,30);
		System.out.println("result :" +result2);
		
		}
		
}
