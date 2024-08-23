package testsApiPublic;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetWithUrlParams {

    //@Test
    public void getWithUrlParams(){
        RequestSpecification request = given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects")
                .formParam("id", "4")
                .formParam("id", "5");

        Response response = request.when().get();

        response.prettyPrint();
        int statusCode= response.getStatusCode();
        System.out.println("Status Code: "+statusCode);
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void getWithUrlParams2(){
        RequestSpecification request = given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects")
                .formParam("id", 4,5);

        Response response = request.when().get();

        response.prettyPrint();
        int statusCode= response.getStatusCode();
        System.out.println("Status Code: "+statusCode);
        Assert.assertEquals(statusCode, 200);
    }
}
