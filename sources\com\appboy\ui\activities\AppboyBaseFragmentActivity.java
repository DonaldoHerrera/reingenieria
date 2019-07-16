package com.appboy.ui.activities;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.appboy.h;
import com.appboy.ui.inappmessage.AppboyInAppMessageManager;

public class AppboyBaseFragmentActivity extends FragmentActivity {
    public void onPause() {
        super.onPause();
        AppboyInAppMessageManager.getInstance().unregisterInAppMessageManager(this);
    }

    public void onResume() {
        super.onResume();
        AppboyInAppMessageManager.getInstance().registerInAppMessageManager(this);
    }

    public void onStart() {
        super.onStart();
        h.a((Context) this).b((Activity) this);
    }

    public void onStop() {
        super.onStop();
        h.a((Context) this).a((Activity) this);
    }
}
