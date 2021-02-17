import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {

    @Test
    void getDetails() {

        //Specify base URI
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users";

        // Request object
        RequestSpecification httpRequest = RestAssured.given();

        // Response object
        Response response = httpRequest.request(Method.GET, "Nicholas Runolfsdottir V");

        // print response in console window

        String responseBody = response.getBody().asString();
        System.out.println("Response Body is:" + responseBody);

    }

}
