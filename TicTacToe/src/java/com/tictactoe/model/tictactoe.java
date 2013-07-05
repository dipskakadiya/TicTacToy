/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tictactoe.model;

/**
 *
 * @author sai
 */
public class tictactoe {
    private char btn1;
    private char btn2;
    private char btn3;
    private char btn4;
    private char btn5;
    private char btn6;
    private char btn7;
    private char btn8;
    private char btn9;

    public tictactoe(){
      btn1='1';
    btn2='2';
    btn3='3';
      btn4='4';
      btn5='5';
      btn6='6';
      btn7='7';
      btn8='8';
      btn9='9';
    }
    public char getBtn1() {
        return btn1;
    }

    public void setBtn1(char btn1) {
        this.btn1 = btn1;
    }

    public char getBtn2() {
        return btn2;
    }

    public void setBtn2(char btn2) {
        this.btn2 = btn2;
    }

    public char getBtn3() {
        return btn3;
    }

    public void setBtn3(char btn3) {
        this.btn3 = btn3;
    }

    public char getBtn4() {
        return btn4;
    }

    public void setBtn4(char btn4) {
        this.btn4 = btn4;
    }

    public char getBtn5() {
        return btn5;
    }

    public void setBtn5(char btn5) {
        this.btn5 = btn5;
    }

    public char getBtn6() {
        return btn6;
    }

    public void setBtn6(char btn6) {
        this.btn6 = btn6;
    }

    public char getBtn7() {
        return btn7;
    }

    public void setBtn7(char btn7) {
        this.btn7 = btn7;
    }

    public char getBtn8() {
        return btn8;
    }

    public void setBtn8(char btn8) {
        this.btn8 = btn8;
    }

    public char getBtn9() {
        return btn9;
    }

    public void setBtn9(char btn9) {
        this.btn9 = btn9;
    }
    
    public char check_result(){
        char res='~';
        if(btn1==btn4 && btn4==btn7){
            res=btn1;
        }
        if(btn2==btn5 && btn5==btn8){
             res=btn2;
        }
        if(btn3==btn6 && btn6==btn9){
             res=btn3;
        }
        if(btn1==btn2 && btn2==btn3){
             res=btn1;
        }
        if(btn4==btn5 && btn5==btn6){ 
             res=btn4;
        }
        if(btn7==btn8 && btn8==btn9){
             res=btn7;
        }
        if(btn1==btn5 && btn5==btn9){
             res=btn1;
        }
        if(btn3==btn5 && btn5==btn7){
             res=btn3;
        }    
        return res;
    }
    
}
