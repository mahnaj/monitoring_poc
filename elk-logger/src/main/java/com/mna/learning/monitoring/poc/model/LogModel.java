package com.mna.learning.monitoring.poc.model;

import lombok.*;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
@Setter
public class LogModel {
    private String appName;
    private String component;
    private String env;
    private String message;
    private String operation;

    @Override
    public String toString() {
        return "LogModel{" +
                "appName='" + appName + '\'' +
                ", component='" + component + '\'' +
                ", env='" + env + '\'' +
                ", message='" + message + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}