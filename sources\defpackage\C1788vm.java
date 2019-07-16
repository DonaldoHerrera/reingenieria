package defpackage;

/* renamed from: vm reason: default package and case insensitive filesystem */
/* compiled from: AuxEffectInfo */
public final class C1788vm {
    public final int a;
    public final float b;

    public C1788vm(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1788vm.class != obj.getClass()) {
            return false;
        }
        C1788vm vmVar = (C1788vm) obj;
        if (!(this.a == vmVar.a && Float.compare(vmVar.b, this.b) == 0)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((527 + this.a) * 31) + Float.floatToIntBits(this.b);
    }
}
