package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import androidx.core.content.a;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.y reason: case insensitive filesystem */
final class C2517y {
    private final SharedPreferences a;
    private final Context b;
    private final ba c;
    private final Map<String, aa> d;

    public C2517y(Context context) {
        this(context, new ba());
    }

    private static String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private final synchronized boolean c() {
        return this.a.getAll().isEmpty();
    }

    public final synchronized String a() {
        return this.a.getString("topic_operation_queue", "");
    }

    private C2517y(Context context, ba baVar) {
        String str = "FirebaseInstanceId";
        this.d = new T();
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.c = baVar;
        File file = new File(a.c(this.b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !c()) {
                    Log.i(str, "App restored, clearing state");
                    b();
                    FirebaseInstanceId.b().h();
                }
            } catch (IOException e) {
                if (Log.isLoggable(str, 3)) {
                    String str2 = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
    }

    public final synchronized void a(String str) {
        this.a.edit().putString("topic_operation_queue", str).apply();
    }

    public final synchronized void b() {
        this.d.clear();
        ba.a(this.b);
        this.a.edit().clear().commit();
    }

    public final synchronized void c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        Editor edit = this.a.edit();
        for (String str2 : this.a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    public final synchronized B a(String str, String str2, String str3) {
        return B.a(this.a.getString(b(str, str2, str3), null));
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String a2 = B.a(str4, str5, System.currentTimeMillis());
        if (a2 != null) {
            Editor edit = this.a.edit();
            edit.putString(b(str, str2, str3), a2);
            edit.commit();
        }
    }

    public final synchronized aa b(String str) {
        aa aaVar;
        aa aaVar2 = (aa) this.d.get(str);
        if (aaVar2 != null) {
            return aaVar2;
        }
        try {
            aaVar = this.c.a(this.b, str);
        } catch (C2497d unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.b().h();
            aaVar = this.c.b(this.b, str);
        }
        this.d.put(str, aaVar);
        return aaVar;
    }
}
