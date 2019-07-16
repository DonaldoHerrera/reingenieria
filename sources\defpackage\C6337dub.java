package defpackage;

import java.util.List;

/* renamed from: dub reason: default package and case insensitive filesystem */
/* compiled from: ErrorType.kt */
public final class C6337dub extends C6947mtb {
    private final String e;

    public C6337dub(String str, Ptb ptb, Eqb eqb, List<? extends Stb> list, boolean z) {
        C7471uYa.b(str, "presentableName");
        C7471uYa.b(ptb, "constructor");
        C7471uYa.b(eqb, "memberScope");
        C7471uYa.b(list, "arguments");
        super(ptb, eqb, list, z);
        this.e = str;
    }

    public final String Ca() {
        return this.e;
    }

    public Etb a(boolean z) {
        C6337dub dub = new C6337dub(this.e, za(), ha(), ya(), z);
        return dub;
    }
}
