package com.epam.calculator;

public class Divison {
	float a;
	float b;
	public Divison(float a,float b){
		this.a=a;
		this.b=b;
	}
	public String div(){
		if(b==0) return "divisor cannot be a zero";
		return Float.toString(this.a+this.b);
	}
}