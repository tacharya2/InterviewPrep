class Persons {
    String name;
    Integer id;

    Persons(String n, Integer i) {
        name = n;
        id = i;
    }

    Persons(Integer i) {
        name = null;
        id = i;
    }
    @Override
    public String toString() {
        return name != null ? name + " " + id : "null " + id;
    }
}
