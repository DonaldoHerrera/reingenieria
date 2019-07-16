package com.google.android.gms.internal.firebase-perf;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class B {
    private static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    private static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* access modifiers changed from: private */
    public static final AtomicBoolean e = new AtomicBoolean();
    private static HashMap<String, String> f;
    private static final HashMap<String, Boolean> g = new HashMap<>();
    private static final HashMap<String, Integer> h = new HashMap<>();
    private static final HashMap<String, Long> i = new HashMap<>();
    private static final HashMap<String, Float> j = new HashMap<>();
    private static Object k;
    private static boolean l;
    private static String[] m = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        r10 = r10.query(a, null, null, new java.lang.String[]{r11}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bd, code lost:
        if (r10 != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bf, code lost:
        if (r10 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        if (r10.moveToFirst() != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cb, code lost:
        a(r0, r11, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r12 = r10.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d8, code lost:
        if (r12 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        if (r12.equals(null) == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e0, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e1, code lost:
        a(r0, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e4, code lost:
        if (r12 == null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e7, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e8, code lost:
        if (r10 == null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ea, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ed, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ee, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ef, code lost:
        if (r10 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f1, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f4, code lost:
        throw r11;
     */
    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (B.class) {
            if (f == null) {
                e.set(false);
                f = new HashMap<>();
                k = new Object();
                l = false;
                contentResolver.registerContentObserver(a, true, new C0825cb(null));
            } else if (e.getAndSet(false)) {
                f.clear();
                g.clear();
                h.clear();
                i.clear();
                j.clear();
                k = new Object();
                l = false;
            }
            Object obj = k;
            if (f.containsKey(str)) {
                String str3 = (String) f.get(str);
                if (str3 == null) {
                    str3 = null;
                }
            } else {
                String[] strArr = m;
                int length = strArr.length;
                int i2 = 0;
                while (i2 < length) {
                    if (!str.startsWith(strArr[i2])) {
                        i2++;
                    } else if (!l || f.isEmpty()) {
                        f.putAll(a(contentResolver, m));
                        l = true;
                        if (f.containsKey(str)) {
                            String str4 = (String) f.get(str);
                            if (str4 == null) {
                                str4 = null;
                            }
                        }
                    }
                }
            }
        }
    }

    private static void a(Object obj, String str, String str2) {
        synchronized (B.class) {
            if (obj == k) {
                f.put(str, str2);
            }
        }
    }

    private static Map<String, String> a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }
}
