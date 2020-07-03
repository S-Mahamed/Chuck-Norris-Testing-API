
package com.sparta.sumaya;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


public class App {
    public static void main(String [] args){
        ObjectMapper objectMapper = new ObjectMapper();
        Image image = null;

        try{
            ChuckPojo chuckPojo = objectMapper.readValue(new URL("https://assets.chucknorris.host/img/avatar/chuck-norris.png"), ChuckPojo.class);
            URL iconURL = new URL(chuckPojo.getIconUrl());
            image = ImageIO.read(iconURL);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JFrame jframe = new JFrame();
        jframe.setSize(500,500);
        JLabel jlabel = new JLabel(new ImageIcon(image));
        jframe.add(jlabel);
        jframe.setVisible(true);
    }
    public void serverHeader () throws IOException {
        URL url = new URL("https://api.chucknorris.io/jokes/random");
        URLConnection urlConnection = url.openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();

        System.out.println( urlConnection.getHeaderField("Server"));
    }

}