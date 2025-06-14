package com.ereeen.project;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping()
public class WebApiController {

    public WebApiController() {

    }


    @ExceptionHandler
    public void handleRestException(Exception e) {

    }

    @CrossOrigin
    @GetMapping("/")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("online");
    }
}

