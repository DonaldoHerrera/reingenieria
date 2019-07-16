package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.ha reason: case insensitive filesystem */
public class C0969ha {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
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

    private static void a(ContentResolver contentResolver) {
        if (f == null) {
            e.set(false);
            f = new HashMap<>();
            k = new Object();
            l = false;
            contentResolver.registerContentObserver(a, true, new C0962ga(null));
            return;
        }
        if (e.getAndSet(false)) {
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            k = new Object();
            l = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r13 = r13.query(a, null, null, new java.lang.String[]{r14}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r13 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0074, code lost:
        if (r13 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0076, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        if (r13.moveToFirst() != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0080, code lost:
        a(r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r15 == null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r15.equals(null) == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0096, code lost:
        a(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0099, code lost:
        if (r15 == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009c, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009d, code lost:
        if (r13 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009f, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a2, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a3, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a4, code lost:
        if (r13 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a6, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a9, code lost:
        throw r14;
     */
    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (C0969ha.class) {
            a(contentResolver);
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
        synchronized (C0969ha.class) {
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
