package sample;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Podaj liczbe: ");

        b = scanner.nextInt();

        System.out.println("Podaj ilosc liczb: ");

        a = scanner.nextInt();

        System.out.println("Podaj liczby: ");
        int t[] = new int[a];
        for(int i=0; i<a; i++){
            t[i] = scanner.nextInt();
        }
        Arrays.sort(t);


        int L=0,S,P=a-1;
        while(L<=P)
        {
            S = (L + P)/2;

            if(t[S] == b){
                S++;
                System.out.println("Liczba znajduje sie na pozycji: "+S);
                break;
            }

            else if(t[S] > b){
                P = S - 1;
            }
            else{
                L = S - 1;
            }

        }
    }
}
