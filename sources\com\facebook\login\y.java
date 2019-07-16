package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.d;
import com.facebook.common.e;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import com.facebook.login.LoginClient.b;

/* compiled from: LoginFragment */
public class y extends Fragment {
    private String a;
    private LoginClient b;
    private Request c;

    /* access modifiers changed from: protected */
    public LoginClient Qb() {
        return new LoginClient((Fragment) this);
    }

    /* access modifiers changed from: protected */
    public int Rb() {
        return e.com_facebook_login_fragment;
    }

    /* access modifiers changed from: 0000 */
    public LoginClient Sb() {
        return this.b;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.b.a(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b = (LoginClient) bundle.getParcelable("loginClient");
            this.b.a((Fragment) this);
        } else {
            this.b = Qb();
        }
        this.b.a((b) new w(this));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            a((Activity) activity);
            Intent intent = activity.getIntent();
            if (intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request");
                if (bundleExtra != null) {
                    this.c = (Request) bundleExtra.getParcelable("request");
                }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(Rb(), viewGroup, false);
        this.b.a((a) new x(this, inflate.findViewById(d.com_facebook_login_fragment_progress_bar)));
        return inflate;
    }

    public void onDestroy() {
        this.b.a();
        super.onDestroy();
    }

    public void onPause() {
        View view;
        super.onPause();
        if (getView() == null) {
            view = null;
        } else {
            view = getView().findViewById(d.com_facebook_login_fragment_progress_bar);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.a == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
            return;
        }
        this.b.c(this.c);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.b);
    }

    /* access modifiers changed from: private */
    public void a(Result result) {
        this.c = null;
        int i = result.a == a.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (isAdded()) {
            getActivity().setResult(i, intent);
            getActivity().finish();
        }
    }

    private void a(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.a = callingActivity.getPackageName();
        }
    }
}
