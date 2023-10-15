public class AquaticAnimal {
    String habitat;
    public AquaticAnimal(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Habitat : " + habitat;
    }


    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

}
