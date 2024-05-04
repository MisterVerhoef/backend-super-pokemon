public class ElectricPokemon extends Pokemon {

    int electroBall;
    int voltTackle;
    int thunder;

    public ElectricPokemon(double accuracy, int attack, int defence, String food, double height, int hp, int level, String name, String sound, int weight, int xp) {
        super(accuracy, attack, defence, food, height, hp, level, name, sound, weight, xp);
    }

    public int getElectroBall() {
        return electroBall;
    }

    public void setElectroBall(int electroBall) {
        this.electroBall = electroBall;
    }

    public int getThunder() {
        return thunder;
    }

    public void setThunder(int thunder) {
        this.thunder = thunder;
    }

    public int getVoltTackle() {
        return voltTackle;
    }

    public void setVoltTackle(int voltTackle) {
        this.voltTackle = voltTackle;
    }

    @Override
    public void speaks() {
        System.out.println("Roar");
    }

    @Override
    public void eats() {
        System.out.println(ElectricPokemon.this.getName() + " is eating " + ElectricPokemon.this.getFood());
    }

    @Override
    public void attacks(){
        System.out.println(ElectricPokemon.this.getName() + " is attacking" + "using" + ElectricPokemon.this.getThunder());
    }
}

