package defpackage;

import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.Stream;

@EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dBU\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\r\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0014\u0010\t\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012\u0001\u0002\u001e\u001f¨\u0006 "}, d2 = {"Lcom/soundcloud/android/playback/core/event/PlayerError;", "", "associatedItem", "Lcom/soundcloud/android/playback/core/event/PlayerError$AssociatedItem;", "playerType", "", "playerVersion", "playerVariant", "category", "sourceFile", "line", "", "message", "cdn", "(Lcom/soundcloud/android/playback/core/event/PlayerError$AssociatedItem;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAssociatedItem", "()Lcom/soundcloud/android/playback/core/event/PlayerError$AssociatedItem;", "getCategory", "()Ljava/lang/String;", "getCdn", "getLine", "()I", "getMessage", "getPlayerType", "getPlayerVariant", "getPlayerVersion", "getSourceFile", "AssociatedItem", "GenericError", "NetworkError", "Lcom/soundcloud/android/playback/core/event/PlayerError$NetworkError;", "Lcom/soundcloud/android/playback/core/event/PlayerError$GenericError;", "playback-core_release"}, mv = {1, 1, 15})
/* renamed from: Fla reason: default package */
/* compiled from: PlayerError.kt */
public abstract class Fla {
    private final a a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final int g;
    private final String h;
    private final String i;

    /* renamed from: Fla$a */
    /* compiled from: PlayerError.kt */
    public static final class a {
        private final PlaybackItem a;
        private final Stream b;

        public a(PlaybackItem playbackItem, Stream stream) {
            C7471uYa.b(playbackItem, "playbackItem");
            C7471uYa.b(stream, "stream");
            this.a = playbackItem;
            this.b = stream;
        }

        public final PlaybackItem a() {
            return this.a;
        }

        public final Stream b() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            PlaybackItem playbackItem = this.a;
            int i = 0;
            int hashCode = (playbackItem != null ? playbackItem.hashCode() : 0) * 31;
            Stream stream = this.b;
            if (stream != null) {
                i = stream.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AssociatedItem(playbackItem=");
            sb.append(this.a);
            sb.append(", stream=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: Fla$b */
    /* compiled from: PlayerError.kt */
    public static final class b extends Fla {
        private final a j;
        private final String k;
        private final String l;
        private final String m;
        private final String n;
        private final String o;
        private final int p;
        private final String q;
        private final String r;

        public b(a aVar, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7) {
            String str8 = str;
            String str9 = str4;
            String str10 = str5;
            String str11 = str6;
            String str12 = str7;
            C7471uYa.b(str8, "playerType");
            C7471uYa.b(str9, "category");
            C7471uYa.b(str10, "sourceFile");
            C7471uYa.b(str11, "message");
            C7471uYa.b(str12, "cdn");
            super(aVar, str, str2, str3, str4, str5, i, str6, str7, null);
            this.j = aVar;
            this.k = str8;
            this.l = str2;
            this.m = str3;
            this.n = str9;
            this.o = str10;
            this.p = i;
            this.q = str11;
            this.r = str7;
        }

        public a a() {
            return this.j;
        }

        public String b() {
            return this.n;
        }

        public String c() {
            return this.r;
        }

        public int d() {
            return this.p;
        }

        public String e() {
            return this.k;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) a(), (Object) bVar.a()) && C7471uYa.a((Object) e(), (Object) bVar.e()) && C7471uYa.a((Object) g(), (Object) bVar.g()) && C7471uYa.a((Object) f(), (Object) bVar.f()) && C7471uYa.a((Object) b(), (Object) bVar.b()) && C7471uYa.a((Object) h(), (Object) bVar.h())) {
                        if (!(d() == bVar.d()) || !C7471uYa.a((Object) i(), (Object) bVar.i()) || !C7471uYa.a((Object) c(), (Object) bVar.c())) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public String f() {
            return this.m;
        }

        public String g() {
            return this.l;
        }

        public String h() {
            return this.o;
        }

        public int hashCode() {
            a a = a();
            int i = 0;
            int hashCode = (a != null ? a.hashCode() : 0) * 31;
            String e = e();
            int hashCode2 = (hashCode + (e != null ? e.hashCode() : 0)) * 31;
            String g = g();
            int hashCode3 = (hashCode2 + (g != null ? g.hashCode() : 0)) * 31;
            String f = f();
            int hashCode4 = (hashCode3 + (f != null ? f.hashCode() : 0)) * 31;
            String b = b();
            int hashCode5 = (hashCode4 + (b != null ? b.hashCode() : 0)) * 31;
            String h = h();
            int hashCode6 = (((hashCode5 + (h != null ? h.hashCode() : 0)) * 31) + d()) * 31;
            String i2 = i();
            int hashCode7 = (hashCode6 + (i2 != null ? i2.hashCode() : 0)) * 31;
            String c = c();
            if (c != null) {
                i = c.hashCode();
            }
            return hashCode7 + i;
        }

        public String i() {
            return this.q;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("GenericError(associatedItem=");
            sb.append(a());
            sb.append(", playerType=");
            sb.append(e());
            sb.append(", playerVersion=");
            sb.append(g());
            sb.append(", playerVariant=");
            sb.append(f());
            sb.append(", category=");
            sb.append(b());
            sb.append(", sourceFile=");
            sb.append(h());
            sb.append(", line=");
            sb.append(d());
            sb.append(", message=");
            sb.append(i());
            sb.append(", cdn=");
            sb.append(c());
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: Fla$c */
    /* compiled from: PlayerError.kt */
    public static final class c extends Fla {
        private final a j;
        private final String k;
        private final String l;
        private final String m;
        private final String n;
        private final String o;
        private final int p;
        private final String q;
        private final String r;

        public c(a aVar, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7) {
            String str8 = str;
            String str9 = str4;
            String str10 = str5;
            String str11 = str6;
            String str12 = str7;
            C7471uYa.b(str8, "playerType");
            C7471uYa.b(str9, "category");
            C7471uYa.b(str10, "sourceFile");
            C7471uYa.b(str11, "message");
            C7471uYa.b(str12, "cdn");
            super(aVar, str, str2, str3, str4, str5, i, str6, str7, null);
            this.j = aVar;
            this.k = str8;
            this.l = str2;
            this.m = str3;
            this.n = str9;
            this.o = str10;
            this.p = i;
            this.q = str11;
            this.r = str7;
        }

        public a a() {
            return this.j;
        }

        public String b() {
            return this.n;
        }

        public String c() {
            return this.r;
        }

        public int d() {
            return this.p;
        }

        public String e() {
            return this.k;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) a(), (Object) cVar.a()) && C7471uYa.a((Object) e(), (Object) cVar.e()) && C7471uYa.a((Object) g(), (Object) cVar.g()) && C7471uYa.a((Object) f(), (Object) cVar.f()) && C7471uYa.a((Object) b(), (Object) cVar.b()) && C7471uYa.a((Object) h(), (Object) cVar.h())) {
                        if (!(d() == cVar.d()) || !C7471uYa.a((Object) i(), (Object) cVar.i()) || !C7471uYa.a((Object) c(), (Object) cVar.c())) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public String f() {
            return this.m;
        }

        public String g() {
            return this.l;
        }

        public String h() {
            return this.o;
        }

        public int hashCode() {
            a a = a();
            int i = 0;
            int hashCode = (a != null ? a.hashCode() : 0) * 31;
            String e = e();
            int hashCode2 = (hashCode + (e != null ? e.hashCode() : 0)) * 31;
            String g = g();
            int hashCode3 = (hashCode2 + (g != null ? g.hashCode() : 0)) * 31;
            String f = f();
            int hashCode4 = (hashCode3 + (f != null ? f.hashCode() : 0)) * 31;
            String b = b();
            int hashCode5 = (hashCode4 + (b != null ? b.hashCode() : 0)) * 31;
            String h = h();
            int hashCode6 = (((hashCode5 + (h != null ? h.hashCode() : 0)) * 31) + d()) * 31;
            String i2 = i();
            int hashCode7 = (hashCode6 + (i2 != null ? i2.hashCode() : 0)) * 31;
            String c = c();
            if (c != null) {
                i = c.hashCode();
            }
            return hashCode7 + i;
        }

        public String i() {
            return this.q;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NetworkError(associatedItem=");
            sb.append(a());
            sb.append(", playerType=");
            sb.append(e());
            sb.append(", playerVersion=");
            sb.append(g());
            sb.append(", playerVariant=");
            sb.append(f());
            sb.append(", category=");
            sb.append(b());
            sb.append(", sourceFile=");
            sb.append(h());
            sb.append(", line=");
            sb.append(d());
            sb.append(", message=");
            sb.append(i());
            sb.append(", cdn=");
            sb.append(c());
            sb.append(")");
            return sb.toString();
        }
    }

    private Fla(a aVar, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7) {
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i2;
        this.h = str6;
        this.i = str7;
    }

    public a a() {
        return this.a;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.i;
    }

    public int d() {
        return this.g;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.d;
    }

    public String g() {
        return this.c;
    }

    public String h() {
        return this.f;
    }

    public /* synthetic */ Fla(a aVar, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, C7264rYa rya) {
        this(aVar, str, str2, str3, str4, str5, i2, str6, str7);
    }
}
