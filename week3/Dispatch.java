class A 
{
	void callme(){
		System.out.println("callme in class A");
}
}
	class B extends A
	{
		void callme(){
		System.out.println("callme in class B");
		}
	}
	class C extends A
	{
		void callme(){
			System.out.println("callme in class c");
		}
		void callme1(){
			System.out.println("callme1 in class c");
		}
	}
		class Dispatch
		{
    	public static void main(String[] args) 
	{
			A a=new A();
			B b=new B();
			C c =new C();
			A r;
			r=a;
			a.callme();
			r=b;
			b.callme();
			r=c;
			c.callme();
	}
}
