package com.margic.metro2.model;

import java.util.Date;

import lombok.Data;

@Data
public class Header{
    private int blockDescriptorWord;
    private int recordDescriptorWord;
    private String recordIdentifier;
    private String cycleIdentifier;
    private String innovisProgramIdentifier;
    private String equifaxProgramIdentifier;
    private String experianProgramIdentifier;
    private String transUnionProgramIdentifier;
    private Date activityDate;
    private Date dateCreated;
    private Date programDate;
    private Date programRevisionDate;
    private String reporterName;
    private String reporterAddress;
    private String reporterTelephoneNumber;
    private String softwareVendorName;
    private String softwareVersionNumber;
    private String prbcProgramIdentifier;
}

