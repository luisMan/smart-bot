package hacks.lehmantech.com.notifybot;

import android.content.Context;
import android.speech.tts.TextToSpeech;

import org.w3c.dom.Text;

import java.util.Locale;

public class TextToSpeechSingleton {
    private TextToSpeech speech;
    private Context context;

    public TextToSpeechSingleton(Context context){
        this.context =  context;
        //instantiate the textTospeech object to make this machine to talk
        this.speech =  new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                speech.setLanguage(Locale.ENGLISH);
                if(status ==  TextToSpeech.ERROR){
                    speech.setLanguage(Locale.forLanguageTag("ES"));
                }
            }
        });

    }


    public void speakAtLout(String text)
    {
         speech.speak(text,TextToSpeech.QUEUE_FLUSH,null);

    }

    public void onPause(){
        
    }


}
