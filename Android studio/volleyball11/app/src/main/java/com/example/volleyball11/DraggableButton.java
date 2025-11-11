package com.example.volleyball11;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DraggableButton extends androidx.appcompat.widget.AppCompatButton {

    float lastX = 0f, lastY = 0f;
    private float beginX = 0f, beginY = 0f;
    int screenWidth = 720, screenHeight = 1280;

    public DraggableButton(@NonNull Context context) {
        super(context);
    }

    public DraggableButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DraggableButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        WindowManager wm = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        assert wm != null;
        wm.getDefaultDisplay().getMetrics(dm);
        /**取得螢幕的總寬跟總高*/
        screenHeight = dm.heightPixels-200;
        screenWidth = dm.widthPixels;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN:
                /**當按鈕被按下*/
                //取得目前位置
                lastX = event.getRawX();
                lastY = event.getRawY();
                //將位置寫為起始位置
                beginX = lastX;
                beginY = lastY;
                break;

            case MotionEvent.ACTION_MOVE:
                //取得觸摸點相對於螢幕的座標
                float dx = event.getRawX() - lastX;
                float dy = event.getRawY() - lastY;
                float left, top, right, bottom;
                left = getLeft() + dx;
                top = getTop() + dy;
                right = getRight() + dx;
                bottom = getBottom() + dy;
                //以下判斷為避免物件被拉出畫面
                if(left < 0){
                    left = 0;
                    right = left + getWidth();
                }
                if(right > screenWidth){
                    right = screenWidth;
                    left = right - getWidth();
                }
                if(top < 0){
                    top = 0;
                    bottom = top + getHeight();
                }
                if(bottom > screenHeight){
                    bottom = screenHeight;
                    top = bottom - getHeight();
                }
                //設置被拉到的位置
                layout(Math.round(left),Math.round(top),Math.round(right),Math.round(bottom));
                lastY = event.getRawY();
                lastX = event.getRawX();
                break;

            case MotionEvent.ACTION_UP:
                //如果移動距離小於10，則被視為點擊按鈕；反之則為拖曳按鈕
                if (Math.abs(lastX - beginX)< 10 && Math.abs(lastY - beginY)< 10){
                    return super.onTouchEvent(event);
                }else{
                    setPressed(false);
                    return true;
                }
        }

        return super.onTouchEvent(event);
    }
}
