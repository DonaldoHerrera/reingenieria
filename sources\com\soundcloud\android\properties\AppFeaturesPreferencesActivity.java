package com.soundcloud.android.properties;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.A;
import androidx.fragment.app.Fragment;

public class AppFeaturesPreferencesActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A a = getSupportFragmentManager().a();
        a.a(16908290, (Fragment) new h());
        a.a();
    }

    public boolean onNavigateUp() {
        finish();
        return true;
    }
}
