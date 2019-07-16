package defpackage;

/* renamed from: tXa reason: default package and case insensitive filesystem */
/* compiled from: ContinuationImpl.kt */
public abstract class C7401tXa extends C7332sXa implements C7333sYa<Object>, C7470uXa {
    private final int b;

    public C7401tXa(int i, C5575aXa<Object> axa) {
        super(axa);
        this.b = i;
    }

    public int getArity() {
        return this.b;
    }

    public String toString() {
        if (a() != null) {
            return super.toString();
        }
        String a = HYa.a((C7333sYa) this);
        C7471uYa.a((Object) a, "Reflection.renderLambdaToString(this)");
        return a;
    }
}
