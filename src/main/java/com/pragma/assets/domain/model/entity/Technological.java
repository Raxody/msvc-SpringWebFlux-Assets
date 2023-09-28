package com.pragma.assets.domain.model.entity;

import com.pragma.assets.common.exception.InvalidValueException;
import com.pragma.assets.common.util.ArgumentValidator;
import com.pragma.assets.common.util.Status;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Technological extends Asset {

    private static final String TECHNOLOGICAL = "Technological";
    private String brand;
    private String location;
    private String detail;
    private LocalDate warrantyExpirationDate;
    private String warrantyDetail;

    public Technological(String invoiceNumber, String responsible, LocalDate dateOfPurchase, String description, String status, String kind, String brand, String location, String detail, LocalDate warrantyExpirationDate, String warrantyDetail) throws InvalidValueException {
        super(invoiceNumber, responsible, dateOfPurchase, description, status, kind);
        super.validateStatus(kind, Arrays.asList(Status.OPERATIONAL, Status.DAMAGED, Status.REPAIR,
                Status.TRANSPORT, Status.CONFLICT, Status.LOST),TECHNOLOGICAL);

        this.brand = brand;
        this.location = location;
        this.detail = detail;
        this.warrantyExpirationDate = warrantyExpirationDate;
        this.warrantyDetail = warrantyDetail;
    }
}
