package penyaka.petprojects.spring_webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import penyaka.petprojects.spring_webapp.service.PublisherService;

@Controller
public class PublisherController {
    private final PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @RequestMapping("/publishers")
    public String getPusblishers (Model model) {
        model.addAttribute("publishers", publisherService.findAll());
        return "publishers";
    }

}
