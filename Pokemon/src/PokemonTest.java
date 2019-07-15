
public class PokemonTest extends Pokedex {
	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon charmander = pokedex.createPokemon("Charmander", "Fire", 10);
		Pokemon quagsire = pokedex.createPokemon("Quagsire", "Water/Ground", 50);
		
		System.out.println(pokedex.pokemonInfo(charmander));
		charmander.attackPokemon(quagsire);
		pokedex.listPokemon();
		System.out.println(quagsire.getHealth());
	}
}
