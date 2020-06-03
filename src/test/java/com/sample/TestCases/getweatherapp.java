
package com.sample.TestCases;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getweatherapp {


     /*
      This is the structure but the api key should not be stored on github.
      This can be stored on AWS Secrets Manager so that api key can be pulled at run time
      The assertion can be done all of the response object but i have done for two of the fields
     */


    @Test(priority = 2)
    public void getLondonWeatherQuery() {

        Response resp=
                given().
                        header("Content-Type", "application/json")
                        .when().
                        get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=9ef0dcd0eb0d9677b5d85aab7d51e100").
                        then().
                        statusCode(200)
                        .log().all()
                        .extract().response();

        String weather_condition  = resp.jsonPath().getString("weather.description[0]");
        String city_name = resp.jsonPath().getString("name");


        Assert.assertEquals("overcast clouds", weather_condition);
        Assert.assertEquals("London", city_name);

        System.out.println("Display City Name: " + city_name);
        System.out.println("Verify Jenkins Change");
    }

    @Test(priority = 1)
    public void getLosAnglesWeatherQuery() {

        Response resp=
                given().
                        header("Content-Type", "application/json")
                        .when().
                        get("http://api.openweathermap.org/data/2.5/weather?q=Los Angeles&appid=9ef0dcd0eb0d9677b5d85aab7d51e100").
                        then().
                        statusCode(200)
                        .log().all()
                        .extract().response();

        String weather_condition  = resp.jsonPath().getString("weather.description[0]");
        String city_name = resp.jsonPath().getString("name");


        Assert.assertEquals("clear sky", weather_condition);
        Assert.assertEquals("Los Angeles", city_name);

        System.out.println("Display City Name: " + city_name);
    }

}
