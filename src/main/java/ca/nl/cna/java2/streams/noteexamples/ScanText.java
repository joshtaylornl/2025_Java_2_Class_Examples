package ca.nl.cna.java2.streams.noteexamples;

import java.io.*;
import java.util.Scanner;

/**
 * Simple example that uses a scanner to read from a text file
 */
public class ScanText {

    public static String source_folder = "file_examples";

    public static void main(String[] args) throws IOException {

        //Try-with-resources
        try(
                Scanner scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(source_folder + "\\scannerinput.txt")));
        ) {
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        }
    }
}