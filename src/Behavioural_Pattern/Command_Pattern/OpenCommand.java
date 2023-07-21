package Behavioural_Pattern.Command_Pattern;

public class OpenCommand implements Command{

    private Word_Document word_document;

        public OpenCommand(Word_Document word_document){
           this.word_document=word_document;


        }


    @Override
    public void execute() {
        word_document.Open();

    }
}
