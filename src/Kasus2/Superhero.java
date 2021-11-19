package Kasus2;

import java.util.List;

public abstract class Superhero implements Comparable<Superhero>{
	int PowerLevel;
	String name;
	private List<Power> PowerList;
	
	public int getPowerLevel() {
		return PowerLevel;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void addPower(Power power);
	public abstract void Identify();
	
	public abstract void showPower();

	@Override
	public int compareTo(Superhero o){
		if(this.PowerLevel < o.PowerLevel) {
			return 1;
		}else if(this.PowerLevel > o.PowerLevel) {
			return -1;
		}
		return 0;
	}
}
