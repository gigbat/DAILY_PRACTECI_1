public class Person implements Comparable<Person>{
    private final String NAME;
    private final int ID;

    public Person(String NAME, int ID) {
        this.NAME = NAME;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    @Override
    public int compareTo(Person o) {
        if (this.ID < o.getID()) {
            return -1;
        } else if (this.ID > o.getID()) {
            return 1;
        } else {
            return 0;
        }
    }
}
