package Structural_Pattern.Translation_Adapter;

public class Translator implements Englishspeaker{
    private Frencspeaker frencspeaker;

    public Translator(Frencspeaker frencspeaker)
    {
        this.frencspeaker=frencspeaker;
    }


    @Override
    public void speaksenglish() {
        System.out.println("Translates in French");
        frencspeaker.speakfrench();
    }
}
