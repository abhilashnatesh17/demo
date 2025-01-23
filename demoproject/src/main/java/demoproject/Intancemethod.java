package demoproject;

public class Intancemethod {

		public void sample(int a, String b)
		{
			System.out.println("Age is  "+a);
			System.out.println("Name is "+b);
		}

		public static void main(String[] args) {
		
			Intancemethod ob=new Intancemethod();
			ob.sample(26,"ABHI");
			
			}
	}
