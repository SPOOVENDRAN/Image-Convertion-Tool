package com.imageConvertiontool.ic.Controllers;

import com.imageConvertiontool.ic.Service.IcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class IcController {
    @Autowired
    IcService icService;

    @GetMapping("/in")
    public ResponseEntity<?> send(){
        return new ResponseEntity<>(icService.getName(), HttpStatus.OK);
    }
}
