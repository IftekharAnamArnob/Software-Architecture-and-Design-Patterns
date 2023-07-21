package Behavioural_Pattern.Command_Pattern;

public class Menu {

    private OpenCommand openCommand;
    private CloseCommand closeCommand;
    private SaveCommand saveCommand;


    public Menu(OpenCommand openCommand,SaveCommand saveCommand,CloseCommand closeCommand){

         this.openCommand=openCommand;
         this.saveCommand=saveCommand;
         this.closeCommand=closeCommand;

    }

    public void ClickOpen()
    {
        openCommand.execute();
    }
    public void ClickClose()
    {
        closeCommand.execute();
    }
    public void ClickSave()
    {
        saveCommand.execute();
    }


}
