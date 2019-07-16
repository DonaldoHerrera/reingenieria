package com.soundcloud.android.collection;

/* renamed from: com.soundcloud.android.collection.n reason: case insensitive filesystem */
/* compiled from: AutoValue_CollectionItem_UpsellHeaderCollectionItem */
final class C2761n extends c {
    private final int a;

    C2761n(int i) {
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
        if (!(obj instanceof c)) {
            return false;
        }
        if (this.a != ((c) obj).c()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.a ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpsellHeaderCollectionItem{type=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
