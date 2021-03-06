package com.stackroute.downstreamservice.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//This class is to model the education sections data

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EducationSection {
    private String sectionId;
    private String userId;
    private String operationType;
    private Chicklets[] chicklets;

}
