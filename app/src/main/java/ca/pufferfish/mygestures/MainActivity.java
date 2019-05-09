package ca.pufferfish.mygestures;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.MotionEvent;
import android.view.GestureDetector;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener{

    private TextView textView;
    private GestureDetectorCompat gestureDetectorCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        gestureDetectorCompat = new GestureDetectorCompat(this,this);
        gestureDetectorCompat.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        gestureDetectorCompat.onTouchEvent(e);
        return super.onTouchEvent(e);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        textView.setText("onSingleTapConfirmed "+e.toString());
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        textView.setText("onDoubleTap "+e.toString());
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        textView.setText(""+e.toString());
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        textView.setText("onDown "+e.toString());
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        textView.setText("onShowPress "+e.toString());

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        textView.setText("onSingleTapUp "+e.toString());
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        textView.setText("onScroll "+e1.toString()+ " ### "+ e2.toString());
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

        textView.setText("onLongPress "+e.toString());
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        textView.setText("onFling "+e1.toString()+ " ### "+ e2.toString());
        return false;
    }
}
