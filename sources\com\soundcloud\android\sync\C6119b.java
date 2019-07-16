package com.soundcloud.android.sync;

import android.accounts.Account;
import android.content.ContentResolver;
import android.os.Bundle;

/* renamed from: com.soundcloud.android.sync.b reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C6119b implements C7118pQa {
    public static final /* synthetic */ C6119b a = new C6119b();

    private /* synthetic */ C6119b() {
    }

    public final Object apply(Object obj) {
        return ContentResolver.requestSync((Account) obj, "com.soundcloud.android.provider.ScContentProvider", new Bundle());
    }
}
