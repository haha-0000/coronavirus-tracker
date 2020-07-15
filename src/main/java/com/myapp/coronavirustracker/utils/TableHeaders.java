package com.myapp.coronavirustracker.utils;

public enum TableHeaders {
    PROVINCE_OR_STATE("Province/State"),
    COUNTRY_OR_REGION("Country/Region");

    String headerName;
    TableHeaders(String headerName) {
        this.headerName = headerName;
    }

    public String getHeaderName() {
        return headerName;
    }
}
