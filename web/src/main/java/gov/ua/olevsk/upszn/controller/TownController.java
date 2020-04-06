package gov.ua.olevsk.upszn.controller;

import gov.ua.olevsk.upszn.entity.Town;
import gov.ua.olevsk.upszn.repo.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;


@EnableJpaRepositories(basePackages = {"gov.ua.olevsk.upszn.repo"})
@Controller
@RequestMapping(path = "/town")
public class TownController {
    @Autowired
    private TownRepository townRepository;

    @GetMapping
    public String town(Map<String, Object> model) {
        Iterable<Town> towns = townRepository.findAll();
        model.put("towns", towns);
        return "town";
    }


    @PostMapping
    public String addNewTown(@RequestParam String name, Map<String, Object> model) {
        Town town = new Town();
        town.setName(name);
        townRepository.save(town);
        Iterable<Town> towns = townRepository.findAll();
        model.put("towns", towns);

        return "town";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model) {
        Iterable<Town> towns = townRepository.findByName(filter);
        model.put("towns", towns);

        return "town";
    }
}
