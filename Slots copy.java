package Slotsrc;

import java.util.Random;
//import java.util.ArrayList;

public class Slots {

	private static final int f1 = 7;
	private static final int f2 = 88;
	private static final String f3 = "!";
	private static final String f4 = "!!!";
	Random random = new Random();

	Object[] face1 = new Object[4];
	Object[] face2 = new Object[4];
	Object[] face3 = new Object[4];

	Object wheel1 = face1[random.nextInt(face1.length)];
	{
		face1[0] = f1;
		face1[1] = f2;
		face1[2] = f3;
		face1[3] = f4;
	}
	
	Object wheel2 = face2[random.nextInt(face2.length)];
	{
		face2[0] = f1;
		face2[1] = f2;
		face2[2] = f3;
		face2[3] = f4;
	}
	
	Object wheel3 = face3[random.nextInt(face3.length)];
	{
		face3[0] = f1;
		face3[1] = f2;
		face3[2] = f3;
		face3[3] = f4;
	}
	
	Object Lever() {
		System.out.println(face1[random.nextInt(face1.length)]);
		System.out.println(face2[random.nextInt(face2.length)]);
		System.out.println(face3[random.nextInt(face3.length)]);
		
		if(face1 == face2 && face2 == face3 && face1==face3) {
			System.out.println("Jackpot!!!");
			
		}
		else {
			System.out.println(" ");
			System.out.println("Better luck next time.");
		}
		return (" ");
		
	}

	
}
