package com.soundcloud.android.features.record;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.List;

/* compiled from: RecordingOperations */
public class S {
    private final U a;

    S(U u) {
        this.a = u;
    }

    /* access modifiers changed from: 0000 */
    public APa<List<Recording>> a(Context context, File file) {
        return this.a.a(context, file).b(C6645iVa.b());
    }

    /* access modifiers changed from: 0000 */
    public C6979nPa b(Context context, File file) {
        return this.a.b(context, file).b(C6645iVa.b());
    }

    public APa<Recording> a(File file, Uri uri, String str, ContentResolver contentResolver) {
        return this.a.a(file, uri, str, contentResolver).b(C6645iVa.b());
    }
}
