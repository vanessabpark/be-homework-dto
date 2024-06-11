package com.springboot.coffee;

import javax.validation.constraints.*;

public class CoffeePostDto {

    @NotBlank(message = "한글 이름은 필수 입력 사항 입니다.")
    @Pattern(regexp = "^\\S+(\\s?\\S+)*$", message = "커피 이름은 공백이 아니어야 합니다.")
    private String korName;

    @NotBlank(message = "영어 이름은 필수 입력 사항 입니다.")
    @Pattern(regexp = "^[a-zA-Z]+\\s?([a-zA-Z]+$)")
    private String engName;

    @Min(100) @Max(50000)
    private Integer price;

    public String getKorName() { return korName; }

    public String getEngName() { return engName; }

    public Integer getPrice() { return price; }

}
