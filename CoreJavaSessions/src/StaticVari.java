
public class StaticVari {
	static int a;
	int b;
	
	public void add()
	{
		int result=a+b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("result: "+result);
	}
	public static void main(String[] args) {
		
		StaticVari st=new StaticVari();
		st.add();

	}

}
