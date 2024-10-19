package org.example.Calculatorapp2;

public class Calculatorapp2 {

    private double op1;
    private double op2;
    private char operator;
    private double result;

    public void calculate() {
        switch (this.operator) {
            case '+':
                this.result = this.op1 + this.op2;
                break;
            case '-':
                this.result = this.op1 - this.op2;
                break;
            case '*':
                this.result = this.op1 * this.op2;
                break;
            case '/':
                if (this.op2 != 0) {
                    this.result = this.op1 / this.op2;
                } else {
                    this.result = 0; // Либо бросьте исключение для деления на ноль
                }
                break;
        }
    }

    // Геттеры и сеттеры
    public double getOp1() {
        return op1;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
