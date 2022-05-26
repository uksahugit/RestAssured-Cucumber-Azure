package endpoints;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserManipulationEndpoints {
    static String dummyTestBaseURI = System.getProperty("sys.demo.dummyBaseURI");

    public static Response listUsers() {
        return given().contentType("application/json")
                .when().get(dummyTestBaseURI+ "/api/users?page=2");
    }
}
