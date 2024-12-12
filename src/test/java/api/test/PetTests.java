package api.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.PetEndpoints;
import api.payload.Pet;
import io.restassured.response.Response;

public class PetTests {
    //Note: later we can create DataProvider which grab payload data
    //from Input file that has Test data of various test cases in JSON format
    //This would decouple the Test Input from source code.

    @Test(priority = 1)
    public void testPost0IdPet() {
        Pet pet = new Pet();
        pet.setId("0");
        Response response = PetEndpoints.createPet(pet);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 2)
    public void testPostPet() {
        Pet pet = new Pet();
        Response response = PetEndpoints.createPet(pet);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 3)
    public void testGetPet() {
        Response response = PetEndpoints.readPet("123");
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
        // also check the updated value in last test case
    }

    @Test(priority = 4)
    public void testDeletePet() {
        Response response = PetEndpoints.deletePet("123");
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 5)
    public void testGetAfterDeletePet() {
        Response response = PetEndpoints.readPet("123");
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 404);
    }

    @Test(priority = 6)
    public void testDeleteAfterDeletePet() {
        Response response = PetEndpoints.deletePet("123");
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 404);
    }
}
