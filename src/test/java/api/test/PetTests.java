package api.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.PetEndpoints;
import api.payload.Pet;
import io.restassured.response.Response;

public class PetTests {
    @Test(priority=1)
    public void testPostPet() {
        Pet pet = new Pet();

        Response response = PetEndpoints.createPet(pet);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
