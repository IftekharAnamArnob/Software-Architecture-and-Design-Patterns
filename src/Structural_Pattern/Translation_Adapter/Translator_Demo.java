package Structural_Pattern.Translation_Adapter;

public class Translator_Demo {

    public static void main(String[] args) {
        Englishspeaker robert = new Robert();
        Frencspeaker jean = new Jean();
        Translator translator = new Translator(jean);

        robert.speaksenglish();

        translator.speaksenglish();
    }
}
