package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: gpb reason: default package and case insensitive filesystem */
/* compiled from: DescriptorUtils */
public class C6531gpb {
    public static final C7694xnb a = C7694xnb.b("values");
    public static final C7694xnb b = C7694xnb.b("valueOf");
    public static final C7349snb c = new C7349snb("kotlin.coroutines");
    public static final C7349snb d = c.a(C7694xnb.b("experimental"));
    public static final C7349snb e = d.a(C7694xnb.b("intrinsics"));
    public static final C7349snb f;
    public static final C7349snb g;
    public static final C7349snb h = new C7349snb("kotlin.Result");
    public static final C7349snb i = new C7349snb("kotlin.jvm.JvmName");

    static {
        String str = "Continuation";
        f = d.a(C7694xnb.b(str));
        g = c.a(C7694xnb.b(str));
    }

    private static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 3:
            case 5:
            case 8:
            case 10:
            case 11:
            case 21:
            case 39:
            case 41:
            case 42:
            case 45:
            case 47:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 61:
            case 68:
            case 72:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 3:
            case 5:
            case 8:
            case 10:
            case 11:
            case 21:
            case 39:
            case 41:
            case 42:
            case 45:
            case 47:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 61:
            case 68:
            case 72:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
            case 20:
            case 22:
            case 23:
            case 33:
            case 34:
            case 35:
            case 55:
            case 56:
            case 57:
            case 59:
            case 77:
            case 90:
            case 92:
                objArr[0] = "descriptor";
                break;
            case 3:
            case 5:
            case 8:
            case 10:
            case 11:
            case 21:
            case 39:
            case 41:
            case 42:
            case 45:
            case 47:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 61:
            case 68:
            case 72:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                objArr[0] = str2;
                break;
            case 15:
                objArr[0] = "first";
                break;
            case 16:
                objArr[0] = "second";
                break;
            case 17:
            case 18:
                objArr[0] = "aClass";
                break;
            case 19:
                objArr[0] = "kotlinType";
                break;
            case 24:
                objArr[0] = "declarationDescriptor";
                break;
            case 25:
            case 27:
                objArr[0] = "subClass";
                break;
            case 26:
            case 28:
            case 32:
                objArr[0] = "superClass";
                break;
            case 29:
            case 31:
            case 44:
            case 63:
                objArr[0] = C1325gg.TYPE;
                break;
            case 30:
                objArr[0] = "other";
                break;
            case 36:
                objArr[0] = "classKind";
                break;
            case 37:
            case 38:
            case 40:
            case 43:
            case 48:
            case 52:
            case 64:
            case 65:
            case 66:
            case 73:
            case 74:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 53:
                objArr[0] = "innerClassName";
                break;
            case 54:
                objArr[0] = "location";
                break;
            case 62:
                objArr[0] = "variable";
                break;
            case 67:
                objArr[0] = "f";
                break;
            case 69:
                objArr[0] = "current";
                break;
            case 70:
                objArr[0] = "result";
                break;
            case 71:
                objArr[0] = "memberDescriptor";
                break;
            case 75:
            case 76:
                objArr[0] = "annotated";
                break;
            case 80:
            case 82:
            case 85:
            case 87:
                objArr[0] = "scope";
                break;
            case 83:
            case 86:
            case 88:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "unwrapFakeOverride";
        String str4 = "getDefaultConstructorVisibility";
        String str5 = "getClassDescriptorForTypeConstructor";
        String str6 = "getClassDescriptorForType";
        String str7 = "getSuperClassType";
        String str8 = "getSuperclassDescriptors";
        String str9 = "getContainingModule";
        String str10 = "getFqNameFromTopLevelClass";
        String str11 = "getFqNameUnsafe";
        String str12 = "getFqNameSafe";
        String str13 = "getFqName";
        switch (i2) {
            case 3:
                objArr[1] = str13;
                break;
            case 5:
                objArr[1] = str12;
                break;
            case 8:
                objArr[1] = str11;
                break;
            case 10:
            case 11:
                objArr[1] = str10;
                break;
            case 21:
                objArr[1] = str9;
                break;
            case 39:
                objArr[1] = str8;
                break;
            case 41:
            case 42:
                objArr[1] = str7;
                break;
            case 45:
                objArr[1] = str6;
                break;
            case 47:
                objArr[1] = str5;
                break;
            case 49:
            case 50:
            case 51:
                objArr[1] = str4;
                break;
            case 58:
                objArr[1] = str3;
                break;
            case 60:
            case 61:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 68:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 78:
            case 79:
                objArr[1] = "getContainingSourceFile";
                break;
            case 81:
                objArr[1] = "getAllDescriptors";
                break;
            case 84:
                objArr[1] = "getFunctionByName";
                break;
            case 89:
                objArr[1] = "getPropertyByName";
                break;
            case 91:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i2) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = str13;
                break;
            case 3:
            case 5:
            case 8:
            case 10:
            case 11:
            case 21:
            case 39:
            case 41:
            case 42:
            case 45:
            case 47:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 61:
            case 68:
            case 72:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                break;
            case 4:
                objArr[2] = str12;
                break;
            case 6:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 7:
                objArr[2] = str11;
                break;
            case 9:
                objArr[2] = str10;
                break;
            case 12:
                objArr[2] = "isExtension";
                break;
            case 13:
                objArr[2] = "isOverride";
                break;
            case 14:
                objArr[2] = "isStaticDeclaration";
                break;
            case 15:
            case 16:
                objArr[2] = "areInSameModule";
                break;
            case 17:
            case 18:
                objArr[2] = "getParentOfType";
                break;
            case 19:
            case 22:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 20:
                objArr[2] = str9;
                break;
            case 23:
                objArr[2] = "getContainingClass";
                break;
            case 24:
                objArr[2] = "isAncestor";
                break;
            case 25:
            case 26:
                objArr[2] = "isDirectSubclass";
                break;
            case 27:
            case 28:
                objArr[2] = "isSubclass";
                break;
            case 29:
            case 30:
                objArr[2] = "isSameClass";
                break;
            case 31:
            case 32:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 33:
                objArr[2] = "isAnonymousObject";
                break;
            case 34:
                objArr[2] = "isAnonymousFunction";
                break;
            case 35:
                objArr[2] = "isEnumEntry";
                break;
            case 36:
                objArr[2] = "isKindOf";
                break;
            case 37:
                objArr[2] = "hasAbstractMembers";
                break;
            case 38:
                objArr[2] = str8;
                break;
            case 40:
                objArr[2] = str7;
                break;
            case 43:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 44:
                objArr[2] = str6;
                break;
            case 46:
                objArr[2] = str5;
                break;
            case 48:
                objArr[2] = str4;
                break;
            case 52:
            case 53:
            case 54:
                objArr[2] = "getInnerClassByName";
                break;
            case 55:
                objArr[2] = "isStaticNestedClass";
                break;
            case 56:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 57:
                objArr[2] = str3;
                break;
            case 59:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 62:
            case 63:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 64:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 66:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 67:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 69:
            case 70:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 73:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 74:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 75:
                objArr[2] = "getJvmName";
                break;
            case 76:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 77:
                objArr[2] = "getContainingSourceFile";
                break;
            case 80:
                objArr[2] = "getAllDescriptors";
                break;
            case 82:
            case 83:
                objArr[2] = "getFunctionByName";
                break;
            case 85:
            case 86:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 87:
            case 88:
                objArr[2] = "getPropertyByName";
                break;
            case 90:
                objArr[2] = "getDirectMember";
                break;
            case 92:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 3:
            case 5:
            case 8:
            case 10:
            case 11:
            case 21:
            case 39:
            case 41:
            case 42:
            case 45:
            case 47:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 61:
            case 68:
            case 72:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public static boolean a(C5272Rcb rcb, C5272Rcb rcb2) {
        if (rcb == null) {
            a(15);
            throw null;
        } else if (rcb2 != null) {
            return a(rcb).equals(a(rcb2));
        } else {
            a(16);
            throw null;
        }
    }

    public static C6450fdb b(C7706xtb xtb) {
        if (xtb != null) {
            C5122Mcb c2 = xtb.za().c();
            if (c2 == null) {
                return null;
            }
            return b((C5272Rcb) c2);
        }
        a(19);
        throw null;
    }

    public static C4781Bdb c(C5272Rcb rcb) {
        if (rcb != null) {
            if (rcb instanceof C7546vdb) {
                rcb = ((C7546vdb) rcb).I();
            }
            if (rcb instanceof C5361Ucb) {
                C4781Bdb a2 = ((C5361Ucb) rcb).getSource().a();
                if (a2 != null) {
                    return a2;
                }
                a(78);
                throw null;
            }
            C4781Bdb bdb = C4781Bdb.a;
            if (bdb != null) {
                return bdb;
            }
            a(79);
            throw null;
        }
        a(77);
        throw null;
    }

    public static C7615wdb d(C5272Rcb rcb) {
        if (rcb == null) {
            a(0);
            throw null;
        } else if (rcb instanceof C5029Jcb) {
            return ((C5029Jcb) rcb).O();
        } else {
            return null;
        }
    }

    public static C7487unb e(C5272Rcb rcb) {
        if (rcb != null) {
            C7349snb s = s(rcb);
            C7487unb g2 = s != null ? s.g() : t(rcb);
            if (g2 != null) {
                return g2;
            }
            a(3);
            throw null;
        }
        a(2);
        throw null;
    }

    public static C7349snb f(C5272Rcb rcb) {
        if (rcb != null) {
            C7349snb s = s(rcb);
            if (s == null) {
                s = t(rcb).h();
            }
            if (s != null) {
                return s;
            }
            a(5);
            throw null;
        }
        a(4);
        throw null;
    }

    public static boolean g(C5272Rcb rcb) {
        return a(rcb, C5060Kcb.ANNOTATION_CLASS);
    }

    public static boolean h(C5272Rcb rcb) {
        if (rcb != null) {
            return i(rcb) && rcb.getName().equals(C7832znb.a);
        }
        a(33);
        throw null;
    }

    public static boolean i(C5272Rcb rcb) {
        return a(rcb, C5060Kcb.CLASS);
    }

    public static boolean j(C5272Rcb rcb) {
        return i(rcb) || m(rcb);
    }

    public static boolean k(C5272Rcb rcb) {
        return a(rcb, C5060Kcb.OBJECT) && ((C5029Jcb) rcb).K();
    }

    public static boolean l(C5272Rcb rcb) {
        return (rcb instanceof C5390Vcb) && ((C5390Vcb) rcb).d() == _db.f;
    }

    public static boolean m(C5272Rcb rcb) {
        return a(rcb, C5060Kcb.ENUM_CLASS);
    }

    public static boolean n(C5272Rcb rcb) {
        if (rcb != null) {
            return a(rcb, C5060Kcb.ENUM_ENTRY);
        }
        a(35);
        throw null;
    }

    public static boolean o(C5272Rcb rcb) {
        return a(rcb, C5060Kcb.INTERFACE);
    }

    public static boolean p(C5272Rcb rcb) {
        if (rcb != null) {
            while (rcb != null) {
                if (h(rcb) || l(rcb)) {
                    return true;
                }
                rcb = rcb.e();
            }
            return false;
        }
        a(1);
        throw null;
    }

    public static boolean q(C5272Rcb rcb) {
        return a(rcb, C5060Kcb.CLASS) && ((C5029Jcb) rcb).h() == C6314ddb.SEALED;
    }

    public static boolean r(C5272Rcb rcb) {
        return rcb != null && (rcb.e() instanceof C6790kdb);
    }

    private static C7349snb s(C5272Rcb rcb) {
        if (rcb == null) {
            a(6);
            throw null;
        } else if ((rcb instanceof C6450fdb) || C7154ptb.a(rcb)) {
            return C7349snb.a;
        } else {
            if (rcb instanceof C7132pdb) {
                return ((C7132pdb) rcb).q();
            }
            if (rcb instanceof C6790kdb) {
                return ((C6790kdb) rcb).q();
            }
            return null;
        }
    }

    private static C7487unb t(C5272Rcb rcb) {
        if (rcb != null) {
            C7487unb a2 = e(rcb.e()).a(rcb.getName());
            if (a2 != null) {
                return a2;
            }
            a(8);
            throw null;
        }
        a(7);
        throw null;
    }

    public static <D extends C5272Rcb> D a(C5272Rcb rcb, Class<D> cls) {
        if (cls != null) {
            return a(rcb, cls, true);
        }
        a(17);
        throw null;
    }

    public static C6450fdb b(C5272Rcb rcb) {
        if (rcb != null) {
            while (rcb != null) {
                if (rcb instanceof C6450fdb) {
                    return (C6450fdb) rcb;
                }
                if (rcb instanceof C7132pdb) {
                    return ((C7132pdb) rcb).sa();
                }
                rcb = rcb.e();
            }
            return null;
        }
        a(22);
        throw null;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=Rcb, code=D, for r1v0, types: [Rcb] */
    public static <D extends C5272Rcb> D a(D d2, Class<D> cls, boolean z) {
        if (cls == null) {
            a(18);
            throw null;
        } else if (d2 == null) {
            return null;
        } else {
            if (z) {
                d2 = d2.e();
            }
            while (d2 != null) {
                if (cls.isInstance(d2)) {
                    return d2;
                }
                d2 = d2.e();
            }
            return null;
        }
    }

    public static C6450fdb a(C5272Rcb rcb) {
        if (rcb != null) {
            C6450fdb b2 = b(rcb);
            if (b2 != null) {
                return b2;
            }
            a(21);
            throw null;
        }
        a(20);
        throw null;
    }

    public static boolean b(C5029Jcb jcb, C5029Jcb jcb2) {
        if (jcb == null) {
            a(27);
            throw null;
        } else if (jcb2 != null) {
            return a((C7706xtb) jcb.z(), (C5272Rcb) jcb2.getOriginal());
        } else {
            a(28);
            throw null;
        }
    }

    public static boolean a(C5029Jcb jcb, C5029Jcb jcb2) {
        if (jcb == null) {
            a(25);
            throw null;
        } else if (jcb2 != null) {
            for (C7706xtb b2 : jcb.Q().b()) {
                if (b(b2, (C5272Rcb) jcb2.getOriginal())) {
                    return true;
                }
            }
            return false;
        } else {
            a(26);
            throw null;
        }
    }

    private static boolean b(C7706xtb xtb, C5272Rcb rcb) {
        if (xtb == null) {
            a(29);
            throw null;
        } else if (rcb != null) {
            C5122Mcb c2 = xtb.za().c();
            if (c2 != null) {
                C5272Rcb original = c2.getOriginal();
                if ((original instanceof C5122Mcb) && (rcb instanceof C5122Mcb) && ((C5122Mcb) rcb).Q().equals(((C5122Mcb) original).Q())) {
                    return true;
                }
            }
            return false;
        } else {
            a(30);
            throw null;
        }
    }

    public static boolean a(C7706xtb xtb, C5272Rcb rcb) {
        if (xtb == null) {
            a(31);
            throw null;
        } else if (rcb == null) {
            a(32);
            throw null;
        } else if (b(xtb, rcb)) {
            return true;
        } else {
            for (C7706xtb a2 : xtb.za().b()) {
                if (a(a2, rcb)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static C5029Jcb b(C5029Jcb jcb) {
        if (jcb != null) {
            for (C7706xtb a2 : jcb.Q().b()) {
                C5029Jcb a3 = a(a2);
                if (a3.g() != C5060Kcb.INTERFACE) {
                    return a3;
                }
            }
            return null;
        }
        a(43);
        throw null;
    }

    private static boolean a(C5272Rcb rcb, C5060Kcb kcb) {
        if (kcb != null) {
            return (rcb instanceof C5029Jcb) && ((C5029Jcb) rcb).g() == kcb;
        }
        a(36);
        throw null;
    }

    public static C5029Jcb a(C7706xtb xtb) {
        if (xtb != null) {
            C5029Jcb a2 = a(xtb.za());
            if (a2 != null) {
                return a2;
            }
            a(45);
            throw null;
        }
        a(44);
        throw null;
    }

    public static C5029Jcb a(Ptb ptb) {
        if (ptb != null) {
            C5029Jcb jcb = (C5029Jcb) ptb.c();
            if (jcb != null) {
                return jcb;
            }
            a(47);
            throw null;
        }
        a(46);
        throw null;
    }

    public static C5583aeb a(C5029Jcb jcb) {
        if (jcb != null) {
            C5060Kcb g2 = jcb.g();
            if (g2 == C5060Kcb.ENUM_CLASS || g2.a() || q(jcb)) {
                C5583aeb aeb = _db.a;
                if (aeb != null) {
                    return aeb;
                }
                a(49);
                throw null;
            } else if (h(jcb)) {
                C5583aeb aeb2 = _db.l;
                if (aeb2 != null) {
                    return aeb2;
                }
                a(50);
                throw null;
            } else {
                C5583aeb aeb3 = _db.e;
                if (aeb3 != null) {
                    return aeb3;
                }
                a(51);
                throw null;
            }
        } else {
            a(48);
            throw null;
        }
    }

    public static <D extends C4935Gcb> D a(D d2) {
        if (d2 != null) {
            while (d2.g() == a.FAKE_OVERRIDE) {
                Collection j = d2.j();
                if (!j.isEmpty()) {
                    d2 = (C4935Gcb) j.iterator().next();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Fake override should have at least one overridden descriptor: ");
                    sb.append(d2);
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (d2 != null) {
                return d2;
            }
            a(58);
            throw null;
        }
        a(57);
        throw null;
    }

    public static <D extends C5390Vcb> D a(D d2) {
        if (d2 == null) {
            a(59);
            throw null;
        } else if (d2 instanceof C4935Gcb) {
            D a2 = a((D) (C4935Gcb) d2);
            if (a2 != null) {
                return a2;
            }
            a(60);
            throw null;
        } else if (d2 != null) {
            return d2;
        } else {
            a(61);
            throw null;
        }
    }

    public static boolean a(C5123Mdb mdb, C7706xtb xtb) {
        if (mdb == null) {
            a(62);
            throw null;
        } else if (xtb != null) {
            boolean z = false;
            if (!mdb.V() && !C7844ztb.a(xtb)) {
                if (C5605aub.a(xtb)) {
                    return true;
                }
                C5301Sbb b2 = C7148pqb.b((C5272Rcb) mdb);
                if (C5301Sbb.s(xtb) || C6745jub.a.a(b2.C(), xtb) || C6745jub.a.a(b2.x().z(), xtb) || C6745jub.a.a(b2.e(), xtb) || C5505Zbb.e.a(xtb)) {
                    z = true;
                }
            }
            return z;
        } else {
            a(63);
            throw null;
        }
    }

    public static <D extends C4904Fcb> Set<D> a(D d2) {
        if (d2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            a((D) d2.getOriginal(), (Set<D>) linkedHashSet);
            return linkedHashSet;
        }
        a(67);
        throw null;
    }

    private static <D extends C4904Fcb> void a(D d2, Set<D> set) {
        if (d2 == null) {
            a(69);
            throw null;
        } else if (set == null) {
            a(70);
            throw null;
        } else if (!set.contains(d2)) {
            for (C4904Fcb original : d2.getOriginal().j()) {
                C4904Fcb original2 = original.getOriginal();
                a((D) original2, set);
                set.add(original2);
            }
        }
    }
}
