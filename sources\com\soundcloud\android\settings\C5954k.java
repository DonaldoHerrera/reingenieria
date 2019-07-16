package com.soundcloud.android.settings;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.N;

/* renamed from: com.soundcloud.android.settings.k reason: case insensitive filesystem */
/* compiled from: ClearCacheDialog */
public class C5954k extends DialogFragment {
    Context a;
    N b;
    C5630bKa c;
    Ula d;
    HPa e;
    private VPa f = C4881Eua.a();

    /* renamed from: com.soundcloud.android.settings.k$a */
    /* compiled from: ClearCacheDialog */
    private class a extends C4974Hua {
        private a() {
        }

        public void onComplete() {
            Toast.makeText(C5954k.this.a, p.cache_cleared, 0).show();
            C5954k.this.dismiss();
            super.onComplete();
        }
    }

    public C5954k() {
        SoundCloudApplication.f().a(this);
    }

    private C6979nPa a() {
        return C6979nPa.a((C7186qPa) new C5944a(this));
    }

    public Dialog onCreateDialog(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setTitle(p.cache_clearing);
        progressDialog.setMessage(getString(p.cache_clearing_message));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        this.f.dispose();
        C6979nPa a2 = a().b(this.e).a(RPa.a());
        a aVar = new a();
        a2.c(aVar);
        this.f = aVar;
        return progressDialog;
    }

    public /* synthetic */ void a(C7048oPa opa) throws Exception {
        this.c.a();
        this.d.a().b();
        opa.onComplete();
    }
}
