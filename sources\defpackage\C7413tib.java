package defpackage;

/* renamed from: tib reason: default package and case insensitive filesystem */
/* compiled from: JavaTypeResolver.kt */
final class C7413tib extends C7540vYa implements PXa<Etb> {
    final /* synthetic */ C4905Fdb a;

    C7413tib(C4905Fdb fdb) {
        this.a = fdb;
        super(0);
    }

    public final Etb d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Can't compute erased upper bound of type parameter `");
        sb.append(this.a);
        sb.append('`');
        Etb c = C7154ptb.c(sb.toString());
        C7471uYa.a((Object) c, "ErrorUtils.createErrorTy… type parameter `$this`\")");
        return c;
    }
}
