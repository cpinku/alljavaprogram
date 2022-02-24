package text1;

public class array {

	public static void main(String[] args) {
		int[] a={1,2,4,5};
		int[] b={5,8,9,2};
		int[] c=new int[a.length];
		for(int i=0;i<a.length;++i)
		{
			c[i]=a[i]+b[i];
		
			System.out.println(c[i]);
		}

	}

}
