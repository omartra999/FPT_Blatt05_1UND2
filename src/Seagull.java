public class Seagull extends Bird{
    private float maxAirSpeed;
    public Seagull(String name, int age, float weight, float maxAirSpeed, FlyingEntity flyingEntity, SwimmingEntity swimmingEntity){
        super(name, age, weight, null, flyingEntity);
        this.maxAirSpeed = maxAirSpeed;
    }

    @Override
    public void eatFood() {
        System.out.println("Seagull food");
    }
}