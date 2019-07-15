
public class Pokedex extends AbstractPokemon {
	protected String myPokemon = "";
	public String pokemonInfo(Pokemon pokemon) {
		return "Name: "+pokemon.getName()+", Health: "+pokemon.getHealth()+", Type: "+pokemon.getType()+"";
	}
	public void listPokemon() {
		System.out.println(myPokemon);
	}
	public Pokemon createPokemon(String name, String type, int health) {
		myPokemon += "Name: "+name+"\r\n";
		return new Pokemon(name, type, health);
	}
}
