import greenfoot.*;
/**
 * Write a description of class InstructionScreen here.
 * 
 * @author Zheng
 * @version October 2024
 */
public class InstructionScreen extends World  
{
        
    private World home;
  
    private Label instructions;
    
    private String[] allText = { "Screen 0", "Screen 1", "Screen 2" };
    
    private int currentIndex = 0;
    private Label instructionLabel = new Label(allText[currentIndex], 50); 

    /*
     * Constructor for objects of class InstructionScreen
     */
    public InstructionScreen(World home)
    {
      // create a new world 
        super(600, 400, 1);
        this.home = home;
        instructions = new Label("Use Buttons to Navigate through screens", 30);
        addObject(instructions, 300, 100);
        // instructionLabel = new Label(getInstruction(currentIndex), 50);
        addObject(instructionLabel, 300, 200);
        // Next button
        addObject(new Button(this::nextScreen), 500, 350);
        Label goNext = new Label("next", 20);
        addObject(goNext, 100, 260);
        // Back button
        addObject(new Button(this::prevScreen), 100, 350);  
        Label goBack = new Label("back", 20); 
        addObject(goBack, 100, 260);

        // go back to menu screen 
        addObject(new Button(this:: backMenu), 100, 370);
        backMenuLabel = new Label("Return to Menu", 20);
        addObject(backMenuLabel, 100, 350);

    }
    
    private String getInstruction(int index) {
        return "Screen " + index; 

    }


    private void nextScreen() {
        if(currentIndex < allText.length - 1)
        {
          currentIndex++;
        }
        
        instructionLabel.setValue(allText[currentIndex]);
      }
    
      private void prevScreen() {
        // Exit if at the first screen
        if (currentIndex == 0) {
          Greenfoot.setWorld(home);
          return;
        } else {
          currentIndex--;
          instructionLabel.setValue(allText(currentIndex));
        }
    }
    
    private void backMenu()
    {
      Greenfoot.setWorld(home);
    }
}
