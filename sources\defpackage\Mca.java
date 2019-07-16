package defpackage;

import com.soundcloud.android.foundation.events.C3708j;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;

/* renamed from: Mca reason: default package */
/* compiled from: ShareOptions.kt */
public final class Mca {
    private final boolean a;
    private final boolean b;
    private final String c;
    private final boolean d;
    private final String e;
    private final C3710l f;
    private final PromotedSourceInfo g;
    private final C3708j h;
    private final C3508cda i;

    public Mca(String str, boolean z, String str2, C3710l lVar, PromotedSourceInfo promotedSourceInfo, C3708j jVar, C3508cda cda) {
        C7471uYa.b(str, "permalinkUrl");
        C7471uYa.b(lVar, "eventContextMetadata");
        C7471uYa.b(jVar, "entityMetadata");
        C7471uYa.b(cda, "urn");
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = lVar;
        this.g = promotedSourceInfo;
        this.h = jVar;
        this.i = cda;
        this.a = this.i.J();
        this.b = this.i.x();
    }

    public final C3708j a() {
        return this.h;
    }

    public final C3710l b() {
        return this.f;
    }

    public final String c() {
        return this.c;
    }

    public final PromotedSourceInfo d() {
        return this.g;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Mca) {
                Mca mca = (Mca) obj;
                if (C7471uYa.a((Object) this.c, (Object) mca.c)) {
                    if (!(this.d == mca.d) || !C7471uYa.a((Object) this.e, (Object) mca.e) || !C7471uYa.a((Object) this.f, (Object) mca.f) || !C7471uYa.a((Object) this.g, (Object) mca.g) || !C7471uYa.a((Object) this.h, (Object) mca.h) || !C7471uYa.a((Object) this.i, (Object) mca.i)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C3508cda f() {
        return this.i;
    }

    public final boolean g() {
        return this.d;
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        String str = this.c;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        int i3 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.e;
        int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C3710l lVar = this.f;
        int hashCode3 = (hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        PromotedSourceInfo promotedSourceInfo = this.g;
        int hashCode4 = (hashCode3 + (promotedSourceInfo != null ? promotedSourceInfo.hashCode() : 0)) * 31;
        C3708j jVar = this.h;
        int hashCode5 = (hashCode4 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        C3508cda cda = this.i;
        if (cda != null) {
            i2 = cda.hashCode();
        }
        return hashCode5 + i2;
    }

    public final boolean i() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShareOptions(permalinkUrl=");
        sb.append(this.c);
        sb.append(", isPrivate=");
        sb.append(this.d);
        sb.append(", secretToken=");
        sb.append(this.e);
        sb.append(", eventContextMetadata=");
        sb.append(this.f);
        sb.append(", promotedSourceInfo=");
        sb.append(this.g);
        sb.append(", entityMetadata=");
        sb.append(this.h);
        sb.append(", urn=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Mca(String str, boolean z, String str2, C3710l lVar, PromotedSourceInfo promotedSourceInfo, C3708j jVar, C3508cda cda, int i2, C7264rYa rya) {
        this(str, z, str2, lVar, promotedSourceInfo, jVar, (i2 & 64) != 0 ? jVar.f() : cda);
    }
}
