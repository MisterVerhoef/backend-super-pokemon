public class GrassPokemon extends Pokemon{

    int razorLeaf;
    int solarBeam;

    public GrassPokemon(double accuracy, int attack, int defence, String food, double height, int hp, int level, String name, String sound, int weight, int xp, int razorLeaf, int solarBeam) {
        super(accuracy, attack, defence, food, height, hp, level, name, sound, weight, xp);
        this.razorLeaf = razorLeaf;
        this.solarBeam = solarBeam;
    }

    public int getRazorLeaf() {
        return razorLeaf;
    }

    public void setRazorLeaf(int razorLeaf) {
        this.razorLeaf = razorLeaf;
    }

    public int getSolarBeam() {
        return solarBeam;
    }

    public void setSolarBeam(int solarBeam) {
        this.solarBeam = solarBeam;
    }

    @Override
    public void speaks() {
        System.out.println("Roar");
    }

    @Override
    public void eats() {
        System.out.println(GrassPokemon.this.getName() + " is eating " + GrassPokemon.this.getFood());
    }

    @Override
    public void attacks(){
        System.out.println(GrassPokemon.this.getName() + " is attacking");
    }

}
