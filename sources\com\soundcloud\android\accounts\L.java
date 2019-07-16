package com.soundcloud.android.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.google.common.base.Preconditions;

/* compiled from: SoundCloudTokenOperations */
class L {
    private final AccountManager a;
    private C2358WP b = C2358WP.a;

    /* compiled from: SoundCloudTokenOperations */
    private enum a {
        ACCESS_TOKEN("access_token"),
        REFRESH_TOKEN("refresh_token"),
        SCOPE("scope"),
        EXPIRES_IN("expires_in");
        
        private String f;

        private a(String str) {
            this.f = str;
        }

        public String a() {
            return this.f;
        }
    }

    L(AccountManager accountManager) {
        this.a = accountManager;
    }

    private String b(Account account) {
        return this.a.peekAuthToken(account, a.ACCESS_TOKEN.a());
    }

    private String c(Account account) {
        return this.a.peekAuthToken(account, a.REFRESH_TOKEN.a());
    }

    private String d(Account account) {
        return this.a.getUserData(account, a.SCOPE.a());
    }

    /* access modifiers changed from: 0000 */
    public void a(Account account, C2358WP wp) {
        Preconditions.checkNotNull(account);
        this.a.setUserData(account, a.EXPIRES_IN.a(), Long.toString(wp.b()));
        this.a.setUserData(account, a.SCOPE.a(), wp.d());
        this.a.setAuthToken(account, a.ACCESS_TOKEN.a(), wp.a());
        this.a.setAuthToken(account, a.REFRESH_TOKEN.a(), wp.c());
    }

    /* access modifiers changed from: 0000 */
    public C2358WP a(Account account) {
        if (this.b == C2358WP.a && account != null) {
            this.b = new C2358WP(b(account), c(account), d(account));
        }
        return this.b;
    }

    public void a(C2358WP wp) {
        this.b = wp;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.b = C2358WP.a;
    }
}
