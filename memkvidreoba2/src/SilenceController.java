class SilenceController extends LibraryEmployee {
    private double strictness;

    public SilenceController(String firstName, String lastName, int id, double strictness) {
        super(firstName, lastName, id);
        this.strictness = strictness;
    }

    public double getStrictness() {
        return strictness;
    }
}