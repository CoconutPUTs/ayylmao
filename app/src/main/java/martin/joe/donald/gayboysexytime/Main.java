package martin.joe.donald.gayboysexytime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Main extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        addListenerOnButton();


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void addListenerOnButton() {
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnTouchListener(new View.OnTouchListener() {
            float scale = 1.0f;

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() != MotionEvent.ACTION_BUTTON_RELEASE) {
                    scale = scale * 1.1f;
                    imageButton.setScaleX(scale);
                    imageButton.setScaleY(scale);
                }
                return false;
            }
        });
    }
}
