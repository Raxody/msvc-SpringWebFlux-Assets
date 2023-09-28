package com.pragma.assets.infraestructure.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "asset")
@TypeAlias("Abstract")
@NoArgsConstructor
public class AbstractEntity extends AssetEntity{

    private String url;

}
