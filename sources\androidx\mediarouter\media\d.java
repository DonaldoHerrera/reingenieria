package androidx.mediarouter.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaRouteProviderDescriptor */
public final class d {
    final Bundle a;
    List<a> b;

    /* compiled from: MediaRouteProviderDescriptor */
    public static final class a {
        private final Bundle a;
        private ArrayList<a> b;

        public a() {
            this.a = new Bundle();
        }

        public a a(a aVar) {
            if (aVar != null) {
                ArrayList<a> arrayList = this.b;
                if (arrayList == null) {
                    this.b = new ArrayList<>();
                } else if (arrayList.contains(aVar)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                this.b.add(aVar);
                return this;
            }
            throw new IllegalArgumentException("route must not be null");
        }

        public a(d dVar) {
            if (dVar != null) {
                this.a = new Bundle(dVar.a);
                dVar.b();
                if (!dVar.b.isEmpty()) {
                    this.b = new ArrayList<>(dVar.b);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }

        /* access modifiers changed from: 0000 */
        public a a(Collection<a> collection) {
            if (collection == null || collection.isEmpty()) {
                this.b = null;
                this.a.remove("routes");
            } else {
                this.b = new ArrayList<>(collection);
            }
            return this;
        }

        public d a() {
            ArrayList<a> arrayList = this.b;
            if (arrayList != null) {
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList2.add(((a) this.b.get(i)).a());
                }
                this.a.putParcelableArrayList("routes", arrayList2);
            }
            return new d(this.a, this.b);
        }
    }

    d(Bundle bundle, List<a> list) {
        this.a = bundle;
        this.b = list;
    }

    public Bundle a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        if (this.b == null) {
            ArrayList parcelableArrayList = this.a.getParcelableArrayList("routes");
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                this.b = Collections.emptyList();
                return;
            }
            int size = parcelableArrayList.size();
            this.b = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                this.b.add(a.a((Bundle) parcelableArrayList.get(i)));
            }
        }
    }

    public List<a> c() {
        b();
        return this.b;
    }

    public boolean d() {
        b();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.b.get(i);
            if (aVar == null || !aVar.x()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouteProviderDescriptor{ ");
        sb.append("routes=");
        sb.append(Arrays.toString(c().toArray()));
        sb.append(", isValid=");
        sb.append(d());
        sb.append(" }");
        return sb.toString();
    }

    public static d a(Bundle bundle) {
        if (bundle != null) {
            return new d(bundle, null);
        }
        return null;
    }
}
