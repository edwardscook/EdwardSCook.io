package com.revature.game;


public class YouZer extends Combatant implements Recovery {
	private String name;
	
	
	public YouZer() {
		name = "";
		
	}
	
	
	public void recover() {
		
		this.setStamina(getStamina() + 100);
	}
	
	
	public long attack() {
				
				long batSwing = this.getStrength();
				return batSwing;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String toString() {
		return ">Your hero name is : " + name + 
				"\n>Your stamina is : " + this.getStamina() +
				"\n>Your strength is : " + this.getStrength();
	}
	
	
}	