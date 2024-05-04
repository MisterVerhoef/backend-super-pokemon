import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       Pokemon firestarter = new FirePokemon(20, 100,200,"firegummy", 44,400,1,"firestarter", "Flame on", 20, 1,200, 100);


        firestarter.attacks();

        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(firestarter);

    }


}
