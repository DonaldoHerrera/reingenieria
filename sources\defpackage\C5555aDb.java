package defpackage;

/* renamed from: aDb reason: default package and case insensitive filesystem */
/* compiled from: TextStyle */
public enum C5555aDb {
    FULL,
    FULL_STANDALONE,
    SHORT,
    SHORT_STANDALONE,
    NARROW,
    NARROW_STANDALONE;

    public C5555aDb a() {
        return values()[ordinal() & -2];
    }
}
