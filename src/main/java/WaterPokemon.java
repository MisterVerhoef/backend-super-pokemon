public class WaterPokemon extends Pokemon{

    int hydroCanon;
    int hydroPump;

    public WaterPokemon(double accuracy, int attack, int defence, String food, double height, int hp, int level, String name, String sound, int weight, int xp, int fireBomb, int lavabreath) {
        super(accuracy, attack, defence, food, height, hp, level, name, sound, weight, xp);
        this.hydroCanon = hydroCanon;
        this.hydroPump = hydroPump;
    }

    public int getHydroCanon() {
        return hydroCanon;
    }

    public void setHydroCanon(int hydroCanon) {
        this.hydroCanon = hydroCanon;
    }

    public int getHydroPump() {
        return hydroPump;
    }

    public void setHydroPump(int hydroPump) {
        this.hydroPump = hydroPump;
    }

    @Override
    public void speaks() {
        System.out.println("Roar");
    }

    @Override
    public void eats() {
        System.out.println(WaterPokemon.this.getName() + " is eating " + WaterPokemon.this.getFood());
    }

    @Override
    public void attacks(){
        System.out.println(WaterPokemon.this.getName() + " is attacking");
    }
}



