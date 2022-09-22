import greenfoot.*;  
public class Board extends World
{
    public static Counter level = new Counter("Level: ");
    public static Counter Life = new Counter("Life: ");
    public static Counter points = new Counter("Points: ");
    int dx = 4;
    int dy = 4;
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
        addObject(level, 880, 50);
        addObject(points, 880, 80);
        addObject(wb, 425, 300);
        addObject(Life, 880, 550);
        Life.setValue(3);
        
        
    }
    public void act(){ 
    directionLeftRight();
    cpdMovement();
    }        
    
    public void directionLeftRight(){
        if(Greenfoot.isKeyDown("left")){
        pd.move(-4);
            if(wb.bounceCount > wb.levelThree){
            pd.move(-5);
            }
        }
        if(Greenfoot.isKeyDown("right")){
        pd.move(4);
            if(wb.bounceCount > wb.levelThree){
            pd.move(5);
            }
        }
        
    }
    
    public void cpdMovement(){
        if(cpd.isAtEdge()){
            removeObject(this.cpd);
            addObject(cpd, Greenfoot.getRandomNumber(100)+20,Greenfoot.getRandomNumber(100)+50);
           /* if(level.getValue() == 3){
                removeObject(this.cpd);
                addObject(cpd, Greenfoot.getRandomNumber(100)+20,Greenfoot.getRandomNumber(100)+50);
            }*/
    }
    }
}
