class Toy {
    private String type;
    private int difficultyLevel;

    public Toy(String type, int difficultyLevel) {
        this.type = type;
        this.difficultyLevel = difficultyLevel;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getDifficultyLevel() { return difficultyLevel; }
    public void setDifficultyLevel(int difficultyLevel) { this.difficultyLevel = difficultyLevel; }

    public boolean isChallenging() {
        return difficultyLevel > 7;
    }

    public String toString() {
        return "Toy Type: " + type + ", Difficulty Level: " + difficultyLevel;
    }
}
