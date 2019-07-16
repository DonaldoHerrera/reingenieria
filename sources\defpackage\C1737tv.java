package defpackage;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: tv reason: default package and case insensitive filesystem */
public final class C1737tv {
    private static final Map<String, C1737tv> a = new HashMap();
    private final Context b;
    private final String c;

    private C1737tv(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    public final synchronized Void a(C1432jv jvVar) throws IOException {
        Throwable th;
        FileOutputStream openFileOutput = this.b.openFileOutput(this.c, 0);
        try {
            openFileOutput.write(jvVar.toString().getBytes("UTF-8"));
            if (openFileOutput != null) {
                a((Throwable) null, openFileOutput);
            }
        } catch (Throwable th2) {
            if (openFileOutput != null) {
                a(th, openFileOutput);
            }
            throw th2;
        }
        return null;
    }

    public final synchronized C1432jv b() throws IOException {
        FileInputStream openFileInput;
        Throwable th;
        Throwable th2;
        C1432jv a2;
        try {
            openFileInput = this.b.openFileInput(this.c);
            try {
                byte[] bArr = new byte[openFileInput.available()];
                openFileInput.read(bArr, 0, bArr.length);
                a2 = C1432jv.a(new JSONObject(new String(bArr, "UTF-8")));
                if (openFileInput != null) {
                    a((Throwable) null, openFileInput);
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th = r2;
                th2 = th4;
            }
        } catch (FileNotFoundException | JSONException unused) {
            return null;
        }
        return a2;
        if (openFileInput != null) {
            a(th, openFileInput);
        }
        throw th2;
    }

    public final synchronized Void c() {
        this.b.deleteFile(this.c);
        return null;
    }

    public static synchronized C1737tv a(Context context, String str) {
        C1737tv tvVar;
        synchronized (C1737tv.class) {
            if (!a.containsKey(str)) {
                a.put(str, new C1737tv(context, str));
            }
            tvVar = (C1737tv) a.get(str);
        }
        return tvVar;
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return this.c;
    }

    private static /* synthetic */ void a(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                Xu.a(th, th2);
            }
        } else {
            fileOutputStream.close();
        }
    }

    private static /* synthetic */ void a(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                Xu.a(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }
}
