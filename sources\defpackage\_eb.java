package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: _eb reason: default package */
/* compiled from: FunctionDescriptorImpl */
public abstract class _eb extends Qeb implements C5582adb {
    private final defpackage.C4935Gcb.a A;
    private C5582adb B;
    protected Map<defpackage.C4904Fcb.a<?>, Object> C;
    private List<C4905Fdb> e;
    private List<C5061Kdb> f;
    private C7706xtb g;
    private C7615wdb h;
    /* access modifiers changed from: private */
    public C7615wdb i;
    private C6314ddb j;
    private C5583aeb k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private Collection<? extends C5582adb> x;
    private volatile PXa<Collection<C5582adb>> y;
    private final C5582adb z;

    /* renamed from: _eb$a */
    /* compiled from: FunctionDescriptorImpl */
    public class a implements defpackage.C5582adb.a<C5582adb> {
        protected Wtb a;
        protected C5272Rcb b;
        protected C6314ddb c;
        protected C5583aeb d;
        protected C5582adb e;
        protected defpackage.C4935Gcb.a f;
        protected List<C5061Kdb> g;
        protected C7615wdb h;
        protected C7615wdb i;
        protected C7706xtb j;
        protected C7694xnb k;
        protected boolean l;
        protected boolean m;
        protected boolean n;
        protected boolean o;
        /* access modifiers changed from: private */
        public boolean p;
        /* access modifiers changed from: private */
        public List<C4905Fdb> q;
        /* access modifiers changed from: private */
        public C6723jeb r;
        /* access modifiers changed from: private */
        public boolean s;
        /* access modifiers changed from: private */
        public Map<defpackage.C4904Fcb.a<?>, Object> t;
        /* access modifiers changed from: private */
        public Boolean u;
        protected boolean v;
        final /* synthetic */ _eb w;

        public a(_eb _eb, Wtb wtb, C5272Rcb rcb, C6314ddb ddb, C5583aeb aeb, defpackage.C4935Gcb.a aVar, List<C5061Kdb> list, C7615wdb wdb, C7706xtb xtb, C7694xnb xnb) {
            if (wtb == null) {
                a(0);
                throw null;
            } else if (rcb == null) {
                a(1);
                throw null;
            } else if (ddb == null) {
                a(2);
                throw null;
            } else if (aeb == null) {
                a(3);
                throw null;
            } else if (aVar == null) {
                a(4);
                throw null;
            } else if (list == null) {
                a(5);
                throw null;
            } else if (xtb != null) {
                this.w = _eb;
                this.e = null;
                this.i = this.w.i;
                this.l = true;
                this.m = false;
                this.n = false;
                this.o = false;
                this.p = this.w.v();
                this.q = null;
                this.r = null;
                this.s = this.w.w();
                this.t = new LinkedHashMap();
                this.u = null;
                this.v = false;
                this.a = wtb;
                this.b = rcb;
                this.c = ddb;
                this.d = aeb;
                this.f = aVar;
                this.g = list;
                this.h = wdb;
                this.j = xtb;
                this.k = xnb;
            } else {
                a(6);
                throw null;
            }
        }

        private static /* synthetic */ void a(int i2) {
            String str;
            int i3;
            Throwable th;
            switch (i2) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i2) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    i3 = 2;
                    break;
                default:
                    i3 = 3;
                    break;
            }
            Object[] objArr = new Object[i3];
            String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
            switch (i2) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 13:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newReturnType";
                    break;
                case 7:
                    objArr[0] = "owner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    objArr[0] = str2;
                    break;
                case 9:
                    objArr[0] = "modality";
                    break;
                case 11:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "name";
                    break;
                case 18:
                case 20:
                    objArr[0] = "parameters";
                    break;
                case 22:
                    objArr[0] = C1325gg.TYPE;
                    break;
                case 32:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 36:
                    objArr[0] = "userDataKey";
                    break;
                default:
                    objArr[0] = "substitution";
                    break;
            }
            String str3 = "putUserData";
            String str4 = "setSubstitution";
            String str5 = "setAdditionalAnnotations";
            String str6 = "setReturnType";
            String str7 = "setTypeParameters";
            String str8 = "setValueParameters";
            String str9 = "setName";
            String str10 = "setKind";
            String str11 = "setVisibility";
            String str12 = "setModality";
            String str13 = "setOwner";
            switch (i2) {
                case 8:
                    objArr[1] = str13;
                    break;
                case 10:
                    objArr[1] = str12;
                    break;
                case 12:
                    objArr[1] = str11;
                    break;
                case 14:
                    objArr[1] = str10;
                    break;
                case 15:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 17:
                    objArr[1] = str9;
                    break;
                case 19:
                    objArr[1] = str8;
                    break;
                case 21:
                    objArr[1] = str7;
                    break;
                case 23:
                    objArr[1] = str6;
                    break;
                case 24:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 25:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 26:
                    objArr[1] = "setOriginal";
                    break;
                case 27:
                    objArr[1] = "setSignatureChange";
                    break;
                case 28:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 29:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 30:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 31:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 33:
                    objArr[1] = str5;
                    break;
                case 35:
                    objArr[1] = str4;
                    break;
                case 37:
                    objArr[1] = str3;
                    break;
                case 38:
                    objArr[1] = "getSubstitution";
                    break;
                case 39:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
                default:
                    objArr[1] = str2;
                    break;
            }
            switch (i2) {
                case 7:
                    objArr[2] = str13;
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    break;
                case 9:
                    objArr[2] = str12;
                    break;
                case 11:
                    objArr[2] = str11;
                    break;
                case 13:
                    objArr[2] = str10;
                    break;
                case 16:
                    objArr[2] = str9;
                    break;
                case 18:
                    objArr[2] = str8;
                    break;
                case 20:
                    objArr[2] = str7;
                    break;
                case 22:
                    objArr[2] = str6;
                    break;
                case 32:
                    objArr[2] = str5;
                    break;
                case 34:
                    objArr[2] = str4;
                    break;
                case 36:
                    objArr[2] = str3;
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i2) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    th = new IllegalStateException(format);
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
            throw th;
        }

        public C5582adb build() {
            return this.w.a(this);
        }

        public a c() {
            this.p = true;
            return this;
        }

        public a d() {
            this.n = true;
            return this;
        }

        public a e() {
            this.m = true;
            return this;
        }

        public a c(boolean z) {
            this.v = z;
            return this;
        }

        public a b(List<C4905Fdb> list) {
            if (list != null) {
                this.q = list;
                return this;
            }
            a(20);
            throw null;
        }

        public a b(C7615wdb wdb) {
            this.h = wdb;
            return this;
        }

        public a b() {
            this.s = true;
            return this;
        }

        public a b(boolean z) {
            this.u = Boolean.valueOf(z);
            return this;
        }

        public a a(C5272Rcb rcb) {
            if (rcb != null) {
                this.b = rcb;
                return this;
            }
            a(7);
            throw null;
        }

        public a a(C6314ddb ddb) {
            if (ddb != null) {
                this.c = ddb;
                return this;
            }
            a(9);
            throw null;
        }

        public a a(C5583aeb aeb) {
            if (aeb != null) {
                this.d = aeb;
                return this;
            }
            a(11);
            throw null;
        }

        public a a(defpackage.C4935Gcb.a aVar) {
            if (aVar != null) {
                this.f = aVar;
                return this;
            }
            a(13);
            throw null;
        }

        public a a(boolean z) {
            this.l = z;
            return this;
        }

        public a a(C7694xnb xnb) {
            if (xnb != null) {
                this.k = xnb;
                return this;
            }
            a(16);
            throw null;
        }

        public a a(List<C5061Kdb> list) {
            if (list != null) {
                this.g = list;
                return this;
            }
            a(18);
            throw null;
        }

        public a a(C7706xtb xtb) {
            if (xtb != null) {
                this.j = xtb;
                return this;
            }
            a(22);
            throw null;
        }

        public a a(C7615wdb wdb) {
            this.i = wdb;
            return this;
        }

        public a a(C4935Gcb gcb) {
            this.e = (C5582adb) gcb;
            return this;
        }

        public a a() {
            this.o = true;
            return this;
        }

        public a a(C6723jeb jeb) {
            if (jeb != null) {
                this.r = jeb;
                return this;
            }
            a(32);
            throw null;
        }

        public a a(Wtb wtb) {
            if (wtb != null) {
                this.a = wtb;
                return this;
            }
            a(34);
            throw null;
        }
    }

    protected _eb(C5272Rcb rcb, C5582adb adb, C6723jeb jeb, C7694xnb xnb, defpackage.C4935Gcb.a aVar, C7822zdb zdb) {
        if (rcb == null) {
            d(0);
            throw null;
        } else if (jeb == null) {
            d(1);
            throw null;
        } else if (xnb == null) {
            d(2);
            throw null;
        } else if (aVar == null) {
            d(3);
            throw null;
        } else if (zdb != null) {
            super(rcb, jeb, xnb, zdb);
            this.k = _db.i;
            this.l = false;
            this.m = false;
            this.n = false;
            this.o = false;
            this.p = false;
            this.q = false;
            this.r = false;
            this.s = false;
            this.t = false;
            this.u = false;
            this.v = true;
            this.w = false;
            this.x = null;
            this.y = null;
            this.B = null;
            this.C = null;
            if (adb == 0) {
                adb = this;
            }
            this.z = adb;
            this.A = aVar;
        } else {
            d(4);
            throw null;
        }
    }

    private static /* synthetic */ void d(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
        switch (i2) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "typeParameters";
                break;
            case 6:
            case 27:
            case 29:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 7:
            case 9:
                objArr[0] = "visibility";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
                objArr[0] = str2;
                break;
            case 10:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 11:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
            case 28:
            case 30:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "newCopyBuilder";
        String str4 = "initialize";
        switch (i2) {
            case 8:
                objArr[1] = str4;
                break;
            case 12:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 13:
                objArr[1] = "getModality";
                break;
            case 14:
                objArr[1] = "getVisibility";
                break;
            case 16:
                objArr[1] = "getTypeParameters";
                break;
            case 17:
                objArr[1] = "getValueParameters";
                break;
            case 18:
                objArr[1] = "getOriginal";
                break;
            case 19:
                objArr[1] = "getKind";
                break;
            case 21:
            case 23:
                objArr[1] = str3;
                break;
            case 25:
                objArr[1] = "copy";
                break;
            case 26:
                objArr[1] = "getSourceToUseForCopy";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i2) {
            case 5:
            case 6:
            case 7:
                objArr[2] = str4;
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setReturnType";
                break;
            case 11:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = str3;
                break;
            case 24:
                objArr[2] = "doSubstitute";
                break;
            case 27:
            case 28:
            case 29:
            case 30:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 26:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    private void k(boolean z2) {
        this.t = z2;
    }

    private void l(boolean z2) {
        this.s = z2;
    }

    private void ta() {
        PXa<Collection<C5582adb>> pXa = this.y;
        if (pXa != null) {
            this.x = (Collection) pXa.d();
            this.y = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract _eb a(C5272Rcb rcb, C5582adb adb, defpackage.C4935Gcb.a aVar, C7694xnb xnb, C6723jeb jeb, C7822zdb zdb);

    public void b(boolean z2) {
        this.q = z2;
    }

    public void c(boolean z2) {
        this.n = z2;
    }

    public void d(boolean z2) {
        this.v = z2;
    }

    public void e(boolean z2) {
        this.w = z2;
    }

    public void f(boolean z2) {
        this.m = z2;
    }

    public void g(boolean z2) {
        this.o = z2;
    }

    public List<C4905Fdb> getTypeParameters() {
        List<C4905Fdb> list = this.e;
        if (list != null) {
            return list;
        }
        d(16);
        throw null;
    }

    public void h(boolean z2) {
        this.l = z2;
    }

    public void i(boolean z2) {
        this.u = z2;
    }

    public boolean isInline() {
        return this.o;
    }

    public void j(boolean z2) {
        this.p = z2;
    }

    public boolean m() {
        return this.r;
    }

    public boolean n() {
        return this.n;
    }

    public boolean o() {
        return this.w;
    }

    public boolean p() {
        return this.q;
    }

    public boolean r() {
        return this.p;
    }

    public boolean s() {
        return this.u;
    }

    public boolean t() {
        if (this.l) {
            return true;
        }
        for (C5582adb t2 : getOriginal().j()) {
            if (t2.t()) {
                return true;
            }
        }
        return false;
    }

    public C5582adb u() {
        return this.B;
    }

    public boolean v() {
        return this.s;
    }

    public boolean w() {
        return this.t;
    }

    public defpackage.C5582adb.a<? extends C5582adb> x() {
        a b = b(_tb.a);
        if (b != null) {
            return b;
        }
        d(21);
        throw null;
    }

    public boolean y() {
        if (this.m) {
            return true;
        }
        for (C5582adb y2 : getOriginal().j()) {
            if (y2.y()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public a b(_tb _tb) {
        if (_tb != null) {
            a aVar = new a(this, _tb.a(), e(), h(), d(), g(), f(), l(), a(), null);
            return aVar;
        }
        d(22);
        throw null;
    }

    public C5583aeb d() {
        C5583aeb aeb = this.k;
        if (aeb != null) {
            return aeb;
        }
        d(14);
        throw null;
    }

    public List<C5061Kdb> f() {
        List<C5061Kdb> list = this.f;
        if (list != null) {
            return list;
        }
        d(17);
        throw null;
    }

    public defpackage.C4935Gcb.a g() {
        defpackage.C4935Gcb.a aVar = this.A;
        if (aVar != null) {
            return aVar;
        }
        d(19);
        throw null;
    }

    public C6314ddb h() {
        C6314ddb ddb = this.j;
        if (ddb != null) {
            return ddb;
        }
        d(13);
        throw null;
    }

    public Collection<? extends C5582adb> j() {
        ta();
        Collection<? extends C5582adb> collection = this.x;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        d(12);
        throw null;
    }

    public C7615wdb k() {
        return this.i;
    }

    public C7615wdb l() {
        return this.h;
    }

    public _eb a(C7615wdb wdb, C7615wdb wdb2, List<? extends C4905Fdb> list, List<C5061Kdb> list2, C7706xtb xtb, C6314ddb ddb, C5583aeb aeb) {
        if (list == null) {
            d(5);
            throw null;
        } else if (list2 == null) {
            d(6);
            throw null;
        } else if (aeb != null) {
            this.e = C7676xWa.q(list);
            this.f = C7676xWa.q(list2);
            this.g = xtb;
            this.j = ddb;
            this.k = aeb;
            this.h = wdb;
            this.i = wdb2;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String str = " but position is ";
                if (i3 < list.size()) {
                    C4905Fdb fdb = (C4905Fdb) list.get(i3);
                    if (fdb.getIndex() == i3) {
                        i3++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(fdb);
                        sb.append(" index is ");
                        sb.append(fdb.getIndex());
                        sb.append(str);
                        sb.append(i3);
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    while (i2 < list2.size()) {
                        C5061Kdb kdb = (C5061Kdb) list2.get(i2);
                        if (kdb.getIndex() == i2 + 0) {
                            i2++;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(kdb);
                            sb2.append("index is ");
                            sb2.append(kdb.getIndex());
                            sb2.append(str);
                            sb2.append(i2);
                            throw new IllegalStateException(sb2.toString());
                        }
                    }
                    return this;
                }
            }
        } else {
            d(7);
            throw null;
        }
    }

    public C5582adb getOriginal() {
        C5582adb adb = this.z;
        C5582adb original = adb == this ? this : adb.getOriginal();
        if (original != 0) {
            return original;
        }
        d(18);
        throw null;
    }

    public void a(C5583aeb aeb) {
        if (aeb != null) {
            this.k = aeb;
        } else {
            d(9);
            throw null;
        }
    }

    public void a(boolean z2) {
        this.r = z2;
    }

    public void a(C7706xtb xtb) {
        if (xtb != null) {
            C7706xtb xtb2 = this.g;
            this.g = xtb;
            return;
        }
        d(10);
        throw null;
    }

    public <V> V a(defpackage.C4904Fcb.a<V> aVar) {
        Map<defpackage.C4904Fcb.a<?>, Object> map = this.C;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public void a(Collection<? extends C4935Gcb> collection) {
        if (collection != null) {
            this.x = collection;
            for (C5582adb w2 : this.x) {
                if (w2.w()) {
                    this.t = true;
                    return;
                }
            }
            return;
        }
        d(15);
        throw null;
    }

    public C7706xtb a() {
        return this.g;
    }

    public C5582adb a(_tb _tb) {
        if (_tb == null) {
            d(20);
            throw null;
        } else if (_tb.b()) {
            return this;
        } else {
            a b = b(_tb);
            b.a((C4935Gcb) getOriginal());
            b.c(true);
            return b.build();
        }
    }

    /* access modifiers changed from: protected */
    public C5582adb a(a aVar) {
        C7615wdb wdb;
        C7615wdb wdb2;
        a aVar2 = aVar;
        if (aVar2 != null) {
            boolean[] zArr = new boolean[1];
            C6723jeb a2 = aVar.r != null ? C6859leb.a(getAnnotations(), aVar.r) : getAnnotations();
            C5272Rcb rcb = aVar2.b;
            C5582adb adb = aVar2.e;
            _eb a3 = a(rcb, adb, aVar2.f, aVar2.k, a2, a(aVar2.n, adb));
            List typeParameters = aVar.q == null ? getTypeParameters() : aVar.q;
            zArr[0] = zArr[0] | (!typeParameters.isEmpty());
            ArrayList arrayList = new ArrayList(typeParameters.size());
            _tb a4 = C6743jtb.a(typeParameters, aVar2.a, a3, arrayList, zArr);
            if (a4 == null) {
                return null;
            }
            C7615wdb wdb3 = aVar2.h;
            if (wdb3 != null) {
                C7706xtb b = a4.b(wdb3.getType(), C6473fub.IN_VARIANCE);
                if (b == null) {
                    return null;
                }
                C7272rfb rfb = new C7272rfb(a3, new Qqb(a3, b, aVar2.h.getValue()), aVar2.h.getAnnotations());
                zArr[0] = (b != aVar2.h.getType()) | zArr[0];
                wdb = rfb;
            } else {
                wdb = null;
            }
            C7615wdb wdb4 = aVar2.i;
            if (wdb4 != null) {
                C7615wdb a5 = wdb4.a(a4);
                if (a5 == null) {
                    return null;
                }
                zArr[0] = zArr[0] | (a5 != aVar2.i);
                wdb2 = a5;
            } else {
                wdb2 = null;
            }
            List a6 = a((C5582adb) a3, aVar2.g, a4, aVar2.o, aVar2.n, zArr);
            if (a6 == null) {
                return null;
            }
            C7706xtb b2 = a4.b(aVar2.j, C6473fub.OUT_VARIANCE);
            if (b2 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (b2 != aVar2.j);
            if (!zArr[0] && aVar2.v) {
                return this;
            }
            _tb _tb = a4;
            a3.a(wdb, wdb2, arrayList, a6, b2, aVar2.c, aVar2.d);
            a3.h(this.l);
            a3.f(this.m);
            a3.c(this.n);
            a3.g(this.o);
            a3.j(this.p);
            a3.i(this.u);
            a3.b(this.q);
            a3.a(this.r);
            a3.d(this.v);
            a3.l(aVar.p);
            a3.k(aVar.s);
            a3.e(aVar.u != null ? aVar.u.booleanValue() : this.w);
            if (!aVar.t.isEmpty() || this.C != null) {
                Map<defpackage.C4904Fcb.a<?>, Object> f2 = aVar.t;
                Map<defpackage.C4904Fcb.a<?>, Object> map = this.C;
                if (map != null) {
                    for (Entry entry : map.entrySet()) {
                        if (!f2.containsKey(entry.getKey())) {
                            f2.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (f2.size() == 1) {
                    a3.C = Collections.singletonMap(f2.keySet().iterator().next(), f2.values().iterator().next());
                } else {
                    a3.C = f2;
                }
            }
            if (aVar2.m || u() != null) {
                a3.a((u() != null ? u() : this).a(_tb));
            }
            if (aVar2.l && !getOriginal().j().isEmpty()) {
                if (aVar2.a.d()) {
                    PXa<Collection<C5582adb>> pXa = this.y;
                    if (pXa != null) {
                        a3.y = pXa;
                    } else {
                        a3.a(j());
                    }
                } else {
                    a3.y = new Zeb(this, _tb);
                }
            }
            return a3;
        }
        d(24);
        throw null;
    }

    public C5582adb a(C5272Rcb rcb, C6314ddb ddb, C5583aeb aeb, defpackage.C4935Gcb.a aVar, boolean z2) {
        C5582adb build = x().a(rcb).a(ddb).a(aeb).a(aVar).a(z2).build();
        if (build != null) {
            return build;
        }
        d(25);
        throw null;
    }

    private C7822zdb a(boolean z2, C5582adb adb) {
        C7822zdb zdb;
        if (z2) {
            if (adb == null) {
                adb = getOriginal();
            }
            zdb = adb.getSource();
        } else {
            zdb = C7822zdb.a;
        }
        if (zdb != null) {
            return zdb;
        }
        d(26);
        throw null;
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d) {
        return tcb.a((C5582adb) this, d);
    }

    public static List<C5061Kdb> a(C5582adb adb, List<C5061Kdb> list, _tb _tb) {
        if (list == null) {
            d(27);
            throw null;
        } else if (_tb != null) {
            return a(adb, list, _tb, false, false, (boolean[]) null);
        } else {
            d(28);
            throw null;
        }
    }

    public static List<C5061Kdb> a(C5582adb adb, List<C5061Kdb> list, _tb _tb, boolean z2, boolean z3, boolean[] zArr) {
        C7706xtb xtb;
        _tb _tb2 = _tb;
        if (list == null) {
            d(29);
            throw null;
        } else if (_tb2 != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C5061Kdb kdb : list) {
                C7706xtb b = _tb2.b(kdb.getType(), C6473fub.IN_VARIANCE);
                C7706xtb da = kdb.da();
                if (da == null) {
                    xtb = null;
                } else {
                    xtb = _tb2.b(da, C6473fub.IN_VARIANCE);
                }
                if (b == null) {
                    return null;
                }
                if (!((b == kdb.getType() && da == xtb) || zArr == null)) {
                    zArr[0] = true;
                }
                C7755yfb yfb = new C7755yfb(adb, z2 ? null : kdb, kdb.getIndex(), kdb.getAnnotations(), kdb.getName(), b, kdb.ea(), kdb.ca(), kdb.ba(), xtb, z3 ? kdb.getSource() : C7822zdb.a);
                arrayList.add(yfb);
            }
            return arrayList;
        } else {
            d(30);
            throw null;
        }
    }

    private void a(C5582adb adb) {
        this.B = adb;
    }

    public <V> void a(defpackage.C4904Fcb.a<V> aVar, Object obj) {
        if (this.C == null) {
            this.C = new LinkedHashMap();
        }
        this.C.put(aVar, obj);
    }
}
