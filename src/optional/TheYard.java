package optional;

import java.util.ArrayList;
import java.util.List;

/* Extract a Milkshake class from TheYard */

public class TheYard {

	public static class Milkshake {
		public String iceCreamFlavor;
		public boolean cherryOnTop;
		public String syrupFlavor;

		public Milkshake() {
			
		}
	}


	private Milkshake milkShake = new Milkshake();

	public void setMilkshake(String iceCreamFlavor, boolean cherryOnTop, String syrupFlavor) {
		this.milkShake.iceCreamFlavor = iceCreamFlavor;
		this.milkShake.cherryOnTop = cherryOnTop;
		this.milkShake.syrupFlavor = syrupFlavor;
	}
	private List<Boy> theBoys = new ArrayList<Boy>();

	void bringAllTheBoysToTheYard() {
		for (Boy aBoy : theBoys) {
			aBoy.bringToTheYard(milkShake.iceCreamFlavor, milkShake.cherryOnTop, milkShake.syrupFlavor);
		}
	}

	public void addBoy(Boy boy) {
		this.theBoys.add(boy);
	}


	public static void main(String[] args) {
		TheYard theYard = new TheYard();
		theYard.setMilkshake("vanilla", true, "strawberry");
		theYard.addBoy(new Boy("groucho"));
		theYard.addBoy(new Boy("harpo"));
		theYard.addBoy(new Boy("zeppo"));
		theYard.bringAllTheBoysToTheYard();
	}

}

class Boy {

	private String name;

	public Boy(String name) {
		this.name = name;
	}

	public void bringToTheYard(String iceCreamFlavor, boolean cherryOnTop, String syrupFlavor) {
		if (cherryOnTop)
			System.out.println("damn right, it's better than yours");
		else
			System.out.println("i could teach you, but i'd have to charge");
	}

}
