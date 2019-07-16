package defpackage;

/* renamed from: bMa reason: default package and case insensitive filesystem */
/* compiled from: BriteDatabase */
class C5632bMa implements C6776kQa<Object> {
    final /* synthetic */ C5700cMa a;

    C5632bMa(C5700cMa cma) {
        this.a = cma;
    }

    public void accept(Object obj) throws Exception {
        if (this.a.d.get() != null) {
            throw new IllegalStateException("Cannot subscribe to observable query in a transaction.");
        }
    }
}
