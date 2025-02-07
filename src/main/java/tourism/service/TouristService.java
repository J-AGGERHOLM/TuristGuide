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


    public TouristAttraction addAttraction(String name, String description) {
        return touristRepository.addAttraction(name, description);
    }

    public boolean removeAttraction(String name) {
        return touristRepository.removeAttraction(name);
    }

    public TouristAttraction editAttraction(String name, String newDescription) {
        return touristRepository.editAttraction(name, newDescription);
    }

    public List<TouristAttraction> seeAttractions() {
        return touristRepository.seeAttraction();
    }

    public TouristAttraction findByName(String name){
        return touristRepository.findByName(name);
    }

}
