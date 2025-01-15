class Library {
    private int id;
    private String name;

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Library ID: " + id);
        System.out.println("Library Name: " + name);
    }
}