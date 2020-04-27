package com.sample.TestCases;

import com.javaObjects.postBodyEntities;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

  /*
     Create a pojo objects (javaObjects class)
     Pass the value into the post body payload using the pojo objects
     This is example of post request
   */
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

    }



}
