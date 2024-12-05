package com.example.accounts.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts") //cuz of this annotation Spring has automatically created a bean for this class
@Getter
@Setter
public class AccountsContactInfoDto {
    String message;
    Map<String, String> contactDetails;
    List<String> onCallSupport;
}
