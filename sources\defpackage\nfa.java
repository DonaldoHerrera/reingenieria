package defpackage;

/* renamed from: nfa reason: default package */
/* compiled from: StringPart */
public final class nfa extends lfa {
    private final String c;

    public nfa(String str, String str2) {
        super(str, "text/plain; charset=UTF-8");
        this.c = str2;
    }

    public static nfa a(String str, String str2) {
        return new nfa(str, str2);
    }

    public String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof nfa)) {
            return false;
        }
        nfa nfa = (nfa) obj;
        if (C4804CKa.a(this.c, nfa.c) && C4804CKa.a(this.a, nfa.a) && C4804CKa.a(this.b, nfa.b)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return C4804CKa.a(this.c, this.a, this.b);
    }

    public String toString() {
        return C4804CKa.a((Object) this).a("partName", (Object) this.a).a("value", (Object) this.c).toString();
    }
}
