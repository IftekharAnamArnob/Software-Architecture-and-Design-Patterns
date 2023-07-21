package Behavioural_Pattern.Command_Pattern;

public class WordOperations {

    public static void main(String[] args) {

         Word_Document word_document = new Word_Document();

         OpenCommand openCommand = new OpenCommand(word_document);
         CloseCommand closeCommand = new CloseCommand(word_document);
         SaveCommand saveCommand = new SaveCommand(word_document);


          Menu menu = new Menu(openCommand,saveCommand,closeCommand);

          menu.ClickOpen();
          menu.ClickSave();
          menu.ClickClose();





    }
}
