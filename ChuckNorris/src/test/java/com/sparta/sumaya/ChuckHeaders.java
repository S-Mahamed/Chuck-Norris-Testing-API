package com.sparta.sumaya;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class ChuckHeaders {
    public void serverHeader () throws IOException {
        URL url = new URL("https://api.chucknorris.io/jokes/random");
        URLConnection urlConnection = url.openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();

        System.out.println( urlConnection.getHeaderField("Server"));
    }
}
