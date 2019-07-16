package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

@KeepName
public class SignInHubActivity extends FragmentActivity {
    private static boolean a = false;
    private boolean b = false;
    private SignInConfiguration c;
    private boolean d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public Intent f;

    private class a implements defpackage.C1260ed.a<Void> {
        private a() {
        }

        public final void a(C1384id<Void> idVar) {
        }

        public final /* synthetic */ void a(C1384id idVar, Object obj) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.e, SignInHubActivity.this.f);
            SignInHubActivity.this.finish();
        }

        public final C1384id<Void> onCreateLoader(int i, Bundle bundle) {
            return new f(SignInHubActivity.this, GoogleApiClient.getAllClients());
        }
    }

    private final void b(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        a = false;
    }

    private final void w() {
        getSupportLoaderManager().a(0, null, new a());
        a = false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.b) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    String str = "signInAccount";
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(str);
                    if (signInAccount == null || signInAccount.i() == null) {
                        String str2 = "errorCode";
                        if (intent.hasExtra(str2)) {
                            int intExtra = intent.getIntExtra(str2, 8);
                            if (intExtra == 13) {
                                intExtra = 12501;
                            }
                            b(intExtra);
                            return;
                        }
                    } else {
                        GoogleSignInAccount i3 = signInAccount.i();
                        m.a(this).a(this.c.i(), i3);
                        intent.removeExtra(str);
                        intent.putExtra("googleSignInAccount", i3);
                        this.d = true;
                        this.e = i2;
                        this.f = intent;
                        w();
                        return;
                    }
                }
                b(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            b(12500);
            return;
        }
        String str = "com.google.android.gms.auth.GOOGLE_SIGN_IN";
        String str2 = "AuthSignInClient";
        if (action.equals(str) || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String str3 = "config";
            this.c = (SignInConfiguration) intent.getBundleExtra(str3).getParcelable(str3);
            if (this.c == null) {
                Log.e(str2, "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                this.d = bundle.getBoolean("signingInGoogleApiClients");
                if (this.d) {
                    this.e = bundle.getInt("signInResultCode");
                    this.f = (Intent) bundle.getParcelable("signInResultData");
                    w();
                }
            } else if (a) {
                setResult(0);
                b(12502);
            } else {
                a = true;
                Intent intent2 = new Intent(action);
                if (action.equals(str)) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra(str3, this.c);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.b = true;
                    Log.w(str2, "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    b(17);
                }
            }
        } else {
            String str4 = "Unknown action: ";
            String valueOf = String.valueOf(intent.getAction());
            Log.e(str2, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.d);
        if (this.d) {
            bundle.putInt("signInResultCode", this.e);
            bundle.putParcelable("signInResultData", this.f);
        }
    }
}
