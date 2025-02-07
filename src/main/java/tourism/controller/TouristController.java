package tourism.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tourism.model.TouristAttraction;
import tourism.service.TouristService;

import java.util.List;

@Controller
@RequestMapping("/attractions")
public class TouristController {


    private final TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }



    @GetMapping("")
    public ResponseEntity<List<TouristAttraction>> getAttractions(){
        List<TouristAttraction> touristAttractions = touristService.seeAttractions();
        return new ResponseEntity<>(touristAttractions, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<TouristAttraction> getAttractionByName(@PathVariable String name){
        TouristAttraction touristAttraction = touristService.findByName(name);
        return new ResponseEntity<>(touristAttraction,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<TouristAttraction> addTouristAttraction(@RequestBody String name, String description){
        TouristAttraction newTouristAttraction = touristService.addAttraction(name, description);
        return new ResponseEntity<>(newTouristAttraction, HttpStatus.CREATED);

    }

    @PostMapping("/update")
    public ResponseEntity<TouristAttraction> updateAttraction(@RequestBody TouristAttraction updatedAttraction){
        TouristAttraction touristAttraction = touristService.editAttraction(updatedAttraction.getName(), updatedAttraction.getDescription());
        return new ResponseEntity<>(touristAttraction, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{name}")
    public ResponseEntity<String> deleteAttraction(@PathVariable String name) {
        boolean isDeleted = touristService.removeAttraction(name);

        if (isDeleted) {
            return new ResponseEntity<>("Attraction '" + name + "' deleted successfully.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Attraction '" + name + "' not found.", HttpStatus.NOT_FOUND);
        }
    }




}
