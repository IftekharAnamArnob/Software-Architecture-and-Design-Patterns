package Behavioural_Pattern.Command_Pattern;

public class CloseCommand implements Command{

     private Word_Document word_document;

       public CloseCommand(Word_Document word_document)
       {
           this.word_document=word_document;

       }

    @Override
    public void execute() {
        word_document.Close();

    }
}
