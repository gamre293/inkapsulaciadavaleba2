class BookIssuer extends LibraryEmployee {
    private String issueStartTime;
    private String issueEndTime;

    public BookIssuer(String firstName, String lastName, int id, String issueStartTime, String issueEndTime) {
        super(firstName, lastName, id);
        this.issueStartTime = issueStartTime;
        this.issueEndTime = issueEndTime;
    }

    public String getIssueStartTime() {
        return issueStartTime;
    }

    public String getIssueEndTime() {
        return issueEndTime;
    }
}