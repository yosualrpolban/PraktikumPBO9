package Kasus2;

import java.util.ArrayList;
import java.util.List;

public class ManRay extends Superhero implements Comparable<Superhero>{
	private int PowerLevel;
	private String name;
	private List<Power> PowerList;
	
	ManRay(String Name, int powerLevel) {
		this.name = Name;
		this.PowerLevel = powerLevel;
		this.PowerList = new ArrayList<Power>();
		addPower(new LaserEye());
		addPower(new Strength());
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public int getPowerLevel() {
		return this.PowerLevel;
	}
	
	public void addPower(Power power) {
		PowerList.add(power);
	}
	
	public void Identify() {
		System.out.println("===============================================");
		System.out.println("its " + getName() + "the Man Ray ! it has the power level of " + getPowerLevel());
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAAAME IS " + getName());
	}
	
	public void showPower() {
		System.out.println("ITS TIME TO SHOW MY POWER");
		for(Power power: PowerList) {
			power.doPower();
		}
		System.out.println("===============================================");
	}


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
