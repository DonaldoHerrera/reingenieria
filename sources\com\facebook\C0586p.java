package com.facebook;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.core.content.a;
import androidx.fragment.app.Fragment;
import com.facebook.common.g;
import com.facebook.internal.L;

/* renamed from: com.facebook.p reason: case insensitive filesystem */
/* compiled from: FacebookButtonBase */
public abstract class C0586p extends Button {
    private String a;
    private String b;
    /* access modifiers changed from: private */
    public OnClickListener c;
    /* access modifiers changed from: private */
    public OnClickListener d;
    private boolean e;
    private int f;
    private int g;
    private L h;

    protected C0586p(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, 0);
        if (i2 == 0) {
            i2 = getDefaultStyleResource();
        }
        if (i2 == 0) {
            i2 = g.com_facebook_button;
        }
        a(context, attributeSet, i, i2);
        this.a = str;
        this.b = str2;
        setClickable(true);
        setFocusable(true);
    }

    @SuppressLint({"ResourceType"})
    private void c(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i, i2);
        try {
            setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
            setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(4, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void d(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i, i2);
        try {
            setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: finally extract failed */
    private void e(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i, i2);
        try {
            setTextColor(obtainStyledAttributes.getColorStateList(0));
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i, i2);
            try {
                setGravity(obtainStyledAttributes2.getInt(0, 17));
                obtainStyledAttributes2.recycle();
                TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i, i2);
                try {
                    setTextSize(0, (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0));
                    setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes3.getInt(1, 1)));
                    setText(obtainStyledAttributes3.getString(2));
                } finally {
                    obtainStyledAttributes3.recycle();
                }
            } catch (Throwable th) {
                obtainStyledAttributes2.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    public Activity getActivity() {
        boolean z;
        Context context = getContext();
        while (true) {
            z = context instanceof Activity;
            if (!z && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            } else if (!z) {
                return (Activity) context;
            } else {
                throw new C0594t("Unable to get Activity.");
            }
        }
        if (!z) {
        }
    }

    public int getCompoundPaddingLeft() {
        if (this.e) {
            return this.f;
        }
        return super.getCompoundPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        if (this.e) {
            return this.g;
        }
        return super.getCompoundPaddingRight();
    }

    /* access modifiers changed from: protected */
    public abstract int getDefaultRequestCode();

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return 0;
    }

    public Fragment getFragment() {
        L l = this.h;
        if (l != null) {
            return l.c();
        }
        return null;
    }

    public android.app.Fragment getNativeFragment() {
        L l = this.h;
        if (l != null) {
            return l.b();
        }
        return null;
    }

    public int getRequestCode() {
        return getDefaultRequestCode();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            a(getContext());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if ((getGravity() & 1) != 0) {
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int compoundPaddingRight = getCompoundPaddingRight();
            int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - a(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
            this.f = compoundPaddingLeft - min;
            this.g = compoundPaddingRight + min;
            this.e = true;
        }
        super.onDraw(canvas);
        this.e = false;
    }

    public void setFragment(Fragment fragment) {
        this.h = new L(fragment);
    }

    /* access modifiers changed from: protected */
    public void setInternalOnClickListener(OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    /* access modifiers changed from: private */
    public void b(Context context) {
        new C1452kk(context).a(this.b);
    }

    public void setFragment(android.app.Fragment fragment) {
        this.h = new L(fragment);
    }

    /* access modifiers changed from: protected */
    public int a(String str) {
        return (int) Math.ceil((double) getPaint().measureText(str));
    }

    private void b(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i, i2);
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(a.a(context, com.facebook.common.a.com_facebook_blue));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Context context, AttributeSet attributeSet, int i, int i2) {
        b(context, attributeSet, i, i2);
        c(context, attributeSet, i, i2);
        d(context, attributeSet, i, i2);
        e(context, attributeSet, i, i2);
        a();
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        OnClickListener onClickListener = this.c;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private void a(Context context) {
        new C1452kk(context).a(this.a);
    }

    private void a() {
        super.setOnClickListener(new C0585o(this));
    }
}
