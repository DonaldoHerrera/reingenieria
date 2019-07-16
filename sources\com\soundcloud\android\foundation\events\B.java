package com.soundcloud.android.foundation.events;

/* compiled from: QuerySourceInfo.kt */
public final class B {
    private final int a;
    private final C3508cda b;

    public B(int i, C3508cda cda) {
        C7471uYa.b(cda, "queryUrn");
        this.a = i;
        this.b = cda;
    }

    public final int a() {
        return this.a;
    }

    public final C3508cda b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof B) {
                B b2 = (B) obj;
                if (!(this.a == b2.a) || !C7471uYa.a((Object) this.b, (Object) b2.b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.a * 31;
        C3508cda cda = this.b;
        return i + (cda != null ? cda.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("QuerySourceInfo(queryPosition=");
        sb.append(this.a);
        sb.append(", queryUrn=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
