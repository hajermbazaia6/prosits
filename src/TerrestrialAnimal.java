public class TerrestrialAnimal {
    int nbrLegs;

    public TerrestrialAnimal(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Nombre de pattes : " + nbrLegs;
    }

}
