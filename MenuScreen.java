import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreen here.
 * 
 * @author Zheng
 * @version Oct 2024
 */
public class MenuScreen extends World
{
    
    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    MenuScreen currentMenu = this;

    public MenuScreen() {
        super(600, 400, 1);
        
        Button instructionButton = new Button(new Runnable() {
            public void run() {
                Greenfoot.setWorld(new InstructionScreen(MenuScreen.this));
            }
        });
        addObject(instructionButton, 300, 340);
    }

    
    
    
}
