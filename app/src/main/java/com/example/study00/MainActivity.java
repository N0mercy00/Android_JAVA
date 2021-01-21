package com.example.study00;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                Fragment1 fragment1 = new Fragment1();
                transaction.replace(R.id.frame,fragment1);

                transaction.commit();
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                Fragment2 fragment2 = new Fragment2();
                transaction.replace(R.id.frame,fragment2);

                transaction.commit();
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                Fragment3 fragment3 = new Fragment3();
                transaction.replace(R.id.frame,fragment3);

                transaction.commit();
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                Fragment4 fragment4 = new Fragment4();
                transaction.replace(R.id.frame,fragment4);

                transaction.commit();
            }
        });

    }
}
