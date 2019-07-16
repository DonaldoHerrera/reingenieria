package androidx.room;

/* renamed from: androidx.room.c reason: case insensitive filesystem */
/* compiled from: EntityInsertionAdapter */
public abstract class C0434c<T> extends C {
    public C0434c(t tVar) {
        super(tVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a(Yd yd, T t);

    public final void a(T t) {
        Yd a = a();
        try {
            a(a, t);
            a.x();
        } finally {
            a(a);
        }
    }

    public final void a(Iterable<T> iterable) {
        Yd a = a();
        try {
            for (T a2 : iterable) {
                a(a, a2);
                a.x();
            }
        } finally {
            a(a);
        }
    }
}
