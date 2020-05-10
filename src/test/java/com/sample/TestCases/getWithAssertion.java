package com.sample.TestCases;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.junit.Assert;
import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import org.testng.annotations.Test;

import io.restassured.parsing.Parser;

public class getWithAssertion {

    /*
      Get a specific video game from the api call
     */

    @Test(enabled=false)
    public void getVideoGames() {

        Response resp=
        given().
                header("Content-Type", "application/json")
                .when().
                get("http://localhost:8080/app/videogames/1").
                then().
                statusCode(200)
                .log().all()
                .extract().response();

        String name1 = resp.path("$.name").toString();
        Assert.assertEquals("Resident Evil 4", name1);
        System.out.println(name1);
    }

    /*
    Get the first 10 records and store them in a collection
    Loop thru to verify the video game name
     */

    @Test(enabled=false)
    public void getAllVideoGames() {

        for (int i = 1; i < 10; i++) {
            Response resp =
                    given().
                            header("Content-Type", "application/json")
                            .when().
                            get("http://localhost:8080/app/videogames/" + i).
                            then().
                            statusCode(200)
                           // .log().all()
                            .extract().response();

            String name1 = resp.path("$.name"),toString;

            List <String> addname = new ArrayList<String>();
            addname.add(name1);

            int add_index = 1;
            int x_length = name1.length();
            System.out.println(x_length);

            String x = addname.toString().substring(add_index, add_index+(x_length));

             Assert.assertEquals(name1, x);
            System.out.println(addname);
            System.out.println(name1);
        }
    }

    @Test()
    public void testpoc() {

        System.out.println("Welcome poc test ci-cd for demo");

    }
    }

