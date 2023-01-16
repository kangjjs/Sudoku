package com.example.sudoku;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    BoardGenerator board= new BoardGenerator();
    CustomButton clickedCustomButton;
    CustomButton[][] buttons = new CustomButton[9][9];

    //numberPad 1 눌렀을때
    public void onClickNum1(View view){
        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);
        TableLayout numberPad = (TableLayout) findViewById(R.id.NumberPad);
        clickedCustomButton.set(1);
        numberPad.setVisibility(View.INVISIBLE);
        table.setBackgroundColor(Color.parseColor("#808080"));
        unsetConflict();
        setConflict();
    }

    //numberPad 2 눌렀을때
    public void onClickNum2(View view){
        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);
        TableLayout numberPad = (TableLayout) findViewById(R.id.NumberPad);
        clickedCustomButton.set(2);
        numberPad.setVisibility(View.INVISIBLE);
        table.setBackgroundColor(Color.parseColor("#808080"));
        unsetConflict();
        setConflict();
    }

    //numberPad 3 눌렀을때
    public void onClickNum3(View view){
        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);
        TableLayout numberPad = (TableLayout) findViewById(R.id.NumberPad);
        clickedCustomButton.set(3);
        numberPad.setVisibility(View.INVISIBLE);
        table.setBackgroundColor(Color.parseColor("#808080"));
        unsetConflict();
        setConflict();
    }

    //numberPad 4 눌렀을때
    public void onClickNum4(View view){
        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);
        TableLayout numberPad = (TableLayout) findViewById(R.id.NumberPad);
        clickedCustomButton.set(4);
        numberPad.setVisibility(View.INVISIBLE);
        table.setBackgroundColor(Color.parseColor("#808080"));
        unsetConflict();
        setConflict();
    }

    //numberPad 5 눌렀을때
    public void onClickNum5(View view){
        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);
        TableLayout numberPad = (TableLayout) findViewById(R.id.NumberPad);
        clickedCustomButton.set(5);
        numberPad.setVisibility(View.INVISIBLE);
        table.setBackgroundColor(Color.parseColor("#808080"));
        unsetConflict();
        setConflict();
    }

    //numberPad 6 눌렀을때
    public void onClickNum6(View view){
        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);
        TableLayout numberPad = (TableLayout) findViewById(R.id.NumberPad);
        clickedCustomButton.set(6);
        numberPad.setVisibility(View.INVISIBLE);
        table.setBackgroundColor(Color.parseColor("#808080"));
        unsetConflict();
        setConflict();
    }

    //numberPad 7 눌렀을때
    public void onClickNum7(View view){
        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);
        TableLayout numberPad = (TableLayout) findViewById(R.id.NumberPad);
        clickedCustomButton.set(7);
        numberPad.setVisibility(View.INVISIBLE);
        table.setBackgroundColor(Color.parseColor("#808080"));
        unsetConflict();
        setConflict();
    }

    //numberPad 8 눌렀을때
    public void onClickNum8(View view){
        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);
        TableLayout numberPad = (TableLayout) findViewById(R.id.NumberPad);
        clickedCustomButton.set(8);
        numberPad.setVisibility(View.INVISIBLE);
        table.setBackgroundColor(Color.parseColor("#808080"));
        unsetConflict();
        setConflict();
    }

    //numberPad 9 눌렀을때
    public void onClickNum9(View view){
        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);
        TableLayout numberPad = (TableLayout) findViewById(R.id.NumberPad);
        clickedCustomButton.set(9);
        numberPad.setVisibility(View.INVISIBLE);
        table.setBackgroundColor(Color.parseColor("#808080"));
        unsetConflict();
        setConflict();
    }

    //numberPad delete 눌렀을때
    public void onClickDelete(View view){
        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);
        TableLayout numberPad = (TableLayout) findViewById(R.id.NumberPad);
        clickedCustomButton.set(0);
        numberPad.setVisibility(View.INVISIBLE);
        table.setBackgroundColor(Color.parseColor("#808080"));
        unsetConflict();
    }

    //numberPad cancel 눌렀을때
    public void onClickCancel(View view){
        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);
        TableLayout numberPad = (TableLayout) findViewById(R.id.NumberPad);
        numberPad.setVisibility(View.INVISIBLE);
        table.setBackgroundColor(Color.parseColor("#808080"));
        unsetConflict();
    }

    //스도쿠상에서 row와 col square안에 있는 수와 겹칠때
    public void setConflict() {

        int squareRow=clickedCustomButton.row/3;
        int squareCol=clickedCustomButton.col/3;

        squareRow*=3;
        squareCol*=3;

        for (int j = 0; j < 9; j++) {
            if (buttons[j][clickedCustomButton.col].value == clickedCustomButton.value) {
                if (j != clickedCustomButton.row) {
                    buttons[j][clickedCustomButton.col].setBackgroundColor(Color.parseColor("#FF0000"));
                    clickedCustomButton.setBackgroundColor(Color.parseColor("#FF0000"));
                }
            }
        }

        for(int x=0;x<9;x++){
            if (buttons[clickedCustomButton.row][x].value == clickedCustomButton.value) {
                if (x != clickedCustomButton.col) {
                    buttons[clickedCustomButton.row][x].setBackgroundColor(Color.parseColor("#FF0000"));
                    clickedCustomButton.setBackgroundColor(Color.parseColor("#FF0000"));
                }
            }
        }

        for(int i=squareRow;i<squareRow+3;i++){
            for(int k=squareCol;k<squareCol+3;k++){
                if(buttons[i][k].value==clickedCustomButton.value){
                    if(i!=clickedCustomButton.row&&k!=clickedCustomButton.col) {
                        buttons[i][k].setBackgroundColor(Color.parseColor("#FF0000"));
                        clickedCustomButton.setBackgroundColor(Color.parseColor("#FF0000"));
                    }
                }
            }
        }
    }

    //겹치지 않을때
    public void unsetConflict(){

        int squareRow=clickedCustomButton.row/3;
        int squareCol=clickedCustomButton.col/3;

        squareRow*=3;
        squareCol*=3;

        for (int j = 0; j < 9; j++) {
            if(j!=clickedCustomButton.row) {
                if (buttons[j][clickedCustomButton.col].value != clickedCustomButton.value) {
                    buttons[j][clickedCustomButton.col].setBackgroundColor(Color.parseColor("#FFFFFF"));
                    clickedCustomButton.setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        }

        for(int x=0;x<9;x++){
            if (x != clickedCustomButton.col) {
                if (buttons[clickedCustomButton.row][x].value != clickedCustomButton.value) {
                    buttons[clickedCustomButton.row][x].setBackgroundColor(Color.parseColor("#FFFFFF"));
                    clickedCustomButton.setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        }

        for(int i=squareRow;i<squareRow+3;i++){
            for(int k=squareCol;k<squareCol+3;k++){
                if(i!=clickedCustomButton.row&&k!=clickedCustomButton.col){
                    if(buttons[i][k].value!=clickedCustomButton.value){
                        buttons[i][k].setBackgroundColor(Color.parseColor("#FFFFFF"));
                        clickedCustomButton.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    }
                }
            }
        }
    }

    //memo에서 dialog 띄우기
    public void dialog(View view){
        View memoForm = getLayoutInflater().inflate(R.layout.dialog_memo,null);
        TableLayout memoTableLayout = memoForm.findViewById(R.id.memo);

        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
        builder.setView(memoForm);

        final AlertDialog alertDialog = builder.create();
        alertDialog.show();

        Button cancelBtn = memoForm.findViewById(R.id.memoCancel);
        Button okBtn = memoForm.findViewById(R.id.memoOk);
        Button deleteBtn = memoForm.findViewById(R.id.memoDelete);
        ToggleButton[] toggleButton = new ToggleButton[9];

        int k=0;
        for(int i=1;i<=3;i++){
            TableRow tableRow = (TableRow) memoTableLayout.getChildAt(i);
            for(int j=0;j<3;j++,k++){
                toggleButton[k]=(ToggleButton) tableRow.getChildAt(j);
            }
        }

        TextView[] memos = new TextView[9];
        System.arraycopy(clickedCustomButton.memos, 0, memos, 0, 9);
        isChecked(memos,toggleButton);


        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });

        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean[] buttonChecked = new boolean[9];

                for(int i=0;i<9;i++){
                    buttonChecked[i]=toggleButton[i].isChecked();
                }

                for(int i=0;i<9;i++){
                    if(buttonChecked[i]){
                        memos[i].setVisibility(View.VISIBLE);
                    }else{
                        memos[i].setVisibility(View.INVISIBLE);
                    }
                }

                alertDialog.dismiss();
            }
        });

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<9;i++){
                    memos[i].setVisibility(View.INVISIBLE);
                }
                alertDialog.dismiss();
            }
        });
    }

    //토글버튼 on상태 유지되게할때
    public void isChecked(TextView[] memos,ToggleButton[] toggleButtons){
        for(int i=0;i<memos.length;i++){
            toggleButtons[i].setChecked(memos[i].getVisibility() == View.VISIBLE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);
        TableLayout numberPad = (TableLayout) findViewById(R.id.NumberPad);
        TableLayout mode = (TableLayout) findViewById(R.id.mode);

        Button easyButton = (Button) findViewById(R.id.easymode);
        Button normalButton = (Button) findViewById(R.id.normalmode);
        Button hardButton = (Button) findViewById(R.id.hardmode);

        table.setBackgroundColor(Color.parseColor("#808080"));

        table.setVisibility(View.INVISIBLE);
        numberPad.setVisibility(View.INVISIBLE);

        /**
         * 난이도 조절 -추가기능
         */

        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BoardGenerator board = new BoardGenerator();
                for (int i = 0; i < 9; i++)
                    for (int j = 0; j < 9; j++) {
                        if (Math.random() <= 0.65) {
                            buttons[i][j].set(board.get(i, j));
                            buttons[i][j].setEnabled(false);
                            table.setVisibility(View.VISIBLE);
                            mode.setVisibility(View.INVISIBLE);
                        }
                    }
            }
        });

        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BoardGenerator board = new BoardGenerator();
                for (int i = 0; i < 9; i++)
                    for (int j = 0; j < 9; j++) {
                        if (Math.random() <= 0.61) {
                            buttons[i][j].set(board.get(i, j));
                            buttons[i][j].setEnabled(false);
                            table.setVisibility(View.VISIBLE);
                            mode.setVisibility(View.INVISIBLE);
                        }
                    }
            }
        });

        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BoardGenerator board = new BoardGenerator();
                for (int i = 0; i < 9; i++)
                    for (int j = 0; j < 9; j++) {
                        if (Math.random() <= 0.57) {
                            buttons[i][j].set(board.get(i, j));
                            buttons[i][j].setEnabled(false);
                            table.setVisibility(View.VISIBLE);
                            mode.setVisibility(View.INVISIBLE);
                        }
                    }
            }
        });

        for (int i = 0; i < 9; i++) {
            TableRow tableRow = new TableRow(this);
            int bottom = 0;
            if (i == 2 || i == 5) {
                bottom = 20;
            }

            for (int j = 0; j < 9; j++) {
                buttons[i][j] = new CustomButton(this,i,j);
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

                int left=10;

                if(j==0){
                    left=50;
                }

                layoutParams.setMargins(left, 15, right, bottom);
                buttons[i][j].setLayoutParams(layoutParams);

                buttons[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        clickedCustomButton=(CustomButton) view;
                        table.setBackgroundColor(Color.parseColor("#80808080"));
                        numberPad.setVisibility(View.VISIBLE);
                    }
                });

                buttons[i][j].setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        clickedCustomButton=(CustomButton) view;
                        dialog(clickedCustomButton);
                        return true;
                    }
                });

                tableRow.addView(buttons[i][j]);
            }
            table.addView(tableRow);
        }
    }
}