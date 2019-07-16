package defpackage;

/* renamed from: Bub reason: default package */
/* compiled from: utils.kt */
final class Bub extends C7540vYa implements _Xa<String, StringBuilder> {
    final /* synthetic */ StringBuilder a;

    Bub(StringBuilder sb) {
        this.a = sb;
        super(1);
    }

    /* renamed from: a */
    public final StringBuilder invoke(String str) {
        C7471uYa.b(str, "$this$unaryPlus");
        StringBuilder sb = this.a;
        sb.append(str);
        C7471uYa.a((Object) sb, "append(value)");
        C7783yxb.a(sb);
        return sb;
    }
}
