package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.b;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountRequest;

@KeepForSdk
public class a extends GmsClient<f> implements Oy {
    private final boolean a;
    private final Bundle b;
    private Integer c;
    private final ClientSettings zaet;

    private a(Context context, Looper looper, boolean z, ClientSettings clientSettings, Bundle bundle, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.a = true;
        this.zaet = clientSettings;
        this.b = bundle;
        this.c = clientSettings.getClientSessionId();
    }

    public final void a(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((f) getService()).a(iAccountAccessor, this.c.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void connect() {
        connect(new LegacyClientCallbackAdapter());
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof f) {
            return (f) queryLocalInterface;
        }
        return new g(iBinder);
    }

    /* access modifiers changed from: protected */
    public Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.zaet.getRealClientPackageName())) {
            this.b.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zaet.getRealClientPackageName());
        }
        return this.b;
    }

    public int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    public String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public boolean requiresSignIn() {
        return this.a;
    }

    public final void a() {
        try {
            ((f) getService()).e(this.c.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void a(d dVar) {
        Preconditions.checkNotNull(dVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountOrDefault = this.zaet.getAccountOrDefault();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(accountOrDefault.name)) {
                googleSignInAccount = b.a(getContext()).b();
            }
            ((f) getService()).a(new zah(new ResolveAccountRequest(accountOrDefault, this.c.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e) {
            String str = "SignInClientImpl";
            Log.w(str, "Remote service probably died when signIn is called");
            try {
                dVar.zab(new zaj(8));
            } catch (RemoteException unused) {
                Log.wtf(str, "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public a(Context context, Looper looper, boolean z, ClientSettings clientSettings, Ky ky, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, true, clientSettings, a(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }

    @KeepForSdk
    public static Bundle a(ClientSettings clientSettings) {
        Ky signInOptions = clientSettings.getSignInOptions();
        Integer clientSessionId = clientSettings.getClientSessionId();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.getAccount());
        if (clientSessionId != null) {
            bundle.putInt(ClientSettings.KEY_CLIENT_SESSION_ID, clientSessionId.intValue());
        }
        if (signInOptions != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", signInOptions.g());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", signInOptions.f());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", signInOptions.d());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", signInOptions.e());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", signInOptions.b());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", signInOptions.h());
            if (signInOptions.a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", signInOptions.a().longValue());
            }
            if (signInOptions.c() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", signInOptions.c().longValue());
            }
        }
        return bundle;
    }
}
