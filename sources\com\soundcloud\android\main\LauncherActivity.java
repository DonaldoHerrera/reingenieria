package com.soundcloud.android.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.ia.l;

public class LauncherActivity extends RootActivity {
    Ica n;
    C2526g o;
    C4581ija p;
    HPa q;
    private VPa r = C4881Eua.b();

    private void A() {
        Intent intent = getIntent();
        intent.putExtra("EXTRA_FROM_LAUNCHER", true);
        this.p.a((Context) this, intent.getExtras());
    }

    public /* synthetic */ void a(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            A();
        } else {
            this.o.a((Activity) this);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.r.dispose();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        IPa a = this.n.a().b(this.q).a(RPa.a());
        C5250Qua a2 = C5250Qua.a(new C4022a(this));
        a.c(a2);
        this.r = a2;
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        setContentView(l.empty);
    }

    public Yca x() {
        return Yca.UNKNOWN;
    }

    /* access modifiers changed from: protected */
    public boolean y() {
        return false;
    }
}
