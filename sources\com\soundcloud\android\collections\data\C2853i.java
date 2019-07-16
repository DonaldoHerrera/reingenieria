package com.soundcloud.android.collections.data;

import java.util.Date;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/soundcloud/android/collections/data/CollectionChange;", "", "action", "Lcom/soundcloud/android/collections/data/CollectionChange$Action;", "targetUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "updatedAt", "Ljava/util/Date;", "(Lcom/soundcloud/android/collections/data/CollectionChange$Action;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/util/Date;)V", "getAction", "()Lcom/soundcloud/android/collections/data/CollectionChange$Action;", "getTargetUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getUpdatedAt", "()Ljava/util/Date;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Action", "collections-data_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.collections.data.i reason: case insensitive filesystem */
/* compiled from: CollectionChange.kt */
public final class C2853i {
    private final a a;
    private final C3508cda b;
    private final Date c;

    /* renamed from: com.soundcloud.android.collections.data.i$a */
    /* compiled from: CollectionChange.kt */
    public enum a {
        ADD,
        REMOVE,
        UPDATE
    }

    public C2853i(a aVar, C3508cda cda, Date date) {
        C7471uYa.b(aVar, "action");
        C7471uYa.b(cda, "targetUrn");
        C7471uYa.b(date, "updatedAt");
        this.a = aVar;
        this.b = cda;
        this.c = date;
    }

    public final a a() {
        return this.a;
    }

    public final C3508cda b() {
        return this.b;
    }

    public final Date c() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2853i) {
                C2853i iVar = (C2853i) obj;
                if (C7471uYa.a((Object) this.a, (Object) iVar.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) iVar.b)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        a aVar = this.a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        C3508cda cda = this.b;
        int hashCode2 = (hashCode + (cda != null ? cda.hashCode() : 0)) * 31;
        Date date = this.c;
        if (date != null) {
            i = date.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollectionChange(action=");
        sb.append(this.a);
        sb.append(", targetUrn=");
        sb.append(this.b);
        sb.append(", updatedAt=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
