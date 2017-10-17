package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

public class Practice10HistogramView extends View {
    private Paint mPaint;
    private TextPaint mTextPaint;
    private static String[] str = new String[]{"Froyo", "GB", "ICS", "JB", "KiaKat", "L", "M"};
    private static int[] y = new int[]{0, 20, 30, 200, 400, 450, 160};

    public Practice10HistogramView(Context context) {
        super(context);
        initPaint();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2.0f);
        mTextPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
        mTextPaint.setColor(Color.WHITE);
        mTextPaint.setTextSize(30.0f);
    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float startX = 100.0f;
        float startY = 500.0f;

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        canvas.drawLines(new float[]{100, 50, 100, 500, 100, 500, 1000, 500}, mPaint);
        mPaint.setColor(Color.parseColor("#8800ff00"));
        mPaint.setStyle(Paint.Style.FILL);
        for (int i = 0; i < 7; i++) {
            canvas.drawRect(startX + 20 + 120 * i, startY - 10 - y[i], startX + 120 * (i + 1), startY, mPaint);
            canvas.drawText(str[i], startX + 120 * (i + 1) - 50 - mTextPaint.measureText(str[i]) / 2, 530, mTextPaint);
        }
    }
}
