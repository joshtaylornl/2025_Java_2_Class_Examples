package ca.nl.cna.java2.networking;

import java.io.IOException;

public class QuoteServer {
    public static void main(String[] args) throws IOException {
        new QuoteServerThread().start();
    }
}