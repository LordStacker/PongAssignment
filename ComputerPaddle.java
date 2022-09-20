import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ComputerPaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComputerPaddle extends Actor
{
    /**
     * Act - do whatever the ComputerPaddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage damnBanana;
    public ComputerPaddle () {
         super();
         getImage().scale(320,100);
         //damnBanana = new GreenfootImage("BananaStages2.png");
         //setImage(damnBanana);
         
    }
    public void act(){
        move();
    }
    
    public void move(){
        move(5);
    }
    
    public void changeTexture(){
        
    }
}
