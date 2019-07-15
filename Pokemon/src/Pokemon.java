
public class Pokemon {
	protected String name;
	protected String type;
	protected int health = 0;
	protected static int count = 0;
	
	void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
	}
	public Pokemon(String name, String type, int health) {
		count++;
		this.setHealth(health);
		this.setName(name);
		this.setType(type);
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHealth() {
		return this.health;
	}
	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}
}
