package text1;

public class buffer {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Started Java");
		System.out.println("string buffer:"+s);
		s.append("Phase1");
		System.out.println(s);
		s.delete(2,5);
		System.out.println(s);
		s.replace(4,6,"Python");
		System.out.println(s);
		s.insert(3,"language");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}
}
			
			