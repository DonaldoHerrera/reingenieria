package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* renamed from: NDb reason: default package */
/* compiled from: ZoneRules */
public abstract class NDb {

    /* renamed from: NDb$a */
    /* compiled from: ZoneRules */
    static final class a extends NDb implements Serializable {
        private final PBb a;

        a(PBb pBb) {
            this.a = pBb;
        }

        public KDb a(C7032oBb obb) {
            return null;
        }

        public PBb a(C6623iBb ibb) {
            return this.a;
        }

        public boolean a() {
            return true;
        }

        public List<PBb> b(C7032oBb obb) {
            return Collections.singletonList(this.a);
        }

        public boolean b(C6623iBb ibb) {
            return false;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            if (!(obj instanceof IDb)) {
                return false;
            }
            IDb iDb = (IDb) obj;
            if (!iDb.a() || !this.a.equals(iDb.a(C6623iBb.a))) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return ((((this.a.hashCode() + 31) ^ 1) ^ 1) ^ (this.a.hashCode() + 31)) ^ 1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FixedRules:");
            sb.append(this.a);
            return sb.toString();
        }

        public boolean a(C7032oBb obb, PBb pBb) {
            return this.a.equals(pBb);
        }
    }

    NDb() {
    }

    public static NDb a(PBb pBb) {
        C6355eDb.a(pBb, "offset");
        return new a(pBb);
    }

    public abstract KDb a(C7032oBb obb);

    public abstract PBb a(C6623iBb ibb);

    public abstract boolean a();

    public abstract boolean a(C7032oBb obb, PBb pBb);

    public abstract List<PBb> b(C7032oBb obb);

    public abstract boolean b(C6623iBb ibb);
}
