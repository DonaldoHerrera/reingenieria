package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.A;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.M;
import com.facebook.common.d;
import com.facebook.common.e;
import com.facebook.common.f;
import com.facebook.common.g;
import com.facebook.internal.ja;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DeviceShareDialogFragment extends C0361c {
    private static ScheduledThreadPoolExecutor a;
    private ProgressBar b;
    private TextView c;
    /* access modifiers changed from: private */
    public Dialog d;
    private volatile RequestState e;
    private volatile ScheduledFuture f;
    private ShareContent g;

    private static class RequestState implements Parcelable {
        public static final Creator<RequestState> CREATOR = new C0592d();
        private String a;
        private long b;

        RequestState() {
        }

        public void a(String str) {
            this.a = str;
        }

        public String b() {
            return this.a;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeLong(this.b);
        }

        protected RequestState(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readLong();
        }

        public long a() {
            return this.b;
        }

        public void a(long j) {
            this.b = j;
        }
    }

    private void Qb() {
        if (isAdded()) {
            A a2 = getFragmentManager().a();
            a2.d(this);
            a2.a();
        }
    }

    private static synchronized ScheduledThreadPoolExecutor Rb() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (a == null) {
                a = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = a;
        }
        return scheduledThreadPoolExecutor;
    }

    private Bundle Sb() {
        ShareContent shareContent = this.g;
        if (shareContent == null) {
            return null;
        }
        if (shareContent instanceof ShareLinkContent) {
            return E.a((ShareLinkContent) shareContent);
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            return E.a((ShareOpenGraphContent) shareContent);
        }
        return null;
    }

    private void Tb() {
        Bundle Sb = Sb();
        if (Sb == null || Sb.size() == 0) {
            a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ja.a());
        sb.append("|");
        sb.append(ja.b());
        Sb.putString("access_token", sb.toString());
        Sb.putString("device_info", C1330gl.a());
        GraphRequest graphRequest = new GraphRequest(null, "device/share", Sb, M.POST, new C0590b(this));
        graphRequest.c();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        this.d = new Dialog(getActivity(), g.com_facebook_auth_dialog);
        View inflate = getActivity().getLayoutInflater().inflate(e.com_facebook_device_auth_dialog_fragment, null);
        this.b = (ProgressBar) inflate.findViewById(d.progress_bar);
        this.c = (TextView) inflate.findViewById(d.confirmation_code);
        ((Button) inflate.findViewById(d.cancel_button)).setOnClickListener(new C0589a(this));
        ((TextView) inflate.findViewById(d.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(f.com_facebook_device_auth_instructions)));
        this.d.setContentView(inflate);
        Tb();
        return this.d;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            RequestState requestState = (RequestState) bundle.getParcelable("request_state");
            if (requestState != null) {
                a(requestState);
            }
        }
        return onCreateView;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f != null) {
            this.f.cancel(true);
        }
        a(-1, new Intent());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.e != null) {
            bundle.putParcelable("request_state", this.e);
        }
    }

    private void a(int i, Intent intent) {
        if (this.e != null) {
            C1330gl.a(this.e.b());
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(getContext(), facebookRequestError.c(), 0).show();
        }
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    public void a(ShareContent shareContent) {
        this.g = shareContent;
    }

    /* access modifiers changed from: private */
    public void a(FacebookRequestError facebookRequestError) {
        Qb();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        a(-1, intent);
    }

    /* access modifiers changed from: private */
    public void a(RequestState requestState) {
        this.e = requestState;
        this.c.setText(requestState.b());
        this.c.setVisibility(0);
        this.b.setVisibility(8);
        this.f = Rb().schedule(new C0591c(this), requestState.a(), TimeUnit.SECONDS);
    }
}
