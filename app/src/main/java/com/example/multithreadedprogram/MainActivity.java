package com.example.multithreadedprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class MyRunnableOdd implements Runnable {
        @Override
        public void run() {
            int n = 100;
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.println(i + " ");
                }
            }
        }
    }

    public class MyRunnableEven implements Runnable {
        @Override
        public void run() {
            int n = 100;
            for (int i = 1; i <= n; i++){
                if (i % 2 == 0) {
                    System.out.println(i + " ");
                }
            }
        }
    }
}