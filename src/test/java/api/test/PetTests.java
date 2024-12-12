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
        HashMap<String,String> categoryMap = new HashMap<String, String>();
        categoryMap.put("id","1");
        categoryMap.put("name","Dogs");

        ArrayList<String> photoUrlList = new ArrayList<String>();
        photoUrlList.add("dummyPhotoURL");

        HashMap<String,String> tag = new HashMap<String, String>();
        tag.put("id","0");
        tag.put("name","dummyTagNAme");

        ArrayList<HashMap<String,String>> tags = new ArrayList<HashMap<String,String>>();
        tags.add(tag);

        pet.setId("0");
        pet.setName("Tommy");
        pet.setCategory(categoryMap);
        pet.setPhotoUrls(photoUrlList);
        pet.setTags(tags);
        pet.setStatus("available");

        Response response = PetEndpoints.createPet(pet);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
