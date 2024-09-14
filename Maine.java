/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maine;
import java.util.Scanner;
/**
 *
 * @author ljapo
 */
public class Maine {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       
        System.out.println("enter radius: ");
        double a=sc.nextDouble();
        
        Circle n=new Circle();
        n.setradius(a);
        System.out.println("the radius: "+n.calculateRadius());
    }
    
}
