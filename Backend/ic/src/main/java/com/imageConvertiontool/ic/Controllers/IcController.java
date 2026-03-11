package com.imageConvertiontool.ic.Controllers;

import com.imageConvertiontool.ic.Service.IcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.function.ServerRequest;

import java.io.File;
import java.io.IOException;

@RestController
@CrossOrigin("*")
public class IcController {
    @Autowired
    IcService icService;

    @PostMapping("/postimg")
    public String print (@RequestParam("imgFile") MultipartFile img) throws IOException {
        String name = img.getOriginalFilename();
        try{
            icService.saveImg(name , img);
            return "Image Uploaded Sucessfully";
        }
        catch (Exception e){
            return "Problem in Upload Of Image";
        }
    }

}
