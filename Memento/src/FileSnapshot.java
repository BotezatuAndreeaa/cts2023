public class FileSnapshot {
    private String content;
    private String comment;

    public FileSnapshot(String content, String comment) {
        this.content = content;
        this.comment = comment;
    }

    public String getContent() {
        return content;
    }

    public String getComment() {
        return comment;
    }
}
