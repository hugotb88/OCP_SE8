package chapter8_IO;

import java.io.File;
import java.nio.file.Paths;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Example of File class
 * The File class is used to read information
 * about existing fi les and directories, list the contents of a directory, and create/delete fi les
 * and directories.
 *  An instance of a File class represents the pathname of a particular fi le or directory on
 * the fi le system. The File class cannot read or write data within a fi le, although it can be
 * passed as a reference to many stream classes to read or write data,
 */
public class FileClassExample {

    public static void main(String[] args) {
        //Creating a File
        // Differents O.S vary on the format of their path names

        //We can know the separator used by the O.S with the next instructions
        System.out.println(System.getProperty("file.separator")); // using windows we gonna get \
        System.out.println(java.io.File.separator); // using windows we gonna get \


        //Creating a File
        String separator = System.getProperty("file.separator");
        File file = new File("C:/tmp/zoo.txt");
        File file3 = new File("C:"+separator+"tmp"+separator+"zoo.txt");
        File file4 = new File("C:\\tmp\\zoo.txt");
        System.out.println(file.exists());
        System.out.println(file3.exists());
        System.out.println(file4.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file3.getAbsolutePath());
        System.out.println(file4.getAbsolutePath());

        System.out.println(Paths.get("zoo.txt"));
    }

}
