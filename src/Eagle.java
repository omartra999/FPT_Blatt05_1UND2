//child class of Flying Birds must have a matching constructor
public class Eagle extends Bird  {
    private float maxAirSpeed;

    public Eagle(String name, int age, float weight, float maxAirSpeed, SwimmingEntity swimmingEntity, FlyingEntity flyingEntity){
        super(name, age, weight, null, flyingEntity);
    }



    @Override
    public void eatFood() {
        System.out.println("Eagle food");
    }

}