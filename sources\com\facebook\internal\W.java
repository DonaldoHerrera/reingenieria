package com.facebook.internal;

import android.util.Log;
import com.facebook.B;
import com.facebook.O;
import java.util.HashMap;
import java.util.Map.Entry;

/* compiled from: Logger */
public class W {
    private static final HashMap<String, String> a = new HashMap<>();
    private final O b;
    private final String c;
    private StringBuilder d;
    private int e = 3;

    public W(O o, String str) {
        ja.a(str, "tag");
        this.b = o;
        StringBuilder sb = new StringBuilder();
        sb.append("FacebookSDK.");
        sb.append(str);
        this.c = sb.toString();
        this.d = new StringBuilder();
    }

    public static synchronized void a(String str, String str2) {
        synchronized (W.class) {
            a.put(str, str2);
        }
    }

    public static synchronized void c(String str) {
        synchronized (W.class) {
            if (!B.a(O.INCLUDE_ACCESS_TOKENS)) {
                a(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    private static synchronized String d(String str) {
        synchronized (W.class) {
            for (Entry entry : a.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    public void b(String str) {
        a(this.b, this.e, this.c, str);
    }

    private boolean b() {
        return B.a(this.b);
    }

    public static void a(O o, String str, String str2) {
        a(o, 3, str, str2);
    }

    public static void a(O o, String str, String str2, Object... objArr) {
        if (B.a(o)) {
            a(o, 3, str, String.format(str2, objArr));
        }
    }

    public static void a(O o, int i, String str, String str2, Object... objArr) {
        if (B.a(o)) {
            a(o, i, str, String.format(str2, objArr));
        }
    }

    public static void a(O o, int i, String str, String str2) {
        if (B.a(o)) {
            String d2 = d(str2);
            String str3 = "FacebookSDK.";
            if (!str.startsWith(str3)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                str = sb.toString();
            }
            Log.println(i, str, d2);
            if (o == O.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    public void a() {
        b(this.d.toString());
        this.d = new StringBuilder();
    }

    public void a(String str) {
        if (b()) {
            this.d.append(str);
        }
    }

    public void a(String str, Object... objArr) {
        if (b()) {
            this.d.append(String.format(str, objArr));
        }
    }

    public void a(String str, Object obj) {
        a("  %s:\t%s\n", str, obj);
    }
}
