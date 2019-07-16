package com.soundcloud.android.collection;

/* renamed from: com.soundcloud.android.collection.l reason: case insensitive filesystem */
/* compiled from: AutoValue_CollectionItem_OnboardingCollectionItem */
final class C2757l extends a {
    private final int a;

    C2757l(int i) {
        this.a = i;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.a != ((a) obj).c()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.a ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OnboardingCollectionItem{type=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
