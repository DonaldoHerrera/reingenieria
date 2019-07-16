package com.google.firebase.components;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
final /* synthetic */ class k implements C2273SE {
    private final n a;
    private final e b;

    private k(n nVar, e eVar) {
        this.a = nVar;
        this.b = eVar;
    }

    public static C2273SE a(n nVar, e eVar) {
        return new k(nVar, eVar);
    }

    public Object get() {
        return this.b.b().create(new x(this.b, this.a));
    }
}
