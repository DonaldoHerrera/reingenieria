package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* renamed from: vwb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaValueParameter.kt */
public final class C7574vwb extends C6817kwb implements C5656bjb {
    private final C7436twb a;
    private final Annotation[] b;
    private final String c;
    private final boolean d;

    public C7574vwb(C7436twb twb, Annotation[] annotationArr, String str, boolean z) {
        C7471uYa.b(twb, C1325gg.TYPE);
        C7471uYa.b(annotationArr, "reflectAnnotations");
        this.a = twb;
        this.b = annotationArr;
        this.c = str;
        this.d = z;
    }

    public boolean G() {
        return this.d;
    }

    public boolean c() {
        return false;
    }

    public C7694xnb getName() {
        String str = this.c;
        if (str != null) {
            return C7694xnb.a(str);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C7574vwb.class.getName());
        String str = ": ";
        sb.append(str);
        sb.append(G() ? "vararg " : "");
        sb.append(getName());
        sb.append(str);
        sb.append(getType());
        return sb.toString();
    }

    public Svb a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return Wvb.a(this.b, snb);
    }

    public List<Svb> getAnnotations() {
        return Wvb.a(this.b);
    }

    public C7436twb getType() {
        return this.a;
    }
}
