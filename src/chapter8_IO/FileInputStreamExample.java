package chapter8_IO;

import java.io.*;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Example of FileInputStream, wrtes in bytes
 * They are used to read bytes from a file or
 * write bytes to a file, respectively.
 *
 * FileOutputStream
 */
public class FileInputStreamExample {

    //Method
    public static void copy(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            int b;
            while((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        // String, representing a path to the file.
        //The data in a FileInputStream object is commonly accessed by successive calls to the
        //read() method until a value of -1 is returned, indicating that the end of the stream—in this
        //case the end of the file—has been reached.
        File source = new File("Zoo.class");
        File destination = new File("ZooCopy.class");
        copy(source,destination);

        //The main() method creates two File objects, one for the source fi le to copy from and one
        //for the destination fi le to copy to. If the destination fi le already exists, it will be overridden by
        //this code.
        //The copy() method creates instances of FileInputStream and FileOutputStream,
        //and it proceeds to read the FileInputStream one byte at a time, copying the value to the
        //FileOutputStream as it’s read. As soon as the in.read() returns a -1 value, the loop ends.
        //Finally, both streams are closed using the try-with-resource syntax
    }

}
