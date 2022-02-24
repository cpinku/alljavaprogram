package program.a1;

public class N {
	
	protected long x=20;
	public int y=2000;
	double z=23;
	
	public void methodPublic(){
		System.out.println("N Class:methodPublic");
		methodPrivate();
	}
	protected void methodProtected(){
		System.out.println("N Class:methodProtected");
		methodPrivate();
	}
	void methoddefault(){
		System.out.println("N Class:methodDefault");
		methodPrivate();
		
	}
	
	private void methodPrivate(){
		System.out.println("N class:method private");
		System.out.println("Value of private int x:" + x);
		System.out.println("Value of long y:" + y);
		System.out.println("Value of float z:" + z);
	}
}

			
