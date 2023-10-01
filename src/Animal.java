public class Animal {
    private static int nextId = 1;
    private int id;
    String family;
   String name ;
  int age ;
  boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.id = nextId++;

        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Famille : " + this.family + "\n" +
                "Nom : " + this.name + "\n" +
                "Âge : " + this.age + "\n" +
                "Est un mammifère : " + this.isMammal;
    }


    public int getId() {
        return this.id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}

