package api.endpoints;

import static io.restassured.RestAssured.given;
//import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import api.payload.Pet;

public class PetEndpoints {
    public static String base_url = 
        "https://petstore.swagger.io/v2/pet";
    public static String base_url_withId = 
        "https://petstore.swagger.io/v2/pet/{petId}";

    public static Response createPet(Pet payload) {
        Response response = 
            given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
            .when()
                .post(base_url);
        
        return response;
    }

    public static Response readPet(String petId) {
        Response response = 
            given()
                .pathParam("petId", petId)
            .when()
                .get(base_url_withId);
        
        return response;
    }

    public static Response updatePet(String petId, Pet payload) {
        Response response = 
            given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("petId", petId)
                .body(payload)
            .when()
                .put(base_url_withId);
        
        return response;
    }

    public static Response deletePet(String petId) {
        Response response = 
            given()
                .pathParam("petId", petId)
            .when()
                .delete(base_url_withId);
        
        return response;
    }
}
