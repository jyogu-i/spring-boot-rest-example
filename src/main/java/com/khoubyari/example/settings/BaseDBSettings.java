package com.khoubyari.example.settings;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseDBSettings {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
