package com.pragma.assets.domain.model.entity;

import com.pragma.assets.common.util.ArgumentValidator;
import com.pragma.assets.common.util.Status;
import lombok.*;
import org.springframework.data.annotation.Transient;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Asset {

    private String invoiceNumber;
    private String responsible;
    private LocalDate dateOfPurchase;
    private String description;
    private String status;


    public Asset(String invoiceNumber, String responsible, LocalDate dateOfPurchase, String description, String status, String kind) {
        this.invoiceNumber = invoiceNumber;
        this.responsible = responsible;
        this.dateOfPurchase = dateOfPurchase;
        this.description = description;
        this.status = status;
    }

    public void validateStatus(String kind, List<String> statusAvailable, String kindClass){
        if (kind.equalsIgnoreCase(kindClass)) {
            ArgumentValidator.allowedStates(Arrays.asList(Status.OPERATIONAL, Status.DAMAGED, Status.REPAIR,
                            Status.TRANSPORT, Status.CONFLICT, Status.LOST), status,
                    String.format(Status.STATE_IS_NOT_ALLOWED_IN_THE_CATEGORY, status, kindClass));
        }
    }

}
