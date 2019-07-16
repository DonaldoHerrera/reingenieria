package com.soundcloud.android.onboarding.auth;

import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.WebViewActivity;
import com.soundcloud.android.view.CustomFontTitleToolbar;

public class RemoteSignInWebViewActivity extends WebViewActivity {
    private void A() {
        CustomFontTitleToolbar customFontTitleToolbar = (CustomFontTitleToolbar) findViewById(i.toolbar_id);
        customFontTitleToolbar.setTitle(getString(p.remote_signin_activity_title));
        customFontTitleToolbar.setNavigationIcon(h.close_icon);
        customFontTitleToolbar.setNavigationOnClickListener(new C4205c(this));
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A();
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        setContentView(l.remote_signin_web_view);
    }

    /* access modifiers changed from: protected */
    public boolean z() {
        return false;
    }
}
