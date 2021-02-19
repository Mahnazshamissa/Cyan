import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.when;

public class RestAssuredTest {


    public static Response response;
    public static String jsonAsString;

    @BeforeClass
    public static void setupURL()
    {
        // here we setup the default URL and API base path to use throughout the tests
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RestAssured.basePath = "/users";
    }

    @BeforeClass
    public static void callNamesAPI()
    {
        // call the names API, the full address is "https://jsonplaceholder.typicode.com/users/name",
        // but we set the default above, so just need "/names"
        response =
                when().
                    get("/name").
                then().
                    contentType(ContentType.JSON).  // check that the content type return from the API is JSON
                extract().response(); // extract the response

        // We convert the JSON response to a string, and save it in a variable called 'jsonAsString'
        jsonAsString = response.asString();
    }



    @Test
    public void checkByName() {

        //List<String> names = response.jsonPath().getList("name");
        List<String> names = response.path("name");

        for (String name:names){
            Assert.assertEquals(name, "Nicholas Runolfsdottir V");
        }

        System.out.println("user Nicholas Runolfsdottir V exists : " + names.contains("Nicholas Runolfsdottir V"));

        String address = response.jsonPath().getString("address[7]");
        System.out.println("Address is:" + address);

    }
}
