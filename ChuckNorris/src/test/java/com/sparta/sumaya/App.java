
package com.sparta.sumaya;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

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
}