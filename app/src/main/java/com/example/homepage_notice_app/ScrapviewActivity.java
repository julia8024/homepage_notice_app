package com.example.homepage_notice_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class ScrapviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrapview);

        RecyclerView recyclerView = findViewById(R.id.scrap_list);

        // 리싸이클러뷰에 레이아웃 매니저 설정하기
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        ScrapViewAdapter adapter = new ScrapViewAdapter();

        // 리싸이클러뷰에 어댑터 설정하기
        adapter.addItem(new Scrap(172, "[공통]", "게시글 제목 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.17."));
        adapter.addItem(new Scrap(173, "[천안]", "게시글 제목2 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.18."));
        adapter.addItem(new Scrap(174, "[공통]", "게시글 제목3 123456789 입니다 안드로이드 어플 만들기 뚜둔", "2022.03.21."));


    }
}