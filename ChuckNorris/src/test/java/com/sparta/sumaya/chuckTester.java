package com.sparta.sumaya;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class chuckTester {

    //restAssuredTest
    @Test
    public void testURL(){
        given()
                .when()
                .request("GET","https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .assertThat()
                .body("icon_url",equalTo("https://assets.chucknorris.host/img/avatar/chuck-norris.png"));

    }
    @Test
    public void testCreationDate(){
        given()
                .when()
                .request("GET","https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .assertThat()
                .body("created_at",equalTo("2020-01-05 13:42:28.984661"));

    }

    ChuckReader chuckReader = new ChuckReader();
    ChuckPojo chuckTest = chuckReader.readChuckNorris("src\\test\\resources\\chuckNorris.json");

    @Test
    public void TestchuckImage()
    {
        Assertions.assertEquals("https://assets.chucknorris.host/img/avatar/chuck-norris.png",chuckTest.getIconUrl());

    }

}
