package com.tc.BimBrain.Domain.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "rectangles")
public class Rectangle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double length;
    private double width;
    private String validRangeRule;
    private String correctStepIncrease;
    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getValidRangeRule() {
        return validRangeRule;
    }

    public void setValidRangeRule(String validRangeRule) {
        this.validRangeRule = validRangeRule;
    }

    public String getCorrectStepIncrease() {
        return correctStepIncrease;
    }

    public void setCorrectStepIncrease(String correctStepIncrease) {
        this.correctStepIncrease = correctStepIncrease;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double validLengthStep()
    {
        return (this.length*100-9.125*100)%12.5;
    }
    public double validWidthStep()
    {
        return (this.width*100-8.5*100)%12.5;
    }
}
