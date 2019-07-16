package com.soundcloud.android.features.record;

import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: InputObject */
public class D {
    public ArrayBlockingQueue<D> a;
    public byte b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public View i;
    public int j;

    public D(ArrayBlockingQueue<D> arrayBlockingQueue) {
        this.a = arrayBlockingQueue;
    }

    public void a(View view, MotionEvent motionEvent) {
        this.i = view;
        this.b = 2;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.d = 3;
        } else if (action == 1) {
            this.d = 5;
        } else if (action == 2) {
            this.d = 4;
        } else if (action == 5) {
            this.d = 6;
        } else if (action != 6) {
            this.d = 0;
        } else {
            this.d = 7;
        }
        this.j = motionEvent.getActionIndex();
        this.c = motionEvent.getEventTime();
        this.e = (int) motionEvent.getX();
        this.f = (int) motionEvent.getY();
        if (motionEvent.getPointerCount() > 1) {
            this.g = (int) motionEvent.getX(1);
            this.h = (int) motionEvent.getY(1);
        }
    }

    public void a(View view, MotionEvent motionEvent, int i2) {
        this.i = view;
        this.b = 2;
        this.d = 4;
        this.c = motionEvent.getHistoricalEventTime(i2);
        this.e = (int) motionEvent.getHistoricalX(i2);
        this.f = (int) motionEvent.getHistoricalY(i2);
    }

    public void a() {
        this.a.add(this);
    }
}
