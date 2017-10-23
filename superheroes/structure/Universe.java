package structure;

import java.util.List;
import structure.Character;

public abstract class Universe {
	private String name; //DC, Marvel
	private List<Character> superheroes;
	
	public Universe() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Character> getSuperheroes() {
		return superheroes;
	}

	public void setSuperheroes(List<Character> superheroes) {
		this.superheroes = superheroes;
	}
	
}