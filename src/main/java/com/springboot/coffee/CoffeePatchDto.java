package com.springboot.coffee;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import com.springboot.member.NotZero;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CoffeePatchDto {

    private long coffeeId;

    @Pattern(regexp = "^([가-힣])(\\s?[가-힣])*$")
    private String korName;

    @Pattern(regexp = "^([a-zA-Z])(\\s?[a-zA-Z]*$)")
    private String engName;

    @NotZero(min = 100, max = 50000)
    private Integer price;

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }
}



