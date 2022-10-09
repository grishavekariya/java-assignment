import java.util.*;
public class Practical_2Main
{
	public static void main(String[] args) 
	{
		//Practical_2 robj1 = new Practical_2();
		Practical_2 r2= new Practical_2(7, 3);
		Practical_2 r1= new Practical_2(4,3,2,1);

		System.out.println("Perimeter: "+r1.getPerimeter());
        System.out.println("Area: "+r1.getArea());

        System.out.println("Perimeter 2: "+r2.getPerimeter());
        System.out.println("Area 2: "+r2.getArea());
		System.out.println("\nprepared by 21CE153_grisha");
	}
}

