package com.example.android_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txt_cur;
    private Context mContext;
    private Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;

    int rn;

    public void r(){
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);

        b1.setText("1,2月 發票");
        b2.setText("3,4月 發票");
        b3.setText("5,6月 發票");
        b4.setText("7,8月 發票");
        b5.setText("9,10月 發票");
        b6.setText("11,12月 發票");
    }

    public void r1(View view){
        r();
        b1.setText("✓1,2月 發票");
        rn = 1;
    }

    public void r2(View view){
        r();
        b2.setText("✓3,4月 發票");
        rn = 2;
    }

    public void r3(View view){
        r();
        b3.setText("✓5,6月 發票");
        rn = 3;
    }

    public void r4(View view){
        r();
        b4.setText("✓7,8月 發票");
        rn = 4;
    }

    public void r5(View view){
        r();
        b5.setText("✓9,10月 發票");
        rn = 5;
    }

    public void r6(View view){
        r();
        b6.setText("✓11,12月 發票");
        rn = 6;
    }

    public void r7(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        switch (rn){
            case 1:
                intent.putExtra("n1", 11111);
                intent.putExtra("n2", 22222);
                intent.putExtra("n3", 33333);
                intent.putExtra("n4", 44444);
                intent.putExtra("n5", 55555);
                break;
            case 2:
                intent.putExtra("n1", 66666);
                intent.putExtra("n2", 77777);
                intent.putExtra("n3", 88888);
                intent.putExtra("n4", 99999);
                intent.putExtra("n5", 12121);
                break;
            case 3:
                intent.putExtra("n1", 13131);
                intent.putExtra("n2", 14141);
                intent.putExtra("n3", 15151);
                intent.putExtra("n4", 16161);
                intent.putExtra("n5", 17171);
                break;
            case 4:
                intent.putExtra("n1", 18181);
                intent.putExtra("n2", 19191);
                intent.putExtra("n3", 00000);
                intent.putExtra("n4", 20202);
                intent.putExtra("n5", 21212);
                break;
            case 5:
                intent.putExtra("n1", 23232);
                intent.putExtra("n2", 24242);
                intent.putExtra("n3", 25252);
                intent.putExtra("n4", 26262);
                intent.putExtra("n5", 28282);
                break;
            case 6:
                intent.putExtra("n1", 30303);
                intent.putExtra("n2", 31313);
                intent.putExtra("n3", 32323);
                intent.putExtra("n4", 34343);
                intent.putExtra("n5", 35353);
                break;
        }

        if(rn == 0)
        {
            Toast.makeText(this, "請先選擇月份", Toast.LENGTH_SHORT).show();
        }
        else {
            startActivity(intent);
            this.finish();
        }

    }
}