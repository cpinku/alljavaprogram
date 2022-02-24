package program.a1;

public class M {
        private int x=20;
		long y=2000;
		protected float z=12;
	
		
		public void methodPublic(){
			
			methodPrivate();
		}
		protected void methodProtected(){
			System.out.println("M Class:methodProtected");
			methodPrivate();
		}
		void methoddefault(){
			System.out.println("M Class:methodDefault");
			methodPrivate();
			
		}
		
		private void methodPrivate(){
			System.out.println("M class:method private");
			System.out.println("Value of private int x:" + x);
			System.out.println("Value of long y:" + y);
			System.out.println("Value of float z:" + z);
		}
	}

	
			

		

