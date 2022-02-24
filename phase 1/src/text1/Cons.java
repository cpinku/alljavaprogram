package text1;

class Cons {
	int side,le,bt;
	double rad ;
	
	Cons(){
		System.out.println("default constructor");
	}
	
	Cons(int g){
		side=g;
		System.out.println("area of square:" +g*g);
	}
	Cons(int k,int f){
		le=k;
		bt=f;
		System.out.println("area of rect:" +k*f);
	}
	Cons(double m){
		rad=m;
		System.out.println("area of circle:" +3.14*m*m);
	}
	
	
	void square(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void rect(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void circle(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
    
    void area(double d, double e) {
    	System.out.println("Area of Rhombus: " + ( d * e ) / 2);
    }
    void area(int base, int height) {
    	System.out.println("Area of Triangle: " + ( base * height ) / 2);
    }
    


    public static void main(String[] arg){
		Cons d=new Cons();
		Cons sq=new Cons(2);
		Cons r=new Cons(11,12);
		Cons c=new Cons(2.5);
		Cons ob=new Cons();
		ob.square(7);
		ob.rect(11,12);
		ob.circle(7.8);
		ob.area(3,9);
		ob.area(2,4);
	}
}
		
	
		

	

