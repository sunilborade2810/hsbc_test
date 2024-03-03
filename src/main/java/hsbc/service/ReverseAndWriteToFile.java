package main.java.hsbc.service;

public class ReverseAndWriteToFile 
{
    private final IFileOperations fileOperations;

    public ReverseAndWriteToFile(IFileOperations fileOperations) 
    {
        this.fileOperations = fileOperations;
    }

    public void reverseAndWrite(String inputFilename, String outputFilename) 
    {
        String content = fileOperations.readFile(inputFilename);
        String reversedContent = reverseString(content);
        fileOperations.writeFile(outputFilename, reversedContent);
    }

    private String reverseString(String str) 
    {
        return new StringBuilder(str).reverse().toString();
    }
}