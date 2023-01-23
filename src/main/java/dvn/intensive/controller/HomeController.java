package dvn.intensive.controller;

import dvn.intensive.builder.Director;
import dvn.intensive.builder.Lunch;
import dvn.intensive.builder.concrete_builders.FullLunchBuilder;
import dvn.intensive.builder.concrete_builders.LightLunchBuilder;
import dvn.intensive.builder.concrete_builders.StandardLunchBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomeView() {
        return "home";
    }

    @RequestMapping("/HomeWork2/lightLunch")
    public String getLightLunch(Model model) {
        Lunch lunch = (new Director()).getLunch(new LightLunchBuilder());
        String lightLunch = lunch.toString();
        model.addAttribute("lunch", lightLunch);
        return "lunch";
    }

    @RequestMapping("/HomeWork2/standardLunch")
    public String getStandardLunch(Model model) {
        Lunch lunch = (new Director()).getLunch(new StandardLunchBuilder());
        String lightLunch = lunch.toString();
        model.addAttribute("lunch", lightLunch);
        return "lunch";
    }

    @RequestMapping("/HomeWork2/fullLunch")
    public String getFullLunch(Model model) {
        Lunch lunch = (new Director()).getLunch(new FullLunchBuilder());
        String lightLunch = lunch.toString();
        model.addAttribute("lunch", lightLunch);
        return "lunch";
    }

}
