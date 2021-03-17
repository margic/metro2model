package com.margic.metro2.model;

import java.util.Date;

import lombok.Data;


/**
 * Associated Consumer
 * Different Address
 */
@Data
 public class J2Segment{

    private String segmentIdentifier;
    private String surname;
    private String firstName;
    private String middleMame;
    private String generationCode;
    private int socialSecurityNumber;
    private Date dateBirth;
    private String telephoneNumber;
    private String ecoaCode;
    private String consumerInformationIndicator;
    private String countryCode;
    private String firstLineAddress;
    private String secondLineAddress;
    private String city;
    private String state;
    private String postalZipCode;
    private String addressIndicator;
    private String residenceCode;
 }