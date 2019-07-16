package com.soundcloud.android.creators.record;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.soundcloud.android.C2929h;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.features.record.S;
import com.soundcloud.android.features.record.ba;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.main.LoggedInActivity;

public class UploadActivity extends LoggedInActivity {
    C4834DJa x;
    S y;
    C4655rja z;

    private boolean C() {
        Intent intent = getIntent();
        String action = intent.getAction();
        return intent.hasExtra("android.intent.extra.STREAM") && ("android.intent.action.SEND".equals(action) || C2929h.i.equals(action) || C2929h.j.equals(action));
    }

    private GPa<Recording> a(Intent intent) {
        return new e(this, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(l.resolve);
        if (!C()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        this.y.a(ba.b((Context) this), (Uri) intent.getParcelableExtra("android.intent.extra.STREAM"), intent.getType(), getContentResolver()).c(a(intent));
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        this.x.c(this);
    }

    public Yca x() {
        return Yca.DEEPLINK_UPLOAD;
    }
}
