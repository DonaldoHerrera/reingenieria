package com.soundcloud.android.comments;

import android.os.Bundle;
import java.io.Serializable;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 (2\u00020\u0001:\u0002()B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/soundcloud/android/comments/CommentActionsSheetParams;", "", "commentUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "userUrn", "trackUrn", "username", "", "timestamp", "", "canDeleteComment", "", "reportOptions", "Lcom/soundcloud/android/comments/CommentActionsSheetParams$ReportOptions;", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;JZLcom/soundcloud/android/comments/CommentActionsSheetParams$ReportOptions;)V", "getCanDeleteComment", "()Z", "getCommentUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getReportOptions", "()Lcom/soundcloud/android/comments/CommentActionsSheetParams$ReportOptions;", "getTimestamp", "()J", "getTrackUrn", "getUserUrn", "getUsername", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "ReportOptions", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.comments.i reason: case insensitive filesystem */
/* compiled from: CommentActionsSheetParams.kt */
public final class C2890i {
    public static final a a = new a(null);
    private final C3508cda b;
    private final C3508cda c;
    private final C3508cda d;
    private final String e;
    private final long f;
    private final boolean g;
    private final b h;

    /* renamed from: com.soundcloud.android.comments.i$a */
    /* compiled from: CommentActionsSheetParams.kt */
    public static final class a {
        private a() {
        }

        public final C2890i a(C3508cda cda, C3508cda cda2, String str, long j, C3508cda cda3, C3508cda cda4, C3508cda cda5) {
            C3508cda cda6 = cda2;
            C3508cda cda7 = cda3;
            C3508cda cda8 = cda4;
            C3508cda cda9 = cda;
            C7471uYa.b(cda, "commentUrn");
            C7471uYa.b(cda2, "commentUserUrn");
            String str2 = str;
            C7471uYa.b(str, "username");
            C7471uYa.b(cda7, "loggedInUser");
            C7471uYa.b(cda8, "trackCreatorUrn");
            C7471uYa.b(cda5, "trackUrn");
            C2890i iVar = new C2890i(cda, cda2, cda5, str, j, C7471uYa.a((Object) cda7, (Object) cda2) || C7471uYa.a((Object) cda3, (Object) cda4), a(cda7, cda8, cda2));
            return iVar;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        private final b a(C3508cda cda, C3508cda cda2, C3508cda cda3) {
            if (C7471uYa.a((Object) cda2, (Object) cda) && (!C7471uYa.a((Object) cda, (Object) cda3))) {
                return b.REPORT_AND_DELETE;
            }
            if (!C7471uYa.a((Object) cda, (Object) cda3)) {
                return b.REPORT_ONLY;
            }
            if (C7471uYa.a((Object) cda, (Object) cda3)) {
                return b.NO_REPORT;
            }
            return b.NO_REPORT;
        }

        public final Bundle a(C2890i iVar) {
            C7471uYa.b(iVar, "commentActionsSheetParams");
            Bundle bundle = new Bundle();
            C5526_Ha.b(bundle, "ARG_URN_COMMENT", iVar.b());
            C5526_Ha.b(bundle, "ARG_URN_USER", iVar.f());
            C5526_Ha.b(bundle, "ARG_URN_TRACK", iVar.e());
            bundle.putString("ARG_USERNAME", iVar.g());
            bundle.putLong("ARG_COMMENT_TIMESTAMP", iVar.d());
            bundle.putBoolean("ARG_CAN_DELETE_COMMENT", iVar.a());
            bundle.putSerializable("ARG_REPORT_OPTIONS", iVar.c());
            return bundle;
        }

        public final C2890i a(Bundle bundle) {
            C7471uYa.b(bundle, "bundle");
            C3508cda b = C5526_Ha.b(bundle, "ARG_URN_USER");
            String str = "Required value was null.";
            if (b != null) {
                C3508cda b2 = C5526_Ha.b(bundle, "ARG_URN_COMMENT");
                if (b2 != null) {
                    C3508cda b3 = C5526_Ha.b(bundle, "ARG_URN_TRACK");
                    if (b3 != null) {
                        long j = bundle.getLong("ARG_COMMENT_TIMESTAMP");
                        String string = bundle.getString("ARG_USERNAME");
                        if (string != null) {
                            boolean z = bundle.getBoolean("ARG_CAN_DELETE_COMMENT");
                            Serializable serializable = bundle.getSerializable("ARG_REPORT_OPTIONS");
                            if (serializable != null) {
                                if (!(serializable instanceof b)) {
                                    serializable = null;
                                }
                                b bVar = (b) serializable;
                                if (bVar == null) {
                                    bVar = b.NO_REPORT;
                                }
                                C2890i iVar = new C2890i(b2, b, b3, string, j, z, bVar);
                                return iVar;
                            }
                            throw new IllegalArgumentException(str);
                        }
                        throw new IllegalArgumentException(str);
                    }
                    throw new IllegalArgumentException(str);
                }
                throw new IllegalArgumentException(str);
            }
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: com.soundcloud.android.comments.i$b */
    /* compiled from: CommentActionsSheetParams.kt */
    public enum b {
        REPORT_AND_DELETE,
        REPORT_ONLY,
        NO_REPORT
    }

    public C2890i(C3508cda cda, C3508cda cda2, C3508cda cda3, String str, long j, boolean z, b bVar) {
        C7471uYa.b(cda, "commentUrn");
        C7471uYa.b(cda2, "userUrn");
        C7471uYa.b(cda3, "trackUrn");
        C7471uYa.b(str, "username");
        C7471uYa.b(bVar, "reportOptions");
        this.b = cda;
        this.c = cda2;
        this.d = cda3;
        this.e = str;
        this.f = j;
        this.g = z;
        this.h = bVar;
    }

    public final boolean a() {
        return this.g;
    }

    public final C3508cda b() {
        return this.b;
    }

    public final b c() {
        return this.h;
    }

    public final long d() {
        return this.f;
    }

    public final C3508cda e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2890i) {
                C2890i iVar = (C2890i) obj;
                if (C7471uYa.a((Object) this.b, (Object) iVar.b) && C7471uYa.a((Object) this.c, (Object) iVar.c) && C7471uYa.a((Object) this.d, (Object) iVar.d) && C7471uYa.a((Object) this.e, (Object) iVar.e)) {
                    if (this.f == iVar.f) {
                        if (!(this.g == iVar.g) || !C7471uYa.a((Object) this.h, (Object) iVar.h)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C3508cda f() {
        return this.c;
    }

    public final String g() {
        return this.e;
    }

    public int hashCode() {
        C3508cda cda = this.b;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        C3508cda cda2 = this.c;
        int hashCode2 = (hashCode + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        C3508cda cda3 = this.d;
        int hashCode3 = (hashCode2 + (cda3 != null ? cda3.hashCode() : 0)) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        long j = this.f;
        int i2 = (hashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.g;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        b bVar = this.h;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CommentActionsSheetParams(commentUrn=");
        sb.append(this.b);
        sb.append(", userUrn=");
        sb.append(this.c);
        sb.append(", trackUrn=");
        sb.append(this.d);
        sb.append(", username=");
        sb.append(this.e);
        sb.append(", timestamp=");
        sb.append(this.f);
        sb.append(", canDeleteComment=");
        sb.append(this.g);
        sb.append(", reportOptions=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
