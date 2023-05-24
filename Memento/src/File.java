public class File {
    private String content;

    public File(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public FileSnapshot createFileSnapshot(String comment)
    {
        return new FileSnapshot(this.content, comment);
    }
    public void restoreFile(FileSnapshot fileSnapshot)
    {
        this.content = fileSnapshot.getContent();
    }

    public void print()
    {
        System.out.println(this.content);
    }
}
