package com.margic.metro2.model;

import java.util.Date;

import lombok.Data;

/**
 * J1Segment
 * Associated Consumer
 * Same Address
 */

@Data
public class J1Segment{
    private String segmentIdentifier;
    private String surname;
    private String firstName;
    private String middleName;
    private String generationCode;
    private int socialSecurityNumber;
    private Date dateBirth;
    private String telephoneNumber;
    private String ecoaCode;
    private String consumerInformationIdentifier;
}