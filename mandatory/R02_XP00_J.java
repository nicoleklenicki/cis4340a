//Rule: XP00
//Compliant Version

import java.io.File;

public class R02_XP00_J {
    public static void main(String[] args) {
        deleteFile();
    }

    public static void deleteFile() {
        File someFile = new File("someFileName.txt");

        if (!someFile.delete()) {
            System.out.println("Failed to delete file.");
        }
    }
}
