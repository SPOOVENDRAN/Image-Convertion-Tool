package com.imageConvertiontool.ic.Service;

import com.imageConvertiontool.ic.Entity.IC;
import com.imageConvertiontool.ic.Repo.IcRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

@Service
public class IcService {

    @Autowired
    IcRepo icRepo;

    private final String uploadPath = "uploads";

    public void saveImg (String name , MultipartFile file) throws Exception{

        Path uploadDir = Paths.get(uploadPath);

        if(!Files.exists(uploadDir)){
            Files.createDirectories(uploadDir);
        }

        String fileName = System.currentTimeMillis() +"_"+file.getOriginalFilename();
        Path filePath = uploadDir.resolve(fileName);

        Files.copy(file.getInputStream() , filePath , StandardCopyOption.REPLACE_EXISTING);

        IC ic = IC.builder()
                .imageName(name)
                .imagePath(fileName)
                .build();

        icRepo.save(ic);
    }
}
