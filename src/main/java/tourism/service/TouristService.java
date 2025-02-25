package tourism.service;

import org.springframework.stereotype.Service;
import tourism.model.TouristAttraction;
import tourism.repository.TouristRepository;

import java.util.List;

@Service
public class TouristService {

    TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }


//    public TouristAttraction addAttraction(String name, String description, String imagePath, List<String> tags, String by) {
//        return touristRepository.addAttraction(name, description, imagePath, tags, by);
//    }

    public boolean removeAttraction(String name) {
        return touristRepository.removeAttraction(name);
    }

    public TouristAttraction editAttraction(String name, String newDescription, String imagePath, List<String> tags, String by) {
        return touristRepository.editAttraction(name, newDescription, imagePath, tags, by);
    }

    public List<TouristAttraction> seeAttractions() {
        return touristRepository.seeAttractions();
    }

    public TouristAttraction findByName(String name){
        return touristRepository.findByName(name);
    }


    public void addAttraction(TouristAttraction attraction) {
        touristRepository.addAttraction(attraction);
    }
}
