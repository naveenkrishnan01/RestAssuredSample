package com.sample.TestCases;

import com.javaObjects.postBodyEntities;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class postWithAssertion {

    postBodyEntities addBody = new postBodyEntities(20, "Dare Devil20",
            "2014-17-01", 4, "Universal", "MA" );



    @Test()
    public void postVideoGames() throws InterruptedException {

        Response resp=
                given().
                        header("Content-Type", "application/json")
                        .body(addBody)
                        .when().
                        log().all().
                        post("http://localhost:8080/app/videogames").
                        then().
                        log().
                        ifError().
                        statusCode(200)
                        .extract().response();
                     Thread.sleep(2000);

        System.out.println(resp.statusLine());
//        String name1 = resp.path("$.name").toString();
//        Assert.assertEquals("Dare Devil9", name1);
//        System.out.println(name1);
    }



}
