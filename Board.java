import greenfoot.*;  
public class Board extends World
{

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
   /* wb.setLocation(wb.getX() + dx, wb.getY() + dy);
    if(wb.getX() < 10 || wb.getX()>940){
        dx = dx * -1;
    }
      if(wb.getY() < 10 || wb.getY() > 590){
        dy = dy * -1;
    }*/
    }        
}
