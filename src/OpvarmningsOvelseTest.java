import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpvarmningsOvelseTest {

    @Test
    void main() {


    }

    @Test
    public void average () {

        int x = 2;
        int y = 4;
        int numberOfNumbers = 2;
        int average = x + y / numberOfNumbers;
        int result = average;

        assertEquals(2,2);


    }

    @Test
    public void stop() {
        String stop = "q";
        if (stop.equals("q"))
            System.out.println("you have stopped the program!");

        assertEquals("r","q");

    }
}