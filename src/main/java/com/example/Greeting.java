package com.example;
import com.engflow.fancytext.FancyFormatter;

public class Greeting {
    public static void sayHi() {
        FancyFormatter ff = new FancyFormatter();
        String output = ff.format("why oiewfjeowho");
        //String output = FancyFormatte.fo
        //String output = new FancyFormatter().format("Why won't this work T.T");
       System.out.println(output);
    }
}
