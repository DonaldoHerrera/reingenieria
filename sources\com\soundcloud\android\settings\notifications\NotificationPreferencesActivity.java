package com.soundcloud.android.settings.notifications;

import android.app.Fragment;
import android.os.Bundle;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.android.view.CircularProgressBar;

public class NotificationPreferencesActivity extends LoggedInActivity {
    C4834DJa x;
    n y;
    private VPa z = C4881Eua.b();

    private static class a extends C4943Gua {
        NotificationPreferencesActivity d;

        a(NotificationPreferencesActivity notificationPreferencesActivity) {
            this.d = notificationPreferencesActivity;
            notificationPreferencesActivity.F();
        }

        public void onComplete() {
            if (!this.d.isFinishing()) {
                this.d.C();
                this.d.E();
            }
        }
    }

    /* access modifiers changed from: private */
    public void C() {
        findViewById(i.loading).setVisibility(8);
    }

    private void D() {
        C6979nPa a2 = this.y.b().h().f().a(RPa.a());
        a aVar = new a(this);
        a2.c(aVar);
        this.z = aVar;
    }

    /* access modifiers changed from: private */
    public void E() {
        a((Fragment) new l());
    }

    /* access modifiers changed from: private */
    public void F() {
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(i.loading);
        circularProgressBar.setIndeterminate(true);
        circularProgressBar.setVisibility(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.y.a()) {
            if (bundle != null) {
                z();
            }
            D();
            return;
        }
        E();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.z.dispose();
        super.onDestroy();
    }

    public boolean onNavigateUp() {
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        this.x.d(this);
    }

    public Yca x() {
        return Yca.SETTINGS_NOTIFICATIONS;
    }
}
