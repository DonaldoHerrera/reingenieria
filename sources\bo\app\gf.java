package bo.app;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class gf implements gd {
    private final LinkedHashMap<String, Bitmap> a;
    private final int b;
    private int c;

    public gf(int i) {
        if (i > 0) {
            this.b = i;
            this.a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Bitmap a(String str) {
        Bitmap bitmap;
        if (str != null) {
            synchronized (this) {
                bitmap = (Bitmap) this.a.get(str);
            }
            return bitmap;
        }
        throw new NullPointerException("key == null");
    }

    public final Bitmap b(String str) {
        Bitmap bitmap;
        if (str != null) {
            synchronized (this) {
                bitmap = (Bitmap) this.a.remove(str);
                if (bitmap != null) {
                    this.c -= b(str, bitmap);
                }
            }
            return bitmap;
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", new Object[]{Integer.valueOf(this.b)});
    }

    public final boolean a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.c += b(str, bitmap);
            Bitmap bitmap2 = (Bitmap) this.a.put(str, bitmap);
            if (bitmap2 != null) {
                this.c -= b(str, bitmap2);
            }
        }
        a(this.b);
        return true;
    }

    private int b(String str, Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    private void a(int i) {
        while (true) {
            synchronized (this) {
                if (this.c < 0 || (this.a.isEmpty() && this.c != 0)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getClass().getName());
                    sb.append(".sizeOf() is reporting inconsistent results!");
                } else if (this.c <= i) {
                    break;
                } else if (this.a.isEmpty()) {
                    break;
                } else {
                    Entry entry = (Entry) this.a.entrySet().iterator().next();
                    if (entry != null) {
                        String str = (String) entry.getKey();
                        Bitmap bitmap = (Bitmap) entry.getValue();
                        this.a.remove(str);
                        this.c -= b(str, bitmap);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.a.keySet());
        }
        return hashSet;
    }
}
