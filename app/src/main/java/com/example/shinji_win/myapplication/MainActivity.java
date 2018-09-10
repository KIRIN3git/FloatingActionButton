package com.example.shinji_win.myapplication;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout fab_layout,main_fab_layout,right_fab_layout,left_fab_layout;
    FloatingActionButton main_fab_button,right_fab_button,left_fab_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab_layout = (LinearLayout) findViewById(R.id.fab);
        main_fab_layout = (LinearLayout) findViewById(R.id.main_fab_layout);
        right_fab_layout = (LinearLayout) findViewById(R.id.right_fab_layout);
        left_fab_layout = (LinearLayout) findViewById(R.id.left_fab_layout);

        main_fab_button = (FloatingActionButton) findViewById(R.id.main_fab);
        right_fab_button = (FloatingActionButton) findViewById(R.id.right_fab);
        left_fab_button = (FloatingActionButton) findViewById(R.id.left_fab);

        final AlphaAnimation fadein = new AlphaAnimation(0, 1);
        final AlphaAnimation fadeout = new AlphaAnimation(1, 0);
        fadein.setDuration(500);
        fadeout.setDuration(500);

        main_fab_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (right_fab_layout.getVisibility() == View.VISIBLE) {
                    main_fab_button.setImageResource(R.drawable.ic_action_display_type_list);
                    fab_layout.setBackgroundResource(0);
                    fab_layout.setClickable(false);
                }
                else {
                    main_fab_button.setImageResource(R.drawable.ic_action_stop);
                    fab_layout.setBackgroundResource(R.color.nacolor_ui_dark_medium_grayish_alpha2);
                    fab_layout.setClickable(true);
                }

                if (left_fab_layout.getVisibility() == View.INVISIBLE || right_fab_layout.getVisibility() == View.GONE) {
                    left_fab_layout.startAnimation(fadein);
                    left_fab_layout.setVisibility(View.VISIBLE);
                } else {
                    left_fab_layout.startAnimation(fadeout);
                    left_fab_layout.setVisibility(View.INVISIBLE);
                }
                if (right_fab_layout.getVisibility() == View.INVISIBLE || right_fab_layout.getVisibility() == View.GONE) {
                    right_fab_layout.startAnimation(fadein);
                    right_fab_layout.setVisibility(View.VISIBLE);
                } else {
                    right_fab_layout.startAnimation(fadeout);
                    right_fab_layout.setVisibility(View.INVISIBLE);
                }
            }
        });

        right_fab_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        left_fab_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });


                Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "ボタンが押されました", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
