package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;

public class e {
    private static final String[] a = {AccountType.GOOGLE, "com.google.work", "cn.google"};
    @SuppressLint({"InlinedApi"})
    public static final String b = "callerUid";
    @SuppressLint({"InlinedApi"})
    public static final String c = "androidPackageName";
    private static final ComponentName d = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    /* access modifiers changed from: private */
    public static final Logger e = new Logger("Auth", "GoogleAuthUtil");

    @Deprecated
    public static String a(Context context, String str, String str2, Bundle bundle) throws IOException, d, a {
        return a(context, new Account(str, AccountType.GOOGLE), str2, bundle);
    }

    public static TokenData b(Context context, Account account, String str, Bundle bundle) throws IOException, d, a {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        Preconditions.checkNotEmpty(str, "Scope cannot be empty or null.");
        a(account);
        a(context, 8400000);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(c))) {
            bundle2.putString(c, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return (TokenData) a(context, d, new f(account, str, bundle2));
    }

    public static String a(Context context, Account account, String str, Bundle bundle) throws IOException, d, a {
        a(account);
        return b(context, account, str, bundle).i();
    }

    @Deprecated
    public static void a(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken(AccountType.GOOGLE, str);
    }

    private static void a(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (!TextUtils.isEmpty(account.name)) {
            String[] strArr = a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        } else {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
    }

    private static void a(Context context, int i) throws a {
        try {
            GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context.getApplicationContext(), i);
        } catch (GooglePlayServicesRepairableException e2) {
            throw new c(e2.getConnectionStatusCode(), e2.getMessage(), e2.getIntent());
        } catch (GooglePlayServicesNotAvailableException e3) {
            throw new a(e3.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public static <T> T b(T t) throws IOException {
        if (t != null) {
            return t;
        }
        e.w("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }

    private static <T> T a(Context context, ComponentName componentName, g<T> gVar) throws IOException, a {
        String str = "Error on service connection.";
        BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
        GmsClientSupervisor instance = GmsClientSupervisor.getInstance(context);
        String str2 = "GoogleAuthUtil";
        if (instance.bindService(componentName, (ServiceConnection) blockingServiceConnection, str2)) {
            try {
                T a2 = gVar.a(blockingServiceConnection.getService());
                instance.unbindService(componentName, (ServiceConnection) blockingServiceConnection, str2);
                return a2;
            } catch (RemoteException | InterruptedException e2) {
                e.i(str2, str, e2);
                throw new IOException(str, e2);
            } catch (Throwable th) {
                instance.unbindService(componentName, (ServiceConnection) blockingServiceConnection, str2);
                throw th;
            }
        } else {
            throw new IOException("Could not bind to service.");
        }
    }
}
