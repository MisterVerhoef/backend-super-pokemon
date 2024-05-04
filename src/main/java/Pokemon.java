abstract class Pokemon {

    private String name;
    private int level = 1;
    private int hp = 500;
    private int xp = 10;
    private double height = 1.32;
    private int weight;
    private String food;
    private String sound;
    private int defence = 50;
    private int attack = 25;
    private double accuracy = 10;

    public Pokemon(double accuracy, int attack, int defence, String food, double height, int hp, int level, String name, String sound, int weight, int xp) {
        this.accuracy = accuracy;
        this.attack = attack;
        this.defence = defence;
        this.food = food;
        this.height = height;
        this.hp = hp;
        this.level = level;
        this.name = name;
        this.sound = sound;
        this.weight = weight;
        this.xp = xp;
    }


    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public abstract void eats();

    public abstract void speaks();

    public abstract void attacks();

}
