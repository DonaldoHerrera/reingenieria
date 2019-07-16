package com.facebook.share.internal;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.C0586p;
import com.facebook.common.c;
import com.facebook.common.f;
import com.facebook.common.g;

@Deprecated
/* compiled from: LikeButton */
public class w extends C0586p {
    @Deprecated
    public w(Context context, boolean z) {
        super(context, null, 0, 0, "fb_like_button_create", "fb_like_button_did_tap");
        setSelected(z);
    }

    private void b() {
        if (isSelected()) {
            setCompoundDrawablesWithIntrinsicBounds(c.com_facebook_button_like_icon_selected, 0, 0, 0);
            setText(getResources().getString(f.com_facebook_like_button_liked));
            return;
        }
        setCompoundDrawablesWithIntrinsicBounds(c.com_facebook_button_icon, 0, 0, 0);
        setText(getResources().getString(f.com_facebook_like_button_not_liked));
    }

    /* access modifiers changed from: protected */
    public void a(Context context, AttributeSet attributeSet, int i, int i2) {
        super.a(context, attributeSet, i, i2);
        b();
    }

    /* access modifiers changed from: protected */
    public int getDefaultRequestCode() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return g.com_facebook_button_like;
    }

    @Deprecated
    public void setSelected(boolean z) {
        super.setSelected(z);
        b();
    }
}
