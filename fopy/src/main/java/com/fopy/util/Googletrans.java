package com.fopy.util;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;


public class Googletrans {

    public void translation(String text){
        // Instantiates a client
        Translate translate = TranslateOptions.getDefaultInstance().getService();


        // Translates some text into Russian
        Translation translation =
                translate.translate(
                        text,
                        TranslateOption.sourceLanguage("en"),
                        TranslateOption.targetLanguage("ko"));

        System.out.printf("Text: %s%n", text);
        System.out.printf("Translation: %s%n", translation.getTranslatedText());
    }

}
