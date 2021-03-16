package com.margic.metro2.model;

import java.util.Date;

import lombok.data;

@Data
public class BaseSegment{
    private int blockDescriptorWord;
    private int recordDescriptorWord;
    private int processingIndicator;
    private Date timeStamp;
    private String identificationNumber;
    private String cycleIdentifier;
    private String consumerAccountNumber;
    private String portfolioType;
    private String accountType;
    private Date dateOpened;
    private int creditLimit;
    private int highestCredit;
    private String termsDuration;
    private String termsFrequency;
    private int scheduledMontlyPaymentAmount;
    private int actualPaymentAmount;
    private String accountStatus;
    private String paymentRating;
    private String paymentHistoryProfile;
    private String specialComment;
    private String complianceConditionCode;
    private int currentBalance;
    private int amountPastDue;
    private int originalChargeOffAmount;
    private Date dateAccountInformation;
    private Date fcraCompliance;
    private Date dateClosed;
    private Date dateLastPayment;
    private String interestTypeIndicator;
    private String surname;
    private String firstName;
    private String middleName;
    private String generationName;
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