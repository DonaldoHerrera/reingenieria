package com.soundcloud.android.features.record;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;

/* renamed from: com.soundcloud.android.features.record.q reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C3665q implements CPa {
    private final /* synthetic */ U a;
    private final /* synthetic */ ContentResolver b;
    private final /* synthetic */ Uri c;
    private final /* synthetic */ File d;
    private final /* synthetic */ String e;

    public /* synthetic */ C3665q(U u, ContentResolver contentResolver, Uri uri, File file, String str) {
        this.a = u;
        this.b = contentResolver;
        this.c = uri;
        this.d = file;
        this.e = str;
    }

    public final void a(BPa bPa) {
        this.a.a(this.b, this.c, this.d, this.e, bPa);
    }
}
