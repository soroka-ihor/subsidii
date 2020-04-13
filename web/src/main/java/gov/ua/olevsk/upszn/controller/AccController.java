package gov.ua.olevsk.upszn.controller;

import gov.ua.olevsk.upszn.entity.Accountant;
import gov.ua.olevsk.upszn.entity.Town;
import gov.ua.olevsk.upszn.entity.Post;
import gov.ua.olevsk.upszn.repo.AccountantRepo;
import gov.ua.olevsk.upszn.repo.PostRepo;
import gov.ua.olevsk.upszn.repo.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping(path = "/acc")
public class AccController {

    @Autowired
    private AccountantRepo accountantRepo;

    @Autowired
    private TownRepository townRepository;

    @Autowired
    private PostRepo postRepo;

    @GetMapping
    public String acc(Map<String, Object> model) {
        Iterable<Accountant> accountants = accountantRepo.findAll();
        model.put("accountants", accountants);

        Iterable<Town> towns = townRepository.findAll();
        model.put("towns", towns);

        Iterable<Post> posts = postRepo.findAll();
        model.put("posts", posts);

        return "acc";
    }


}
