package tourism.repository;

import org.springframework.stereotype.Repository;
import tourism.model.TouristAttraction;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    private List<TouristAttraction> touristAttractions;
    TouristAttraction touristAttraction;

    public TouristRepository(){
        touristAttractions = new ArrayList<>();
        addAttraction("Den Lille Havfrue", "pizaaaa","denLilleHavfrue.webp");
        addAttraction("Tivoli", "sadd vodka", "tivoli.webp");
        addAttraction("Zoologisk Have", "pizaaaa", "zoologiskHave.jpg");
        addAttraction("Den Blå Planet", "sadd vodka", "denBlåPlanet.jpeg");
        addAttraction("Jailhouse", "pizaaaa", "jailHouse.jpg");
//        addAttraction("Amalienborg Slot", "sadd vodka");
    }

    public TouristAttraction addAttraction(String name, String description, String imagePath){
        touristAttraction = new TouristAttraction(name, description, imagePath);
        touristAttractions.add(touristAttraction);
        return touristAttraction;
    }

    public boolean removeAttraction(String name) {
        for (TouristAttraction attraction : touristAttractions) {
            if (attraction.getName().equals(name)) {
                touristAttractions.remove(attraction);
                return true;
            }
        }
        return false;
    }


    public TouristAttraction editAttraction(String name, String newDescription, String imagePath){

        for (TouristAttraction attraction : touristAttractions){
            if (attraction.getName().equals(name)){
                attraction.setDescription(newDescription);
                attraction.setImagePath(imagePath);
                touristAttraction = new TouristAttraction(name, newDescription, imagePath);
            }
        }
        return touristAttraction;
    }

    public List<TouristAttraction> seeAttractions(){
        return touristAttractions;
    }

    public TouristAttraction findByName (String name){
        for (TouristAttraction touristAttraction : touristAttractions){
            if (touristAttraction.getName().equals(name)){
                System.out.println(touristAttraction.getName());
                return touristAttraction;
            }
        }
        return new TouristAttraction("empty", "Attraction not found", "notFound");
    }

}
