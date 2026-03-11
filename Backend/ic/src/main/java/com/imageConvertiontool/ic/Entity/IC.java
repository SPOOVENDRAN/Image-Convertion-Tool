package com.imageConvertiontool.ic.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;

@Data
@Builder
@Entity

public class IC {

    @Id
    @GeneratedValue
    private Long id;

    String imageName;
    String imagePath;

}
