package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: yMa reason: default package and case insensitive filesystem */
/* compiled from: RamLruCache */
class C7735yMa<K, V> {
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public C7735yMa(int i) {
        if (i > 0) {
            this.c = i;
            this.a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int c(K k, V v) {
        int b2 = b(k, v);
        if (b2 >= 0) {
            return b2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(k);
        sb.append("=");
        sb.append(v);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public V a(K k) {
        return null;
    }

    public final V a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.d++;
            this.b += c(k, v);
            put = this.a.put(k, v);
            if (put != null) {
                this.b -= c(k, put);
            }
        }
        if (put != null) {
            a(false, k, put, v);
        }
        a(this.c);
        return put;
    }

    /* access modifiers changed from: protected */
    public void a(boolean z, K k, V v, V v2) {
    }

    /* access modifiers changed from: protected */
    public int b(K k, V v) {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.e++;
        r1 = r4.a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r1 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        r4.a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r4.b += c(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r1 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        a(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        a(r4.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        return r0;
     */
    public final V b(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.a.get(k);
                if (v != null) {
                    this.g++;
                    return v;
                }
                this.h++;
            }
        } else {
            throw new NullPointerException("key == null");
        }
    }

    public final synchronized String toString() {
        int i;
        i = this.g + this.h;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i != 0 ? (this.g * 100) / i : 0)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append(getClass().getName());
        r0.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045 A[Catch:{ NoSuchMethodException -> 0x003c, InvocationTargetException -> 0x0037, IllegalAccessException -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0043 A[SYNTHETIC] */
    public void a(int i) {
        Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this) {
                if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                    break;
                } else if (this.b > i) {
                    try {
                        entry = (Entry) this.a.getClass().getMethod("eldest", new Class[0]).invoke(this.a, new Object[0]);
                    } catch (NoSuchMethodException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
                        e3.printStackTrace();
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    }
                    if (entry == null) {
                        key = entry.getKey();
                        value = entry.getValue();
                        this.a.remove(key);
                        this.b -= c(key, value);
                        this.f++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            a(true, key, value, null);
        }
        entry = null;
        if (entry == null) {
        }
    }

    public final synchronized Map<K, V> b() {
        return new LinkedHashMap(this.a);
    }

    public final void a() {
        a(-1);
    }
}
