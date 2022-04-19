package uz.pdp.appcommunicationcompany.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class SimCardDto {

    private Integer code;
    private UUID customerId;
    private Integer companyId;
}
