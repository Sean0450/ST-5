package com.mycompany.app;

import com.mycompany.app.Sqrt;

public class App
{
    public static void main(String[] args)
    {
        double val=Double.parseDouble("2.0");
        Sqrt sqrt=new Sqrt(val);
        double result=sqrt.calc();
        System.out.println("Sqrt of " + val + " = " + result);
    }
}