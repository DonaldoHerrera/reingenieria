package com.soundcloud.android.comments;

import android.content.Intent;
import android.os.Bundle;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, d2 = {"Lcom/soundcloud/android/comments/CommentsParams;", "", "trackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "timestamp", "", "secretToken", "", "makeCommentOnLoad", "", "(Lcom/soundcloud/android/foundation/domain/Urn;JLjava/lang/String;Z)V", "getMakeCommentOnLoad", "()Z", "getSecretToken", "()Ljava/lang/String;", "getTimestamp", "()J", "getTrackUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toString", "writeToIntent", "Landroid/content/Intent;", "intent", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: CommentsParams.kt */
public class Y {
    public static final a a = new a(null);
    private final C3508cda b;
    private final long c;
    private final String d;
    private final boolean e;

    /* compiled from: CommentsParams.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final Y a(C3508cda cda, long j, String str) {
            C7471uYa.b(cda, "trackUrn");
            Y y = new Y(cda, j, str, true);
            return y;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final Y a(Bundle bundle) {
            C7471uYa.b(bundle, "bundle");
            C3508cda b = C5526_Ha.b(bundle, "urn");
            if (b != null) {
                Y y = new Y(b, bundle.getLong("timestamp"), bundle.getString("secret_token"), bundle.getBoolean("make_comment_on_load", false));
                return y;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public final Y a(Intent intent) {
            C7471uYa.b(intent, "intent");
            C3508cda a = C5526_Ha.a(intent, "urn");
            if (a != null) {
                Y y = new Y(a, intent.getLongExtra("timestamp", 0), intent.getStringExtra("secret_token"), intent.getBooleanExtra("make_comment_on_load", false));
                return y;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public Y(C3508cda cda) {
        this(cda, 0, null, false, 14, null);
    }

    public Y(C3508cda cda, long j, String str) {
        this(cda, j, str, false, 8, null);
    }

    public Y(C3508cda cda, long j, String str, boolean z) {
        C7471uYa.b(cda, "trackUrn");
        this.b = cda;
        this.c = j;
        this.d = str;
        this.e = z;
    }

    @NXa
    public static final Y a(C3508cda cda, long j, String str) {
        return a.a(cda, j, str);
    }

    public boolean a() {
        return this.e;
    }

    public String b() {
        return this.d;
    }

    public long c() {
        return this.c;
    }

    public C3508cda d() {
        return this.b;
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        C5526_Ha.b(bundle, "urn", d());
        bundle.putLong("timestamp", c());
        bundle.putString("secret_token", b());
        bundle.putBoolean("make_comment_on_load", a());
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Y) {
                Y y = (Y) obj;
                if (C7471uYa.a((Object) d(), (Object) y.d())) {
                    if ((c() == y.c()) && C7471uYa.a((Object) b(), (Object) y.b())) {
                        if (a() == y.a()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda d2 = d();
        int i = 0;
        int hashCode = (d2 != null ? d2.hashCode() : 0) * 31;
        long c2 = c();
        int i2 = (hashCode + ((int) (c2 ^ (c2 >>> 32)))) * 31;
        String b2 = b();
        if (b2 != null) {
            i = b2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean a2 = a();
        if (a2) {
            a2 = true;
        }
        return i3 + (a2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CommentsParams(trackUrn=");
        sb.append(d());
        sb.append(", timestamp=");
        sb.append(c());
        sb.append(", secretToken=");
        sb.append(b());
        sb.append(", makeCommentOnLoad=");
        sb.append(a());
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Y(C3508cda cda, long j, String str, boolean z, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            j = -1;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str = null;
        }
        this(cda, j2, str, (i & 8) != 0 ? false : z);
    }

    public Intent a(Intent intent) {
        C7471uYa.b(intent, "intent");
        C5526_Ha.b(intent, "urn", d());
        intent.putExtra("timestamp", c());
        intent.putExtra("secret_token", b());
        intent.putExtra("make_comment_on_load", a());
        return intent;
    }
}
