class  Student
{
	int rollno;
	String name;
	String branch;
	int marks;

void getData(int rollno,String name,String branch,int marks){
	this.rollno=rollno;
	this.name=name;
	this.branch=branch;
	this.marks=marks;
}
 void display()
	{
	 System.out.println("roll no: "+rollno);
	System.out.println("name:"+name);
	System.out.println("branch:  "+branch);
	System.out.println("marks:  "+marks);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		
		s1.getData(01,"sai","cse",90);
		s2.getData(02,"bhavana","eee",100);
		
		s1.display();
		s2.display();
	}
}
