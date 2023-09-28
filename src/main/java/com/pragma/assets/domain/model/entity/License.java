package com.pragma.assets.domain.model.entity;

import com.pragma.assets.common.util.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
public class License extends Abstract {
    private static final String LICENSE = "License";
    private String supplier;
    private LocalDate dueDate;

    public License(String invoiceNumber, String responsible, LocalDate dateOfPurchase, String description, String status, String kind, String url, String supplier, LocalDate dueDate) {
        super(invoiceNumber, responsible, dateOfPurchase, description, status, kind, url);
        super.validateStatus(kind, Arrays.asList(Status.ACTIVE, Status.INACTIVE, Status.DEFEATED), LICENSE);
        this.supplier = supplier;
        this.dueDate = dueDate;
    }
}
