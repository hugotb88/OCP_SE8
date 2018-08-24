package chapter8_IO;

import java.io.File;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject
 */
public class AnotherFileExample {
    public static void main(String[] args) {
        File file = new File("C:\\tmp\\zoo.txt");
        System.out.println("File Exists: "+ file.exists());
        if(file.exists()) {
            System.out.println("Absolute Path: "+file.getAbsolutePath());
            System.out.println("Is Directory: "+file.isDirectory());
            System.out.println("Parent Path: "+file.getParent());
            if(file.isFile()) {
                System.out.println("File size: "+file.length());
                System.out.println("File LastModified: "+file.lastModified());
            } else {
                for(File subfile: file.listFiles()) {
                    System.out.println("\t"+subfile.getName());
                }
            }
        }
    }
}
