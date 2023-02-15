package com.myfirstapp.apnacareer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;


public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    EditText editsearch;
    Button btnsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "LVFQu_piWsE";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

        button = findViewById(R.id.btn_graduation);
        button2 = findViewById(R.id.btn_govt);
        editsearch = findViewById(R.id.searchedit);
        btnsearch = findViewById(R.id.buttonsearch);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Graduation.class);
                startActivity(intent);
            }
        });

        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchTerms =editsearch.getText().toString();
                if(!searchTerms.equals("")){
                    searchnet(searchTerms);
                }

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Government.class);
                startActivity(intent);
            }
        });
    }
// Search Internet with default search app
private void  searchnet(String words){
    try {
        Intent intent =new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY,words);
        startActivity(intent);
    } catch (ActivityNotFoundException e){
        e.printStackTrace();
        searchNetCompat(words);
    }


        }
        //Search internet with browser if there is no search app

        private void searchNetCompat(String words){
            Uri uri=Uri.parse("http://www.google.com/#q=" +words);
            try {
                Intent intent =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            } catch (ActivityNotFoundException e){
                e.printStackTrace();
                Toast.makeText(this,"Error!",Toast.LENGTH_SHORT).show();
            }

        }

    }
