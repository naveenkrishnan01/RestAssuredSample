package com.sample.TestCases;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class getVoterCensus {

     /*
      This is the structure but the api key should not be stored on github.
      This can be stored on AWS Secrets Manager so that api key can be pulled at run time
      The assertion can be done all of the response object but i have done for two of the fields
     */

  /*
    @Test()
    public void electionQuery() {

        Response resp=
                given().
                        header("Content-Type", "application/json")
                        .when().
                        get("https://www.googleapis.com/civicinfo/v2/elections?key=[YOUR_API_KEY]").
                        then().
                        statusCode(200)
                        .log().all()
                        .extract().response();

         int id  = resp.path("s.id");
        String name = resp.path("$.name").toString();


        Assert.assertEquals("2000", id);
        Assert.assertEquals("VIP Test Election", name);

        System.out.println(name1);
    }
*/
 /*
  @Test()
  public void getCivicInfo() {

       String address_info = "3922 Emerald st Torrance, CA, 90505";

      Response resp=
              given().
                      header("Content-Type", "application/json")
                      .when().
                      get("https://www.googleapis.com/" +
                              "civicinfo/v2/voterinfo?" +
                              "address=" + address_info +
                              "&officialOnly=true" +
                              "&returnAllAvailableData=true" +
                              "&key=[YOUR_API_KEY]").
                      then().
                      statusCode(200)
                      .log().all()
                      .extract().response();


      String kind = resp.path("$.kind").toString();
      String address_line1 = resp.path("$.normalizedInput.line1").toString();


      Assert.assertEquals("civicinfo#voterInfoResponse", kind);
      Assert.assertEquals("3922 Emerald Street", address_line1);
  }

}
*/