package defpackage;

import java.io.Serializable;

/* renamed from: vYa reason: default package and case insensitive filesystem */
/* compiled from: Lambda.kt */
public abstract class C7540vYa<R> implements C7333sYa<R>, Serializable {
    private final int arity;

    public C7540vYa(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String a = HYa.a(this);
        C7471uYa.a((Object) a, "Reflection.renderLambdaToString(this)");
        return a;
    }
}
