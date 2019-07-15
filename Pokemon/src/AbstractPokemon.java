
public abstract class AbstractPokemon implements PokemonInterface {
	public abstract Pokemon createPokemon(String name, String type, int health);
	public abstract String pokemonInfo(Pokemon pokemon);
}
