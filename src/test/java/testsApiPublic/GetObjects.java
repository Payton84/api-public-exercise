package testsApiPublic;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetObjects {

    @Test
    public void getObject(){
        RequestSpecification request = given().baseUri("https://api.restful-api.dev").basePath("/objects");

        Response response = request.when().get();

        response.prettyPrint();
        int statusCode= response.getStatusCode();
        System.out.println("Status Code: "+statusCode);
        Assert.assertEquals(statusCode, 200);
    }
}
