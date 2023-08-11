package com.mahesh.graphqldemo.dto;

import lombok.Data;

@Data
public class BookInput {
    private String title;
    private String description;
    private String author;
    private double price;
    private int pages;
}
