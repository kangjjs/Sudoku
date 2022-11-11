package com.example.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {
    BoardGenerator board= new BoardGenerator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableLayout table;
        table = (TableLayout) findViewById(R.id.tableLayout);
        table.setBackgroundColor(Color.rgb(128,128,128));

        Button[][] buttons = new Button[9][9];

        for (int i = 0; i < 9; i++) {
            TableRow tableRow = new TableRow(this);
            table.setColumnStretchable(tableRow.getId(),true);
            int bottom = 0;
            if (i == 2 || i == 5) {
                bottom = 20;
            }

            for (int j = 0; j < 9; j++) {
                //버튼 생성
                buttons[i][j] = new Button(this);
                //보드에서 행,열 좌표 숫자 가져오기
                int number = board.get(i,j);
                //확률 적용
                if(Math.random()<=0.63){
                    buttons[i][j].setText(Integer.toString(number));
                }
                //마진 적용
                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(
                        TableRow.LayoutParams.WRAP_CONTENT,
                        TableRow.LayoutParams.WRAP_CONTENT,
                        1.0f);
                int right = 0;

                if (j == 2 || j == 5) {
                    right = 20;
                } else if(j==8){
                    right=50;
                }

                int left=0;

                if(j==0){
                    left=50;
                }


                layoutParams.setMargins(left, 7, right, bottom);
                buttons[i][j].setLayoutParams(layoutParams);
                buttons[i][j].setTextSize(30);
                //행에 버튼 붙이기
                tableRow.addView(buttons[i][j]);
            }
            //테이블에 행 붙이기
            table.addView(tableRow);
        }

    }


}