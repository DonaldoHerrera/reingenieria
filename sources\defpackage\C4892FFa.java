package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.ImagesContract;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/users/SocialMediaLinkItem;", "", "title", "Lcom/soundcloud/java/optional/Optional;", "", "network", "Lcom/soundcloud/android/users/Network;", "url", "(Lcom/soundcloud/java/optional/Optional;Lcom/soundcloud/android/users/Network;Ljava/lang/String;)V", "getNetwork", "()Lcom/soundcloud/android/users/Network;", "getTitle", "()Lcom/soundcloud/java/optional/Optional;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "displayName", "equals", "", "other", "hashCode", "", "icon", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "toString", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: FFa reason: default package and case insensitive filesystem */
/* compiled from: SocialMediaLinkItem.kt */
public class C4892FFa {
    public static final a a = new a(null);
    private final C4928GKa<String> b;
    private final C4861EFa c;
    private final String d;

    /* renamed from: FFa$a */
    /* compiled from: SocialMediaLinkItem.kt */
    public static final class a {
        private a() {
        }

        public final C4892FFa a(C1935AP ap) {
            C7471uYa.b(ap, "apiSocialMediaLink");
            C4928GKa b = ap.b();
            C7471uYa.a((Object) b, "apiSocialMediaLink.title()");
            String a = ap.a();
            C7471uYa.a((Object) a, "apiSocialMediaLink.network()");
            String c = ap.c();
            C7471uYa.a((Object) c, "apiSocialMediaLink.url()");
            return a(b, a, c);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final C4892FFa a(C4928GKa<String> gKa, String str, String str2) {
            C7471uYa.b(gKa, "title");
            C7471uYa.b(str, "network");
            C7471uYa.b(str2, ImagesContract.URL);
            C4861EFa a = C4861EFa.a(str);
            C7471uYa.a((Object) a, "Network.from(network)");
            return new C4892FFa(gKa, a, str2);
        }
    }

    public C4892FFa(C4928GKa<String> gKa, C4861EFa eFa, String str) {
        C7471uYa.b(gKa, "title");
        C7471uYa.b(eFa, "network");
        C7471uYa.b(str, ImagesContract.URL);
        this.b = gKa;
        this.c = eFa;
        this.d = str;
    }

    public String a() {
        Object d2 = c().a(b().a()).d(new C7162pxb("^https?://(?:www.)?").b(d(), ""));
        C7471uYa.a(d2, "title\n                .o…oRegex(), Strings.EMPTY))");
        return (String) d2;
    }

    public C4861EFa b() {
        return this.c;
    }

    public C4928GKa<String> c() {
        return this.b;
    }

    public String d() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) d(), (java.lang.Object) r3.d()) != false) goto L_0x0035;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4892FFa) {
                C4892FFa fFa = (C4892FFa) obj;
                if (C7471uYa.a((Object) c(), (Object) fFa.c())) {
                    if (C7471uYa.a((Object) b(), (Object) fFa.b())) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C4928GKa c2 = c();
        int i = 0;
        int hashCode = (c2 != null ? c2.hashCode() : 0) * 31;
        C4861EFa b2 = b();
        int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
        String d2 = d();
        if (d2 != null) {
            i = d2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SocialMediaLinkItem(title=");
        sb.append(c());
        sb.append(", network=");
        sb.append(b());
        sb.append(", url=");
        sb.append(d());
        sb.append(")");
        return sb.toString();
    }

    public Drawable a(Context context) {
        C7471uYa.b(context, "context");
        return androidx.core.content.a.c(context, b().b());
    }
}
