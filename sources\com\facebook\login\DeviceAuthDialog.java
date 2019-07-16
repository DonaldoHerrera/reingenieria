package com.facebook.login;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0361c;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.C0538h;
import com.facebook.C0594t;
import com.facebook.FacebookActivity;
import com.facebook.GraphRequest;
import com.facebook.J;
import com.facebook.M;
import com.facebook.common.d;
import com.facebook.common.e;
import com.facebook.common.f;
import com.facebook.common.g;
import com.facebook.internal.ia.b;
import com.facebook.internal.ja;
import com.facebook.login.LoginClient.Request;
import com.soundcloud.flippernative.BuildConfig;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class DeviceAuthDialog extends C0361c {
    private View a;
    private TextView b;
    private TextView c;
    private DeviceAuthMethodHandler d;
    /* access modifiers changed from: private */
    public AtomicBoolean e = new AtomicBoolean();
    private volatile J f;
    private volatile ScheduledFuture g;
    /* access modifiers changed from: private */
    public volatile RequestState h;
    /* access modifiers changed from: private */
    public Dialog i;
    /* access modifiers changed from: private */
    public boolean j = false;
    /* access modifiers changed from: private */
    public boolean k = false;
    /* access modifiers changed from: private */
    public Request l = null;

    private static class RequestState implements Parcelable {
        public static final Creator<RequestState> CREATOR = new C0577j();
        private String a;
        private String b;
        private String c;
        private long d;
        private long e;

        RequestState() {
        }

        public String a() {
            return this.a;
        }

        public void b(String str) {
            this.b = str;
            this.a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{str});
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.b;
        }

        public int describeContents() {
            return 0;
        }

        public boolean e() {
            boolean z = false;
            if (this.e == 0) {
                return false;
            }
            if ((new Date().getTime() - this.e) - (this.d * 1000) < 0) {
                z = true;
            }
            return z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeLong(this.d);
            parcel.writeLong(this.e);
        }

        protected RequestState(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readLong();
            this.e = parcel.readLong();
        }

        public void a(String str) {
            this.c = str;
        }

        public void a(long j) {
            this.d = j;
        }

        public long b() {
            return this.d;
        }

        public void b(long j) {
            this.e = j;
        }
    }

    private GraphRequest Rb() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.h.c());
        GraphRequest graphRequest = new GraphRequest(null, "device/login_status", bundle, M.POST, new C0573f(this));
        return graphRequest;
    }

    /* access modifiers changed from: private */
    public void Sb() {
        this.h.b(new Date().getTime());
        this.f = Rb().c();
    }

    /* access modifiers changed from: private */
    public void Tb() {
        this.g = DeviceAuthMethodHandler.e().schedule(new C0572e(this), this.h.b(), TimeUnit.SECONDS);
    }

    /* access modifiers changed from: protected */
    public void Qb() {
        if (this.e.compareAndSet(false, true)) {
            if (this.h != null) {
                C1330gl.a(this.h.d());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.d;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.f();
            }
            this.i.dismiss();
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        this.i = new Dialog(getActivity(), g.com_facebook_auth_dialog);
        this.i.setContentView(g(C1330gl.b() && !this.k));
        return this.i;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.d = (DeviceAuthMethodHandler) ((y) ((FacebookActivity) getActivity()).w()).Sb().d();
        if (bundle != null) {
            RequestState requestState = (RequestState) bundle.getParcelable("request_state");
            if (requestState != null) {
                a(requestState);
            }
        }
        return onCreateView;
    }

    public void onDestroy() {
        this.j = true;
        this.e.set(true);
        super.onDestroy();
        if (this.f != null) {
            this.f.cancel(true);
        }
        if (this.g != null) {
            this.g.cancel(true);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.j) {
            Qb();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.h != null) {
            bundle.putParcelable("request_state", this.h);
        }
    }

    /* access modifiers changed from: protected */
    public int f(boolean z) {
        return z ? e.com_facebook_smart_device_dialog_fragment : e.com_facebook_device_auth_dialog_fragment;
    }

    /* access modifiers changed from: protected */
    public View g(boolean z) {
        View inflate = getActivity().getLayoutInflater().inflate(f(z), null);
        this.a = inflate.findViewById(d.progress_bar);
        this.b = (TextView) inflate.findViewById(d.confirmation_code);
        ((Button) inflate.findViewById(d.cancel_button)).setOnClickListener(new C0571d(this));
        this.c = (TextView) inflate.findViewById(d.com_facebook_device_auth_instructions);
        this.c.setText(Html.fromHtml(getString(f.com_facebook_device_auth_instructions)));
        return inflate;
    }

    public void a(Request request) {
        this.l = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.h()));
        String f2 = request.f();
        if (f2 != null) {
            bundle.putString("redirect_uri", f2);
        }
        String e2 = request.e();
        if (e2 != null) {
            bundle.putString("target_user_id", e2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ja.a());
        sb.append("|");
        sb.append(ja.b());
        bundle.putString("access_token", sb.toString());
        bundle.putString("device_info", C1330gl.a());
        GraphRequest graphRequest = new GraphRequest(null, "device/login", bundle, M.POST, new C0570c(this));
        graphRequest.c();
    }

    /* access modifiers changed from: private */
    public void a(RequestState requestState) {
        this.h = requestState;
        this.b.setText(requestState.d());
        this.c.setCompoundDrawablesWithIntrinsicBounds(null, new BitmapDrawable(getResources(), C1330gl.b(requestState.a())), null, null);
        this.b.setVisibility(0);
        this.a.setVisibility(8);
        if (!this.k && C1330gl.c(requestState.d())) {
            new C1452kk(getContext()).a("fb_smart_login_service");
        }
        if (requestState.e()) {
            Tb();
        } else {
            Sb();
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, b bVar, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(f.com_facebook_smart_login_confirmation_title);
        String string2 = getResources().getString(f.com_facebook_smart_login_confirmation_continue_as);
        String string3 = getResources().getString(f.com_facebook_smart_login_confirmation_cancel);
        String format = String.format(string2, new Object[]{str3});
        Builder builder = new Builder(getContext());
        Builder cancelable = builder.setMessage(string).setCancelable(true);
        C0575h hVar = new C0575h(this, str, bVar, str2, date, date2);
        cancelable.setNegativeButton(format, hVar).setPositiveButton(string3, new C0574g(this));
        builder.create().show();
    }

    /* access modifiers changed from: private */
    public void a(String str, Long l2, Long l3) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = null;
        Date date2 = l2.longValue() != 0 ? new Date(new Date().getTime() + (l2.longValue() * 1000)) : null;
        if (!(l3.longValue() == 0 || l3 == null)) {
            date = new Date(l3.longValue() * 1000);
        }
        AccessToken accessToken = new AccessToken(str, B.f(), BuildConfig.VERSION_NAME, null, null, null, null, date2, null, date);
        GraphRequest graphRequest = new GraphRequest(accessToken, "me", bundle, M.GET, new C0576i(this, str, date2, date));
        graphRequest.c();
    }

    /* access modifiers changed from: private */
    public void a(String str, b bVar, String str2, Date date, Date date2) {
        this.d.a(str2, B.f(), str, bVar.c(), bVar.a(), bVar.b(), C0538h.DEVICE_AUTH, date, null, date2);
        this.i.dismiss();
    }

    /* access modifiers changed from: protected */
    public void a(C0594t tVar) {
        if (this.e.compareAndSet(false, true)) {
            if (this.h != null) {
                C1330gl.a(this.h.d());
            }
            this.d.a((Exception) tVar);
            this.i.dismiss();
        }
    }
}
