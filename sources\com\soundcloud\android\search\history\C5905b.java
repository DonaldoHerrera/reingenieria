package com.soundcloud.android.search.history;

/* renamed from: com.soundcloud.android.search.history.b reason: case insensitive filesystem */
/* compiled from: AutoValue_SearchHistoryDbModel */
final class C5905b extends p {
    private final String b;
    private final long c;

    C5905b(String str, long j) {
        if (str != null) {
            this.b = str;
            this.c = j;
            return;
        }
        throw new NullPointerException("Null search_term");
    }

    public long a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.b.equals(pVar.b()) || this.c != pVar.a()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        long j = this.c;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchHistoryDbModel{search_term=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
