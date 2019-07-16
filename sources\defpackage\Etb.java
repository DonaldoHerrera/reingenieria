package defpackage;

/* renamed from: Etb reason: default package */
/* compiled from: KotlinType.kt */
public abstract class Etb extends C6405eub {
    public Etb() {
        super(null);
    }

    public abstract Etb a(C6723jeb jeb);

    public abstract Etb a(boolean z);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (C6315deb a : getAnnotations()) {
            C7852zxb.a(sb, "[", Cob.a(Cob.h, a, null, 2, null), "] ");
        }
        sb.append(za());
        if (!ya().isEmpty()) {
            C7676xWa.a(ya(), sb, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (Aa()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
