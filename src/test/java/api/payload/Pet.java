package api.payload;

import java.util.ArrayList;
import java.util.HashMap;

public class Pet {
    private String id;
    private String name;
    private HashMap <String,String> category;
    private ArrayList<String> photoUrls;
    private HashMap <String,String> tag;
    private ArrayList<HashMap <String,String>> tags;
    private String status;

    public Pet() {
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

        this.setId("0");
        this.setName("Tommy");
        this.setCategory(categoryMap);
        this.setPhotoUrls(photoUrlList);
        this.setTags(tags);
        this.setStatus("available");
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public HashMap<String, String> getCategory() {
        return category;
    }
    public void setCategory(HashMap<String, String> category) {
        this.category = category;
    }
    public ArrayList<String> getPhotoUrls() {
        return photoUrls;
    }
    public void setPhotoUrls(ArrayList<String> photoUrls) {
        this.photoUrls = photoUrls;
    }
    public HashMap<String, String> getTag() {
        return tag;
    }
    public void setTag(HashMap<String, String> tag) {
        this.tag = tag;
    }
    public ArrayList<HashMap<String, String>> getTags() {
        return tags;
    }
    public void setTags(ArrayList<HashMap<String, String>> tags) {
        this.tags = tags;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
