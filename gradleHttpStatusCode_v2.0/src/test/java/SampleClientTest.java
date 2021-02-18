
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleClientTest {

    /**
     * Baseline test that everything works as expected
     * @throws Exception
     */
    @Test
    public void testSuccess() throws Exception{

        //Specify base URI
        RestAssured.baseURI= "http://the-internet.herokuapp.com/status_codes";

        // Request object
        RequestSpecification httpRequest = RestAssured.given();

        // Response object
        Response response = httpRequest.request(Method.GET, "status_codes/200");

        //Status code validation
        Assert.assertEquals(response.getContentType(),CustomHttpStatus.SUCCESS);

        System.out.println("Status code is: " + CustomClientErrorException.class);
    }


    /**
     * Tests that when a standard status code such as 301 occurs that the proper exception is thrown
     * @throws Exception
     */
    @Test
    public void testRedirection() throws Exception{

    }

    /**
     * Tests that when a standard status code such as 404 occurs that the proper exception is thrown
     * @throws Exception
     */
    @Test
    public void testNotFound() throws Exception{

    }


    /**
     * Verifies out of box behaviour when a non-standard HTTP Status code is returned
     * we get a {@see IllegalArgumentException}
     *
     * @throws Exception
     */
    @Test
    public void testInternalServerError() throws Exception{

    }


}
