

class Parent2 {
	int q = 10;
    private void m1()
    {
        System.out.println("From parent m1()");
    }  
    
    protected void m2()
    {
        System.out.println("From parent m2()");
    }
    
    public void m3()
    {
        System.out.println("From parent m3()");
    }
}
  
class Child2 extends Parent2 {
	int q = 10;
    public void m1()
    {
        System.out.println("From child m1()");
    }  

//    @Override
//	protected void m2() {
//		// TODO Auto-generated method stub
//		super.m2();
//	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		super.m3();
	}

	private void m4()
    {
        System.out.println("From child m4()");
    }
    
    protected void m5()
    {
        System.out.println("From child m5()");
    }
    
    
}
  
// Driver class
class Overriding6 {
    public static void main(String[] args)
    {
        Parent2 obj1 = new Parent2();
        obj1.m2();
        obj1.m3();
        System.out.println("========================");
        
        
        //obj1.m1();//compile time error because m1 is private method hence not accessible from outside the class
        Parent2 obj2 = new Child2();
        obj2.m2();
        obj2.m3();
       
        System.out.println("========================");
        
        Child2 c = new Child2();
        System.out.println("========================");
    }
}