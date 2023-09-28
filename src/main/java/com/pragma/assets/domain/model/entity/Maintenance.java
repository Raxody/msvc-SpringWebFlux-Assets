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
public class Maintenance extends Furniture{

    private static final String MAINTENANCE = "Maintenance";
    private String maintenanceManager;

    public Maintenance(String invoiceNumber, String responsible, LocalDate dateOfPurchase, String description, String status, String kind, String maker, String location, Integer amount, String detail, String maintenanceManager) {
        super(invoiceNumber, responsible, dateOfPurchase, description, status, kind, maker, location, amount, detail);
        super.validateStatus(kind, Arrays.asList(Status.OPERATIONAL, Status.DAMAGED, Status.TRANSPORT,
                Status.LOST, Status.CONFLICT), MAINTENANCE);
        this.maintenanceManager = maintenanceManager;
    }
}
