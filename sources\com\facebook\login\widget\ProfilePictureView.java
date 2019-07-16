package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.facebook.C0594t;
import com.facebook.O;
import com.facebook.internal.N;
import com.facebook.internal.P;
import com.facebook.internal.P.b;
import com.facebook.internal.Q;
import com.facebook.internal.W;
import com.facebook.internal.ia;
import com.facebook.login.F;
import com.facebook.login.G;
import com.facebook.login.L;

public class ProfilePictureView extends FrameLayout {
    public static final String a = "ProfilePictureView";
    private String b;
    private int c = 0;
    private int d = 0;
    private boolean e = true;
    private Bitmap f;
    private ImageView g;
    private int h = -1;
    private P i;
    private a j;
    private Bitmap k = null;

    public interface a {
        void a(C0594t tVar);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
        a(attributeSet);
    }

    private void b(boolean z) {
        boolean c2 = c();
        String str = this.b;
        if (str == null || str.length() == 0 || (this.d == 0 && this.c == 0)) {
            b();
        } else if (c2 || z) {
            c(true);
        }
    }

    private void c(boolean z) {
        com.facebook.internal.P.a aVar = new com.facebook.internal.P.a(getContext(), P.a(this.b, this.d, this.c));
        aVar.a(z);
        aVar.a((Object) this);
        aVar.a((b) new g(this));
        P a2 = aVar.a();
        P p = this.i;
        if (p != null) {
            N.a(p);
        }
        this.i = a2;
        N.b(a2);
    }

    private void setImageBitmap(Bitmap bitmap) {
        ImageView imageView = this.g;
        if (imageView != null && bitmap != null) {
            this.f = bitmap;
            imageView.setImageBitmap(bitmap);
        }
    }

    public final a getOnErrorListener() {
        return this.j;
    }

    public final int getPresetSize() {
        return this.h;
    }

    public final String getProfileId() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        b(false);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        boolean z;
        LayoutParams layoutParams = getLayoutParams();
        int size = MeasureSpec.getSize(i3);
        int size2 = MeasureSpec.getSize(i2);
        if (MeasureSpec.getMode(i3) == 1073741824 || layoutParams.height != -2) {
            z = false;
        } else {
            size = a(true);
            i3 = MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        }
        if (MeasureSpec.getMode(i2) != 1073741824 && layoutParams.width == -2) {
            size2 = a(true);
            i2 = MeasureSpec.makeMeasureSpec(size2, 1073741824);
            z = true;
        }
        if (z) {
            setMeasuredDimension(size2, size);
            measureChildren(i2, i3);
            return;
        }
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        this.b = bundle.getString("ProfilePictureView_profileId");
        this.h = bundle.getInt("ProfilePictureView_presetSize");
        this.e = bundle.getBoolean("ProfilePictureView_isCropped");
        this.d = bundle.getInt("ProfilePictureView_width");
        this.c = bundle.getInt("ProfilePictureView_height");
        b(true);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", onSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.b);
        bundle.putInt("ProfilePictureView_presetSize", this.h);
        bundle.putBoolean("ProfilePictureView_isCropped", this.e);
        bundle.putInt("ProfilePictureView_width", this.d);
        bundle.putInt("ProfilePictureView_height", this.c);
        bundle.putBoolean("ProfilePictureView_refresh", this.i != null);
        return bundle;
    }

    public final void setCropped(boolean z) {
        this.e = z;
        b(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.k = bitmap;
    }

    public final void setOnErrorListener(a aVar) {
        this.j = aVar;
    }

    public final void setPresetSize(int i2) {
        if (i2 == -4 || i2 == -3 || i2 == -2 || i2 == -1) {
            this.h = i2;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Must use a predefined preset size");
    }

    public final void setProfileId(String str) {
        boolean z;
        if (ia.b(this.b) || !this.b.equalsIgnoreCase(str)) {
            b();
            z = true;
        } else {
            z = false;
        }
        this.b = str;
        b(z);
    }

    public final boolean a() {
        return this.e;
    }

    private void a(Context context) {
        removeAllViews();
        this.g = new ImageView(context);
        this.g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.g.setScaleType(ScaleType.CENTER_INSIDE);
        addView(this.g);
    }

    private void b() {
        P p = this.i;
        if (p != null) {
            N.a(p);
        }
        if (this.k == null) {
            setImageBitmap(BitmapFactory.decodeResource(getResources(), a() ? G.com_facebook_profile_picture_blank_square : G.com_facebook_profile_picture_blank_portrait));
            return;
        }
        c();
        setImageBitmap(Bitmap.createScaledBitmap(this.k, this.d, this.c, false));
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, L.com_facebook_profile_picture_view);
        setPresetSize(obtainStyledAttributes.getInt(L.com_facebook_profile_picture_view_com_facebook_preset_size, -1));
        this.e = obtainStyledAttributes.getBoolean(L.com_facebook_profile_picture_view_com_facebook_is_cropped, true);
        obtainStyledAttributes.recycle();
    }

    private boolean c() {
        int height = getHeight();
        int width = getWidth();
        boolean z = true;
        if (width < 1 || height < 1) {
            return false;
        }
        int a2 = a(false);
        if (a2 != 0) {
            height = a2;
            width = height;
        }
        if (width <= height) {
            height = a() ? width : 0;
        } else {
            width = a() ? height : 0;
        }
        if (width == this.d && height == this.c) {
            z = false;
        }
        this.d = width;
        this.c = height;
        return z;
    }

    /* access modifiers changed from: private */
    public void a(Q q) {
        if (q.c() == this.i) {
            this.i = null;
            Bitmap a2 = q.a();
            Exception b2 = q.b();
            if (b2 != null) {
                a aVar = this.j;
                if (aVar != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error in downloading profile picture for profileId: ");
                    sb.append(getProfileId());
                    aVar.a(new C0594t(sb.toString(), (Throwable) b2));
                    return;
                }
                W.a(O.REQUESTS, 6, a, b2.toString());
            } else if (a2 != null) {
                setImageBitmap(a2);
                if (q.d()) {
                    c(false);
                }
            }
        }
    }

    private int a(boolean z) {
        int i2;
        int i3 = this.h;
        if (i3 == -4) {
            i2 = F.com_facebook_profilepictureview_preset_size_large;
        } else if (i3 == -3) {
            i2 = F.com_facebook_profilepictureview_preset_size_normal;
        } else if (i3 == -2) {
            i2 = F.com_facebook_profilepictureview_preset_size_small;
        } else if (i3 != -1 || !z) {
            return 0;
        } else {
            i2 = F.com_facebook_profilepictureview_preset_size_normal;
        }
        return getResources().getDimensionPixelSize(i2);
    }
}
