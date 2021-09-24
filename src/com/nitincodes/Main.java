package com.nitincodes;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	//
    Scanner sc = new Scanner(System.in);
    Details arr[] = new Details[4];
    for(int i=0;i<arr.length;i++){
        arr[i] = new Details();
        arr[i].age = sc.nextInt();
        arr[i].height = sc.nextInt();
        arr[i].name = sc.next();
        int maxAge = arr[0].age;
        int maxHeight = arr[0].height;
        if(maxAge<arr[i].age){
        maxAge = arr[i].age;
        System.out.println("the oldest person is "+arr[i].name+" with age "+maxAge );
    }
    if(maxHeight<arr[i].height){
        maxHeight = arr[i].height;
        System.out.println("The tallest person is "+arr[i].name+ " with height "+maxHeight);
    }
    }
    }
}
class Details{
    int age;
    int height;
    String name;
}
