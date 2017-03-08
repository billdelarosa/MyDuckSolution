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
public class MallardDuck implements Duck {
    private Flyable flyable;
    private Quackable quack;
    private DisplayMode displayMode;

    public MallardDuck(Flyable flyable, Quackable quack, DisplayMode displayMode){
        this.flyable = flyable;
        this.quack = quack;
        this.displayMode = displayMode;
    }
    @Override
    public void performFly() {
        flyable.fly();
    }

    @Override
    public void performQuack() {
        quack.quack();
    }

    @Override
    public void performDisplay() {
        displayMode.display();
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public Quackable getQuack() {
        return quack;
    }

    public void setQuack(Quackable quack) {
        this.quack = quack;
    }

    public DisplayMode getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(DisplayMode displayMode) {
        this.displayMode = displayMode;
    }
    
    
}
