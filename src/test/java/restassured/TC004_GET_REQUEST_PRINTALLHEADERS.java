package restassured;
/*
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.testng.annotations.Test;

public class TC004_GET_REQUEST_PRINTALLHEADERS {
    @Test
    public void getWeatherDetails(){
        //Specify baseuri
        RestAssured.baseURI = "https://maps.googleapis.com";

        //Request object creating
        RequestSpecification httpRequest = RestAssured.given();

        //Response object creating
        Response response = httpRequest.request(Method.GET, "/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyBjGCE3VpLU4lgTqSTDmHmJ2HoELb4Jy1s");

        //Print response in console window
        String responseBody = response.getBody().asString();
        System.out.println("Response body is: " + responseBody);

        Headers allHeaders = response.headers();//capture all the headers from response
        for(Header header:allHeaders){
            System.out.println(header.getName() +  "   " + header.getValue());
        }
    }
}


 */
