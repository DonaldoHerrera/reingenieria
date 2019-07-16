package defpackage;

/* renamed from: SG reason: default package and case insensitive filesystem */
public enum C2275SG {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");
    
    private final String f;

    private C2275SG(String str) {
        this.f = str;
    }

    public String toString() {
        return this.f;
    }
}
