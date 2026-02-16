package IfElse;

import java.util.Scanner;

public class profitLoss {
    //If cost price and selling price of an item is
    //input through the keyboard, write a program to
    //determine whether the seller has made profit or
    //incurred loss. Also determine how much profit he
    //made or loss he incurred.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cp , sp ;
        System.out.print("enter the cost price : ");
        cp = sc.nextFloat();
        System.out.print("enter the selling price : ");
        sp = sc.nextFloat();
        if(cp == sp){
            System.out.println("no profit no loss");
        }
        else if(cp<sp){
            float profit , profitPer;
            profit = sp - cp ;
            profitPer = (profit / cp)*100;
            System.out.printf("the profit is %f rupees and the profit percentage is %f .",profit,profitPer);
        }
        else {
            float loss , lossPer;
            loss = cp - sp ;
            lossPer = (loss / cp)*100;
            System.out.printf("the loss is %f rupees and the loss percentage is %f .",loss,lossPer);
        }
    }
}
