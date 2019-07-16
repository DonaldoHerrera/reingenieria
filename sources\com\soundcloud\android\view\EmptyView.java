package com.soundcloud.android.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class EmptyView extends RelativeLayout {
    private ViewGroup a;
    private ImageView b;
    private ErrorView c;
    private View d;
    private Button e;
    private TextView f;
    private TextView g;
    private int h;
    private int i;
    private String j;
    private String k;
    private String l;
    /* access modifiers changed from: private */
    public a m;
    private b n;

    public interface a {
        void a();
    }

    public enum b {
        WAITING,
        ERROR,
        CONNECTION_ERROR,
        SERVER_ERROR,
        OK
    }

    public EmptyView(Context context) {
        super(context);
        c(l.ak_empty_view);
    }

    private void b(b bVar) {
        if (this.c == null) {
            this.c = a();
        }
        C5466YFa.b(this.c, true);
        ViewGroup viewGroup = this.a;
        if (viewGroup != null) {
            C5466YFa.a((View) viewGroup, false);
        }
        int i2 = A.a[bVar.ordinal()];
        if (i2 == 1) {
            this.c.b();
        } else if (i2 != 2) {
            this.c.b();
        } else {
            this.c.a();
        }
    }

    private void c(int i2) {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(i2, this);
        setLayoutAnimation(new LayoutAnimationController(AnimationUtils.loadAnimation(getContext(), defpackage.C6974nKa.a.ak_fade_in_med)));
        this.d = findViewById(i.ak_emptyview_progress);
        setClickable(true);
        c();
    }

    private void d() {
        this.a = (ViewGroup) View.inflate(getContext(), getEmptyViewLayoutId(), null);
        addView(this.a, new LayoutParams(-1, -1));
        this.f = (TextView) findViewById(i.ak_emptyview_message);
        this.g = (TextView) findViewById(i.ak_emptyview_link);
        this.e = (Button) findViewById(i.ak_emptyview_btn_action);
        this.b = (ImageView) findViewById(i.ak_emptyview_image);
        if (this.b != null) {
            a(this.i);
        }
        this.e.setOnClickListener(new z(this));
    }

    /* access modifiers changed from: protected */
    public int getEmptyViewLayoutId() {
        return l.ak_empty_collection_view;
    }

    public boolean a(b bVar) {
        if (this.n != bVar) {
            this.n = bVar;
            if (bVar == b.WAITING) {
                this.d.setVisibility(0);
                ViewGroup viewGroup = this.a;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                ErrorView errorView = this.c;
                if (errorView != null) {
                    errorView.setVisibility(8);
                }
                return true;
            }
            C5466YFa.a(this.d, false);
            if (bVar == b.OK) {
                b();
                return true;
            }
            b(bVar);
        }
        return true;
    }

    public EmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(l.ak_empty_view);
    }

    private void c() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(d.emptyViewBackgroundColor, typedValue, true)) {
            setBackgroundColor(typedValue.data);
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (this.a == null) {
            d();
            if (TextUtils.isEmpty(this.j)) {
                b(this.h);
            } else {
                b(this.j);
            }
            c(this.k);
            a(this.l);
        }
        C5466YFa.b(this.a, true);
        ErrorView errorView = this.c;
        if (errorView != null) {
            C5466YFa.a((View) errorView, false);
        }
    }

    public EmptyView c(String str) {
        this.k = str;
        TextView textView = this.g;
        if (textView != null) {
            if (str != null) {
                textView.setText(str);
                this.g.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public ErrorView a() {
        ErrorView errorView = (ErrorView) LayoutInflater.from(getContext()).inflate(l.ak_error_view, null);
        addView(errorView, new LayoutParams(-1, -1));
        return errorView;
    }

    public EmptyView a(int i2) {
        this.i = i2;
        ImageView imageView = this.b;
        if (imageView != null) {
            if (i2 > 0) {
                imageView.setVisibility(0);
                this.b.setImageResource(i2);
            } else {
                imageView.setVisibility(8);
            }
        }
        return this;
    }

    public EmptyView b(int i2) {
        this.h = i2;
        this.j = null;
        TextView textView = this.f;
        if (textView != null) {
            if (i2 > 0) {
                textView.setText(i2);
                this.f.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        return this;
    }

    public EmptyView a(String str) {
        this.l = str;
        Button button = this.e;
        if (button != null) {
            if (str != null) {
                button.setVisibility(0);
                this.e.setText(str);
            } else {
                button.setVisibility(8);
            }
        }
        return this;
    }

    public EmptyView b(String str) {
        this.j = str;
        this.h = -1;
        if (this.f != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f.setText(str);
                this.f.setVisibility(0);
            } else {
                this.f.setVisibility(8);
            }
        }
        return this;
    }
}
