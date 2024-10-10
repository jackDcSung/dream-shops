package com.dailycodework.dreamshops.response;


//所以這是我們要用來回應 res response 的類別


import lombok.AllArgsConstructor;
import lombok.Data;



@AllArgsConstructor
@Data
public class ApiResponse {

private String message;

private Object data;














}
