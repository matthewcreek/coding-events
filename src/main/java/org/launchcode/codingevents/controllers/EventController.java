package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events/")
public class EventController {

//    private static List<String> events = new ArrayList<>();

//    @GetMapping("/")
//    public String displayAllEvents(Model model) {
//        model.addAttribute("events", events);
//        return "events/index";
//    }

    @GetMapping("/")
    public String displayAllEvents(Model model) {
        HashMap<String, String> events = new HashMap<>();
        events.put("Code Til Dawn", "Join friends to write code late into the evening it is fun");
        events.put("Free Coffee Day", "Come to the coffee truck and slurp that hot brown");
        events.put("Bill's Big Day", "Birthday party for 'Bill'");
        model.addAttribute("events", events);
        return "events/index";
    }
    // path /events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }
    //path /events/create
    @PostMapping("create")
    public String createEvent(@RequestParam String eventName) {
//        events.add(eventName);
        return "redirect:";
    }

}
