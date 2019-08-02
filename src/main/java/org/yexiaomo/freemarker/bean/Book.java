package org.yexiaomo.freemarker.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Integer id;

    private String name;

    private String author;
}
