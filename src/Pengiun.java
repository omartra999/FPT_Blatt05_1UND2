public class Pengiun extends Bird{
    private float maxWaterSpeed;
    public Pengiun(String name, int age, float weight, float maxWaterSpeed, SwimmingEntity swimmingEntity, FlyingEntity flyingEntity){
        super(name, age, weight, swimmingEntity, null  );
    }
    @Override
    public void eatFood() {
        System.out.println("penguin eatfood");
    }


}