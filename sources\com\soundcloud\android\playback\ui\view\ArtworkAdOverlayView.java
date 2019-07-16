package com.soundcloud.android.playback.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;

public class ArtworkAdOverlayView extends View {
    private final C0283Yb a;

    private final class a implements OnGestureListener {
        private a() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArtworkAdOverlayView.this.performClick();
            return true;
        }
    }

    public ArtworkAdOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new C0283Yb(context, new a());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.a.a(motionEvent);
        return true;
    }
}
