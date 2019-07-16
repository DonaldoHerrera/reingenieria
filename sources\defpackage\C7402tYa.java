package defpackage;

/* renamed from: tYa reason: default package and case insensitive filesystem */
/* compiled from: FunctionReference */
public class C7402tYa extends C6988nYa implements C7333sYa, C7679xZa {
    private final int d;

    public C7402tYa(int i) {
        this.d = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (defpackage.C7471uYa.a(g(), r5.g()) != false) goto L_0x0052;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7402tYa) {
            C7402tYa tya = (C7402tYa) obj;
            if (h() != null ? h().equals(tya.h()) : tya.h() == null) {
                if (getName().equals(tya.getName())) {
                    if (j().equals(tya.j())) {
                    }
                }
            }
            z = false;
            return z;
        } else if (obj instanceof C7679xZa) {
            return obj.equals(e());
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public C7403tZa f() {
        return HYa.a(this);
    }

    public int getArity() {
        return this.d;
    }

    public int hashCode() {
        return (((h() == null ? 0 : h().hashCode() * 31) + getName().hashCode()) * 31) + j().hashCode();
    }

    public String toString() {
        String str;
        C7403tZa e = e();
        if (e != this) {
            return e.toString();
        }
        if ("<init>".equals(getName())) {
            str = "constructor (Kotlin reflection is not available)";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("function ");
            sb.append(getName());
            sb.append(" (Kotlin reflection is not available)");
            str = sb.toString();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public C7679xZa i() {
        return (C7679xZa) super.i();
    }

    public C7402tYa(int i, Object obj) {
        super(obj);
        this.d = i;
    }
}
