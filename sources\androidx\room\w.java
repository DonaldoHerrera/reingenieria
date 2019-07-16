package androidx.room;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery */
public class w implements Xd, Wd {
    static final TreeMap<Integer, w> a = new TreeMap<>();
    private volatile String b;
    final long[] c;
    final double[] d;
    final String[] e;
    final byte[][] f;
    private final int[] g;
    final int h;
    int i;

    private w(int i2) {
        this.h = i2;
        int i3 = i2 + 1;
        this.g = new int[i3];
        this.c = new long[i3];
        this.d = new double[i3];
        this.e = new String[i3];
        this.f = new byte[i3][];
    }

    public static w a(String str, int i2) {
        synchronized (a) {
            Entry ceilingEntry = a.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                a.remove(ceilingEntry.getKey());
                w wVar = (w) ceilingEntry.getValue();
                wVar.b(str, i2);
                return wVar;
            }
            w wVar2 = new w(i2);
            wVar2.b(str, i2);
            return wVar2;
        }
    }

    private static void c() {
        if (a.size() > 15) {
            int size = a.size() - 10;
            Iterator it = a.descendingKeySet().iterator();
            while (true) {
                int i2 = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(String str, int i2) {
        this.b = str;
        this.i = i2;
    }

    public void close() {
    }

    public void b() {
        synchronized (a) {
            a.put(Integer.valueOf(this.h), this);
            c();
        }
    }

    public void c(int i2) {
        this.g[i2] = 1;
    }

    public String a() {
        return this.b;
    }

    public void a(Wd wd) {
        for (int i2 = 1; i2 <= this.i; i2++) {
            int i3 = this.g[i2];
            if (i3 == 1) {
                wd.c(i2);
            } else if (i3 == 2) {
                wd.a(i2, this.c[i2]);
            } else if (i3 == 3) {
                wd.a(i2, this.d[i2]);
            } else if (i3 == 4) {
                wd.a(i2, this.e[i2]);
            } else if (i3 == 5) {
                wd.a(i2, this.f[i2]);
            }
        }
    }

    public void a(int i2, long j) {
        this.g[i2] = 2;
        this.c[i2] = j;
    }

    public void a(int i2, double d2) {
        this.g[i2] = 3;
        this.d[i2] = d2;
    }

    public void a(int i2, String str) {
        this.g[i2] = 4;
        this.e[i2] = str;
    }

    public void a(int i2, byte[] bArr) {
        this.g[i2] = 5;
        this.f[i2] = bArr;
    }
}
