public class Penguin extends AquaticAnimal{
    float swimmingDepth;

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfondeur de nage : " + swimmingDepth;
    }

}
