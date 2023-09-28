package com.pragma.assets.domain.model.entity;

import com.pragma.assets.common.exception.InvalidValueException;
import com.pragma.assets.common.util.ArgumentValidator;
import com.pragma.assets.common.util.Status;
import com.pragma.assets.infraestructure.entity.TechnologicalEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
public class Computer extends Technological {

    private static final String COMPUTER = "Computer";

    private String processor;
    private String ram;
    private String hhd;


    public Computer(String invoiceNumber, String responsible, LocalDate dateOfPurchase, String description, String status, String kind, String brand, String location, String detail, LocalDate warrantyExpirationDate, String warrantyDetail, String processor, String ram, String hhd) {
        super(invoiceNumber, responsible, dateOfPurchase, description, status, kind, brand, location, detail, warrantyExpirationDate, warrantyDetail);
        super.validateStatus(kind, Arrays.asList(Status.OPERATIONAL, Status.DAMAGED, Status.REPAIR,
                Status.TRANSPORT, Status.CONFLICT, Status.LOST), COMPUTER);

        this.processor = processor;
        this.ram = ram;
        this.hhd = hhd;
    }

    public static void main(String[] args) throws InvalidValueException {
        Asset a = new Technological("a", "a", LocalDate.now(), "aq", "a", "Technological", "a", "a", "a", LocalDate.now(), "a");
    }
}
