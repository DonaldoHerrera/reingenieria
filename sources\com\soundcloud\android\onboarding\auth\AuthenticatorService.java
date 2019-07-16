package com.soundcloud.android.onboarding.auth;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.NetworkErrorException;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.onboarding.OnboardActivity;

public class AuthenticatorService extends Service {
    a a;

    public static class a extends AbstractAccountAuthenticator {
        private final C2526g a;
        private final Context b;
        private final Handler c = new Handler();

        public a(Context context, C2526g gVar) {
            super(context);
            this.b = context;
            this.a = gVar;
        }

        public /* synthetic */ void a() {
            C5232QGa.a(this.b, p.account_one_active, new Object[0]);
        }

        public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) throws NetworkErrorException {
            Bundle bundle2 = new Bundle();
            if (C5232QGa.a(this.b, str).length == 0) {
                Intent intent = new Intent(this.b, OnboardActivity.class);
                intent.addFlags(67108864);
                intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
                bundle2.putParcelable("intent", intent);
            } else {
                bundle2.putInt("errorCode", 0);
                bundle2.putString("errorMessage", this.b.getString(p.account_one_active));
                this.c.post(new C4204b(this));
            }
            return bundle2;
        }

        public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) throws NetworkErrorException {
            return null;
        }

        public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
            return null;
        }

        public Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) throws NetworkErrorException {
            Bundle accountRemovalAllowed = super.getAccountRemovalAllowed(accountAuthenticatorResponse, account);
            if (accountRemovalAllowed != null) {
                String str = "booleanResult";
                if (accountRemovalAllowed.containsKey(str) && !accountRemovalAllowed.containsKey("intent") && accountRemovalAllowed.getBoolean(str)) {
                    this.a.l().a((C7117pPa) new C4943Gua());
                }
            }
            return accountRemovalAllowed;
        }

        public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
            return null;
        }

        public String getAuthTokenLabel(String str) {
            return null;
        }

        public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) throws NetworkErrorException {
            return null;
        }

        public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) throws NetworkErrorException {
            return null;
        }
    }

    public IBinder onBind(Intent intent) {
        if (intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            return this.a.getIBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        SoundCloudApplication.f().a(this);
    }
}
