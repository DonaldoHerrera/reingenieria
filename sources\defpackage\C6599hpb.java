package defpackage;

/* renamed from: hpb reason: default package and case insensitive filesystem */
/* compiled from: ExternalOverridabilityCondition */
public interface C6599hpb {

    /* renamed from: hpb$a */
    /* compiled from: ExternalOverridabilityCondition */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* renamed from: hpb$b */
    /* compiled from: ExternalOverridabilityCondition */
    public enum b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    a a();

    b a(C4904Fcb fcb, C4904Fcb fcb2, C5029Jcb jcb);
}
