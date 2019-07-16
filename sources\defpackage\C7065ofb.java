package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: ofb reason: default package and case insensitive filesystem */
/* compiled from: PropertyDescriptorImpl */
public class C7065ofb extends Afb implements C7408tdb {
    private final C6314ddb h;
    private C5583aeb i;
    private Collection<? extends C7408tdb> j;
    private final C7408tdb k;
    private final defpackage.C4935Gcb.a l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    /* access modifiers changed from: private */
    public C7615wdb s;
    private C7615wdb t;
    private List<C4905Fdb> u;
    private C7134pfb v;
    private C7546vdb w;
    private boolean x;
    private C5448Xcb y;
    private C5448Xcb z;

    /* renamed from: ofb$a */
    /* compiled from: PropertyDescriptorImpl */
    public class a {
        /* access modifiers changed from: private */
        public C5272Rcb a = C7065ofb.this.e();
        /* access modifiers changed from: private */
        public C6314ddb b = C7065ofb.this.h();
        /* access modifiers changed from: private */
        public C5583aeb c = C7065ofb.this.d();
        /* access modifiers changed from: private */
        public C7408tdb d = null;
        /* access modifiers changed from: private */
        public defpackage.C4935Gcb.a e = C7065ofb.this.g();
        /* access modifiers changed from: private */
        public Wtb f = Wtb.a;
        /* access modifiers changed from: private */
        public boolean g = true;
        /* access modifiers changed from: private */
        public C7615wdb h = C7065ofb.this.s;
        /* access modifiers changed from: private */
        public List<C4905Fdb> i = null;
        /* access modifiers changed from: private */
        public C7694xnb j = C7065ofb.this.getName();

        public a() {
        }

        private static /* synthetic */ void a(int i2) {
            int i3 = i2;
            String str = (i3 == 1 || i3 == 2 || i3 == 4 || i3 == 6 || i3 == 8 || i3 == 16 || i3 == 10 || i3 == 11 || i3 == 13 || i3 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i3 == 1 || i3 == 2 || i3 == 4 || i3 == 6 || i3 == 8 || i3 == 16 || i3 == 10 || i3 == 11 || i3 == 13 || i3 == 14) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            switch (i3) {
                case 1:
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                case 11:
                case 13:
                case 14:
                case 16:
                    objArr[0] = str2;
                    break;
                case 3:
                    objArr[0] = "modality";
                    break;
                case 5:
                    objArr[0] = "visibility";
                    break;
                case 7:
                    objArr[0] = "kind";
                    break;
                case 9:
                    objArr[0] = "typeParameters";
                    break;
                case 12:
                    objArr[0] = "substitution";
                    break;
                case 15:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            String str3 = "setVisibility";
            String str4 = "setModality";
            String str5 = "setOwner";
            if (i3 == 1) {
                objArr[1] = str5;
            } else if (i3 == 2) {
                objArr[1] = "setOriginal";
            } else if (i3 == 4) {
                objArr[1] = str4;
            } else if (i3 == 6) {
                objArr[1] = str3;
            } else if (i3 == 8) {
                objArr[1] = "setKind";
            } else if (i3 == 16) {
                objArr[1] = "setName";
            } else if (i3 == 10) {
                objArr[1] = "setTypeParameters";
            } else if (i3 == 11) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i3 == 13) {
                objArr[1] = "setSubstitution";
            } else if (i3 != 14) {
                objArr[1] = str2;
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i3) {
                case 1:
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                case 11:
                case 13:
                case 14:
                case 16:
                    break;
                case 3:
                    objArr[2] = str4;
                    break;
                case 5:
                    objArr[2] = str3;
                    break;
                case 7:
                    objArr[2] = "setKind";
                    break;
                case 9:
                    objArr[2] = "setTypeParameters";
                    break;
                case 12:
                    objArr[2] = "setSubstitution";
                    break;
                case 15:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = str5;
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i3 == 1 || i3 == 2 || i3 == 4 || i3 == 6 || i3 == 8 || i3 == 16 || i3 == 10 || i3 == 11 || i3 == 13 || i3 == 14) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public a a(C5272Rcb rcb) {
            if (rcb != null) {
                this.a = rcb;
                return this;
            }
            a(0);
            throw null;
        }

        public a a(C4935Gcb gcb) {
            this.d = (C7408tdb) gcb;
            return this;
        }

        public a a(C6314ddb ddb) {
            if (ddb != null) {
                this.b = ddb;
                return this;
            }
            a(3);
            throw null;
        }

        public a a(C5583aeb aeb) {
            if (aeb != null) {
                this.c = aeb;
                return this;
            }
            a(5);
            throw null;
        }

        public a a(defpackage.C4935Gcb.a aVar) {
            if (aVar != null) {
                this.e = aVar;
                return this;
            }
            a(7);
            throw null;
        }

        public a a(Wtb wtb) {
            if (wtb != null) {
                this.f = wtb;
                return this;
            }
            a(12);
            throw null;
        }

        public a a(boolean z) {
            this.g = z;
            return this;
        }

        public C7408tdb a() {
            return C7065ofb.this.a(this);
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [tdb] */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    protected C7065ofb(C5272Rcb rcb, C7408tdb tdb, C6723jeb jeb, C6314ddb ddb, C5583aeb aeb, boolean z2, C7694xnb xnb, defpackage.C4935Gcb.a aVar, C7822zdb zdb, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C6314ddb ddb2 = ddb;
        C5583aeb aeb2 = aeb;
        defpackage.C4935Gcb.a aVar2 = aVar;
        if (rcb == null) {
            f(0);
            throw null;
        } else if (jeb == null) {
            f(1);
            throw null;
        } else if (ddb2 == null) {
            f(2);
            throw null;
        } else if (aeb2 == null) {
            f(3);
            throw null;
        } else if (xnb == null) {
            f(4);
            throw null;
        } else if (aVar2 == null) {
            f(5);
            throw null;
        } else if (zdb != null) {
            super(rcb, jeb, xnb, null, z2, zdb);
            this.j = null;
            this.h = ddb2;
            this.i = aeb2;
            this.k = tdb == 0 ? this : tdb;
            this.l = aVar2;
            this.m = z3;
            this.n = z4;
            this.o = z5;
            this.p = z6;
            this.q = z7;
            this.r = z8;
        } else {
            f(6);
            throw null;
        }
    }

    private static /* synthetic */ void f(int i2) {
        String str;
        int i3;
        Throwable th;
        if (!(i2 == 14 || i2 == 24 || i2 == 37 || i2 == 38)) {
            switch (i2) {
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    switch (i2) {
                        case 33:
                        case 34:
                        case 35:
                            break;
                        default:
                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break;
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i2 == 14 || i2 == 24 || i2 == 37 || i2 == 38)) {
            switch (i2) {
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    switch (i2) {
                        case 33:
                        case 34:
                        case 35:
                            break;
                        default:
                            i3 = 3;
                            break;
                    }
            }
        }
        i3 = 2;
        Object[] objArr = new Object[i3];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
        switch (i2) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 17:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 31:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
                objArr[0] = "source";
                break;
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 33:
            case 34:
            case 35:
            case 37:
            case 38:
                objArr[0] = str2;
                break;
            case 15:
                objArr[0] = "outType";
                break;
            case 16:
                objArr[0] = "typeParameters";
                break;
            case 23:
                objArr[0] = "originalSubstitutor";
                break;
            case 25:
                objArr[0] = "copyConfiguration";
                break;
            case 26:
                objArr[0] = "substitutor";
                break;
            case 27:
                objArr[0] = "accessorDescriptor";
                break;
            case 28:
                objArr[0] = "newOwner";
                break;
            case 29:
                objArr[0] = "newModality";
                break;
            case 30:
                objArr[0] = "newVisibility";
                break;
            case 32:
                objArr[0] = "newName";
                break;
            case 36:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "createSubstitutedCopy";
        String str4 = "create";
        if (i2 == 14) {
            objArr[1] = str4;
        } else if (i2 == 24) {
            objArr[1] = "newCopyBuilder";
        } else if (i2 == 37) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i2 != 38) {
            switch (i2) {
                case 18:
                    objArr[1] = "getTypeParameters";
                    break;
                case 19:
                    objArr[1] = "getReturnType";
                    break;
                case 20:
                    objArr[1] = "getModality";
                    break;
                case 21:
                    objArr[1] = "getVisibility";
                    break;
                case 22:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    switch (i2) {
                        case 33:
                            objArr[1] = str3;
                            break;
                        case 34:
                            objArr[1] = "getOriginal";
                            break;
                        case 35:
                            objArr[1] = "getKind";
                            break;
                        default:
                            objArr[1] = str2;
                            break;
                    }
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = str4;
                break;
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 33:
            case 34:
            case 35:
            case 37:
            case 38:
                break;
            case 15:
            case 16:
                objArr[2] = "setType";
                break;
            case 17:
                objArr[2] = "setVisibility";
                break;
            case 23:
                objArr[2] = "substitute";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 26:
            case 27:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                objArr[2] = str3;
                break;
            case 36:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i2 == 14 || i2 == 24 || i2 == 37 || i2 == 38)) {
            switch (i2) {
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    switch (i2) {
                        case 33:
                        case 34:
                        case 35:
                            break;
                        default:
                            th = new IllegalArgumentException(format);
                            break;
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public List<C7339sdb> P() {
        ArrayList arrayList = new ArrayList(2);
        C7134pfb pfb = this.v;
        if (pfb != null) {
            arrayList.add(pfb);
        }
        C7546vdb vdb = this.w;
        if (vdb != null) {
            arrayList.add(vdb);
        }
        return arrayList;
    }

    public C5448Xcb R() {
        return this.z;
    }

    public C5448Xcb U() {
        return this.y;
    }

    public boolean X() {
        return this.n;
    }

    public boolean Z() {
        return this.m;
    }

    public boolean aa() {
        return this.r;
    }

    public C7546vdb c() {
        return this.w;
    }

    public C5583aeb d() {
        C5583aeb aeb = this.i;
        if (aeb != null) {
            return aeb;
        }
        f(21);
        throw null;
    }

    public defpackage.C4935Gcb.a g() {
        defpackage.C4935Gcb.a aVar = this.l;
        if (aVar != null) {
            return aVar;
        }
        f(35);
        throw null;
    }

    public List<C4905Fdb> getTypeParameters() {
        List<C4905Fdb> list = this.u;
        if (list != null) {
            return list;
        }
        f(18);
        throw null;
    }

    public C6314ddb h() {
        C6314ddb ddb = this.h;
        if (ddb != null) {
            return ddb;
        }
        f(20);
        throw null;
    }

    public Collection<? extends C7408tdb> j() {
        Collection<? extends C7408tdb> collection = this.j;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        f(37);
        throw null;
    }

    public C7615wdb k() {
        return this.s;
    }

    public C7615wdb l() {
        return this.t;
    }

    public boolean m() {
        return this.p;
    }

    public boolean n() {
        return this.q;
    }

    public boolean p() {
        return this.o;
    }

    public boolean ta() {
        return this.x;
    }

    public a x() {
        return new a();
    }

    public C7134pfb b() {
        return this.v;
    }

    public static C7065ofb a(C5272Rcb rcb, C6723jeb jeb, C6314ddb ddb, C5583aeb aeb, boolean z2, C7694xnb xnb, defpackage.C4935Gcb.a aVar, C7822zdb zdb, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        if (rcb == null) {
            f(7);
            throw null;
        } else if (jeb == null) {
            f(8);
            throw null;
        } else if (ddb == null) {
            f(9);
            throw null;
        } else if (aeb == null) {
            f(10);
            throw null;
        } else if (xnb == null) {
            f(11);
            throw null;
        } else if (aVar == null) {
            f(12);
            throw null;
        } else if (zdb != null) {
            C7065ofb ofb = new C7065ofb(rcb, null, jeb, ddb, aeb, z2, xnb, aVar, zdb, z3, z4, z5, z6, z7, z8);
            return ofb;
        } else {
            f(13);
            throw null;
        }
    }

    public C7408tdb getOriginal() {
        C7408tdb tdb = this.k;
        C7408tdb original = tdb == this ? this : tdb.getOriginal();
        if (original != 0) {
            return original;
        }
        f(34);
        throw null;
    }

    public void a(C7706xtb xtb, List<? extends C4905Fdb> list, C7615wdb wdb, C7615wdb wdb2) {
        if (xtb == null) {
            f(15);
            throw null;
        } else if (list != null) {
            a(xtb);
            this.u = new ArrayList(list);
            this.t = wdb2;
            this.s = wdb;
        } else {
            f(16);
            throw null;
        }
    }

    public void a(C7134pfb pfb, C7546vdb vdb) {
        a(pfb, vdb, (C5448Xcb) null, (C5448Xcb) null);
    }

    public void a(C7134pfb pfb, C7546vdb vdb, C5448Xcb xcb, C5448Xcb xcb2) {
        this.v = pfb;
        this.w = vdb;
        this.y = xcb;
        this.z = xcb2;
    }

    public void a(boolean z2) {
        this.x = z2;
    }

    public void a(C5583aeb aeb) {
        if (aeb != null) {
            this.i = aeb;
        } else {
            f(17);
            throw null;
        }
    }

    public C7706xtb a() {
        C7706xtb type = getType();
        if (type != null) {
            return type;
        }
        f(19);
        throw null;
    }

    public C7408tdb a(_tb _tb) {
        if (_tb == null) {
            f(23);
            throw null;
        } else if (_tb.b()) {
            return this;
        } else {
            a x2 = x();
            x2.a(_tb.a());
            x2.a((C4935Gcb) getOriginal());
            return x2.a();
        }
    }

    /* access modifiers changed from: protected */
    public C7408tdb a(a aVar) {
        C7615wdb wdb;
        C7615wdb wdb2;
        C7134pfb pfb;
        C7203qfb qfb;
        Yeb yeb = null;
        if (aVar != null) {
            C7065ofb a2 = a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.j);
            List typeParameters = aVar.i == null ? getTypeParameters() : aVar.i;
            ArrayList arrayList = new ArrayList(typeParameters.size());
            _tb a3 = C6743jtb.a(typeParameters, aVar.f, a2, arrayList);
            C7706xtb b = a3.b(getType(), C6473fub.OUT_VARIANCE);
            if (b == null) {
                return null;
            }
            C7615wdb j2 = aVar.h;
            if (j2 != null) {
                wdb = j2.a(a3);
                if (wdb == null) {
                    return null;
                }
            } else {
                wdb = null;
            }
            C7615wdb wdb3 = this.t;
            if (wdb3 != null) {
                C7706xtb b2 = a3.b(wdb3.getType(), C6473fub.IN_VARIANCE);
                if (b2 == null) {
                    return null;
                }
                wdb2 = new C7272rfb(a2, new Qqb(a2, b2, this.t.getValue()), this.t.getAnnotations());
            } else {
                wdb2 = null;
            }
            a2.a(b, (List<? extends C4905Fdb>) arrayList, wdb, wdb2);
            C7134pfb pfb2 = this.v;
            if (pfb2 == null) {
                pfb = null;
            } else {
                pfb = new C7134pfb(a2, pfb2.getAnnotations(), aVar.b, a(this.v.d(), aVar.e), this.v.G(), this.v.n(), this.v.isInline(), aVar.e, aVar.d == null ? null : aVar.d.b(), C7822zdb.a);
            }
            if (pfb != null) {
                C7706xtb a4 = this.v.a();
                pfb.a(a(a3, (C7339sdb) this.v));
                pfb.a(a4 != null ? a3.b(a4, C6473fub.OUT_VARIANCE) : null);
            }
            C7546vdb vdb = this.w;
            if (vdb == null) {
                qfb = null;
            } else {
                qfb = new C7203qfb(a2, vdb.getAnnotations(), aVar.b, a(this.w.d(), aVar.e), this.w.G(), this.w.n(), this.w.isInline(), aVar.e, aVar.d == null ? null : aVar.d.c(), C7822zdb.a);
            }
            if (qfb != null) {
                List a5 = _eb.a((C5582adb) qfb, this.w.f(), a3, false, false, (boolean[]) null);
                if (a5 == null) {
                    a2.a(true);
                    a5 = Collections.singletonList(C7203qfb.a(qfb, C7148pqb.b(aVar.a).u(), ((C5061Kdb) this.w.f().get(0)).getAnnotations()));
                }
                if (a5.size() == 1) {
                    qfb.a(a(a3, (C7339sdb) this.w));
                    qfb.a((C5061Kdb) a5.get(0));
                } else {
                    throw new IllegalStateException();
                }
            }
            C5448Xcb xcb = this.y;
            C5448Xcb yeb2 = xcb == null ? null : new Yeb(xcb.getAnnotations(), a2);
            C5448Xcb xcb2 = this.z;
            if (xcb2 != null) {
                yeb = new Yeb(xcb2.getAnnotations(), a2);
            }
            a2.a(pfb, (C7546vdb) qfb, yeb2, (C5448Xcb) yeb);
            if (aVar.g) {
                Gvb c = Gvb.c();
                for (C7408tdb a6 : j()) {
                    c.add(a6.a(a3));
                }
                a2.a((Collection<? extends C4935Gcb>) c);
            }
            if (X()) {
                Qsb<Npb<?>> qsb = this.g;
                if (qsb != null) {
                    a2.a(qsb);
                }
            }
            return a2;
        }
        f(25);
        throw null;
    }

    private static C5583aeb a(C5583aeb aeb, defpackage.C4935Gcb.a aVar) {
        return (aVar != defpackage.C4935Gcb.a.FAKE_OVERRIDE || !_db.a(aeb.c())) ? aeb : _db.h;
    }

    private static C5582adb a(_tb _tb, C7339sdb sdb) {
        if (_tb == null) {
            f(26);
            throw null;
        } else if (sdb == null) {
            f(27);
            throw null;
        } else if (sdb.u() != null) {
            return sdb.u().a(_tb);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public C7065ofb a(C5272Rcb rcb, C6314ddb ddb, C5583aeb aeb, C7408tdb tdb, defpackage.C4935Gcb.a aVar, C7694xnb xnb) {
        if (rcb == null) {
            f(28);
            throw null;
        } else if (ddb == null) {
            f(29);
            throw null;
        } else if (aeb == null) {
            f(30);
            throw null;
        } else if (aVar == null) {
            f(31);
            throw null;
        } else if (xnb != null) {
            C7065ofb ofb = new C7065ofb(rcb, tdb, getAnnotations(), ddb, aeb, V(), xnb, aVar, C7822zdb.a, Z(), X(), p(), m(), n(), aa());
            return ofb;
        } else {
            f(32);
            throw null;
        }
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d) {
        return tcb.a((C7408tdb) this, d);
    }

    public void a(Collection<? extends C4935Gcb> collection) {
        if (collection != null) {
            this.j = collection;
        } else {
            f(36);
            throw null;
        }
    }

    public C7408tdb a(C5272Rcb rcb, C6314ddb ddb, C5583aeb aeb, defpackage.C4935Gcb.a aVar, boolean z2) {
        a x2 = x();
        x2.a(rcb);
        x2.a((C4935Gcb) null);
        x2.a(ddb);
        x2.a(aeb);
        x2.a(aVar);
        x2.a(z2);
        C7408tdb a2 = x2.a();
        if (a2 != null) {
            return a2;
        }
        f(38);
        throw null;
    }
}
