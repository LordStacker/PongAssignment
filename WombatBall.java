import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WombatBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WombatBall extends Actor
{
    private boolean directionUP;
    /**
     * Act - do whatever the WombatBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WombatBall(){
    super();
    getImage().scale(40,40);
    directionUP=false;
    }
    int dx = 3;
    int dy = 3;
    public static int bounceCount = 0;
    public static int levelTwo = 10;
    public static int levelThree = 20;
    public void act(){
         directionUpDown();   
         gameStop();
         levelUp();
    }
    
    
    public void directionUpDown(){
        this.setLocation(this.getX() + dx, this.getY() + dy);
        if(this.getX() < 10 || this.getX()>940){
            Greenfoot.playSound("BounceWombat.wav");
            dx = dx * -1;
        }   
        if(this.getY() < 10 || this.getY() > 590){
            if(directionUP){
                directionUP=!directionUP;
            }
            Greenfoot.playSound("BounceWombat.wav");
            dy = dy * -1;
        }
        Paddle p = (Paddle) getOneIntersectingObject(Paddle.class);
        ComputerPaddle cp = (ComputerPaddle) getOneIntersectingObject(ComputerPaddle.class);
        if(p != null || cp!=null && directionUP){
           Greenfoot.playSound("BounceWombat.wav");
           dy = dy * -1;
           bounceCount++;
           Board.points.add(1);
           directionUP=!directionUP;
        }
        if(cp != null && directionUP){
           dy = dy * -1;
           directionUP=!directionUP;
          
           if(bounceCount == 1){
            Board.level.add(1);
            }
            if(bounceCount == 10){
            Board.level.add(1);
            }
            if(bounceCount == 20){
            Board.level.add(1);
            }
            if(bounceCount == 30){
                Greenfoot.setWorld(new WinScene());
                Greenfoot.playSound("WinSound.wav");
            }
          
        }
        
    }
 
    private void gameStop(){
        if(this.getY() > 590){
            //getWorld().removeObject(this);
            //Discounting 1 life for every death of the wombat
            Board.Life.add(-1);
            //Greenfoot.stop();
            if(Board.Life.getValue() == 0){
                Greenfoot.setWorld(new GameOver());
                Greenfoot.playSound("GameOverSound.wav");
            }
            else{
                setLocation(300, 300);
            }
        }
    }
    
    public void levelUp(){
        if (bounceCount == levelTwo){
            if (dx>0 && dy>0){ //down + right
            dy = 3;
            dx = 3;
            }
            else if (dx>0 && dy<0){ //up + right
            dy = -3;
            dx = 3;
            }
            else if (dx<0 && dy>0){ //down + left
            dy = 3;
            dx = -3;
            }
            else if (dx<0 && dy<0){ //up + left
            dy = -3;
            dx = -3;
            }
        }
        if (bounceCount == levelThree){
            if (dx>0 && dy>0){ //down + right
            dy = 5;
            dx = 5;
            }
            else if (dx>0 && dy<0){ //up + right
            dy = -5;
            dx = 5;
            }
            else if (dx<0 && dy>0){ //down + left
            dy = 5;
            dx = -5;
            }
            else if (dx<0 && dy<0){ //up + left
            dy = -5;
            dx = -5;
            }
        }
    }
    
}
    
    

