import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RestTest {


    public static Response doGetRequest(String endpoint) {
        RestAssured.defaultParser = Parser.JSON;

        return
                given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                        when().get(endpoint).
                        then().contentType(ContentType.JSON).extract().response();
    }

    public static void main(String[] args) {
        Response response = doGetRequest("https://jsonplaceholder.typicode.com/users");

        List<String> names = response.jsonPath().getList("name");

        System.out.println("user Nicholas Runolfsdottir V exists : " + names.contains("Nicholas Runolfsdottir V"));

        String address = response.jsonPath().getString("address[7]");
        System.out.println("Address is:" + address);

    }
}
