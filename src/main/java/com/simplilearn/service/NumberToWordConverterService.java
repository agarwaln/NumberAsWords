package com.simplilearn.service;

public class NumberToWordConverterService {

    public static final String SPACE = " ";
    String onesAr [] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String tensAr[] = {"","Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty"};


    public String convertNumberToWords(Integer number){
        String numberAsWords = "";

        if(number < 20){
            numberAsWords = onesAr[number];
        }else if (number >= 20 && number < 100){
            numberAsWords = tensAr[number/10] + SPACE + convertNumberToWords(number % 10);
        }else if (number >= 100 && number < 1000 ){
            numberAsWords = onesAr[number/100] + " Hundred" + SPACE + convertNumberToWords(number % 100);
        }
        return numberAsWords.trim();

    }



}
