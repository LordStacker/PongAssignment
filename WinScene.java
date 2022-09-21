import greenfoot.*; 
public class WinScene extends World
{
    int bananaAmount = 10;
    
    public WinScene()
    {    
       
        super(950, 600, 1); 
         shower();
    }
    public void shower(){
        for(int i=0; i<bananaAmount;i++){
            addObject(new BananaSlice1(), Greenfoot.getRandomNumber(950), 0);
        }
        for(int i=0; i<bananaAmount;i++){
            addObject(new BananaSlice2(), Greenfoot.getRandomNumber(950), 0);
        }
    }
}
