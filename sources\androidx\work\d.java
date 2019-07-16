package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ContentUriTriggers */
public final class d {
    private final Set<a> a = new HashSet();

    /* compiled from: ContentUriTriggers */
    public static final class a {
        private final Uri a;
        private final boolean b;

        a(Uri uri, boolean z) {
            this.a = uri;
            this.b = z;
        }

        public Uri a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b != aVar.b || !this.a.equals(aVar.a)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z) {
        this.a.add(new a(uri, z));
    }

    public int b() {
        return this.a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((d) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Set<a> a() {
        return this.a;
    }
}
