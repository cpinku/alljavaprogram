package program.a1;

public class P {

	public static void main(String[] args) {
		callfromclassMN();
	}
	public static void callfromclassMN(){
		System.out.println("P Class:calling");
		new M().methodPublic();
		new M().methodProtected();
		new M().methoddefault();
		new N().methodPublic();
		new N().methodProtected();
		new N().methoddefault();
	


	}

}
