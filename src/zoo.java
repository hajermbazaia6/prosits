
public class zoo {
    private static final int MAX_ANIMALS = 100;
    private static final int MAX_CAGES = 25;

    Animal [] animals;
    String name;
    String city;
    private int nbrCages = MAX_CAGES;
    int animalsCount = 0;


    public zoo(Animal[] animals, String name, String city) {
        this.animals = new Animal[MAX_CAGES];
        this.name = name;
        this.city = city;
    }

    public boolean isZooFull() {
        return animalsCount >= nbrCages;
    }

    public static zoo comparerZoo(zoo z1, zoo z2) {
        if (z1.animalsCount > z2.animalsCount) {
            return z1;
        } else {
            return z2;
        }
    }
    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        if (nbrCages <= MAX_CAGES) {
            this.nbrCages = nbrCages;
        } else {
            System.out.println("Error: Cannot set the number of cages to a value greater than the maximum allowed.");
        }
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + this.name);
        System.out.println("Ville : " + this.city);
        System.out.println("Nombre de cages : " + this.nbrCages);
    }

    @Override
    public String toString() {
        return "Nom du zoo : " + this.name + "\n" +
                "Ville : " + this.city + "\n" +
                "Nombre de cages : " + this.nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        if (animalsCount < MAX_ANIMALS) {
            for (int i = 0; i < animalsCount; i++) {
                if (animals[i].getId() == animal.getId() || animals[i].name.equals(animal.name)) {
                    return false;
                }
            }
            animals[animalsCount] = animal;
            animalsCount++;
            return true;
        } else {
            return false;
        }
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalsCount; i++) {
            if (animals[i].getId() == animal.getId()) {
                animals[i] = animals[animalsCount - 1];
                animals[animalsCount - 1] = null;
                animalsCount--;
                return true;
            }
        }
        return false;
    }

    public void displayAnimals() {
        for (int i = 0; i < animalsCount; i++) {
            if (animals[i] != null) {
                System.out.println("Animal " + (i+1) + ":");
                System.out.println("Nom : " + animals[i].name);
                System.out.println("Famille : " + animals[i].family);
                System.out.println("Âge : " + animals[i].age);
                System.out.println("Est un mammifère : " + animals[i].isMammal);
                System.out.println("---------------------------");
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalsCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

}
