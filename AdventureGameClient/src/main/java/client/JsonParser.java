/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Annika
 */
public class JsonParser {
    private String msg;
    private boolean toAnswer;
    private boolean pressEnter;
    private int max;
    private int min;
    
    public JsonParser() {}

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isToAnswer() {
        return toAnswer;
    }

    public void setToAnswer(boolean toAnswer) {
        this.toAnswer = toAnswer;
    }

    public boolean isPressEnter() {
        return pressEnter;
    }

    public void setPressEnter(boolean pressEnter) {
        this.pressEnter = pressEnter;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
