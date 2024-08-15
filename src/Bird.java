public abstract class Bird {
    private String name;
    private int age;
    private float weight;
    private SwimmingEntity swimBehavior;
    private FlyingEntity flyBehavior;


    public Bird(String name, int age, float weight, SwimmingEntity swimBehavior, FlyingEntity flyBehavior){
        this.name = name;
        this. age = age;
        this.weight = weight;
        this.flyBehavior = flyBehavior;
        this.swimBehavior = swimBehavior;
    }



    public abstract void eatFood();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public FlyingEntity getFlyBehavior() {
        return flyBehavior;
    }

    public SwimmingEntity getSwimBehavior() {
        return swimBehavior;
    }

    public void setFlyBehavior(FlyingEntity flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setSwimBehavior(SwimmingEntity swimBehavior) {
        this.swimBehavior = swimBehavior;
    }
}