import greenfoot.*; 
public class ComputerPaddle extends Actor
{
    private GreenfootImage banana1;
    private GreenfootImage banana2;
    private GreenfootImage banana3;
    public ComputerPaddle () {
         super();
            banana1 = new GreenfootImage("BananaStage1.png");
            banana2 = new GreenfootImage("BananaStage2.png");
            banana3 = new GreenfootImage("BananaStage3.png");

    }
    public void act(){
        move();
        changeTexture();
    }
    
    public void move(){
        move(5);
    }
    
    public void changeTexture(){
        if(WombatBall.bounceCount < 10){
                setImage(banana1);
            }
        if (WombatBall.bounceCount == WombatBall.levelTwo ){
                setImage(banana2);
            }
        if (WombatBall.bounceCount == WombatBall.levelThree){
                setImage(banana3);
            }
        }
    }

