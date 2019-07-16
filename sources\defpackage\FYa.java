package defpackage;

/* renamed from: FYa reason: default package */
/* compiled from: PropertyReference */
public abstract class FYa extends C6988nYa implements DZa {
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FYa) {
            FYa fYa = (FYa) obj;
            if (!h().equals(fYa.h()) || !getName().equals(fYa.getName()) || !j().equals(fYa.j()) || !C7471uYa.a(g(), fYa.g())) {
                z = false;
            }
            return z;
        } else if (obj instanceof DZa) {
            return obj.equals(e());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((h().hashCode() * 31) + getName().hashCode()) * 31) + j().hashCode();
    }

    public String toString() {
        C7403tZa e = e();
        if (e != this) {
            return e.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("property ");
        sb.append(getName());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public DZa i() {
        return (DZa) super.i();
    }
}
