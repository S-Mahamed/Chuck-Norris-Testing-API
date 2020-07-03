package com.sparta.sumaya;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;

public class ChuckReader {
    ObjectMapper objectMapper = new ObjectMapper();

    public ChuckPojo readChuckNorris(String path){
        ChuckPojo chuckPojo = new ChuckPojo();
        try {
            chuckPojo = objectMapper.readValue(new File(path),ChuckPojo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chuckPojo;
    }

}
