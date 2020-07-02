package com.sparta.sumaya;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ChuckReader {
    private JSONPObject ParsedJSONFile;
    ObjectMapper objectMapper = new ObjectMapper();

    public ChuckPojo readChuckNorris(String path){
        ChuckPojo chuckPojo = new ChuckPojo();
        try {
            FileReader JSONFile = new FileReader(path);
            //JSONParser parser = new JSONParser();
            //Object JSONObj = parser.parse();
            objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            chuckPojo = objectMapper.readValue(new File(path),ChuckPojo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return chuckPojo;
    }

}
