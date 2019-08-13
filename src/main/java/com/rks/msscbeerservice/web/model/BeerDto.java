package com.rks.msscbeerservice.web.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public class BeerDto {

    private UUID id;
    private Integer version;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String beerName;

    private BeerStyleEnum beerStyle;
}
