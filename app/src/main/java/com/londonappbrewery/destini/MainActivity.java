package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView tv_storyTextView;
    private Button btn_top,btn_bottom;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        tv_storyTextView = (TextView)findViewById(R.id.storyTextView);
        btn_top = (Button)findViewById(R.id.buttonTop);
        btn_bottom = (Button)findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        btn_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1)
                {
                    tv_storyTextView.setText(getResources().getString(R.string.T3_Story));
                    btn_top.setText(getResources().getString(R.string.T3_Ans1));
                    btn_bottom.setText(getResources().getString(R.string.T3_Ans2));
                    mStoryIndex = 3;
                }
                else if(mStoryIndex == 3)
                {
                    tv_storyTextView.setText(getResources().getString(R.string.T6_End));
                    btn_top.setVisibility(View.GONE);
                    btn_bottom.setVisibility(View.GONE);
                    mStoryIndex = 0;
                }
                else if(mStoryIndex == 2)
                {
                    tv_storyTextView.setText(getResources().getString(R.string.T3_Story));
                    btn_top.setText(getResources().getString(R.string.T3_Ans1));
                    btn_bottom.setText(getResources().getString(R.string.T3_Ans2));
                    mStoryIndex = 3;
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        btn_bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1)
                {
                    tv_storyTextView.setText(getResources().getString(R.string.T2_Story));
                    btn_top.setText(getResources().getString(R.string.T2_Ans1));
                    btn_bottom.setText(getResources().getString(R.string.T2_Ans2));
                    mStoryIndex = 2;
                }
                else if(mStoryIndex == 3)
                {
                    tv_storyTextView.setText(getResources().getString(R.string.T5_End));
                    btn_top.setVisibility(View.GONE);
                    btn_bottom.setVisibility(View.GONE);
                    mStoryIndex = 0;
                }
                else if(mStoryIndex == 2) {
                    tv_storyTextView.setText(getResources().getString(R.string.T4_End));
                    btn_top.setVisibility(View.GONE);
                    btn_bottom.setVisibility(View.GONE);
                    mStoryIndex = 0;
                }
            }
        });

    }
}
