package com.pragma.assets.infraestructure.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@Document(collection = "asset")
@TypeAlias("License")
@NoArgsConstructor
public class LicenseEntity extends AbstractEntity{
    private String supplier;
    private LocalDate dueDate;
}
