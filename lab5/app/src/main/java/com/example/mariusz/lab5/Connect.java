package com.example.mariusz.lab5;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Connect extends AsyncTask {
  //  public Connect(View.OnClickListener onClickListener) {
    //}

    //AsyncTask<Object,Object,Void> at = new AsyncTask<Object, Object, Void>() {
        @Override
        protected Void doInBackground(Object... params) {
            try {
                ServerSocket ss = new ServerSocket(22333);

                Log.i("LocalPort", "" + ss.getLocalPort());
                Log.i("HostAddress", ss.getInetAddress().getHostAddress());
                Log.i("SocketAddress", ss.getLocalSocketAddress().toString());
                Socket socket = ss.accept();
                Log.i("ss.accept", "" + ss.getLocalPort());

                byte[] bufor = new byte[10];
                while (true) {
                    int dlugosc = socket.getInputStream().read(bufor, 0, 10);
                    String s = new String(bufor, 0, dlugosc);
                    socket.getOutputStream().write(s.toUpperCase().getBytes());
                    Log.i("ss.read", s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    };
//at.execute((Object[]) null);


