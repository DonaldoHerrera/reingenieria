package com.soundcloud.android.profile;

import android.os.Bundle;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/profile/UserParams;", "", "userUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "isLoggedInUser", "", "(Lcom/soundcloud/android/foundation/domain/Urn;Z)V", "()Z", "getUserUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.profile.jc reason: case insensitive filesystem */
/* compiled from: UserListFragment.kt */
public final class C5803jc {
    public static final a a = new a(null);
    private final C3508cda b;
    private final boolean c;

    /* renamed from: com.soundcloud.android.profile.jc$a */
    /* compiled from: UserListFragment.kt */
    public static final class a {
        private a() {
        }

        public final Bundle a(C3508cda cda, boolean z) {
            C7471uYa.b(cda, "userUrn");
            Bundle bundle = new Bundle();
            C5526_Ha.b(bundle, "user_urn_key", cda);
            bundle.putBoolean("is_current_user", z);
            return bundle;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final C5803jc a(Bundle bundle) {
            C7471uYa.b(bundle, "bundle");
            C3508cda b = C5526_Ha.b(bundle, "user_urn_key");
            if (b != null) {
                return new C5803jc(b, bundle.getBoolean("is_current_user"));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public C5803jc(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "userUrn");
        this.b = cda;
        this.c = z;
    }

    public final C3508cda a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5803jc) {
                C5803jc jcVar = (C5803jc) obj;
                if (C7471uYa.a((Object) this.b, (Object) jcVar.b)) {
                    if (this.c == jcVar.c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.b;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserParams(userUrn=");
        sb.append(this.b);
        sb.append(", isLoggedInUser=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
