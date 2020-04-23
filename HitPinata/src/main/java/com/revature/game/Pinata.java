package com.revature.game;

import java.util.Random;

public class Pinata extends Combatant{
	
	
	
		public Pinata() {
			
			Random rdm = new Random();
			
			int durability = rdm.nextInt(100)+20; //random element
			this.setStamina(this.getStamina() /2 + durability);
			
			int swingPact = rdm.nextInt(100) + 10; //random element
			this.setStrength((this.getStrength() / 2) + swingPact);
		}
			
			
			public long attack() {
				
				long swingback = this.getStrength();
				return swingback;
		}
		

	
	@Override
	public String toString() {
		return "Pinata durability is: " + this.getStamina() + 
				"\n Pinata strength is: " + this.getStrength();
	}
}

