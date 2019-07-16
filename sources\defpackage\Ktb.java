package defpackage;

import java.util.List;

/* renamed from: Ktb reason: default package */
/* compiled from: StarProjectionImpl.kt */
public final class Ktb extends Rtb {
    final /* synthetic */ List d;

    Ktb(List list) {
        this.d = list;
    }

    public Stb a(Ptb ptb) {
        C7471uYa.b(ptb, "key");
        if (!this.d.contains(ptb)) {
            return null;
        }
        C5122Mcb c = ptb.c();
        if (c != null) {
            return C5605aub.a((C4905Fdb) c);
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
    }
}
