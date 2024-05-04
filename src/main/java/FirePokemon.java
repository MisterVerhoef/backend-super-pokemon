public class FirePokemon extends Pokemon {

    int fireLash;
    int flamethrower;

    public FirePokemon(double accuracy, int attack, int defence, String food, double height, int hp, int level, String name, String sound, int weight, int xp, int fireLash, int flamethrower) {
        super(accuracy, attack, defence, food, height, hp, level, name, sound, weight, xp);
        this.fireLash = fireLash;
        this.flamethrower = flamethrower;
    }

    public int getFireLash() {
        return fireLash;
    }

    public void setFireLash(int fireLash) {
        this.fireLash = fireLash;}

    public int getflamethrower() {
        return flamethrower;
    }

    public void setflamethrower(int flamethrower) {
        this.flamethrower = flamethrower;
    }

    @Override
    public void speaks() {
        System.out.println("Roar");
    }

    @Override
    public void eats() {
        System.out.println(FirePokemon.this.getName() + " is eating " + FirePokemon.this.getFood());
    }

    @Override
    public void attacks(){
        System.out.println(FirePokemon.this.getName() + " is attacking using " + FirePokemon.this.getFireLash() + " and " + FirePokemon.this.getflamethrower() + " attacks");
    }
}
