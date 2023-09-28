package com.pragma.assets.domain.model.entity;

import com.pragma.assets.common.exception.InvalidValueException;
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
public class Screen extends Technological{
    private static final String SCREEN = "Screen";
    private Integer inch;

    public Screen(String invoiceNumber, String responsible, LocalDate dateOfPurchase, String description, String status, String kind, String brand, String location, String detail, LocalDate warrantyExpirationDate, String warrantyDetail, Integer inch) throws InvalidValueException {
        super(invoiceNumber, responsible, dateOfPurchase, description, status, kind, brand, location, detail, warrantyExpirationDate, warrantyDetail);
        super.validateStatus(kind, Arrays.asList(Status.OPERATIONAL, Status.DAMAGED, Status.REPAIR,
                Status.TRANSPORT, Status.CONFLICT, Status.LOST),SCREEN);
        this.inch = inch;
    }
}
