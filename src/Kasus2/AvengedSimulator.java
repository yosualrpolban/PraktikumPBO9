package Kasus2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AvengedSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Superhero> superhero = new ArrayList();
		addSuperhero(superhero);
		Collections.sort(superhero);
		showSuperhero(superhero);

	}
	
	private static void addSuperhero(Collection<Superhero> superhero){
		superhero.add(new ManRay("Gennichiro", 0));
		superhero.add(new FlyingDutchMan("Shirai", 225));
		superhero.add(new ManRay("Gyoubu Masataka Oniwa", 553));
		superhero.add(new DirtyBubble("Arnastria",666));
		superhero.add(new FlyingDutchMan("Kuroi Neko", 777));
		superhero.add(new FlyingDutchMan("Tatenari", 36556));
		
	}
	
	private static void showSuperhero(List<Superhero> superhero) {
		// TODO Auto-generated method stub
		for(Superhero superheroo : superhero) {
			System.out.println(superheroo);
			superheroo.Identify();
			superheroo.showPower();
		}
	}

}
