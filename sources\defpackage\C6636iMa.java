package defpackage;

import android.database.Cursor;
import java.util.List;

/* renamed from: iMa reason: default package and case insensitive filesystem */
/* compiled from: SqlBrite */
public final class C6636iMa {
    static final b a = new C6500gMa();
    static final FPa<c, c> b = new C6568hMa();
    final b c;
    final FPa<c, c> d;

    /* renamed from: iMa$a */
    /* compiled from: SqlBrite */
    public static final class a {
        private b a = C6636iMa.a;
        private FPa<c, c> b = C6636iMa.b;

        public C6636iMa a() {
            return new C6636iMa(this.a, this.b);
        }
    }

    /* renamed from: iMa$b */
    /* compiled from: SqlBrite */
    public interface b {
        void a(String str);
    }

    /* renamed from: iMa$c */
    /* compiled from: SqlBrite */
    public static abstract class c {
        public static <T> DPa<List<T>, c> a(C7118pQa<Cursor, T> pqa) {
            return new C6432fMa(pqa);
        }

        public abstract Cursor a();
    }

    C6636iMa(b bVar, FPa<c, c> fPa) {
        this.c = bVar;
        this.d = fPa;
    }

    public C5700cMa a(Vd vd, HPa hPa) {
        return new C5700cMa(vd, this.c, hPa, this.d);
    }
}
