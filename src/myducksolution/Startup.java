/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myducksolution;

/**
 *
 * @author Billy-Mac
 */
public class Startup {
    public static void main(String[] args) {
        Flyable fly = new FlyWithWings();
        Quackable quack = new Squeak();
        DisplayMode display = new Display2D();
        
        Duck duck = new MallardDuck(fly, quack, display);
        duck.performDisplay();
        duck.performFly();
        duck.performQuack();
    }
}
