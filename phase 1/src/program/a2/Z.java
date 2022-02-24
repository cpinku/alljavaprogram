package program.a2;

public class Z {

	public static void main(String args[]) {
		new M().methodPublic();
		new M().methodProtected();
		new M().methoddefault();
		new N().methodPublic();
		new N().methodProtected();
		new N().methoddefault();
		new X().methodPublic();
		new P().callfromclassMN();
		
		

	}

}
