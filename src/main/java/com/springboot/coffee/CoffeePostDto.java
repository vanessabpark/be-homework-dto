package com.springboot.coffee;

import javax.validation.constraints.*;

public class CoffeePostDto {

    @NotBlank(message = "한글 이름은 필수 입력 사항 입니다.")
    @Pattern(regexp = "^\\S+(\\s?\\S+)*$", message = "커피 이름은 공백이 아니어야 합니다.")
    private String korName;

    @NotBlank(message = "영어 이름은 필수 입력 사항 입니다.")
    @Pattern(regexp = "^[a-zA-Z]+\\\\s?*([a-zA-Z]+$)\n")
//    ^[A-Za-z]+( [A-Za-z]+)*$
    private String engName;

    @NotBlank(message = "가격은 필수 입력 사항 입니다.")
    @Pattern(regexp = "^(100|[1-9]\\d{2,3}|[1-4]\\d{4}|50000)$\n")
    private String price;

    public String getKorName() {
        return korName;
    }

    public String getEngName() { return engName; }

    public String getPrice() {
        return price;
    }

}
