class A
{
	int i,j;
	void showij(){
		System.out.println("i and j "+ i+" "+j);
	}
}
class b extends A{
	int k;
 void showk(){
	 System.out.println("k "+k);
 }
	 void sum(){
		System.out.println("i + j +k"+ (i+j+k));
			
	 }
}
 class simpleinheritance
 {
 public static void main(String[] args) 
	{
		A superob = new A();
		superob.i=20;
		superob.j=15;
		 superob.showij();
		b subob = new b();
	subob.i=10;
	subob.j=20;
	subob.k=30;
	
	subob.showk();
	subob.sum();
	}
}
