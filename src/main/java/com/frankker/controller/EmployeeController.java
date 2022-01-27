package com.frankker.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin()
public class EmployeeController {

    @PreAuthorize("hasAuthority('SUPPORT_ENGINEER')")
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String getEmployees() {
        return "Welcome to tech republic!";
    }
}