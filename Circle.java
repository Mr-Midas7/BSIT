/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maine;

/**
 *
 * @author ljapo
 */
public class Circle {
    private double radius;
    private double result;
    
    public void setradius(double radius){
        this.radius=radius;
    }
    public Double getradius(){
        return radius;
    }
    public double calculateRadius(){
        double rad=2*Math.PI*radius;
        return rad;
    }
    }
