import java.util.ArrayList;
import java.util.HashMap;

public class VersionControlSystem {
    private static int snapshotId = 12091;
    private HashMap<String, FileSnapshot> fileVersions = new HashMap<String, FileSnapshot>();

    public void addSnapshot(FileSnapshot fs)
    {
        this.fileVersions.put(String.valueOf(snapshotId++), fs);
    }

    public FileSnapshot getFileSnapshot(String id)
    {
        return this.fileVersions.get(id);
    }

    public void printSnapshotsList()
    {
        System.out.println();
        this.fileVersions.forEach((s, fileSnapshot) ->
        {
            System.out.println(s + " - " + fileSnapshot.getComment());
        });
    }
}
