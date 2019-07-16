package defpackage;

import java.util.List;

/* renamed from: osb reason: default package and case insensitive filesystem */
/* compiled from: DeserializedMemberDescriptor.kt */
public interface C7083osb extends C5718cdb {

    /* renamed from: osb$a */
    /* compiled from: DeserializedMemberDescriptor.kt */
    public enum a {
        COMPATIBLE,
        NEEDS_WRAPPER,
        INCOMPATIBLE
    }

    /* renamed from: osb$b */
    /* compiled from: DeserializedMemberDescriptor.kt */
    public static final class b {
        public static List<Lmb> a(C7083osb osb) {
            return Lmb.a.a(osb.ma(), osb.ka(), osb.ja());
        }
    }

    Jmb ia();

    Mmb ja();

    Emb ka();

    C7014nsb la();

    Wnb ma();

    List<Lmb> na();
}
