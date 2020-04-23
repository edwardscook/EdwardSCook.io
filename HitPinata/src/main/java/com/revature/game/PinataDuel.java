package com.revature.game;

import java.util.Scanner;

public class PinataDuel {
	public static Scanner fromKey = new Scanner(System.in);;
	
	public static void main(String[] args) {
		System.out.println("Time for Pinata Duel!");
		System.out.println("Press Enter twice to continue!"); //to add consumer Scanner for Long because of replay issue
		boolean userIsPlaying = true;
		while (userIsPlaying) {
			userIsPlaying = gameLoop();
		}

		System.out.println("Thanks for playing!");
	
		
		fromKey.close();
	}
	
	public static boolean gameLoop() {
		
		YouZer uero = setUser();
		Pinata enemy = new Pinata();	
		
		boolean gameOver = false;
		
			while (!gameOver) {
			System.out.println("Start Swinging!!!!");
			System.out.println("1. Hit");
			System.out.println("2. Recover");
			System.out.println(fromKey.nextLine());
	
			switch (fromKey.nextInt()) {
				case 1:
					long smack = uero.attack();
					enemy.getAttacked(smack);
					System.out.println("You Solved WORLD hunger!");
					System.out.println("Pinata took " + smack + " damage.");
					System.out.println("Pinata life: " + enemy.getStamina());
					break;
				case 2:
					uero.recover();
					System.out.println("You recoved!");
					System.out.println("Your stamina: " + uero.getStamina());
					break;
				default:
					System.out.println("try again");
					break;
			}
			if (enemy.getStamina() == 0) {
				System.out.println(uero.getName() + " saved the neighborhood!");
				gameOver = true;
			} else {
				System.out.println("Pinata's swinging at you!");
				long swingBack = enemy.attack();
				uero.getAttacked(swingBack);
				System.out.println("Pinata hit you!");
				System.out.println("You took " + swingBack + " damage.");
				System.out.println("Your health: " + uero.getStamina());
			}	
				if (uero.getStamina() == 0) {
					System.out.println("Pinata wins! Try again!");
					gameOver = true;
				}
			}
			
				if (gameOver) {
				
				System.out.println("Continue the fight to cure world hunger, press \"Enter\" key to Save another neighborhood!");
				{
			        try
			        {
			            System.in.read();
			        }  
			        catch(Exception e)
			        {}  
			 }
				
					return true;
				}
			
			 
				
		return false;
	}
	
	public static YouZer setUser() {
			YouZer hero = new YouZer();
		
		
			System.out.println("Today you are a Hero!");
			fromKey.nextLine(); //consumer Scanner to collect \n from both longs on re-loop
			fromKey.nextLine(); //consumer Scanner
			
			System.out.print("Type in your name:");
			hero.setName(fromKey.nextLine());
			
			System.out.print("Choose you stamina level:");
			hero.setStamina((fromKey.nextLong()));
			
			System.out.print("Choose strength:");
			hero.setStrength((fromKey.nextLong()));
			
			System.out.println(hero);
			
			
			return hero;
		
	

	
	}
}

