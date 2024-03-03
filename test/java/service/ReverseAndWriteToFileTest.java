package java.service;

import main.java.hsbc.service.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ReverseAndWriteToFileTest {

    @Test
    public void testReverseAndWriteToFile() {
        FileOperations fileOperations = mock(FileOperations.class);
        ReverseAndWriteToFile reverseAndWriteToFile = new ReverseAndWriteToFile(fileOperations);
        when(fileOperations.readFile("input.txt")).thenReturn("CBSH ENUP");
        reverseAndWriteToFile.reverseAndWrite("input.txt", "output.txt");
        verify(fileOperations).writeFile("output.txt", "HSBC PUNE");
    }
}