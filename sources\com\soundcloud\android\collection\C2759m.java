package com.soundcloud.android.collection;

/* renamed from: com.soundcloud.android.collection.m reason: case insensitive filesystem */
/* compiled from: AutoValue_CollectionItem_UpsellCollectionItem */
final class C2759m extends b {
    private final int a;

    C2759m(int i) {
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
        if (!(obj instanceof b)) {
            return false;
        }
        if (this.a != ((b) obj).c()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.a ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpsellCollectionItem{type=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
