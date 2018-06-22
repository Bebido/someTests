package com.example.mariusz.myapplication;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mariusz.common.IMyAidlInterface;

public class MainActivity extends Activity {

    IMyAidlInterface mService = null;
    private boolean mIsBound;
    float[] args = new float[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText firstField = findViewById(R.id.editText);
        final EditText secondField = findViewById(R.id.editText2);
        Button pomnoz = findViewById(R.id.button);
        final TextView wynik = findViewById(R.id.textWynik);


        pomnoz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mService == null) {
                    //Intent it = new Intent(MainActivity.this, Serwis.java);

                    Intent it = new Intent();
                    it.setClassName("com.example.mariusz.serwis",
                            "com.example.mariusz.serwis.MyService");
                    bindService(it, connection, Context.BIND_AUTO_CREATE);
                }
                Float a;
                Float b;
                float c;
                float d;

                a = Float.valueOf(firstField.getText().toString());
                b = Float.valueOf(secondField.getText().toString());
                c = a.floatValue();
                args[0] = c;
                d = b.floatValue();
                args[1] = d;
                float iloczyn = (float) 0.00;


                if (mIsBound) {
                    try {
                        iloczyn = mService.mnozenie(args);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }

                wynik.setText(Float.valueOf(iloczyn).toString());

            }
        });

    }
    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mService = IMyAidlInterface.Stub.asInterface(service);
            mIsBound = true;
            Log.e("ppol", "przeszlo");
           // Toast.makeText(getApplicationContext(),	"Service Connected", Toast.LENGTH_SHORT).show();
        }
        @Override
        public void onServiceDisconnected(ComponentName name) {
            mService = null;
            mIsBound = false;
            //Toast.makeText(getApplicationContext(), "Service Disconnected", Toast.LENGTH_SHORT).show();
        }
    };
}
