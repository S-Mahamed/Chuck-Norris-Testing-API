package com.sparta.sumaya;

import com.google.gson.JsonObject;

public class ChuckDTO {
    private final ChuckPojo chuckPojo;

    public ChuckDTO(String path) {
        ChuckReader chuckReader = new ChuckReader();
        chuckPojo = chuckReader.readChuckNorris(path);
    }

    public String getCreatedAt() {
        return chuckPojo.getCreatedAt();
    }

    public String getIconURL() {
        return chuckPojo.getIconUrl();
    }

    public String getId() {
        return chuckPojo.getId();
    }

    public String getUpdatedAt() {
        return chuckPojo.getUpdatedAt();
    }

    public String getUrl() {
        return chuckPojo.getUrl();
    }

    public String getValue() {
        return chuckPojo.getValue();
    }
}
