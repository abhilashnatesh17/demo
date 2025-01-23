package demoproject;

public class Instancemethodnonpara {
	int a=10;
	int b=20;
	public void add()
	{
		int c= a+b;
		System.out.println("Total sum is "+c);
	}

	public static void main(String[] args) {
		Instancemethodnonpara ob=new Instancemethodnonpara();
		ob.add();
		
	}

}
