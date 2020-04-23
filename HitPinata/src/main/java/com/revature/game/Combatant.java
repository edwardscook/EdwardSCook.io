package com.revature.game;

public abstract class Combatant {

	private long stamina;
	private long strength;
	
	public abstract long attack();
	
	public void getAttacked(long atkStrength) {
		this.setStamina(this.stamina - atkStrength);
	
	if (this.stamina < 0) {
		this.stamina = 0;
	}
	
}
	public long getStamina() {
		return stamina;
	}
	public long getStrength() {
		return strength;
	}
	public long setStamina(long stam) {
		return stamina = stam;
	}
	
	public void setStrength(long strn) {
		strength = strn;
	}

	
}