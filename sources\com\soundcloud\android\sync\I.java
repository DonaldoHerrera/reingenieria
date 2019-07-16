package com.soundcloud.android.sync;

import android.accounts.Account;
import android.content.ContentResolver;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/soundcloud/android/sync/SyncConfig;", "", "()V", "enableSyncing", "", "account", "Landroid/accounts/Account;", "isSyncingEnabled", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: SyncConfig.kt */
public final class I {
    private static final long a = TimeUnit.HOURS.toSeconds(1);
    public static final a b = new a(null);

    /* compiled from: SyncConfig.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public final void a(Account account) {
        C7471uYa.b(account, "account");
        String str = "com.soundcloud.android.provider.ScContentProvider";
        ContentResolver.setIsSyncable(account, str, 1);
        ContentResolver.setSyncAutomatically(account, str, true);
        ContentResolver.addPeriodicSync(account, str, new Bundle(), a);
    }

    public final boolean b(Account account) {
        C7471uYa.b(account, "account");
        return ContentResolver.getIsSyncable(account, "com.soundcloud.android.provider.ScContentProvider") > 0;
    }
}
