public class Main {

    public static void main(String[] args) {
        VersionControlSystem simpletGitlab = new VersionControlSystem();

        File file1 = new File("Continut initial al fisierului.");
        file1.print();
        simpletGitlab.addSnapshot(file1.createFileSnapshot("Versiune initiala - backup."));

        file1.setContent("Modificare totala - 1.");
        file1.print();
        simpletGitlab.addSnapshot(file1.createFileSnapshot("Fisierul a fost complet modificat - am reanalizat raportul."));

        file1.setContent("Fisier modificat din nou - modificare totala - 2.");
        file1.print();
        simpletGitlab.addSnapshot(file1.createFileSnapshot("Din nou - fisierul a fost complet modificat - corectare greseli."));

        simpletGitlab.printSnapshotsList();

        file1.restoreFile(simpletGitlab.getFileSnapshot("12092"));
        file1.print();
    }
}
