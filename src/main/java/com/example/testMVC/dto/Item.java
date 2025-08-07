package com.example.testMVC.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
//@NoArgsConstructor: 매개변수가 없는 기본 생성자를 자동 생성
//@AllArgsConstructor: 모든 필드를 인자로 받는 생성자 자동 생성
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    public String itemName;
    public String itemDetail;
    public int price;
    public LocalDateTime regTime;
}
