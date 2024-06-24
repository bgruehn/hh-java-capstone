package org.example.hhjavacapstone.backend;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Product {
    String id;
    @Getter
    @Setter
    String name;
    @Setter
    double price;
    @Getter
    @Setter
    String category;
}