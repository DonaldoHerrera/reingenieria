package com.soundcloud.android.features.record;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.soundcloud.android.features.record.Recording.a;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: RecordingStorage */
public class U {
    private final Ica a;
    private final C3669v b;

    U(Ica ica, C3669v vVar) {
        this.a = ica;
        this.b = vVar;
    }

    /* access modifiers changed from: 0000 */
    public APa<List<Recording>> a(Context context, File file) {
        return APa.a((CPa<T>) new C3663o<T>(this, context, file));
    }

    /* access modifiers changed from: 0000 */
    public C6979nPa b(Context context, File file) {
        return C6979nPa.a((C7186qPa) new C3664p(file, context));
    }

    private File b(File file, Uri uri, String str, ContentResolver contentResolver) throws IOException {
        InputStream openInputStream = contentResolver.openInputStream(uri);
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType == null) {
            extensionFromMimeType = "wav";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(".");
        sb.append(extensionFromMimeType);
        File file2 = new File(file, sb.toString());
        C6698jGa.a(openInputStream, file2);
        return file2;
    }

    public /* synthetic */ void a(Context context, File file, BPa bPa) throws Exception {
        bPa.a(a(context, file, (C3508cda) this.a.c().a(C3508cda.a)));
        bPa.onComplete();
    }

    public static boolean a(Context context, Recording recording) {
        boolean z;
        if (!recording.o || recording.c(context) || recording.d(context)) {
            z = C6630iGa.b(recording.k);
        } else {
            z = false;
        }
        C6630iGa.b(recording.f());
        C6630iGa.b(recording.d());
        C6630iGa.b(recording.b(context));
        return z;
    }

    static /* synthetic */ void a(File file, Context context, C7048oPa opa) throws Exception {
        for (File recording : C6630iGa.g(file)) {
            a(context, new Recording(recording));
        }
        opa.onComplete();
    }

    private List<Recording> a(Context context, File file, C3508cda cda) {
        HashMap hashMap = new HashMap();
        File[] a2 = C6630iGa.a(file, (FilenameFilter) new a());
        Arrays.sort(a2);
        for (File file2 : a2) {
            hashMap.put(C6630iGa.h(file2).getAbsolutePath(), file2);
        }
        ArrayList arrayList = new ArrayList();
        for (File file3 : hashMap.values()) {
            if (Recording.c(file3.getName())) {
                C6630iGa.b(file3);
            } else {
                Recording recording = new Recording(file3);
                recording.d = cda.c();
                recording.f = (long) this.b.a(file3);
                if (recording.f <= 0 || file3.getName().contains("_processed")) {
                    a(context, recording);
                } else {
                    arrayList.add(recording);
                }
            }
        }
        return arrayList;
    }

    public APa<Recording> a(File file, Uri uri, String str, ContentResolver contentResolver) {
        C3665q qVar = new C3665q(this, contentResolver, uri, file, str);
        return APa.a((CPa<T>) qVar);
    }

    public /* synthetic */ void a(ContentResolver contentResolver, Uri uri, File file, String str, BPa bPa) throws Exception {
        String str2;
        File a2 = a(contentResolver, uri);
        if (a2 == null || !a2.exists()) {
            try {
                a2 = b(file, uri, str, contentResolver);
                str2 = a(uri, contentResolver);
            } catch (IOException unused) {
                bPa.onComplete();
                return;
            }
        } else {
            str2 = a2.getName();
        }
        Recording recording = new Recording(a2);
        recording.o = true;
        recording.l = str2;
        recording.f = (long) this.b.a(a2);
        bPa.a(recording);
        bPa.onComplete();
    }

    private String a(Uri uri, ContentResolver contentResolver) {
        Cursor query;
        Throwable th;
        String str = "_display_name";
        try {
            query = contentResolver.query(uri, new String[]{str}, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndex(str));
                    if (string != null) {
                        if (query != null) {
                            query.close();
                        }
                        return string;
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (IllegalArgumentException | SecurityException unused) {
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        return uri.getLastPathSegment();
        throw th;
    }

    private File a(ContentResolver contentResolver, Uri uri) {
        Cursor query;
        Throwable th;
        Throwable th2;
        int i;
        if (uri == null) {
            return null;
        }
        if ("file".equals(uri.getScheme())) {
            return new File(uri.getPath());
        }
        if ("content".equals(uri.getScheme())) {
            String str = "_display_name";
            String str2 = "_data";
            try {
                query = contentResolver.query(uri, new String[]{str2, str}, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            if (uri.toString().startsWith("content://com.google.android.gallery3d")) {
                                i = query.getColumnIndex(str);
                            } else {
                                i = query.getColumnIndex(str2);
                            }
                            if (i != -1) {
                                String string = query.getString(i);
                                if (string != null) {
                                    File file = new File(string);
                                    if (query != null) {
                                        query.close();
                                    }
                                    return file;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        th2 = r12;
                        th = th4;
                    }
                }
                if (query != null) {
                    query.close();
                }
            } catch (IllegalArgumentException | SecurityException unused) {
            }
        }
        return null;
        if (query != null) {
            if (th2 != null) {
                try {
                    query.close();
                } catch (Throwable th5) {
                    th2.addSuppressed(th5);
                }
            } else {
                query.close();
            }
        }
        throw th;
        throw th;
    }
}
