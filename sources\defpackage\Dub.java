package defpackage;

import java.util.List;

/* renamed from: Dub reason: default package */
/* compiled from: ErrorSimpleFunctionDescriptorImpl */
class Dub implements a<C7684xdb> {
    final /* synthetic */ Eub a;

    Dub(Eub eub) {
        this.a = eub;
    }

    private static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
            switch (i3) {
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
            switch (i3) {
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
        switch (i3) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            case 14:
            case 16:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
                objArr[0] = str2;
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 6:
                objArr[0] = "kind";
                break;
            case 9:
                objArr[0] = "name";
                break;
            case 11:
            case 17:
                objArr[0] = "parameters";
                break;
            case 13:
                objArr[0] = "substitution";
                break;
            case 15:
                objArr[0] = "userDataKey";
                break;
            case 19:
                objArr[0] = C1325gg.TYPE;
                break;
            case 29:
                objArr[0] = "additionalAnnotations";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        String str3 = "setOwner";
        if (i3 == 1) {
            objArr[1] = str3;
        } else if (i3 == 3) {
            objArr[1] = "setModality";
        } else if (i3 == 5) {
            objArr[1] = "setVisibility";
        } else if (i3 == 10) {
            objArr[1] = "setName";
        } else if (i3 == 12) {
            objArr[1] = "setValueParameters";
        } else if (i3 == 14) {
            objArr[1] = "setSubstitution";
        } else if (i3 == 16) {
            objArr[1] = "putUserData";
        } else if (i3 == 18) {
            objArr[1] = "setTypeParameters";
        } else if (i3 == 30) {
            objArr[1] = "setAdditionalAnnotations";
        } else if (i3 == 7) {
            objArr[1] = "setKind";
        } else if (i3 != 8) {
            switch (i3) {
                case 20:
                    objArr[1] = "setReturnType";
                    break;
                case 21:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 22:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 23:
                    objArr[1] = "setOriginal";
                    break;
                case 24:
                    objArr[1] = "setSignatureChange";
                    break;
                case 25:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 26:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 27:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 28:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                default:
                    objArr[1] = str2;
                    break;
            }
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i3) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            case 14:
            case 16:
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
                break;
            case 2:
                objArr[2] = "setModality";
                break;
            case 4:
                objArr[2] = "setVisibility";
                break;
            case 6:
                objArr[2] = "setKind";
                break;
            case 9:
                objArr[2] = "setName";
                break;
            case 11:
                objArr[2] = "setValueParameters";
                break;
            case 13:
                objArr[2] = "setSubstitution";
                break;
            case 15:
                objArr[2] = "putUserData";
                break;
            case 17:
                objArr[2] = "setTypeParameters";
                break;
            case 19:
                objArr[2] = "setReturnType";
                break;
            case 29:
                objArr[2] = "setAdditionalAnnotations";
                break;
            default:
                objArr[2] = str3;
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
            switch (i3) {
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public a<C7684xdb> a() {
        return this;
    }

    public a<C7684xdb> a(a aVar) {
        if (aVar != null) {
            return this;
        }
        a(6);
        throw null;
    }

    public a<C7684xdb> a(C5272Rcb rcb) {
        if (rcb != null) {
            return this;
        }
        a(0);
        throw null;
    }

    public a<C7684xdb> a(Wtb wtb) {
        if (wtb != null) {
            return this;
        }
        a(13);
        throw null;
    }

    public a<C7684xdb> a(C5583aeb aeb) {
        if (aeb != null) {
            return this;
        }
        a(4);
        throw null;
    }

    public a<C7684xdb> a(C6314ddb ddb) {
        if (ddb != null) {
            return this;
        }
        a(2);
        throw null;
    }

    public a<C7684xdb> a(List<C5061Kdb> list) {
        if (list != null) {
            return this;
        }
        a(11);
        throw null;
    }

    public a<C7684xdb> a(C6723jeb jeb) {
        if (jeb != null) {
            return this;
        }
        a(29);
        throw null;
    }

    public a<C7684xdb> a(C7615wdb wdb) {
        return this;
    }

    public a<C7684xdb> a(C7694xnb xnb) {
        if (xnb != null) {
            return this;
        }
        a(9);
        throw null;
    }

    public a<C7684xdb> a(C7706xtb xtb) {
        if (xtb != null) {
            return this;
        }
        a(19);
        throw null;
    }

    public a<C7684xdb> a(boolean z) {
        return this;
    }

    public a<C7684xdb> b() {
        return this;
    }

    public a<C7684xdb> b(List<C4905Fdb> list) {
        if (list != null) {
            return this;
        }
        a(17);
        throw null;
    }

    public a<C7684xdb> b(C7615wdb wdb) {
        return this;
    }

    public a<C7684xdb> c() {
        return this;
    }

    public a<C7684xdb> d() {
        return this;
    }

    public a<C7684xdb> e() {
        return this;
    }

    public C7684xdb build() {
        return this.a;
    }
}
