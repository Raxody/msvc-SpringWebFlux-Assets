package com.pragma.assets.infraestructure.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "asset")
public class AssetEntity {

    @Id
    private String invoiceNumber;
    private String responsible;
    private LocalDate dateOfPurchase;
    private String description;
    private String status;
}
