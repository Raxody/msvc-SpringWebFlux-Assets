package com.pragma.assets.infraestructure.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "asset")
@TypeAlias("Furniture")
@NoArgsConstructor
public class FurnitureEntity extends AssetEntity{

    private String maker;
    private String location;
    private Integer amount;
    private String detail;

}
