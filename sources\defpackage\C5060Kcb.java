package defpackage;

/* renamed from: Kcb reason: default package and case insensitive filesystem */
/* compiled from: ClassKind */
public enum C5060Kcb {
    CLASS,
    INTERFACE,
    ENUM_CLASS,
    ENUM_ENTRY,
    ANNOTATION_CLASS,
    OBJECT;

    public boolean a() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
