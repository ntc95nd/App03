package com.example.maimi.activity;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.maimi.boom1.MainActivity;
import com.example.maimi.boom1.R;
import com.example.maimi.fragment.ClassesFragment;
import com.example.maimi.fragment.GameModeFragment;
import com.example.maimi.fragment.ScorePointFragment;
import com.example.maimi.fragment.StatsFragment;
import com.example.maimi.models.Classes;

/**
 * Created by minhtien on 8/1/2016.
 */
public class GuideActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.layout_chose);
        if (savedInstanceState == null) {
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            StatsFragment statsFragment = new StatsFragment();
            ClassesFragment classesFragment = new ClassesFragment();
            ScorePointFragment scorePointFragment = new ScorePointFragment();
            GameModeFragment gameModeFragment = new GameModeFragment();
            Intent intent = getIntent();
            int kind = intent.getIntExtra(MainActivity.BUTTON_INDEX, -1);
            if (kind == -1) return;
            if (kind == 0) {
                ft.add(R.id.fr_chose, statsFragment, "statsFragment");
                ft.commit();
            } else if (kind == 1) {
                ft.add(R.id.fr_chose, classesFragment, "classesFragment");
                ft.commit();
            } else if (kind == 2) {
                ft.add(R.id.fr_chose, scorePointFragment, "scorePointFragment");
                ft.commit();
            } else if (kind == 3) {
                ft.add(R.id.fr_chose, gameModeFragment, "gameModeFragment");
                ft.commit();
            }
        }
    }
}
