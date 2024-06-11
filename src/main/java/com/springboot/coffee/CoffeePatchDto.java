package com.springboot.coffee;

import com.springboot.member.NotSpace;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CoffeePatchDto {

    private String korName;

    private String engName;

    @Min(100) @Max(50000)
    private Integer price;

}



