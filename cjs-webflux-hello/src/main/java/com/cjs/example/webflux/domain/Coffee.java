package com.cjs.example.webflux.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ChengJianSheng
 * @date 2020-03-27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coffee implements Serializable {

    private String id;

    private String name;
}
