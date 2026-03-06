package p1;
public class SamePackage
{
	public SamePackage()
	{
		Protection p = new Protection();
     System.out.println("SamePackage constructor");
	 System.out.println("n = " + p.n);
	 // class only
	 // System.out.println("n_pri = " + p.n_pri);
	 System.out.println("n_pub = " + p.n_pub);
	 System.out.println("n_pro = " + p.n_pro);
	}
}