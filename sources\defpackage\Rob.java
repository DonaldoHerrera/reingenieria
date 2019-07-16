package defpackage;

/* renamed from: Rob reason: default package */
/* compiled from: Delegates.kt */
public final class Rob extends VYa<T> {
    final /* synthetic */ Object b;
    final /* synthetic */ Tob c;

    public Rob(Object obj, Object obj2, Tob tob) {
        this.b = obj;
        this.c = tob;
        super(obj2);
    }

    /* access modifiers changed from: protected */
    public boolean b(DZa<?> dZa, T t, T t2) {
        C7471uYa.b(dZa, "property");
        if (!this.c.X()) {
            return true;
        }
        throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
    }
}
