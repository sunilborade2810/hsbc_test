package main.java.hsbc.service;

public interface IFileOperations 
{
	String readFile(String filename);
    void writeFile(String filename, String content);
}
