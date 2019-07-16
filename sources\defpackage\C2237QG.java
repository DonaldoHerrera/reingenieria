package defpackage;

/* renamed from: QG reason: default package and case insensitive filesystem */
public enum C2237QG {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");
    
    String d;

    private C2237QG(String str) {
        this.d = str;
    }

    public String toString() {
        return this.d;
    }
}
