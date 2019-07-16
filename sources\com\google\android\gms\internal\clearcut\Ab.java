package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class Ab {
    private static final Logger a = Logger.getLogger(Ab.class.getName());
    private static final Unsafe b = d();
    private static final Class<?> c = C0795u.b();
    private static final boolean d = c(Long.TYPE);
    private static final boolean e = c(Integer.TYPE);
    private static final d f;
    private static final boolean g = g();
    private static final boolean h = f();
    /* access modifiers changed from: private */
    public static final long i = ((long) a(byte[].class));
    private static final long j = ((long) a(boolean[].class));
    private static final long k = ((long) b(boolean[].class));
    private static final long l = ((long) a(int[].class));
    private static final long m = ((long) b(int[].class));
    private static final long n = ((long) a(long[].class));
    private static final long o = ((long) b(long[].class));
    private static final long p = ((long) a(float[].class));
    private static final long q = ((long) b(float[].class));
    private static final long r = ((long) a(double[].class));
    private static final long s = ((long) b(double[].class));
    private static final long t = ((long) a(Object[].class));
    private static final long u = ((long) b(Object[].class));
    private static final long v = b(h());
    private static final long w;
    /* access modifiers changed from: private */
    public static final boolean x = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        public final void a(Object obj, long j, byte b) {
            if (Ab.x) {
                Ab.c(obj, j, b);
            } else {
                Ab.d(obj, j, b);
            }
        }

        public final void a(Object obj, long j, double d) {
            a(obj, j, Double.doubleToLongBits(d));
        }

        public final void a(Object obj, long j, float f) {
            a(obj, j, Float.floatToIntBits(f));
        }

        public final void a(Object obj, long j, boolean z) {
            if (Ab.x) {
                Ab.d(obj, j, z);
            } else {
                Ab.e(obj, j, z);
            }
        }

        public final void a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }

        public final boolean c(Object obj, long j) {
            return Ab.x ? Ab.m(obj, j) : Ab.n(obj, j);
        }

        public final float d(Object obj, long j) {
            return Float.intBitsToFloat(a(obj, j));
        }

        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(b(obj, j));
        }

        public final byte f(Object obj, long j) {
            return Ab.x ? Ab.k(obj, j) : Ab.l(obj, j);
        }
    }

    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        public final void a(Object obj, long j, byte b) {
            if (Ab.x) {
                Ab.c(obj, j, b);
            } else {
                Ab.d(obj, j, b);
            }
        }

        public final void a(Object obj, long j, double d) {
            a(obj, j, Double.doubleToLongBits(d));
        }

        public final void a(Object obj, long j, float f) {
            a(obj, j, Float.floatToIntBits(f));
        }

        public final void a(Object obj, long j, boolean z) {
            if (Ab.x) {
                Ab.d(obj, j, z);
            } else {
                Ab.e(obj, j, z);
            }
        }

        public final void a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        public final boolean c(Object obj, long j) {
            return Ab.x ? Ab.m(obj, j) : Ab.n(obj, j);
        }

        public final float d(Object obj, long j) {
            return Float.intBitsToFloat(a(obj, j));
        }

        public final double e(Object obj, long j) {
            return Double.longBitsToDouble(b(obj, j));
        }

        public final byte f(Object obj, long j) {
            return Ab.x ? Ab.k(obj, j) : Ab.l(obj, j);
        }
    }

    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public final void a(long j, byte b) {
            this.a.putByte(j, b);
        }

        public final void a(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        public final void a(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        public final void a(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        public final void a(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        public final void a(byte[] bArr, long j, long j2, long j3) {
            this.a.copyMemory(bArr, Ab.i + j, null, j2, j3);
        }

        public final boolean c(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        public final float d(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        public final double e(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        public final byte f(Object obj, long j) {
            return this.a.getByte(obj, j);
        }
    }

    static abstract class d {
        Unsafe a;

        d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long a(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void a(long j, byte b);

        public abstract void a(Object obj, long j, byte b);

        public abstract void a(Object obj, long j, double d);

        public abstract void a(Object obj, long j, float f);

        public final void a(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void a(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void a(Object obj, long j, boolean z);

        public abstract void a(byte[] bArr, long j, long j2, long j3);

        public final long b(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public abstract boolean c(Object obj, long j);

        public abstract float d(Object obj, long j);

        public abstract double e(Object obj, long j);

        public abstract byte f(Object obj, long j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0105  */
    static {
        d dVar;
        Field a2;
        if (b != null) {
            if (!C0795u.a()) {
                dVar = new c(b);
            } else if (d) {
                dVar = new b(b);
            } else if (e) {
                dVar = new a(b);
            }
            f = dVar;
            a2 = a(String.class, "value");
            if (a2 == null || a2.getType() != char[].class) {
                a2 = null;
            }
            w = b(a2);
        }
        dVar = null;
        f = dVar;
        a2 = a(String.class, "value");
        a2 = null;
        w = b(a2);
    }

    private Ab() {
    }

    static byte a(byte[] bArr, long j2) {
        return f.f(bArr, i + j2);
    }

    private static int a(Class<?> cls) {
        if (h) {
            return f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static int a(Object obj, long j2) {
        return f.a(obj, j2);
    }

    static long a(Field field) {
        return f.a(field);
    }

    static long a(ByteBuffer byteBuffer) {
        return f.b(byteBuffer, v);
    }

    private static Field a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    static void a(long j2, byte b2) {
        f.a(j2, b2);
    }

    static void a(Object obj, long j2, double d2) {
        f.a(obj, j2, d2);
    }

    static void a(Object obj, long j2, float f2) {
        f.a(obj, j2, f2);
    }

    static void a(Object obj, long j2, int i2) {
        f.a(obj, j2, i2);
    }

    static void a(Object obj, long j2, long j3) {
        f.a(obj, j2, j3);
    }

    static void a(Object obj, long j2, Object obj2) {
        f.a.putObject(obj, j2, obj2);
    }

    static void a(Object obj, long j2, boolean z) {
        f.a(obj, j2, z);
    }

    static void a(byte[] bArr, long j2, byte b2) {
        f.a((Object) bArr, i + j2, b2);
    }

    static void a(byte[] bArr, long j2, long j3, long j4) {
        f.a(bArr, j2, j3, j4);
    }

    private static int b(Class<?> cls) {
        if (h) {
            return f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static long b(Object obj, long j2) {
        return f.b(obj, j2);
    }

    private static long b(Field field) {
        if (field != null) {
            d dVar = f;
            if (dVar != null) {
                return dVar.a(field);
            }
        }
        return -1;
    }

    static boolean b() {
        return h;
    }

    /* access modifiers changed from: private */
    public static void c(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = ((~((int) j2)) & 3) << 3;
        int i3 = (255 & b2) << i2;
        a(obj, j3, i3 | (a(obj, j3) & (~(255 << i2))));
    }

    static boolean c() {
        return g;
    }

    private static boolean c(Class<?> cls) {
        if (!C0795u.a()) {
            return false;
        }
        try {
            Class<?> cls2 = c;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean c(Object obj, long j2) {
        return f.c(obj, j2);
    }

    static float d(Object obj, long j2) {
        return f.d(obj, j2);
    }

    static Unsafe d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new Bb());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void d(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a(obj, j3) & (~(255 << i2))));
    }

    /* access modifiers changed from: private */
    public static void d(Object obj, long j2, boolean z) {
        c(obj, j2, z ? (byte) 1 : 0);
    }

    static double e(Object obj, long j2) {
        return f.e(obj, j2);
    }

    /* access modifiers changed from: private */
    public static void e(Object obj, long j2, boolean z) {
        d(obj, j2, z ? (byte) 1 : 0);
    }

    static Object f(Object obj, long j2) {
        return f.a.getObject(obj, j2);
    }

    private static boolean f() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (C0795u.a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean g() {
        String str = "copyMemory";
        String str2 = "getLong";
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod(str2, new Class[]{Object.class, Long.TYPE});
            if (h() == null) {
                return false;
            }
            if (C0795u.a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod(str2, new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod(str, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod(str, new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field h() {
        if (C0795u.a()) {
            Field a2 = a(Buffer.class, "effectiveDirectAddress");
            if (a2 != null) {
                return a2;
            }
        }
        Field a3 = a(Buffer.class, "address");
        if (a3 == null || a3.getType() != Long.TYPE) {
            return null;
        }
        return a3;
    }

    /* access modifiers changed from: private */
    public static byte k(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) (((~j2) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte l(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean m(Object obj, long j2) {
        return k(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean n(Object obj, long j2) {
        return l(obj, j2) != 0;
    }
}
