package defpackage;

import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

@EVa(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R6\u0010\u0005\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006j\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b`\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/PackagePartProvider;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "packageParts", "Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/HashMap;", "visitedModules", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "findPackageParts", "", "packageFqName", "getAnnotationsOnBinaryModule", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "moduleName", "registerModule", "", "EmptyEnumeration", "descriptors.runtime"}, mv = {1, 1, 15})
/* renamed from: Ebb reason: default package and case insensitive filesystem */
/* compiled from: RuntimePackagePartProvider.kt */
public final class C4872Ebb implements Jkb {
    private final HashSet<String> a = new HashSet<>();
    private final HashMap<String, LinkedHashSet<String>> b = new HashMap<>();
    private final ClassLoader c;

    /* renamed from: Ebb$a */
    /* compiled from: RuntimePackagePartProvider.kt */
    private static final class a implements Enumeration {
        public static final a a = new a();

        private a() {
        }

        public boolean hasMoreElements() {
            return false;
        }

        public Void nextElement() {
            throw new NoSuchElementException();
        }
    }

    public C4872Ebb(ClassLoader classLoader) {
        C7471uYa.b(classLoader, "classLoader");
        this.c = classLoader;
    }

    public synchronized List<String> a(String str) {
        List<String> q;
        C7471uYa.b(str, "packageFqName");
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b.get(str);
        q = linkedHashSet != null ? C7676xWa.q(linkedHashSet) : null;
        if (q == null) {
            q = C6918mWa.a();
        }
        return q;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = defpackage.C4872Ebb.a.a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
    public final synchronized void b(String str) {
        InputStream openStream;
        C7471uYa.b(str, "moduleName");
        if (this.a.add(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("META-INF/");
            sb.append(str);
            sb.append(".kotlin_module");
            String sb2 = sb.toString();
            Enumeration enumeration = this.c.getResources(sb2);
            C7471uYa.a((Object) enumeration, "resources");
            Iterator a2 = C7124pWa.a(enumeration);
            while (a2.hasNext()) {
                try {
                    openStream = ((URL) a2.next()).openStream();
                    if (openStream != null) {
                        for (Entry entry : Ikb.a(C7004nnb.c, AXa.a(openStream), sb2, defpackage.C6807krb.a.a, C4903Fbb.a).a().entrySet()) {
                            String str2 = (String) entry.getKey();
                            C7142pnb pnb = (C7142pnb) entry.getValue();
                            HashMap<String, LinkedHashSet<String>> hashMap = this.b;
                            Object obj = hashMap.get(str2);
                            if (obj == null) {
                                obj = new LinkedHashSet();
                                hashMap.put(str2, obj);
                            }
                            ((LinkedHashSet) obj).addAll(pnb.a());
                        }
                        RVa rVa = RVa.a;
                        BXa.a(openStream, null);
                    } else {
                        continue;
                    }
                } catch (UnsupportedOperationException e) {
                    throw e;
                } catch (Exception unused) {
                } catch (Throwable th) {
                    BXa.a(openStream, r2);
                    throw th;
                }
            }
            return;
        }
        return;
    }
}
