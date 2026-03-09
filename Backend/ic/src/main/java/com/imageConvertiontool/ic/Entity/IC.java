package com.imageConvertiontool.ic.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class IC {

    @Id
    @GeneratedValue
    private Long id;

    String imageName;
    String imagePath;
}
