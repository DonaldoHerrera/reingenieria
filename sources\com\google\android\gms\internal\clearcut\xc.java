package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class xc {
    private static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
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

    public static long a(ContentResolver contentResolver, String str, long j2) {
        Object b2 = b(contentResolver);
        long j3 = 0;
        Long l2 = (Long) a(i, str, (T) Long.valueOf(0));
        if (l2 != null) {
            return l2.longValue();
        }
        String a2 = a(contentResolver, str, (String) null);
        if (a2 != null) {
            try {
                long parseLong = Long.parseLong(a2);
                l2 = Long.valueOf(parseLong);
                j3 = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        a(b2, i, str, l2);
        return j3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return r2;
     */
    private static <T> T a(HashMap<String, T> hashMap, String str, T t) {
        synchronized (xc.class) {
            if (!hashMap.containsKey(str)) {
                return null;
            }
            T t2 = hashMap.get(str);
            if (t2 == null) {
                t2 = t;
            }
        }
    }

    /* JADX INFO: finally extract failed */
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
        if (r13 == null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        if (r13.moveToFirst() != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r15 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
        if (r15.equals(null) == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        a(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (r15 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008f, code lost:
        if (r13 == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        a(r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0098, code lost:
        if (r13 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009a, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009e, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x009f, code lost:
        if (r13 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a1, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a4, code lost:
        throw r14;
     */
    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (xc.class) {
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

    private static void a(ContentResolver contentResolver) {
        if (f == null) {
            e.set(false);
            f = new HashMap<>();
            k = new Object();
            l = false;
            contentResolver.registerContentObserver(a, true, new yc(null));
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

    private static void a(Object obj, String str, String str2) {
        synchronized (xc.class) {
            if (obj == k) {
                f.put(str, str2);
            }
        }
    }

    private static <T> void a(Object obj, HashMap<String, T> hashMap, String str, T t) {
        synchronized (xc.class) {
            if (obj == k) {
                hashMap.put(str, t);
                f.remove(str);
            }
        }
    }

    public static boolean a(ContentResolver contentResolver, String str, boolean z) {
        Object b2 = b(contentResolver);
        Boolean bool = (Boolean) a(g, str, (T) Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String a2 = a(contentResolver, str, (String) null);
        if (a2 != null && !a2.equals("")) {
            if (c.matcher(a2).matches()) {
                bool = Boolean.valueOf(true);
                z = true;
            } else if (d.matcher(a2).matches()) {
                bool = Boolean.valueOf(false);
                z = false;
            } else {
                StringBuilder sb = new StringBuilder("attempt to read gservices key ");
                sb.append(str);
                sb.append(" (value \"");
                sb.append(a2);
                sb.append("\") as boolean");
                Log.w("Gservices", sb.toString());
            }
        }
        a(b2, g, str, bool);
        return z;
    }

    private static Object b(ContentResolver contentResolver) {
        Object obj;
        synchronized (xc.class) {
            a(contentResolver);
            obj = k;
        }
        return obj;
    }
}
