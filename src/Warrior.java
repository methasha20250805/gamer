class Warrior extends Character{
    private int swordStrength;
    public Warrior(String name, int healthPoints, int basePower, int swordStrength){
        super(name, healthPoints, basePower);
        this.swordStrength = swordStrength;
    }
    public int calculateAttackPower(){
        return basePower + swordStrength;
    }
}
