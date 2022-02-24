package program.a2;
import program.a1.*;
public class Y{
	public static void main (String args[]){
		new M().methodPublic();
		new M().methodProtected();
		new M().methoddefault();
		new N().methodPublic();
		new N().methodProtected();
		new N().methodDefault();
		//new X().methodPublic();
		//new X().methodDefault()
		//new X().methodProtected()
		System.out.println("X Class: value of default long value of int d:"+ new X().d);
		System.out.println("X Class: value of protected float h:"+ new X().h); 
		System.out.println("X Class: value of public char c:"+ new X().d); 
	

	}

}
