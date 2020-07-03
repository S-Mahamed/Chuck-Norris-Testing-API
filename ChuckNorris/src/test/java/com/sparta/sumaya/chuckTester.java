package com.sparta.sumaya;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class chuckTester {
    ChuckReader chuckReader = new ChuckReader();
    ChuckPojo chuckTest = chuckReader.readChuckNorris("src\\test\\resources\\chuckNorris.json");

    //restAssuredTest
    @Test
    public void testURL(){
        given()
                .when()
                .request("GET","https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .assertThat()
                .contentType("value", String.valueOf())
                .body("value",equalTo("Light travels at 186,000 miles per second to run away from Chuck Norris."));

    }

/////////////////HEADER TESTS////////

//@Test
//public void testDate(){
//    given()
//            .when()
//            .request("GET","https://api.chucknorris.io/jokes/random")
//            .then()
//            .statusCode(200)
//            .header("Date",equalTo("Thu, 02 Jul 2020 14:41:52 GMT"));
//}

    @Test
    public void testContentType(){
        given()
                .when()
                .request("GET","https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .assertThat()
                .header("Content-Type",equalTo("application/json;charset=UTF-8/img/avatar/chuck-norris.png"));
    }

    @Test
    public void testTransferEncoding(){
        given()
                .when()
                .request("GET","https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .assertThat()
                .header("Transfer-Encoding",equalTo("chunked"));
    }  @Test
    public void testConnection(){
        given()
                .when()
                .request("GET","https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .assertThat()
                .header("Connection",equalTo("keep-alive"));
    }
    @Test
    public void testVia(){
        given()
                .when()
                .request("GET","https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .assertThat()
                .header("Via",equalTo("1.1 vegur"));
    }@Test
    public void testCache(){
        given()
                .when()
                .request("GET","https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .assertThat()
                .header("CF-Cache-Status",equalTo("DYNAMIC"));
    }
    @Test
    public void testRequest(){
        given()
                .when()
                .request("GET","https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .assertThat()
                .header("cf-request-id",equalTo("03b19326cf0000079270b5f200000001"));
    }
    @Test
    public void testCT(){
        given()
                .when()
                .request("GET","https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .assertThat()
                .header("Expect-CT",equalTo("max-age=604800, report-uri=\"https://report-uri.cloudflare.com/cdn-cgi/beacon/expect-ct"));
    }@Test
    public void testServer(){
        given()
                .when()
                .request("GET","https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .assertThat()
                .header("Server",equalTo("cloudflare"));
    }@Test
    public void testCFRAY(){
        given()
                .when()
                .request("GET","https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .assertThat()
                .header("CF-RAY",equalTo("5ac921514b870792-LHR"));
    }@Test
    public void testContent(){
        given()
                .when()
                .request("GET","https://api.chucknorris.io/jokes/random")
                .then()
                .statusCode(200)
                .assertThat()
                .header("Content-Encoding",equalTo("br"));
    }



    /////////////JSON TEST////////////////

//    ChuckDTO chuckDTO = new ChuckDTO("src\\test\\resources\\chuckNorris.json");
//
//    @Test
//    public void TestGetValue(){
//    Assertions.assertEquals("Light travels at 186,000 miles per second to run away from Chuck Norris.",chuckDTO.getValue());
//}
//    @Test
//    public void testDateDTO(){
//        Assertions.assertEquals("2020-01-05 13:42:28.984661",chuckDTO.getCreatedAt());
//    }
//@Test
//public void testUpdatedAt(){
//        Assertions.assertEquals("2020-01-0513:42:28.984661", chuckDTO.getUpdatedAt());
//}
//    @Test
//    public void TestGetIcon(){
//        Assertions.assertEquals("https://assets.chucknorris.host/img/avatar/chuck-norris.png.",chuckDTO.getIconURL());
//    }
}
