package com.soundcloud.android.onboarding.auth;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.auth.d;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.sync.T;
import java.lang.ref.WeakReference;

/* compiled from: AuthTaskFragment */
public abstract class E extends C2418ZW {
    private Cka b;
    private Eka c;
    private WeakReference<a> d;
    C6834lGa e;
    C2526g f;
    dfa g;
    T h;
    ia i;
    ka j;
    C3800jea k;
    com.soundcloud.android.properties.a l;

    /* compiled from: AuthTaskFragment */
    public interface a {
        void a(Bundle bundle);

        void a(d dVar);

        void a(C3776gea gea, boolean z);

        void a(String str, boolean z);

        void b(String str);

        void m();

        void q();

        void s();

        void t();

        void u();

        void v();
    }

    protected E() {
        SoundCloudApplication.f().a(this);
    }

    private void Sb() {
        a aVar = (a) this.d.get();
        String str = "ScOnboarding";
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("auth result will be sent to listener: ");
            sb.append(this.c);
            C7316sHa.a(4, str, sb.toString());
            if (this.c.q()) {
                aVar.a(this.c.b().a.b(), this instanceof na);
            } else if (this.c.k()) {
                aVar.t();
            } else if (this.c.p()) {
                aVar.u();
            } else if (this.c.g()) {
                aVar.s();
            } else if (this.c.j()) {
                aVar.q();
            } else if (this.c.i()) {
                aVar.a(this.c.e());
            } else if (this.c.h()) {
                aVar.v();
            } else if (this.c.t()) {
                aVar.b(this.c.c());
            } else if (this.c.f()) {
                aVar.m();
            } else if (this.c.l()) {
                aVar.a((d) this.c.d());
            } else {
                aVar.a(a((Activity) aVar, this.c), b(this.c));
            }
        } else {
            C7316sHa.a(4, str, "auth result listener is gone, when delivering result");
        }
        dismiss();
    }

    private boolean b(Eka eka) {
        return this.e.d() && eka.s();
    }

    /* access modifiers changed from: 0000 */
    public abstract Cka Rb();

    public void a(Eka eka) {
        this.b = null;
        this.c = eka;
        if (isResumed()) {
            Sb();
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.d = new WeakReference<>((a) activity);
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(activity);
            sb.append(" must implement OnAuthResultListener");
            throw new ClassCastException(sb.toString());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        setCancelable(false);
        this.b = Rb();
        this.b.a(this);
        this.b.a(getArguments());
    }

    public Dialog onCreateDialog(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(getActivity(), 2);
        progressDialog.setMessage(getString(p.authentication_login_progress_message));
        progressDialog.setIndeterminate(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Cka cka = this.b;
        if (cka != null) {
            cka.cancel(false);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.b == null) {
            Sb();
        }
    }

    /* access modifiers changed from: protected */
    public String a(Activity activity, Eka eka) {
        Throwable a2 = C7316sHa.a(eka.d());
        boolean z = !this.e.d();
        if (eka.n()) {
            return activity.getString(p.error_server_problems_message);
        }
        if (eka.m() && z) {
            return activity.getString(p.authentication_error_no_connection_message);
        }
        if (a2 instanceof Dka) {
            return ((Dka) a2).a();
        }
        return activity.getString(p.authentication_error_generic);
    }
}
