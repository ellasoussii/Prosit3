public class Zoo {

    private final int nbrCages = 25;
    private int nbrAnimals;
    private String name;

    public Zoo(String name) {
        this.name = name;
        this.nbrAnimals = 0;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public String getName() {
        return name;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

    public Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }

    public void displayZoo() {
        System.out.println("Zoo name: " + name);
        System.out.println("Number of animals: " + nbrAnimals);
        System.out.println("Number of cages: " + nbrCages);
        System.out.println("Zoo full: " + isZooFull());
    }
}