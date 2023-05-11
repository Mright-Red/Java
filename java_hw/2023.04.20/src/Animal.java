public class Animal {
    private String name;
    private int legs;
    private static int count;
    // public Animals(){};

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
        count++;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setKind(int count) {
        this.count = count;
    }

    public int getLegs() {
        return legs;
    }

    public String getKind() {
        return name;
    }

    public static int getCount() {
        return count;
    }

}

class Fish extends Animal {
    private static int count;

    public Fish(String name, int legs) {
        super(name, legs);
        count++;
    }

    public static int getCount() {
        return count;
    }
}

class Tiger extends Animal {
    private static int count;

    public Tiger(String name, int legs) {
        super(name, legs);
        count++;
    }

    public static int getCount() {
        return count;
    }
}

class SouthEastTiger extends Tiger {
    private static int count;

    public SouthEastTiger(String name, int legs) {
        super(name, legs);
        count++;
    }

    public static int getCount() {
        return count;
    }
}