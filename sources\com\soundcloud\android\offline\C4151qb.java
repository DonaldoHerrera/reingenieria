package com.soundcloud.android.offline;

import java.util.List;
import java.util.Set;

/* renamed from: com.soundcloud.android.offline.qb reason: case insensitive filesystem */
/* compiled from: AutoValue_OfflineContentUpdates */
final class C4151qb extends Id {
    private final List<C3508cda> a;
    private final List<C4146pc> b;
    private final List<C3508cda> c;
    private final List<C3508cda> d;
    private final Set<C3508cda> e;
    private final C4157rc f;
    private final List<C3508cda> g;

    /* renamed from: com.soundcloud.android.offline.qb$a */
    /* compiled from: AutoValue_OfflineContentUpdates */
    static final class a extends com.soundcloud.android.offline.Id.a {
        private List<C3508cda> a;
        private List<C4146pc> b;
        private List<C3508cda> c;
        private List<C3508cda> d;
        private Set<C3508cda> e;
        private C4157rc f;
        private List<C3508cda> g;

        a() {
        }

        public com.soundcloud.android.offline.Id.a a(Set<C3508cda> set) {
            if (set != null) {
                this.e = set;
                return this;
            }
            throw new NullPointerException("Null tracksToDelete");
        }

        public com.soundcloud.android.offline.Id.a b(List<C4146pc> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null tracksToDownload");
        }

        public com.soundcloud.android.offline.Id.a c(List<C3508cda> list) {
            if (list != null) {
                this.d = list;
                return this;
            }
            throw new NullPointerException("Null tracksToMarkForDeletion");
        }

        public com.soundcloud.android.offline.Id.a d(List<C3508cda> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null tracksToRestore");
        }

        public com.soundcloud.android.offline.Id.a e(List<C3508cda> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null unavailableTracks");
        }

        public com.soundcloud.android.offline.Id.a a(C4157rc rcVar) {
            if (rcVar != null) {
                this.f = rcVar;
                return this;
            }
            throw new NullPointerException("Null userExpectedOfflineContent");
        }

        public com.soundcloud.android.offline.Id.a a(List<C3508cda> list) {
            if (list != null) {
                this.g = list;
                return this;
            }
            throw new NullPointerException("Null newTracksToDownload");
        }

        public Id a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" unavailableTracks");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" tracksToDownload");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" tracksToRestore");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" tracksToMarkForDeletion");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" tracksToDelete");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" userExpectedOfflineContent");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" newTracksToDownload");
                str = sb7.toString();
            }
            if (str.isEmpty()) {
                C4151qb qbVar = new C4151qb(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
                return qbVar;
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Missing required properties:");
            sb8.append(str);
            throw new IllegalStateException(sb8.toString());
        }
    }

    public List<C3508cda> b() {
        return this.g;
    }

    public Set<C3508cda> d() {
        return this.e;
    }

    public List<C4146pc> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Id)) {
            return false;
        }
        Id id = (Id) obj;
        if (!this.a.equals(id.h()) || !this.b.equals(id.e()) || !this.c.equals(id.g()) || !this.d.equals(id.f()) || !this.e.equals(id.d()) || !this.f.equals(id.i()) || !this.g.equals(id.b())) {
            z = false;
        }
        return z;
    }

    public List<C3508cda> f() {
        return this.d;
    }

    public List<C3508cda> g() {
        return this.c;
    }

    public List<C3508cda> h() {
        return this.a;
    }

    public int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public C4157rc i() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OfflineContentUpdates{unavailableTracks=");
        sb.append(this.a);
        sb.append(", tracksToDownload=");
        sb.append(this.b);
        sb.append(", tracksToRestore=");
        sb.append(this.c);
        sb.append(", tracksToMarkForDeletion=");
        sb.append(this.d);
        sb.append(", tracksToDelete=");
        sb.append(this.e);
        sb.append(", userExpectedOfflineContent=");
        sb.append(this.f);
        sb.append(", newTracksToDownload=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }

    private C4151qb(List<C3508cda> list, List<C4146pc> list2, List<C3508cda> list3, List<C3508cda> list4, Set<C3508cda> set, C4157rc rcVar, List<C3508cda> list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = set;
        this.f = rcVar;
        this.g = list5;
    }
}
