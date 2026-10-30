public abstract class Character {
    protected String name;
    protected int healthPoints;
    protected int basePower;

    // The constructor must be inside the class braces
    public Character(String name, int healthPoints, int basePower) {
        this.name = name;
        this.healthPoints = healthPoints; // Fixed the typo here ("heathPoints" -> "healthPoints")
        this.basePower = basePower;
    }

    public abstract int calculateAttackPower();

    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + healthPoints);
        System.out.println("Base Power: " + basePower);
    }
}


