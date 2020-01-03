package Slotsrc;

import java.util.Scanner;

public class SlotsTester {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Pull the lever to play.(press 'enter')");
		
		Scanner keyboard = new Scanner(System.in);
		
	
		@SuppressWarnings("unused")
		String play = keyboard.nextLine();
		
		
		Slots pull = new Slots();
		System.out.println(pull.Lever());
	}
}















