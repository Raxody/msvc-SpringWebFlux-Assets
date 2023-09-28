package com.pragma.assets.domain.model.entity;

import com.pragma.assets.common.util.Status;
import com.pragma.assets.infraestructure.entity.AssetEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
public class Abstract extends Asset {
    private static final String ABSTRACT = "Abstract";
    private String url;

    public Abstract(String invoiceNumber, String responsible, LocalDate dateOfPurchase, String description, String status, String kind, String url) {
        super(invoiceNumber, responsible, dateOfPurchase, description, status, kind);
        super.validateStatus(kind, Arrays.asList(Status.ACTIVE, Status.INACTIVE), ABSTRACT);
        this.url = url;
    }
}
