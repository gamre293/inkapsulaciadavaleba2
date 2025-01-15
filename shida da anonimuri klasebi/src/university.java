class university {
    private String name;
    private boolean isStateUniversity;
    private int numberOfFaculties;

    public university(String name, boolean isStateUniversity, int numberOfFaculties) {
        this.name = name;
        this.isStateUniversity = isStateUniversity;
        this.numberOfFaculties = numberOfFaculties;
    }

    public void printUniversityInfo() {
        System.out.println("University Name: " + name);
        System.out.println("State University: " + (isStateUniversity ? "Yes" : "No"));
        System.out.println("Number of Faculties: " + numberOfFaculties);
    }
}
