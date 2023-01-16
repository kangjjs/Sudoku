package com.example.sudoku;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomButton extends FrameLayout {

    int row;
    int col;
    int value;
    boolean checked=false;
    TextView textView;
    TextView[] memos;

    public CustomButton(@NonNull Context context) {
        super(context);
    }

    public CustomButton(Context context, int row, int col) {
        super(context);
        this.row=row;
        this.col=col;
        this.textView= new TextView(context);
        textView.setTextSize(41);
        addView(textView);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        TableLayout memo =(TableLayout) layoutInflater.inflate(R.layout.layout_memo,null);
        addView(memo);

        memos = new TextView[9];
        int k=0;
        for(int i=0;i<3;i++){
            TableRow tableRow = (TableRow) memo.getChildAt(i);
            for(int j=0;j<3;j++,k++){
                memos[k]=(TextView) tableRow.getChildAt(j);
                memos[k].setTextSize(13);
                memos[k].setTextColor(Color.BLACK);
                memos[k].setVisibility(INVISIBLE);
            }
        }

        setClickable(true);
        setBackgroundResource(R.drawable.button_selector);
    }

    public void set(int a){
        if(a==0) {
            this.value = 0;
            textView.setText(null);
        }else {
            this.value=a;
            textView.setText(String.valueOf(a));
        }
    }
}