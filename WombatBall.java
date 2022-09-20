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
    int dx = 2;
    int dy = 2;
    public int bounceCount = 0;
    public void act(){
         directionUpDown();   
         gameStop();
         levelUp();
    }
    
    
    public void directionUpDown(){
        this.setLocation(this.getX() + dx, this.getY() + dy);
        if(this.getX() < 10 || this.getX()>940){
            dx = dx * -1;
        }   
        if(this.getY() < 10 || this.getY() > 590){
            if(directionUP){
                directionUP=!directionUP;
            }
            dy = dy * -1;
        }
        Paddle p = (Paddle) getOneIntersectingObject(Paddle.class);
        ComputerPaddle cp = (ComputerPaddle) getOneIntersectingObject(ComputerPaddle.class);
        if(p != null || cp!=null){
           dy = dy * -1;
           directionUP=!directionUP;
        }
        if(cp!=null){
            if(bounceCount == 0){
            Board.level.add(1);
            }
            bounceCount++;
            if(bounceCount == 10){
            Board.level.add(1);
            }
            if(bounceCount == 20){
            Board.level.add(1);
            }
        }
    }
 
    private void gameStop(){
        if(this.getY() > 590){
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    
    private int getbounceCounting(){
       return bounceCount; 
       }   
    
    public void levelUp(){
        if (bounceCount == 10 || bounceCount == 20 || bounceCount == 30){
            if (dx>0 && dy>0){ //down + right
            dy = dy + 1;
            dx = dx + 1;
            }
            if (dx>0 && dy<0){ //up + right
            dy = dy - 1;
            dx = dx + 1;
            }
            if (dx<0 && dy>0){ //down + left
            dy = dy + 1;
            dx = dx - 1;
            }
            if (dx<0 && dy<0){ //up + left
            dy = dy - 1;
            dx = dx - 1;
            }
        }
    }
    
}
    
    

