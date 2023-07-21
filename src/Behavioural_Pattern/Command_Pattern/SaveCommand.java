package Behavioural_Pattern.Command_Pattern;

public class SaveCommand implements Command{

    private Word_Document word_document;

      public SaveCommand(Word_Document word_document){
          this.word_document=word_document;

      }
    @Override
    public void execute() {
          word_document.Save();

    }
}
