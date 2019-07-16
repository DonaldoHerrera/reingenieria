package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.login.G;
import com.facebook.login.H;
import com.facebook.login.I;
import java.lang.ref.WeakReference;

/* compiled from: ToolTipPopup */
public class k {
    private final String a;
    /* access modifiers changed from: private */
    public final WeakReference<View> b;
    private final Context c;
    /* access modifiers changed from: private */
    public a d;
    /* access modifiers changed from: private */
    public PopupWindow e;
    private b f = b.BLUE;
    private long g = 6000;
    private final OnScrollChangedListener h = new h(this);

    /* compiled from: ToolTipPopup */
    private class a extends FrameLayout {
        /* access modifiers changed from: private */
        public ImageView a;
        /* access modifiers changed from: private */
        public ImageView b;
        /* access modifiers changed from: private */
        public View c;
        /* access modifiers changed from: private */
        public ImageView d;

        public a(Context context) {
            super(context);
            c();
        }

        private void c() {
            LayoutInflater.from(getContext()).inflate(I.com_facebook_tooltip_bubble, this);
            this.a = (ImageView) findViewById(H.com_facebook_tooltip_bubble_view_top_pointer);
            this.b = (ImageView) findViewById(H.com_facebook_tooltip_bubble_view_bottom_pointer);
            this.c = findViewById(H.com_facebook_body_frame);
            this.d = (ImageView) findViewById(H.com_facebook_button_xout);
        }

        public void a() {
            this.a.setVisibility(4);
            this.b.setVisibility(0);
        }

        public void b() {
            this.a.setVisibility(0);
            this.b.setVisibility(4);
        }
    }

    /* compiled from: ToolTipPopup */
    public enum b {
        BLUE,
        BLACK
    }

    public k(String str, View view) {
        this.a = str;
        this.b = new WeakReference<>(view);
        this.c = view.getContext();
    }

    private void d() {
        if (this.b.get() != null) {
            ((View) this.b.get()).getViewTreeObserver().removeOnScrollChangedListener(this.h);
        }
    }

    private void e() {
        PopupWindow popupWindow = this.e;
        if (popupWindow != null && popupWindow.isShowing()) {
            if (this.e.isAboveAnchor()) {
                this.d.a();
            } else {
                this.d.b();
            }
        }
    }

    private void c() {
        d();
        if (this.b.get() != null) {
            ((View) this.b.get()).getViewTreeObserver().addOnScrollChangedListener(this.h);
        }
    }

    public void a(b bVar) {
        this.f = bVar;
    }

    public void b() {
        if (this.b.get() != null) {
            this.d = new a(this.c);
            ((TextView) this.d.findViewById(H.com_facebook_tooltip_bubble_view_text_body)).setText(this.a);
            if (this.f == b.BLUE) {
                this.d.c.setBackgroundResource(G.com_facebook_tooltip_blue_background);
                this.d.b.setImageResource(G.com_facebook_tooltip_blue_bottomnub);
                this.d.a.setImageResource(G.com_facebook_tooltip_blue_topnub);
                this.d.d.setImageResource(G.com_facebook_tooltip_blue_xout);
            } else {
                this.d.c.setBackgroundResource(G.com_facebook_tooltip_black_background);
                this.d.b.setImageResource(G.com_facebook_tooltip_black_bottomnub);
                this.d.a.setImageResource(G.com_facebook_tooltip_black_topnub);
                this.d.d.setImageResource(G.com_facebook_tooltip_black_xout);
            }
            View decorView = ((Activity) this.c).getWindow().getDecorView();
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            c();
            this.d.measure(MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
            a aVar = this.d;
            this.e = new PopupWindow(aVar, aVar.getMeasuredWidth(), this.d.getMeasuredHeight());
            this.e.showAsDropDown((View) this.b.get());
            e();
            if (this.g > 0) {
                this.d.postDelayed(new i(this), this.g);
            }
            this.e.setTouchable(true);
            this.d.setOnClickListener(new j(this));
        }
    }

    public void a(long j) {
        this.g = j;
    }

    public void a() {
        d();
        PopupWindow popupWindow = this.e;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }
}
