package chapter6_ExceptionsAndAsertions;

import java.io.IOException;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Multi Catch example
 */
public class MultiCatch {

    public static void main(String[] args) {
        try {
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (NullPointerException npe) {
            npe.printStackTrace();
            throw new RuntimeException(npe);
        }
    }
}

}
