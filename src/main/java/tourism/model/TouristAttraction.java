package tourism.model;

import java.util.List;

public class TouristAttraction {

    private String name;
    private String description;
    private String imagePath;
    private List<String> tags;
    private String by;

    public TouristAttraction(String name, String description, String imagePath, List<String> tags, String by){
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
        this.tags = tags;
        this.by = by;
    }

    public TouristAttraction(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }


    public List<String> getTags() {
        return tags;
    }


    public String getBy() {
        return by;
    }


    public void setBy(String by) {
        this.by = by;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
