package tourism.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tourism.model.Byer;
import tourism.model.TouristAttraction;
import tourism.service.TouristService;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class TouristController {


    private  TouristService touristService;

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


    @GetMapping("/attractions/{name}/tags")
        public String viewTags(@PathVariable String name, @RequestParam (required = false) List<String> tags, Model model) {
            TouristAttraction attraction = touristService.findByName(name);

            model.addAttribute("attraction", attraction);
            model.addAttribute("tags", attraction.getTags());
            return "tags";
        }




    @GetMapping("/attractions/add")
    public String addAttraction(Model model) {
        TouristAttraction attraction = new TouristAttraction();
        model.addAttribute("attraction", attraction);
        model.addAttribute("byer", Byer.values());


        return "addAttraction-form";
    }

    @PostMapping("/attraction/save")
    public String addAttraction(@ModelAttribute("attraction") TouristAttraction attraction) {
        touristService.addAttraction(attraction);
        return "redirect:/attractions";
    }





    @PostMapping("/attractions/update")
    public String updateAttraction(@ModelAttribute TouristAttraction updatedAttraction, Model model) {
        TouristAttraction touristAttraction = touristService.editAttraction(updatedAttraction.getName(), updatedAttraction.getDescription(), updatedAttraction.getImagePath(), updatedAttraction.getTags(), updatedAttraction.getBy());
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
