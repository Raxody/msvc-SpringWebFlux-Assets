package com.pragma.assets.infraestructure.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "asset")
@TypeAlias("Screen")
@NoArgsConstructor
public class ScreenEntity extends TechnologicalEntity{

    private Integer inch;

}
