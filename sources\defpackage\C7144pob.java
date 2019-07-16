package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: pob reason: default package and case insensitive filesystem */
/* compiled from: WireFormat */
public final class C7144pob {
    static final int a = a(1, 3);
    static final int b = a(1, 4);
    static final int c = a(2, 0);
    static final int d = a(3, 2);

    /* renamed from: pob$a */
    /* compiled from: WireFormat */
    public enum a {
        DOUBLE(b.DOUBLE, 1),
        FLOAT(b.FLOAT, 5),
        INT64(b.LONG, 0),
        UINT64(b.LONG, 0),
        INT32(b.INT, 0),
        FIXED64(b.LONG, 1),
        FIXED32(b.INT, 5),
        BOOL(b.BOOLEAN, 0),
        STRING(b.STRING, 2),
        GROUP(b.MESSAGE, 3),
        MESSAGE(b.MESSAGE, 2),
        BYTES(b.BYTE_STRING, 2),
        UINT32(b.INT, 0),
        ENUM(b.ENUM, 0),
        SFIXED32(b.INT, 5),
        SFIXED64(b.LONG, 1),
        SINT32(b.INT, 0),
        SINT64(b.LONG, 0);
        
        private final b t;
        private final int u;

        public b a() {
            return this.t;
        }

        public int b() {
            return this.u;
        }

        public boolean c() {
            return true;
        }

        private a(b bVar, int i) {
            this.t = bVar;
            this.u = i;
        }
    }

    /* renamed from: pob$b */
    /* compiled from: WireFormat */
    public enum b {
        INT(Integer.valueOf(0)),
        LONG(Long.valueOf(0)),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
        BOOLEAN(Boolean.valueOf(false)),
        STRING(""),
        BYTE_STRING(Fnb.a),
        ENUM(null),
        MESSAGE(null);
        
        private final Object k;

        private b(Object obj) {
            this.k = obj;
        }
    }

    public static int a(int i) {
        return i >>> 3;
    }

    static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    static int b(int i) {
        return i & 7;
    }
}
