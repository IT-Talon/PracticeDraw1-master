package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {
    private Paint mPaint;
    private RectF rectF;

    public Practice5DrawOvalView(Context context) {
        super(context);
        initPaint();
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLACK);
        rectF = new RectF();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        rectF.set(getMeasuredWidth() / 4, getMeasuredHeight() / 4, getMeasuredWidth() * 3 / 4, getMeasuredHeight() * 3 / 4);

//        练习内容：使用 canvas.drawOval() 方法画椭圆
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            canvas.drawOval(getMeasuredWidth() / 4, getMeasuredHeight() / 4, getMeasuredWidth() * 3 / 4, getMeasuredHeight() * 3 / 4, mPaint);
//        } else {
        canvas.drawOval(rectF, mPaint);
//        }
    }
}
