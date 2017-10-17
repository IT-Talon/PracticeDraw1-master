package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {
    private Paint mPaint;

    public Practice2DrawCircleView(Context context) {
        super(context);
        initPaint();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }


    private void initPaint() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.BLACK);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float x = getMeasuredWidth();
        float y = getMeasuredHeight();
        float r = x > y ? y / 2 : x / 2;

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

//        mPaint.setStyle(Paint.Style.FILL);
//        canvas.drawCircle(x / 2, y / 2, r, mPaint); //实心圆

//        mPaint.setStyle(Paint.Style.STROKE);
//        canvas.drawCircle(x / 2, y / 2, r, mPaint); //空心圆

//        mPaint.setColor(Color.BLUE);
//        mPaint.setStyle(Paint.Style.FILL);
//        canvas.drawCircle(x / 2, y / 2, r, mPaint); //蓝色实心圆

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(40); //线宽为 20 的空心圆
        canvas.drawCircle(x / 2, y / 2, r / 2, mPaint);

    }
}
