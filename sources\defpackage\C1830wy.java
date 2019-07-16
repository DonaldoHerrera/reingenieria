package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: wy reason: default package and case insensitive filesystem */
public final class C1830wy extends Tt {
    @Yt("Accept")
    private List<String> accept;
    @Yt("Accept-Encoding")
    private List<String> acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    @Yt("Age")
    private List<Long> age;
    @Yt("WWW-Authenticate")
    private List<String> authenticate;
    @Yt("Authorization")
    private List<String> authorization;
    @Yt("Cache-Control")
    private List<String> cacheControl;
    @Yt("Content-Encoding")
    private List<String> contentEncoding;
    @Yt("Content-Length")
    private List<Long> contentLength;
    @Yt("Content-MD5")
    private List<String> contentMD5;
    @Yt("Content-Range")
    private List<String> contentRange;
    @Yt("Content-Type")
    private List<String> contentType;
    @Yt("Cookie")
    private List<String> cookie;
    @Yt("Date")
    private List<String> date;
    @Yt("ETag")
    private List<String> etag;
    @Yt("Expires")
    private List<String> expires;
    @Yt("If-Match")
    private List<String> ifMatch;
    @Yt("If-Modified-Since")
    private List<String> ifModifiedSince;
    @Yt("If-None-Match")
    private List<String> ifNoneMatch;
    @Yt("If-Range")
    private List<String> ifRange;
    @Yt("If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @Yt("Last-Modified")
    private List<String> lastModified;
    @Yt("Location")
    private List<String> location;
    @Yt("MIME-Version")
    private List<String> mimeVersion;
    @Yt("Range")
    private List<String> range;
    @Yt("Retry-After")
    private List<String> retryAfter;
    @Yt("User-Agent")
    private List<String> userAgent;

    public C1830wy() {
        super(EnumSet.of(c.IGNORE_CASE));
    }

    public final C1830wy a(String str) {
        this.authorization = b((T) null);
        return this;
    }

    public final C1830wy b(String str) {
        this.ifModifiedSince = b((T) null);
        return this;
    }

    public final C1830wy c(String str) {
        this.ifMatch = b((T) null);
        return this;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (C1830wy) super.clone();
    }

    public final C1830wy d(String str) {
        this.ifNoneMatch = b((T) str);
        return this;
    }

    public final C1830wy e(String str) {
        this.ifUnmodifiedSince = b((T) null);
        return this;
    }

    public final C1830wy f(String str) {
        this.ifRange = b((T) null);
        return this;
    }

    public final C1830wy g(String str) {
        this.userAgent = b((T) str);
        return this;
    }

    public final /* synthetic */ Tt i() {
        return (C1830wy) clone();
    }

    public final String k() {
        return (String) a(this.contentType);
    }

    public final String l() {
        return (String) a(this.location);
    }

    public final String m() {
        return (String) a(this.userAgent);
    }

    public final String n() {
        return (String) a(this.etag);
    }

    private static <T> List<T> b(T t) {
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    private static void a(Logger logger, StringBuilder sb, StringBuilder sb2, C1245dt dtVar, String str, Object obj, Writer writer) throws IOException {
        if (obj != null && !Ot.b(obj)) {
            String b = obj instanceof Enum ? Ut.a((Enum) obj).b() : obj.toString();
            String str2 = (("Authorization".equalsIgnoreCase(str) || "Cookie".equalsIgnoreCase(str)) && (logger == null || !logger.isLoggable(Level.ALL))) ? "<Not Logged>" : b;
            String str3 = ": ";
            if (sb != null) {
                sb.append(str);
                sb.append(str3);
                sb.append(str2);
                sb.append(C1339gu.a);
            }
            if (sb2 != null) {
                sb2.append(" -H '");
                sb2.append(str);
                sb2.append(str3);
                sb2.append(str2);
                sb2.append("'");
            }
            if (dtVar != null) {
                dtVar.a(str, b);
            }
            if (writer != null) {
                writer.write(str);
                writer.write(str3);
                writer.write(b);
                writer.write("\r\n");
            }
        }
    }

    static void a(C1830wy wyVar, StringBuilder sb, StringBuilder sb2, Logger logger, C1245dt dtVar) throws IOException {
        HashSet hashSet = new HashSet();
        for (Entry entry : wyVar.entrySet()) {
            String str = (String) entry.getKey();
            Object[] objArr = {str};
            if (hashSet.add(str)) {
                Object value = entry.getValue();
                if (value != null) {
                    Ut a = wyVar.j().a(str);
                    if (a != null) {
                        str = a.b();
                    }
                    Class cls = value.getClass();
                    if ((value instanceof Iterable) || cls.isArray()) {
                        for (Object a2 : C1431ju.a(value)) {
                            a(logger, sb, sb2, dtVar, str, a2, null);
                        }
                    } else {
                        a(logger, sb, sb2, dtVar, str, value, null);
                    }
                }
            } else {
                throw new IllegalArgumentException(Uu.a("multiple headers of the same name (headers are case insensitive): %s", objArr));
            }
        }
    }

    public final void a(C1215ct ctVar, StringBuilder sb) throws IOException {
        clear();
        C1920zy zyVar = new C1920zy(this, sb);
        int h = ctVar.h();
        for (int i = 0; i < h; i++) {
            String a = ctVar.a(i);
            String b = ctVar.b(i);
            List<Type> list = zyVar.d;
            Mt mt = zyVar.c;
            It it = zyVar.a;
            StringBuilder sb2 = zyVar.b;
            if (sb2 != null) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(b).length());
                sb3.append(a);
                sb3.append(": ");
                sb3.append(b);
                sb2.append(sb3.toString());
                sb2.append(C1339gu.a);
            }
            Ut a2 = mt.a(a);
            if (a2 != null) {
                Type a3 = Ot.a(list, a2.a());
                if (C1431ju.a(a3)) {
                    Class a4 = C1431ju.a(list, C1431ju.b(a3));
                    it.a(a2.d(), a4, a(a4, list, b));
                } else if (C1431ju.a(C1431ju.a(list, a3), Iterable.class)) {
                    Collection collection = (Collection) a2.a((Object) this);
                    if (collection == null) {
                        collection = Ot.b(a3);
                        a2.a((Object) this, (Object) collection);
                    }
                    collection.add(a(a3 == Object.class ? null : C1431ju.c(a3), list, b));
                } else {
                    a2.a((Object) this, a(a3, list, b));
                }
            } else {
                ArrayList arrayList = (ArrayList) get(a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    a(a, (Object) arrayList);
                }
                arrayList.add(b);
            }
        }
        zyVar.a.a();
    }

    private static <T> T a(List<T> list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    private static Object a(Type type, List<Type> list, String str) {
        return Ot.a(Ot.a(list, type), str);
    }

    public final /* synthetic */ Tt a(String str, Object obj) {
        super.a(str, obj);
        return this;
    }
}
