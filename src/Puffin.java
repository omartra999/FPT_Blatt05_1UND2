public class Puffin extends Bird{
    private float maxAirSpeed;
    private float maxWaterSpeed;

    public Puffin(String name, int age, float weight, float maxAirSpeed, float maxWaterSpeed, FlyingEntity flyingEntity, SwimmingEntity swimmingEntity){
        super(name, age, weight,swimmingEntity, flyingEntity);
        this.maxWaterSpeed = maxWaterSpeed;
        this.maxAirSpeed = maxAirSpeed;
    }

    @Override
    public void eatFood() {

    }
}
