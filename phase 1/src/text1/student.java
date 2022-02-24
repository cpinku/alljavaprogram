package text1;

public class student {
        String name;
		int age;
		char section;
		char gender;
		int subject1,subject2,subject3;
		int tot,avg;
		
		public student(String n,int a,char b,char c,int subj1,int subj2,int subj3){
			
			name=n;
			age=a;
		    section=b;
			gender=c;
			subject1=subj1;
			subject2=subj2;
			subject3=subj3;
		    tot=subj1+subj2+subj3;
		    avg=(tot/2);
		}
		
		void display(){
			System.out.println(name+" "+age+" "+section+" "+gender+" "+subject1+" "+subject2+" "+subject3+" "+tot+" "+avg+"%");
		}
		public static void main(String[] arg){
			student s1=new student("efg",18,'A','F',10,25,35);
			student s2=new student("hij",19,'B','M',16,20,45);
			student s3=new student("klm",20,'C','F',40,60,50);
			student s4=new student("nop",21,'D','M',50,50,50);
			
			s1.display();
			s2.display();
			s3.display();
			s4.display();
		}
	}
			


	