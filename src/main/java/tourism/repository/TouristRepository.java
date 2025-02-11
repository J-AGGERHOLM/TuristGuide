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
        addAttraction("Napoli", "pizaaaa");
        addAttraction("Russia", "sadd vodka");
    }

    public TouristAttraction addAttraction(String name, String description){
        touristAttraction = new TouristAttraction(name, description);
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


    public TouristAttraction editAttraction(String name, String newDescription){

        for (TouristAttraction attraction : touristAttractions){
            if (attraction.getName().equals(name)){
                attraction.setDescription(newDescription);
                touristAttraction = new TouristAttraction(name, newDescription);
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
        return new TouristAttraction("empty", "Attraction not found");
    }

}
