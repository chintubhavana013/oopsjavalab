package MyPack;
public class  balance
{
	String name;
	double bal;
	
	public balance(String n,double d){
		name=n;
		bal=d;
	}
		public void show(){
			if(bal<0){
				System.out.println("the value is --");
			}
			System.out.println(name  + ":$"+  bal);
		}	
			
}
