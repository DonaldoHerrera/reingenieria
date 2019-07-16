package com.soundcloud.android.comments;

@EVa(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0001\t¨\u0006\n"}, d2 = {"Lcom/soundcloud/android/comments/CommentViewModel;", "", "kind", "Lcom/soundcloud/android/comments/CommentViewModel$Kind;", "(Lcom/soundcloud/android/comments/CommentViewModel$Kind;)V", "getKind", "()Lcom/soundcloud/android/comments/CommentViewModel$Kind;", "CommentItem", "Kind", "Lcom/soundcloud/android/comments/CommentViewModel$CommentItem;", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.comments.y reason: case insensitive filesystem */
/* compiled from: CommentViewModel.kt */
public abstract class C2921y {
    private final b a;

    /* renamed from: com.soundcloud.android.comments.y$a */
    /* compiled from: CommentViewModel.kt */
    public static final class a extends C2921y {
        private final C3508cda b;
        private final String c;
        private final String d;
        private final String e;
        private final long f;
        private final long g;
        private final C3508cda h;
        private final C4928GKa<String> i;
        private final boolean j;
        private final boolean k;
        private final C2890i l;
        private final C2892j m;

        public a(C3508cda cda, String str, String str2, String str3, long j2, long j3, C3508cda cda2, C4928GKa<String> gKa, boolean z, boolean z2, C2890i iVar, C2892j jVar) {
            C3508cda cda3 = cda;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            C3508cda cda4 = cda2;
            C4928GKa<String> gKa2 = gKa;
            C2890i iVar2 = iVar;
            C2892j jVar2 = jVar;
            C7471uYa.b(cda, "urn");
            C7471uYa.b(str, "commentText");
            C7471uYa.b(str2, "username");
            C7471uYa.b(str3, "userPermalink");
            C7471uYa.b(cda4, "userUrn");
            C7471uYa.b(gKa2, "imageUrlTemplate");
            C7471uYa.b(iVar2, "commentActionsSheetParams");
            C7471uYa.b(jVar2, "commentAvatarParams");
            super(b.COMMENT, null);
            this.b = cda3;
            this.c = str4;
            this.d = str5;
            this.e = str6;
            this.f = j2;
            this.g = j3;
            this.h = cda4;
            this.i = gKa2;
            this.j = z;
            this.k = z2;
            this.l = iVar2;
            this.m = jVar2;
        }

        public final C2890i b() {
            return this.l;
        }

        public final C2892j c() {
            return this.m;
        }

        public final String d() {
            return this.c;
        }

        public final long e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.b, (Object) aVar.b) && C7471uYa.a((Object) this.c, (Object) aVar.c) && C7471uYa.a((Object) this.d, (Object) aVar.d) && C7471uYa.a((Object) this.e, (Object) aVar.e)) {
                        if (this.f == aVar.f) {
                            if ((this.g == aVar.g) && C7471uYa.a((Object) this.h, (Object) aVar.h) && C7471uYa.a((Object) this.i, (Object) aVar.i)) {
                                if (this.j == aVar.j) {
                                    if (!(this.k == aVar.k) || !C7471uYa.a((Object) this.l, (Object) aVar.l) || !C7471uYa.a((Object) this.m, (Object) aVar.m)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final C4928GKa<String> f() {
            return this.i;
        }

        public final long g() {
            return this.f;
        }

        public final C3508cda h() {
            return this.b;
        }

        public int hashCode() {
            C3508cda cda = this.b;
            int i2 = 0;
            int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.d;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.e;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            long j2 = this.f;
            int i3 = (hashCode4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.g;
            int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            C3508cda cda2 = this.h;
            int hashCode5 = (i4 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
            C4928GKa<String> gKa = this.i;
            int hashCode6 = (hashCode5 + (gKa != null ? gKa.hashCode() : 0)) * 31;
            boolean z = this.j;
            if (z) {
                z = true;
            }
            int i5 = (hashCode6 + (z ? 1 : 0)) * 31;
            boolean z2 = this.k;
            if (z2) {
                z2 = true;
            }
            int i6 = (i5 + (z2 ? 1 : 0)) * 31;
            C2890i iVar = this.l;
            int hashCode7 = (i6 + (iVar != null ? iVar.hashCode() : 0)) * 31;
            C2892j jVar = this.m;
            if (jVar != null) {
                i2 = jVar.hashCode();
            }
            return hashCode7 + i2;
        }

        public final String i() {
            return this.e;
        }

        public final C3508cda j() {
            return this.h;
        }

        public final String k() {
            return this.d;
        }

        public final boolean l() {
            return this.j;
        }

        public final boolean m() {
            return this.k;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CommentItem(urn=");
            sb.append(this.b);
            sb.append(", commentText=");
            sb.append(this.c);
            sb.append(", username=");
            sb.append(this.d);
            sb.append(", userPermalink=");
            sb.append(this.e);
            sb.append(", timestamp=");
            sb.append(this.f);
            sb.append(", createdAt=");
            sb.append(this.g);
            sb.append(", userUrn=");
            sb.append(this.h);
            sb.append(", imageUrlTemplate=");
            sb.append(this.i);
            sb.append(", isReply=");
            sb.append(this.j);
            sb.append(", isSelected=");
            sb.append(this.k);
            sb.append(", commentActionsSheetParams=");
            sb.append(this.l);
            sb.append(", commentAvatarParams=");
            sb.append(this.m);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.comments.y$b */
    /* compiled from: CommentViewModel.kt */
    public enum b {
        COMMENT
    }

    private C2921y(b bVar) {
        this.a = bVar;
    }

    public final b a() {
        return this.a;
    }

    public /* synthetic */ C2921y(b bVar, C7264rYa rya) {
        this(bVar);
    }
}
