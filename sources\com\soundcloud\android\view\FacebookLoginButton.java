package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.login.widget.LoginButton;
import com.soundcloud.android.view.customfontviews.a;

public class FacebookLoginButton extends LoginButton {
    public FacebookLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
        a.a((TextView) this, attributeSet);
    }

    private void d() {
        setInternalOnClickListener(null);
    }

    public FacebookLoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
        a.a((TextView) this, attributeSet);
    }
}
