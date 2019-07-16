package com.soundcloud.android.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Preconditions;
import com.soundcloud.android.ia.p;
import java.io.IOException;
import java.lang.ref.WeakReference;

@EVa(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u001f B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\n \u0017*\u0004\u0018\u00010\b0\bH\u0012J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006!"}, d2 = {"Lcom/soundcloud/android/accounts/ScAccountManager;", "", "accountManager", "Landroid/accounts/AccountManager;", "context", "Landroid/content/Context;", "(Landroid/accounts/AccountManager;Landroid/content/Context;)V", "userIdKey", "", "getUserIdKey$base_release", "()Ljava/lang/String;", "addAccount", "", "string", "currentActivityContext", "Landroid/app/Activity;", "addOrReplaceSoundCloudAccount", "Lcom/soundcloud/java/optional/Optional;", "Landroid/accounts/Account;", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "permalink", "getAccountType", "kotlin.jvm.PlatformType", "getSoundCloudAccount", "getUserUrn", "account", "remove", "removeAccount", "Landroid/accounts/AccountManagerFuture;", "", "AccountManagerCallback", "AddAccountFailure", "base_release"}, mv = {1, 1, 15})
/* compiled from: ScAccountManager.kt */
public class J {
    private final String a = "currentUserId";
    private final AccountManager b;
    private final Context c;

    /* compiled from: ScAccountManager.kt */
    public static final class a implements AccountManagerCallback<Bundle> {
        private final WeakReference<Activity> a;

        public a(Activity activity) {
            C7471uYa.b(activity, "originalActivity");
            this.a = new WeakReference<>(activity);
        }

        public void run(AccountManagerFuture<Bundle> accountManagerFuture) {
            C7471uYa.b(accountManagerFuture, "future");
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            Activity activity = (Activity) this.a.get();
            if (activity != null) {
                Intent intent = (Intent) bundle.getParcelable("intent");
                if (intent != null) {
                    activity.startActivity(intent);
                }
            }
            this.a.clear();
        }
    }

    /* compiled from: ScAccountManager.kt */
    private static final class b extends Exception {
        public b(String str) {
            C7471uYa.b(str, "message");
            super(str);
        }
    }

    public J(AccountManager accountManager, Context context) {
        C7471uYa.b(accountManager, "accountManager");
        C7471uYa.b(context, "context");
        this.b = accountManager;
        this.c = context;
    }

    public void a(String str, Activity activity) {
        C7471uYa.b(str, "string");
        C7471uYa.b(activity, "currentActivityContext");
        Preconditions.checkState(!a().c(), "An account is already present. Why are we trying to add another?", new Object[0]);
        this.b.addAccount(c(), str, null, null, null, new a(activity), null);
    }

    public String b() {
        return this.a;
    }

    public AccountManagerFuture<Boolean> c(Account account) {
        C7471uYa.b(account, "account");
        AccountManagerFuture<Boolean> removeAccount = this.b.removeAccount(account, null, null);
        C7471uYa.a((Object) removeAccount, "accountManager.removeAccount(account, null, null)");
        return removeAccount;
    }

    private String c() {
        return this.c.getString(p.account_type);
    }

    public void b(Account account) throws OperationCanceledException, IOException, AuthenticatorException, C3251sI {
        C7471uYa.b(account, "account");
        if (!((Boolean) c(account).getResult()).booleanValue()) {
            throw new C3251sI();
        }
    }

    public C4928GKa<Account> a() {
        Account[] a2 = C5232QGa.a(this.b, c());
        if (a2.length == 1) {
            C4928GKa<Account> c2 = C4928GKa.c(a2[0]);
            C7471uYa.a((Object) c2, "Optional.of(accounts[0])");
            return c2;
        }
        C4928GKa<Account> a3 = C4928GKa.a();
        C7471uYa.a((Object) a3, "Optional.absent()");
        return a3;
    }

    public C3508cda a(Account account) {
        C7471uYa.b(account, "account");
        String userData = this.b.getUserData(account, b());
        if (userData != null) {
            C3508cda f = C3508cda.f(Long.parseLong(userData));
            C7471uYa.a((Object) f, "Urn.forUser(userData.toLong())");
            return f;
        }
        C3508cda cda = C3508cda.a;
        C7471uYa.a((Object) cda, "Urn.NOT_SET");
        return cda;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035  */
    public C4928GKa<Account> a(C3508cda cda, String str) {
        boolean z;
        C7471uYa.b(cda, "urn");
        C7471uYa.b(str, "permalink");
        C4928GKa<Account> a2 = a();
        if (a2.c()) {
            if (C7471uYa.a((Object) ((Account) a2.b()).name, (Object) str)) {
                z = true;
                if (!z) {
                    String c2 = c();
                    C4928GKa<Account> c3 = C4928GKa.c(new Account(str, c2));
                    C7471uYa.a((Object) c3, "Optional.of(Account(permalink, accountType))");
                    boolean addAccountExplicitly = this.b.addAccountExplicitly((Account) c3.b(), null, null);
                    if (!addAccountExplicitly) {
                        String str2 = "Failed to add account in first try.";
                        String str3 = "AccountOperations";
                        C7316sHa.a(6, str3, str2);
                        C7316sHa.d(new b(str2));
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("\n");
                        a2 = C4928GKa.c(new Account(sb.toString(), c2));
                        C7471uYa.a((Object) a2, "Optional.of(Account(perm…ink + \"\\n\", accountType))");
                        z = this.b.addAccountExplicitly((Account) a2.b(), null, null);
                        if (!z) {
                            String str4 = "Failed to add account in second try.";
                            C7316sHa.a(6, str3, str4);
                            C7316sHa.d(new b(str4));
                        }
                    } else {
                        a2 = c3;
                        z = addAccountExplicitly;
                    }
                }
                if (z) {
                    this.b.setUserData((Account) a2.b(), b(), Long.toString(cda.c()));
                }
                return a2;
            }
            Object b2 = a2.b();
            C7471uYa.a(b2, "account.get()");
            c((Account) b2);
        }
        z = false;
        if (!z) {
        }
        if (z) {
        }
        return a2;
    }
}
