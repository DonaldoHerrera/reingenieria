package com.soundcloud.android.cast.activity;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.SoundCloudApplication;

public abstract class CastRedirectActivity extends AppCompatActivity {
    public CastRedirectActivity() {
        SoundCloudApplication.f().a(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        startActivity(w());
        finish();
    }

    /* access modifiers changed from: protected */
    public abstract Intent w();
}
