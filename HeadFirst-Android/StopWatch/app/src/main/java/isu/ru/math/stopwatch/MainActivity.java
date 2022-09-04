package isu.ru.math.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int seconds = 0;
    private boolean running = false;
    private final short delay = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        runTimer();
    }

    public void runTimer() {
        final TextView textView = findViewById(R.id.timerText);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;
                String time = String.format("%02d:%02d:%02d", hours, minutes, secs);
                textView.setText(time);
                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, delay);
            }
        });
    }

    public void startTimer(View view) {
        running = true;
    }

    public void stopTimer(View view) {
         running = false;
    }

    public void resetTimer(View view) {
        running = false;
        seconds = 0;
    }
}