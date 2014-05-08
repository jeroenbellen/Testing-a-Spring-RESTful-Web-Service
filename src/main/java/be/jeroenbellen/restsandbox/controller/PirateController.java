package be.jeroenbellen.restsandbox.controller;

import be.jeroenbellen.restsandbox.dto.Ship;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PirateController {

    @RequestMapping(value = "/hi", produces = MediaType.TEXT_PLAIN_VALUE)
    public String hi(@RequestBody final String name) {
        return "Ahoy, " + name;
    }

    @RequestMapping(value = "/myShip", produces = MediaType.APPLICATION_JSON_VALUE)
    public Ship myShip() {
        return Ship.of(
                "Royal Fortune", "Frigate", "Bartholomew Roberts");
    }
}
