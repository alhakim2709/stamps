package com.example.stamps.service;

public class ApaBole {
    public void printApaBole(){
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("ApaBole");
            } else if (i % 3 == 0) {
                System.out.print(("Apa"));
            } else if (i % 5 == 0) {
                System.out.print("Bole");
            }else {
                System.out.print(i);
            }
            if(i != 100) System.out.print(", ");
            if(i % 20 == 0) System.out.print('\n');
        }
    }
}
