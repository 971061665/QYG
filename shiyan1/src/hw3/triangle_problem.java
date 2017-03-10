package hw3;

public class triangle_problem {
	String triangle_juidje(double a,double b, double c){
		if(a == b && a == c){
			String str = new String();
			str = "the trangle is equilateral";
			return str;
		}
		if((a+b)>c &&(a+c)>b &&(b+c)>a){
			if((a == b && a != c)|| (a==c && a != b) || (b == c && b != a)){
				String str = new String();
				str = "the trangle is isosceles";
				return str;
			}
			if(a!=b && b!=c){
				String str = new String();
				str = "the trangle is scalene";
				return str;
			}
			
		}
		else{
			String str = new String();
			str = "the three edges can't make up a trangle!";
			return str;
		}
		return null;
		
	}

}
