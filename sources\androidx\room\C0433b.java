package androidx.room;

/* renamed from: androidx.room.b reason: case insensitive filesystem */
/* compiled from: EntityDeletionOrUpdateAdapter */
public abstract class C0433b<T> extends C {
    public C0433b(t tVar) {
        super(tVar);
    }

    public final int a(T t) {
        Yd a = a();
        try {
            a(a, t);
            return a.v();
        } finally {
            a(a);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(Yd yd, T t);
}
