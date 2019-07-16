package com.soundcloud.android.settings.offline.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.soundcloud.android.ia.f;
import java.util.ArrayList;
import java.util.List;

public class UsageBarView extends View {
    private final List<a> a = new ArrayList();
    private final Paint b = new Paint();
    private double c;

    private class a {
        private Paint a = new Paint();
        private long b;

        a(int i, long j) {
            this.a.setColor(i);
            this.b = Math.max(0, j);
        }

        public long a() {
            return this.b;
        }

        public Paint b() {
            return this.a;
        }
    }

    public UsageBarView(Context context) {
        super(context);
        b();
    }

    private void b() {
        this.b.setColor(getResources().getColor(f.ash));
    }

    public UsageBarView a(int i, long j) {
        this.a.add(new a(getResources().getColor(i), j));
        this.c += (double) Math.max(0, j);
        invalidate();
        return this;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.c != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            int measuredWidth = getMeasuredWidth() - 2;
            int measuredHeight = getMeasuredHeight() - 2;
            canvas.drawRect(0.0f, 0.0f, (float) (measuredWidth + 2), (float) (measuredHeight + 2), this.b);
            float f = 1.0f;
            for (a aVar : this.a) {
                float a2 = f + ((float) (((double) (aVar.a() * ((long) measuredWidth))) / this.c));
                canvas.drawRect(f, 1.0f, a2, (float) (measuredHeight + 1), aVar.b());
                f = a2;
            }
        }
    }

    public UsageBarView a() {
        this.a.clear();
        this.c = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        return this;
    }

    public UsageBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public UsageBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}
