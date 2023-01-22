package com.fopy.util;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Googletrans {

    private static String googleApi;

    @Value("${google.api}")
    public void setGoogleApi(String requestApi){
        googleApi = requestApi;
    }

    public void translation(String text){
        Translate translate = TranslateOptions.newBuilder().setApiKey(googleApi).build().getService();
        Translation translation =
                translate.translate(
                        text,
                        TranslateOption.sourceLanguage("en"),
                        TranslateOption.targetLanguage("ko"));

        System.out.printf("Text: %s%n", text);
        System.out.printf("Translation: %s%n", translation.getTranslatedText());
    }
}
