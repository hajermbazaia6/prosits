import java.util.Scanner;

public class ZooManagement {
    int nbrCage;
    String zooName;

    public ZooManagement(int nbrCage, String zooName) {
        this.nbrCage = nbrCage;
        this.zooName = zooName;
    }

    public static void main(String[] args) {

        Animal lion= new Animal("lions","maya",12,true);
        Animal[] anmalsarray ={lion};
        zoo myZoo= new zoo ( anmalsarray,  "myzoo",  "beja");
        Scanner scanner = new Scanner(System.in);

        zoo myZoo1 = new zoo(anmalsarray, "myzoo1", "beja");
        zoo myZoo2 = new zoo(anmalsarray, "myzoo2", "tunis");

        zoo zooWithMoreAnimals = zoo.comparerZoo(myZoo1, myZoo2);

        boolean ajoutLion = myZoo.addAnimal(lion);

        if (ajoutLion) {
            System.out.println("Lion ajouté avec succès !");
        } else {
            System.out.println("Impossible d'ajouter le lion. Le zoo est plein.");
        }

        myZoo.displayAnimals();

        Animal animalRecherche = new Animal("", "maya", 0, false);
        int indiceAnimal = myZoo.searchAnimal(animalRecherche);

        if (indiceAnimal != -1) {
            System.out.println("L'animal a été trouvé à l'indice : " + indiceAnimal);
        } else {
            System.out.println("L'animal n'a pas été trouvé.");
        }


        System.out.println(lion);
        System.out.println(lion.toString());
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        if (!myZoo.isZooFull()) {

        } else {
            System.out.println("Le zoo est plein. Impossible d'ajouter un nouvel animal.");
        }

        System.out.print("Entrez le nombre de cages : ");
        int nbCages = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Entrez le nom du zoo : ");
        String nomZoo = scanner.nextLine();

        ZooManagement zoo = new ZooManagement(nbCages, nomZoo);

        System.out.println(zoo.zooName + " comporte " + zoo.nbrCage + " cages.");


        AquaticAnimal aquaticAnimal = new AquaticAnimal("Océan");

        TerrestrialAnimal terrestrialAnimal = new TerrestrialAnimal(4);

        Dolphin dolphin = new Dolphin("Océan", 20.5f);

        Penguin penguin = new Penguin("Océan", 10.2f);


        System.out.println("Aquatic Animal:");
        System.out.println(aquaticAnimal);

        System.out.println("\nTerrestrial Animal:");
        System.out.println(terrestrialAnimal);

        System.out.println("\nDolphin:");
        System.out.println(dolphin);

        System.out.println("\nPenguin:");
        System.out.println(penguin);


        aquaticAnimal.swim();
        dolphin.swim();
        penguin.swim();
    }



}
