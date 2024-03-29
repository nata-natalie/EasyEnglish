package space.natallia.easyenglish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levels);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Команда для кнопки Назад
        Button button_back = (Button) findViewById(R.id.buttonBack);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Levels.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }

            }
        });

        //Кнопка для перехода на первый уровень
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            try {
                Intent intent = new Intent(Levels.this, Level1.class);
                startActivity(intent);
                finish();
            } catch (Exception e) {
            }
        }
    });

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level3.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level4.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level5.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView6 = (TextView) findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level6.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView7 = (TextView) findViewById(R.id.textView7);
        textView7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level7.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level8.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView9 = (TextView) findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level9.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView10 = (TextView) findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level10.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level11.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level12.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView13 = (TextView) findViewById(R.id.textView13);
        textView13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level13.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView14 = (TextView) findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level14.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView15 = (TextView) findViewById(R.id.textView15);
        textView15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level15.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView16 = (TextView) findViewById(R.id.textView16);
        textView16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level16.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView17 = (TextView) findViewById(R.id.textView17);
        textView17.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level17.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView18 = (TextView) findViewById(R.id.textView18);
        textView18.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level18.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView19 = (TextView) findViewById(R.id.textView19);
        textView19.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level19.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView20 = (TextView) findViewById(R.id.textView20);
        textView20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level20.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView21 = (TextView) findViewById(R.id.textView21);
        textView21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level21.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView22 = (TextView) findViewById(R.id.textView22);
        textView22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level22.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView23 = (TextView) findViewById(R.id.textView23);
        textView23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level23.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView24 = (TextView) findViewById(R.id.textView24);
        textView24.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level24.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView25 = (TextView) findViewById(R.id.textView25);
        textView25.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level25.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView26 = (TextView) findViewById(R.id.textView26);
        textView26.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level26.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView27 = (TextView) findViewById(R.id.textView27);
        textView27.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level27.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });

        TextView textView28 = (TextView) findViewById(R.id.textView28);
        textView28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                try {
                    Intent intent = new Intent(Levels.this, Level28.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
    }

    //Системная кнопка Назад
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Levels.this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
        }
    }
}