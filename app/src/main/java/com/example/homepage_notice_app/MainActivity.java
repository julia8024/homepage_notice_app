package com.example.homepage_notice_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View view_common;
    View view_kongju;
    View view_cheonan;
    View view_yesan;
    View view_else;

    RecyclerView re_common;
    RecyclerView re_kongju;
    RecyclerView re_cheonan;
    RecyclerView re_yesan;
    RecyclerView re_else;

    int nBefore = 180;

    int[] num = {1,1,1,1,1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);















        // 클릭 시 탭 열기 / 닫기 기능
        view_common = findViewById(R.id.line_common);
        view_kongju = findViewById(R.id.line_kongju);
        view_cheonan = findViewById(R.id.line_cheonan);
        view_yesan = findViewById(R.id.line_yesan);
        view_else = findViewById(R.id.line_else);

        re_common = findViewById(R.id.main_common_list);
        re_kongju = findViewById(R.id.main_kongju_list);
        re_cheonan = findViewById(R.id.main_cheonan_list);
        re_yesan = findViewById(R.id.main_yesan_list);
        re_else = findViewById(R.id.main_else_list);

        findViewById(R.id.common_tab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num[0] == 1) {
                    // com_num 이 1이면 사라지게 하기
                    view_common.setVisibility(View.GONE);
                    re_common.setVisibility(View.GONE);
                    num[0] = 0;
                } else {
                    view_common.setVisibility(View.VISIBLE);
                    re_common.setVisibility(View.VISIBLE);
                    num[0] = 1;
                }
                rotateIcon(findViewById(R.id.tab_icon_0));
            }
        });

        findViewById(R.id.kongju_tab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num[1] == 1) {
                    // com_num 이 1이면 사라지게 하기
                    view_common.setVisibility(View.GONE);
                    re_common.setVisibility(View.GONE);
                    num[1] = 0;
                } else {
                    view_common.setVisibility(View.VISIBLE);
                    re_common.setVisibility(View.VISIBLE);
                    num[1] = 1;
                }
                rotateIcon(findViewById(R.id.tab_icon_1));
            }
        });

        findViewById(R.id.cheonan_tab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num[2] == 1) {
                    // com_num 이 1이면 사라지게 하기
                    view_common.setVisibility(View.GONE);
                    re_common.setVisibility(View.GONE);
                    num[2] = 0;
                } else {
                    view_common.setVisibility(View.VISIBLE);
                    re_common.setVisibility(View.VISIBLE);
                    num[2] = 1;
                }
                rotateIcon(findViewById(R.id.tab_icon_2));
            }
        });

        findViewById(R.id.yesan_tab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num[3] == 1) {
                    // com_num 이 1이면 사라지게 하기
                    view_common.setVisibility(View.GONE);
                    re_common.setVisibility(View.GONE);
                    num[3] = 0;
                } else {
                    view_common.setVisibility(View.VISIBLE);
                    re_common.setVisibility(View.VISIBLE);
                    num[3] = 1;
                }
                rotateIcon(findViewById(R.id.tab_icon_3));
            }
        });

        findViewById(R.id.else_tab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num[4] == 1) {
                    // com_num 이 1이면 사라지게 하기
                    view_common.setVisibility(View.GONE);
                    re_common.setVisibility(View.GONE);
                    num[4] = 0;
                } else {
                    view_common.setVisibility(View.VISIBLE);
                    re_common.setVisibility(View.VISIBLE);
                    num[4] = 1;
                }
                rotateIcon(findViewById(R.id.tab_icon_4));
            }
        });


    }

    public void rotateIcon(ImageView imageView) {
        int i = nBefore + 180;
        RotateAnimation ra = new RotateAnimation(
                nBefore,
                i,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
        );
        ra.setDuration(250);
        ra.setFillAfter(true);
        imageView.startAnimation(ra);
        nBefore = i;
    }
}