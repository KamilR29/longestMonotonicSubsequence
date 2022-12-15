package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ASD1 {

    public static void main(String[] args) throws FileNotFoundException {


        File file = new File(String.valueOf(args[0]));
        Scanner scanner = new Scanner(file);



        String subString ;

        int quantity = 0;
        int sum = 0;

        int tmpQuantity = 0;
        int tmpSum = 0;

        int quantityMinus = 0;
        int sumMinus = 0;

        int tmpQuantityMinus = 0;
        int tmpSumMinus = 0;

        int prev;
        int next = scanner.nextInt();
        int index = 0;

        if(!scanner.hasNext()) {
            quantity = 1;
            sum = next;
        }else {


            boolean isTrue = true;
            while (isTrue) {
                prev = next;
                next = scanner.nextInt();


                if (prev <= next) {
                    tmpQuantity++;
                    tmpSum += prev;
                } else {
                    tmpSum += prev;
                    tmpQuantity++;
                    if (tmpQuantity > quantity) {
                        quantity = tmpQuantity;
                        sum = tmpSum;
                        index = 0;

                    }
                    tmpQuantity = 0;
                    tmpSum = 0;
                }


                if (prev >= next) {


                    tmpQuantityMinus++;
                    tmpSumMinus += prev;
                } else {
                    tmpSumMinus += prev;
                    tmpQuantityMinus++;
                    if (tmpQuantityMinus > quantityMinus) {
                        quantityMinus = tmpQuantityMinus;
                        sumMinus = tmpSumMinus;
                        index = 1;


                    }
                    tmpQuantityMinus = 0;
                    tmpSumMinus = 0;
                }
                if (!scanner.hasNext()) {
                    if (prev <= next) {
                        tmpQuantity++;
                        tmpSum += next;
                        if (tmpQuantity > quantity) {
                            quantity = tmpQuantity;
                            sum = tmpSum;
                            index = 0;

                        }
                        isTrue = false;
                    }
                    if (prev >= next) {
                        tmpQuantityMinus++;
                        tmpSumMinus += next;
                        if (tmpQuantityMinus > quantityMinus) {
                            quantityMinus = tmpQuantityMinus;
                            sumMinus = tmpSumMinus;
                            index = 1;
                        }
                        isTrue = false;
                    }
                }

            }
        }

        if(quantity == quantityMinus){
            if(index == 1) {
                subString = (quantity + " " + sum);
            } else {
                subString = (quantityMinus + " " + sumMinus);}

        }else if(quantity>quantityMinus) {

            subString = (quantity + " " + sum);
        }else {
            subString = (quantityMinus + " " + sumMinus);
        }



        System.out.println(subString);



    }

}
