package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: Xeb reason: default package */
/* compiled from: EnumEntrySyntheticClassDescriptor */
public class Xeb extends Meb {
    private final Ptb h;
    private final Eqb i;
    /* access modifiers changed from: private */
    public final Psb<Set<C7694xnb>> j;
    private final C6723jeb k;

    /* renamed from: Xeb$a */
    /* compiled from: EnumEntrySyntheticClassDescriptor */
    private class a extends Fqb {
        private final Msb<C7694xnb, Collection<? extends C7684xdb>> a;
        private final Msb<C7694xnb, Collection<? extends C7408tdb>> b;
        private final Psb<Collection<C5272Rcb>> c;
        final /* synthetic */ Xeb d;

        public a(Xeb xeb, Ssb ssb) {
            if (ssb != null) {
                this.d = xeb;
                this.a = ssb.b((_Xa<? super K, ? extends V>) new Teb<Object,Object>(this, xeb));
                this.b = ssb.b((_Xa<? super K, ? extends V>) new Ueb<Object,Object>(this, xeb));
                this.c = ssb.a((PXa<? extends T>) new Veb<Object>(this, xeb));
                return;
            }
            a(0);
            throw null;
        }

        private static /* synthetic */ void a(int i) {
            String str;
            int i2;
            Throwable th;
            int i3 = i;
            if (!(i3 == 3 || i3 == 5 || i3 == 8 || i3 == 14 || i3 == 10 || i3 == 11)) {
                switch (i3) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i3 == 3 || i3 == 5 || i3 == 8 || i3 == 14 || i3 == 10 || i3 == 11)) {
                switch (i3) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
            switch (i3) {
                case 1:
                case 4:
                case 6:
                case 9:
                case 12:
                    objArr[0] = "name";
                    break;
                case 2:
                case 7:
                    objArr[0] = "location";
                    break;
                case 3:
                case 5:
                case 8:
                case 10:
                case 11:
                case 14:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    objArr[0] = str2;
                    break;
                case 13:
                    objArr[0] = "fromSupertypes";
                    break;
                case 15:
                    objArr[0] = "kindFilter";
                    break;
                case 16:
                    objArr[0] = "nameFilter";
                    break;
                case 22:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            String str3 = "resolveFakeOverrides";
            String str4 = "computeFunctions";
            String str5 = "getContributedFunctions";
            String str6 = "computeProperties";
            String str7 = "getContributedVariables";
            if (i3 == 3) {
                objArr[1] = str7;
            } else if (i3 == 5) {
                objArr[1] = str6;
            } else if (i3 == 8) {
                objArr[1] = str5;
            } else if (i3 == 14) {
                objArr[1] = str3;
            } else if (i3 == 10) {
                objArr[1] = str4;
            } else if (i3 != 11) {
                switch (i3) {
                    case 17:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 18:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 19:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 20:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 21:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = str2;
                        break;
                }
            } else {
                objArr[1] = "getSupertypeScope";
            }
            switch (i3) {
                case 1:
                case 2:
                    objArr[2] = str7;
                    break;
                case 3:
                case 5:
                case 8:
                case 10:
                case 11:
                case 14:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    break;
                case 4:
                    objArr[2] = str6;
                    break;
                case 6:
                case 7:
                    objArr[2] = str5;
                    break;
                case 9:
                    objArr[2] = str4;
                    break;
                case 12:
                case 13:
                    objArr[2] = str3;
                    break;
                case 15:
                case 16:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 22:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i3 == 3 || i3 == 5 || i3 == 8 || i3 == 14 || i3 == 10 || i3 == 11)) {
                switch (i3) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        private Eqb d() {
            Eqb ha = ((C7706xtb) this.d.Q().b().iterator().next()).ha();
            if (ha != null) {
                return ha;
            }
            a(11);
            throw null;
        }

        public Collection<? extends C7408tdb> c(C7694xnb xnb, Dfb dfb) {
            if (xnb == null) {
                a(1);
                throw null;
            } else if (dfb != null) {
                Collection<? extends C7408tdb> collection = (Collection) this.b.invoke(xnb);
                if (collection != null) {
                    return collection;
                }
                a(3);
                throw null;
            } else {
                a(2);
                throw null;
            }
        }

        /* access modifiers changed from: private */
        public Collection<? extends C7408tdb> b(C7694xnb xnb) {
            if (xnb != null) {
                Collection<? extends C7408tdb> a2 = a(xnb, d().c(xnb, Ffb.FOR_NON_TRACKED_SCOPE));
                if (a2 != null) {
                    return a2;
                }
                a(5);
                throw null;
            }
            a(4);
            throw null;
        }

        /* access modifiers changed from: private */
        public Collection<C5272Rcb> c() {
            HashSet hashSet = new HashSet();
            for (C7694xnb xnb : (Set) this.d.j.d()) {
                hashSet.addAll(a(xnb, (Dfb) Ffb.FOR_NON_TRACKED_SCOPE));
                hashSet.addAll(c(xnb, Ffb.FOR_NON_TRACKED_SCOPE));
            }
            return hashSet;
        }

        public Collection<? extends C7684xdb> a(C7694xnb xnb, Dfb dfb) {
            if (xnb == null) {
                a(6);
                throw null;
            } else if (dfb != null) {
                Collection<? extends C7684xdb> collection = (Collection) this.a.invoke(xnb);
                if (collection != null) {
                    return collection;
                }
                a(8);
                throw null;
            } else {
                a(7);
                throw null;
            }
        }

        public Set<C7694xnb> b() {
            Set<C7694xnb> set = (Set) this.d.j.d();
            if (set != null) {
                return set;
            }
            a(21);
            throw null;
        }

        /* access modifiers changed from: private */
        public Collection<? extends C7684xdb> a(C7694xnb xnb) {
            if (xnb != null) {
                Collection<? extends C7684xdb> a2 = a(xnb, d().a(xnb, Ffb.FOR_NON_TRACKED_SCOPE));
                if (a2 != null) {
                    return a2;
                }
                a(10);
                throw null;
            }
            a(9);
            throw null;
        }

        private <D extends C4935Gcb> Collection<? extends D> a(C7694xnb xnb, Collection<? extends D> collection) {
            if (xnb == null) {
                a(12);
                throw null;
            } else if (collection != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C7629wpb.a(xnb, collection, Collections.emptySet(), this.d, new Web(this, linkedHashSet));
                return linkedHashSet;
            } else {
                a(13);
                throw null;
            }
        }

        public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
            if (xqb == null) {
                a(15);
                throw null;
            } else if (_xa != null) {
                Collection<C5272Rcb> collection = (Collection) this.c.d();
                if (collection != null) {
                    return collection;
                }
                a(17);
                throw null;
            } else {
                a(16);
                throw null;
            }
        }

        public Set<C7694xnb> a() {
            Set<C7694xnb> set = (Set) this.d.j.d();
            if (set != null) {
                return set;
            }
            a(19);
            throw null;
        }
    }

    private Xeb(Ssb ssb, C5029Jcb jcb, C7706xtb xtb, C7694xnb xnb, Psb<Set<C7694xnb>> psb, C6723jeb jeb, C7822zdb zdb) {
        if (ssb == null) {
            c(7);
            throw null;
        } else if (jcb == null) {
            c(8);
            throw null;
        } else if (xtb == null) {
            c(9);
            throw null;
        } else if (xnb == null) {
            c(10);
            throw null;
        } else if (psb == null) {
            c(11);
            throw null;
        } else if (jeb == null) {
            c(12);
            throw null;
        } else if (zdb != null) {
            super(ssb, jcb, xnb, zdb, false);
            this.k = jeb;
            this.h = new C6335dtb(this, Collections.emptyList(), Collections.singleton(xtb), ssb);
            this.i = new a(this, ssb);
            this.j = psb;
        } else {
            c(13);
            throw null;
        }
    }

    private static /* synthetic */ void c(int i2) {
        String str;
        int i3;
        Throwable th;
        if (i2 != 6) {
            switch (i2) {
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (i2 != 6) {
            switch (i2) {
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    i3 = 3;
                    break;
            }
        }
        i3 = 2;
        Object[] objArr = new Object[i3];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
        switch (i2) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 10:
                objArr[0] = "name";
                break;
            case 3:
            case 11:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 12:
                objArr[0] = "annotations";
                break;
            case 5:
            case 13:
                objArr[0] = "source";
                break;
            case 6:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = str2;
                break;
            case 8:
                objArr[0] = "containingClass";
                break;
            case 9:
                objArr[0] = "supertype";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        String str3 = "create";
        if (i2 != 6) {
            switch (i2) {
                case 14:
                    objArr[1] = "getUnsubstitutedMemberScope";
                    break;
                case 15:
                    objArr[1] = "getStaticScope";
                    break;
                case 16:
                    objArr[1] = "getConstructors";
                    break;
                case 17:
                    objArr[1] = "getTypeConstructor";
                    break;
                case 18:
                    objArr[1] = "getKind";
                    break;
                case 19:
                    objArr[1] = "getModality";
                    break;
                case 20:
                    objArr[1] = "getVisibility";
                    break;
                case 21:
                    objArr[1] = "getAnnotations";
                    break;
                case 22:
                    objArr[1] = "getDeclaredTypeParameters";
                    break;
                case 23:
                    objArr[1] = "getSealedSubclasses";
                    break;
                default:
                    objArr[1] = str2;
                    break;
            }
        } else {
            objArr[1] = str3;
        }
        switch (i2) {
            case 6:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = str3;
                break;
        }
        String format = String.format(str, objArr);
        if (i2 != 6) {
            switch (i2) {
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public List<C4905Fdb> B() {
        List<C4905Fdb> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        c(22);
        throw null;
    }

    public Collection<C5029Jcb> C() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        c(23);
        throw null;
    }

    public boolean D() {
        return false;
    }

    public C4997Icb F() {
        return null;
    }

    public Eqb J() {
        Eqb eqb = this.i;
        if (eqb != null) {
            return eqb;
        }
        c(14);
        throw null;
    }

    public boolean K() {
        return false;
    }

    public Eqb L() {
        b bVar = b.a;
        if (bVar != null) {
            return bVar;
        }
        c(15);
        throw null;
    }

    public C5029Jcb M() {
        return null;
    }

    public boolean N() {
        return false;
    }

    public Ptb Q() {
        Ptb ptb = this.h;
        if (ptb != null) {
            return ptb;
        }
        c(17);
        throw null;
    }

    public C5583aeb d() {
        C5583aeb aeb = _db.e;
        if (aeb != null) {
            return aeb;
        }
        c(20);
        throw null;
    }

    public C5060Kcb g() {
        C5060Kcb kcb = C5060Kcb.ENUM_ENTRY;
        if (kcb != null) {
            return kcb;
        }
        c(18);
        throw null;
    }

    public C6723jeb getAnnotations() {
        C6723jeb jeb = this.k;
        if (jeb != null) {
            return jeb;
        }
        c(21);
        throw null;
    }

    public C6314ddb h() {
        C6314ddb ddb = C6314ddb.FINAL;
        if (ddb != null) {
            return ddb;
        }
        c(19);
        throw null;
    }

    public Collection<C4997Icb> i() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        c(16);
        throw null;
    }

    public boolean isInline() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("enum entry ");
        sb.append(getName());
        return sb.toString();
    }

    public static Xeb a(Ssb ssb, C5029Jcb jcb, C7694xnb xnb, Psb<Set<C7694xnb>> psb, C6723jeb jeb, C7822zdb zdb) {
        if (ssb == null) {
            c(0);
            throw null;
        } else if (jcb == null) {
            c(1);
            throw null;
        } else if (xnb == null) {
            c(2);
            throw null;
        } else if (psb == null) {
            c(3);
            throw null;
        } else if (jeb == null) {
            c(4);
            throw null;
        } else if (zdb != null) {
            Xeb xeb = new Xeb(ssb, jcb, jcb.z(), xnb, psb, jeb, zdb);
            return xeb;
        } else {
            c(5);
            throw null;
        }
    }
}
