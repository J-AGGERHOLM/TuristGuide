package tourism.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tourism.model.TouristAttraction;
import tourism.service.TouristService;

import java.util.List;

@Controller
@RequestMapping("/")
public class TouristController {


    private final TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    //http://localhost:8080/
@GetMapping("/")
public String getIndex(){
        return "index";
}

    //http://localhost:8080/attractions

    @GetMapping("/attractions")
    public String getAttractions(Model model){
        List<TouristAttraction> touristAttractions = touristService.seeAttractions();
        model.addAttribute("attractions", touristAttractions);
        return "attractions";
    }


    //http://localhost:8080/attractions/Napoli

    @GetMapping("/attractions/{name}")
    public String viewAttraction(@PathVariable String name, Model model) {
        TouristAttraction attraction = touristService.findByName(name);
        model.addAttribute("attraction", attraction);
        return "attraction-detail";
    }


    @PostMapping("/attractions/add")
    public String addTouristAttraction(@RequestParam String name, @RequestParam String description, Model model) {
        TouristAttraction newTouristAttraction = touristService.addAttraction(name, description);
        model.addAttribute("newAttraction", newTouristAttraction);
        return "newAttraction";
    }


    @PostMapping("/attractions/update")
    public String updateAttraction(@ModelAttribute TouristAttraction updatedAttraction, Model model) {
        TouristAttraction touristAttraction = touristService.editAttraction(updatedAttraction.getName(), updatedAttraction.getDescription());
        model.addAttribute("updatedAttraction", touristAttraction);
        return "attraction-detail";
    }


    @DeleteMapping("/attractions/delete/{name}")
    public ResponseEntity<String> deleteAttraction(@PathVariable String name) {
        boolean isDeleted = touristService.removeAttraction(name);

        if (isDeleted) {
            return new ResponseEntity<>("Attraction '" + name + "' deleted successfully.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Attraction '" + name + "' not found.", HttpStatus.NOT_FOUND);
        }
    }




}
