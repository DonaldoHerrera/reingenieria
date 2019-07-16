package com.soundcloud.android.settings;

import android.app.Fragment;
import android.os.Bundle;
import com.soundcloud.android.main.LoggedInActivity;

public class LicensesActivity extends LoggedInActivity {
    C4834DJa x;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a((Fragment) C5986s.a());
    }

    public boolean onNavigateUp() {
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        this.x.c(this);
    }

    public Yca x() {
        return Yca.SETTINGS_LICENSES;
    }
}
