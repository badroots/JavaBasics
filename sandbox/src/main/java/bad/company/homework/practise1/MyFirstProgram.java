package bad.company.homework.practise1;

public class MyFirstProgram {

	public static void main(String[] args){

		double a = 2;
		double b = 3;
    System.out.println(area(a,b));

    System.out.println(area(b));

    }

	public static double area(double len) {
		return len * len;
	}

	public static double area(double a, double b) {
		return a * b;
	}

}