package defpackage;

/* renamed from: feb reason: default package and case insensitive filesystem */
/* compiled from: AnnotationUseSiteTarget.kt */
public enum C6451feb {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    
    private final String k;

    private C6451feb(String str) {
        if (str == null) {
            String name = name();
            if (name != null) {
                str = name.toLowerCase();
                C7471uYa.a((Object) str, "(this as java.lang.String).toLowerCase()");
            } else {
                throw new OVa("null cannot be cast to non-null type java.lang.String");
            }
        }
        this.k = str;
    }

    public final String a() {
        return this.k;
    }
}
