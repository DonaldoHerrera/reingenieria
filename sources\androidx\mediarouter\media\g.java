package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaRouteSelector */
public final class g {
    public static final g a = new g(new Bundle(), null);
    private final Bundle b;
    List<String> c;

    /* compiled from: MediaRouteSelector */
    public static final class a {
        private ArrayList<String> a;

        public a() {
        }

        public a a(String str) {
            if (str != null) {
                if (this.a == null) {
                    this.a = new ArrayList<>();
                }
                if (!this.a.contains(str)) {
                    this.a.add(str);
                }
                return this;
            }
            throw new IllegalArgumentException("category must not be null");
        }

        public a(g gVar) {
            if (gVar != null) {
                gVar.b();
                if (!gVar.c.isEmpty()) {
                    this.a = new ArrayList<>(gVar.c);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        public a a(Collection<String> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (String a2 : collection) {
                        a(a2);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("categories must not be null");
        }

        public a a(g gVar) {
            if (gVar != null) {
                a((Collection<String>) gVar.c());
                return this;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        public g a() {
            if (this.a == null) {
                return g.a;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.a);
            return new g(bundle, this.a);
        }
    }

    g(Bundle bundle, List<String> list) {
        this.b = bundle;
        this.c = list;
    }

    public boolean a(List<IntentFilter> list) {
        if (list != null) {
            b();
            int size = this.c.size();
            if (size != 0) {
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    IntentFilter intentFilter = (IntentFilter) list.get(i);
                    if (intentFilter != null) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (intentFilter.hasCategory((String) this.c.get(i2))) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        if (this.c == null) {
            this.c = this.b.getStringArrayList("controlCategories");
            List<String> list = this.c;
            if (list == null || list.isEmpty()) {
                this.c = Collections.emptyList();
            }
        }
    }

    public List<String> c() {
        b();
        return this.c;
    }

    public boolean d() {
        b();
        return this.c.isEmpty();
    }

    public boolean e() {
        b();
        return !this.c.contains(null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        b();
        gVar.b();
        return this.c.equals(gVar.c);
    }

    public int hashCode() {
        b();
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouteSelector{ ");
        sb.append("controlCategories=");
        sb.append(Arrays.toString(c().toArray()));
        sb.append(" }");
        return sb.toString();
    }

    public boolean a(g gVar) {
        if (gVar == null) {
            return false;
        }
        b();
        gVar.b();
        return this.c.containsAll(gVar.c);
    }

    public Bundle a() {
        return this.b;
    }

    public static g a(Bundle bundle) {
        if (bundle != null) {
            return new g(bundle, null);
        }
        return null;
    }
}
