package com.soundcloud.android.creators.record;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import androidx.appcompat.app.C0325l;
import androidx.core.app.b;
import androidx.core.content.a;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.android.main.ha;

public class RecordPermissionsActivity extends LoggedInActivity {
    private static final int x = (p.record_permission_rationale % 65535);
    C4655rja y;

    private C4928GKa<Recording> C() {
        return C4928GKa.b(getIntent().getParcelableExtra("recording"));
    }

    private void D() {
        b.a(this, new String[]{"android.permission.RECORD_AUDIO"}, x);
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        D();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = "android.permission.RECORD_AUDIO";
        if (a.a((Context) this, str) == 0) {
            return;
        }
        if (b.a((Activity) this, str)) {
            C0325l.a aVar = new C0325l.a(this);
            aVar.c(p.side_menu_record);
            aVar.b(p.record_permission_rationale);
            aVar.c(p.ok_got_it, (OnClickListener) new b(this));
            aVar.c();
            return;
        }
        D();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == x) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.y.a(C4621nja.a(C(), C4928GKa.c(ha.a(getIntent()))));
            }
            finish();
        }
    }

    public Yca x() {
        return Yca.UNKNOWN;
    }
}
