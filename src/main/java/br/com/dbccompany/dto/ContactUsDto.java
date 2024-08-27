package br.com.dbccompany.dto;

import lombok.Data;

import java.io.File;

@Data
public class ContactUsDto {
    private String emailAddress;
    private String orderReference;
    private File file;
    private String message;
}
