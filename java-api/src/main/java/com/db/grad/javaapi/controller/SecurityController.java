package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.service.SecurityHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class SecurityController {
    // Private SecurityHandler object
    private SecurityHandler securityHandler;

    @Autowired
    public SecurityController(SecurityHandler securityHandler) {
        this.securityHandler = securityHandler;
    }

    // Display all the bonds in the system
    @GetMapping("/bonds")
    public List<Security> getAllSecurities() {
        return securityHandler.getAllSecurities();
    }
}