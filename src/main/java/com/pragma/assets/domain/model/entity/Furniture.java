package com.pragma.assets.domain.model.entity;

import com.pragma.assets.common.util.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
public class Furniture extends Asset {

    private static final String FURNITURE = "Furniture";
    private String maker;
    private String location;
    private Integer amount;
    private String detail;

    public Furniture(String invoiceNumber, String responsible, LocalDate dateOfPurchase, String description, String status, String kind, String maker, String location, Integer amount, String detail) {
        super(invoiceNumber, responsible, dateOfPurchase, description, status, kind);
        super.validateStatus(kind, Arrays.asList(Status.OPERATIONAL, Status.DAMAGED, Status.TRANSPORT,
                Status.LOST, Status.CONFLICT), FURNITURE);
        this.maker = maker;
        this.location = location;
        this.amount = amount;
        this.detail = detail;
    }
}
