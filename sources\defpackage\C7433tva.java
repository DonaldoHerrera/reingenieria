package defpackage;

/* renamed from: tva reason: default package and case insensitive filesystem */
/* compiled from: AutocompletionItemRenderer.kt */
public final class C7433tva {
    private final a a;
    private final int b;

    public C7433tva(a aVar, int i) {
        C7471uYa.b(aVar, "autocompletionItem");
        this.a = aVar;
        this.b = i;
    }

    public final a a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7433tva) {
                C7433tva tva = (C7433tva) obj;
                if (C7471uYa.a((Object) this.a, (Object) tva.a)) {
                    if (this.b == tva.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        a aVar = this.a;
        return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AutoCompletionClickData(autocompletionItem=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
