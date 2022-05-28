package com.shore.model;

import lombok.Data;

@Data
public class CityDO {
    private int ID;
    private String Name;
    private String CountryCode;
    private String District;
    private Long Population;

    public CityDO() {
        super();
    }
}
