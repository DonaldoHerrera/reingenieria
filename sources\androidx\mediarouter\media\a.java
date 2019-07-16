package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: MediaRouteDescriptor */
public final class a {
    final Bundle a;
    List<IntentFilter> b;

    /* renamed from: androidx.mediarouter.media.a$a reason: collision with other inner class name */
    /* compiled from: MediaRouteDescriptor */
    public static final class C0016a {
        private final Bundle a;
        private ArrayList<String> b;
        private ArrayList<IntentFilter> c;

        public C0016a(String str, String str2) {
            this.a = new Bundle();
            b(str);
            c(str2);
        }

        public C0016a a(String str) {
            this.a.putString("status", str);
            return this;
        }

        public C0016a b(String str) {
            this.a.putString("id", str);
            return this;
        }

        public C0016a c(String str) {
            this.a.putString("name", str);
            return this;
        }

        public C0016a d(int i) {
            this.a.putInt("presentationDisplayId", i);
            return this;
        }

        public C0016a e(int i) {
            this.a.putInt("volume", i);
            return this;
        }

        public C0016a f(int i) {
            this.a.putInt("volumeHandling", i);
            return this;
        }

        public C0016a g(int i) {
            this.a.putInt("volumeMax", i);
            return this;
        }

        @Deprecated
        public C0016a a(boolean z) {
            this.a.putBoolean("connecting", z);
            return this;
        }

        public C0016a b(boolean z) {
            this.a.putBoolean("enabled", z);
            return this;
        }

        public C0016a c(int i) {
            this.a.putInt("playbackType", i);
            return this;
        }

        public C0016a a(IntentFilter intentFilter) {
            if (intentFilter != null) {
                if (this.c == null) {
                    this.c = new ArrayList<>();
                }
                if (!this.c.contains(intentFilter)) {
                    this.c.add(intentFilter);
                }
                return this;
            }
            throw new IllegalArgumentException("filter must not be null");
        }

        public C0016a b(int i) {
            this.a.putInt("playbackStream", i);
            return this;
        }

        public C0016a(a aVar) {
            if (aVar != null) {
                this.a = new Bundle(aVar.a);
                aVar.c();
                if (!aVar.b.isEmpty()) {
                    this.c = new ArrayList<>(aVar.b);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }

        public C0016a a(Collection<IntentFilter> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (IntentFilter a2 : collection) {
                        a(a2);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("filters must not be null");
        }

        public C0016a a(int i) {
            this.a.putInt("deviceType", i);
            return this;
        }

        public a a() {
            ArrayList<IntentFilter> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayList("controlFilters", arrayList);
            }
            ArrayList<String> arrayList2 = this.b;
            if (arrayList2 != null) {
                this.a.putStringArrayList("groupMemberIds", arrayList2);
            }
            return new a(this.a, this.c);
        }
    }

    a(Bundle bundle, List<IntentFilter> list) {
        this.a = bundle;
        this.b = list;
    }

    public Bundle a() {
        return this.a;
    }

    public boolean b() {
        return this.a.getBoolean("canDisconnect", false);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        if (this.b == null) {
            this.b = this.a.getParcelableArrayList("controlFilters");
            if (this.b == null) {
                this.b = Collections.emptyList();
            }
        }
    }

    public int d() {
        return this.a.getInt("connectionState", 0);
    }

    public List<IntentFilter> e() {
        c();
        return this.b;
    }

    public String f() {
        return this.a.getString("status");
    }

    public int g() {
        return this.a.getInt("deviceType");
    }

    public Bundle h() {
        return this.a.getBundle("extras");
    }

    public List<String> i() {
        return this.a.getStringArrayList("groupMemberIds");
    }

    public Uri j() {
        String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public String k() {
        return this.a.getString("id");
    }

    public int l() {
        return this.a.getInt("maxClientVersion", BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public int m() {
        return this.a.getInt("minClientVersion", 1);
    }

    public String n() {
        return this.a.getString("name");
    }

    public int o() {
        return this.a.getInt("playbackStream", -1);
    }

    public int p() {
        return this.a.getInt("playbackType", 1);
    }

    public int q() {
        return this.a.getInt("presentationDisplayId", -1);
    }

    public IntentSender r() {
        return (IntentSender) this.a.getParcelable("settingsIntent");
    }

    public int s() {
        return this.a.getInt("volume");
    }

    public int t() {
        return this.a.getInt("volumeHandling", 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouteDescriptor{ ");
        sb.append("id=");
        sb.append(k());
        sb.append(", groupMemberIds=");
        sb.append(i());
        sb.append(", name=");
        sb.append(n());
        sb.append(", description=");
        sb.append(f());
        sb.append(", iconUri=");
        sb.append(j());
        sb.append(", isEnabled=");
        sb.append(w());
        sb.append(", isConnecting=");
        sb.append(v());
        sb.append(", connectionState=");
        sb.append(d());
        sb.append(", controlFilters=");
        sb.append(Arrays.toString(e().toArray()));
        sb.append(", playbackType=");
        sb.append(p());
        sb.append(", playbackStream=");
        sb.append(o());
        sb.append(", deviceType=");
        sb.append(g());
        sb.append(", volume=");
        sb.append(s());
        sb.append(", volumeMax=");
        sb.append(u());
        sb.append(", volumeHandling=");
        sb.append(t());
        sb.append(", presentationDisplayId=");
        sb.append(q());
        sb.append(", extras=");
        sb.append(h());
        sb.append(", isValid=");
        sb.append(x());
        sb.append(", minClientVersion=");
        sb.append(m());
        sb.append(", maxClientVersion=");
        sb.append(l());
        sb.append(" }");
        return sb.toString();
    }

    public int u() {
        return this.a.getInt("volumeMax");
    }

    @Deprecated
    public boolean v() {
        return this.a.getBoolean("connecting", false);
    }

    public boolean w() {
        return this.a.getBoolean("enabled", true);
    }

    public boolean x() {
        c();
        return !TextUtils.isEmpty(k()) && !TextUtils.isEmpty(n()) && !this.b.contains(null);
    }

    public static a a(Bundle bundle) {
        if (bundle != null) {
            return new a(bundle, null);
        }
        return null;
    }
}
