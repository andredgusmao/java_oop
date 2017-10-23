package marvel;

import java.util.ArrayList;
import java.util.List;

import powers.SpiderSense;
import powers.SuperAgility;
import powers.SuperStrength;
import structure.Abilities;
import structure.Character;
import structure.Power;

public class SpiderMan extends Character {

	public SpiderMan() {
		this.setName("Spider-Man");
		this.setRealName("Peter Benjamin Parker");
		this.setUniverse(new MarvelUniverse());
		this.setPlaceOfBirth("Forest Hills, New York");
		this.setPowers(this.powers());
		this.setAbilities(this.abilities());
	}
	
	private List<Power> powers() {
		ArrayList<Power> powers = new ArrayList<>();
		powers.add(new SpiderSense());
		powers.add(new SuperAgility());
		powers.add(new SuperStrength());
		
		return powers;
	}
	
	private Abilities abilities() {
		Abilities abilities = new Abilities();
		abilities.setDurability(3);
		abilities.setEnergy(4);
		abilities.setFighting(5);
		abilities.setIntelligence(4);
		abilities.setSpeed(5);
		abilities.setStrength(4);
		
		return abilities;
	}
}
