import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board extends World
{

    int dx = 5;
    int dy = 0;
    LavaFloor lf = new LavaFloor();
    Paddle pd = new Paddle();
    ComputerPaddle cpd = new ComputerPaddle();
    WombatBall wb = new WombatBall();
    public Board()
    {    
        super(950, 600, 1); 
        addObject(lf, 455, 650);
        addObject(pd, 425, 500);
        addObject(cpd,Greenfoot.getRandomNumber(950), 50);
        addObject(wb, 425, 300);
    }
    public void act(){ 
    if(Greenfoot.isKeyDown("left")){
        pd.move(-4);
        }
    if(Greenfoot.isKeyDown("right")){
       pd.move(4);
        }
    if(cpd.isAtEdge()){
    removeObject(this.cpd);
    addObject(cpd, Greenfoot.getRandomNumber(100)+20,Greenfoot.getRandomNumber(100)+50);
    }
    wb.setLocation(wb.getX() + dx, wb.getY() + dy);
    
    }        
}
