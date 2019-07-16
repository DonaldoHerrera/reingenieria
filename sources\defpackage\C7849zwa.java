package defpackage;

/* renamed from: zwa reason: default package and case insensitive filesystem */
/* compiled from: SuggestionItemRenderer.kt */
public final class C7849zwa {
    private final C7366swa a;
    private final int b;

    public C7849zwa(C7366swa swa, int i) {
        C7471uYa.b(swa, "suggestionItem");
        this.a = swa;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final C7366swa b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7849zwa) {
                C7849zwa zwa = (C7849zwa) obj;
                if (C7471uYa.a((Object) this.a, (Object) zwa.a)) {
                    if (this.b == zwa.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C7366swa swa = this.a;
        return ((swa != null ? swa.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SuggestionItemClickData(suggestionItem=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
