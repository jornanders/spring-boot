package no.ciber.absence.controller;

import org.springframework.stereotype.Controller;

@Controller
public class RootController {
    public String error() {
        return "error";
    }
}
