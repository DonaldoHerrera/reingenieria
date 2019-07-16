package defpackage;

import com.comscore.streaming.ContentType;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: Sbb reason: default package and case insensitive filesystem */
/* compiled from: KotlinBuiltIns */
public abstract class C5301Sbb {
    public static final C7694xnb a = C7694xnb.b("kotlin");
    public static final C7349snb b = C7349snb.c(a);
    /* access modifiers changed from: private */
    public static final C7349snb c = b.a(C7694xnb.b("annotation"));
    public static final C7349snb d = b.a(C7694xnb.b("collections"));
    public static final C7349snb e = b.a(C7694xnb.b("ranges"));
    public static final C7349snb f = b.a(C7694xnb.b("text"));
    public static final Set<C7349snb> g = SWa.c(b, d, e, c, C5418Wbb.a(), b.a(C7694xnb.b("internal")), C6531gpb.c);
    public static final a h = new a();
    public static final C7694xnb i = C7694xnb.d("<built-ins module>");
    /* access modifiers changed from: private */
    public C6792kfb j;
    private final Psb<b> k;
    private final Psb<Collection<C7132pdb>> l;
    private final Msb<C7694xnb, C5029Jcb> m;
    private final Ssb n;

    /* renamed from: Sbb$a */
    /* compiled from: KotlinBuiltIns */
    public static class a {
        public final C7349snb A = c("ExtensionFunctionType");
        public final C7349snb B = c("ParameterName");
        public final C7349snb C = c("Annotation");
        public final C7349snb D = a("Target");
        public final C7349snb E = a("AnnotationTarget");
        public final C7349snb F = a("AnnotationRetention");
        public final C7349snb G = a("Retention");
        public final C7349snb H = a("Repeatable");
        public final C7349snb I = a("MustBeDocumented");
        public final C7349snb J = c("UnsafeVariance");
        public final C7349snb K = c("PublishedApi");
        public final C7349snb L = b("Iterator");
        public final C7349snb M = b("Iterable");
        public final C7349snb N = b("Collection");
        public final C7349snb O = b("List");
        public final C7349snb P = b("ListIterator");
        public final C7349snb Q = b("Set");
        public final C7349snb R = b("Map");
        public final C7349snb S = this.R.a(C7694xnb.b("Entry"));
        public final C7349snb T = b("MutableIterator");
        public final C7349snb U = b("MutableIterable");
        public final C7349snb V = b("MutableCollection");
        public final C7349snb W = b("MutableList");
        public final C7349snb X = b("MutableListIterator");
        public final C7349snb Y = b("MutableSet");
        public final C7349snb Z = b("MutableMap");
        public final C7487unb a = d("Any");
        public final C7349snb aa = this.Z.a(C7694xnb.b("MutableEntry"));
        public final C7487unb b = d("Nothing");
        public final C7487unb ba = f("KClass");
        public final C7487unb c = d("Cloneable");
        public final C7487unb ca = f("KCallable");
        public final C7349snb d = c("Suppress");
        public final C7487unb da = f("KProperty0");
        public final C7487unb e = d("Unit");
        public final C7487unb ea = f("KProperty1");
        public final C7487unb f = d("CharSequence");
        public final C7487unb fa = f("KProperty2");
        public final C7487unb g = d("String");
        public final C7487unb ga = f("KMutableProperty0");
        public final C7487unb h = d("Array");
        public final C7487unb ha = f("KMutableProperty1");
        public final C7487unb i = d("Boolean");
        public final C7487unb ia = f("KMutableProperty2");
        public final C7487unb j = d("Char");
        public final C7487unb ja = f("KProperty");
        public final C7487unb k = d("Byte");
        public final C7487unb ka = f("KMutableProperty");
        public final C7487unb l = d("Short");
        public final C7280rnb la = C7280rnb.a(this.ja.h());
        public final C7487unb m = d("Int");
        public final C7349snb ma = c("UByte");
        public final C7487unb n = d("Long");
        public final C7349snb na = c("UShort");
        public final C7487unb o = d("Float");
        public final C7349snb oa = c("UInt");
        public final C7487unb p = d("Double");
        public final C7349snb pa = c("ULong");
        public final C7487unb q = d("Number");
        public final C7280rnb qa = C7280rnb.a(this.ma);
        public final C7487unb r = d("Enum");
        public final C7280rnb ra = C7280rnb.a(this.na);
        public final C7487unb s = d("Function");
        public final C7280rnb sa = C7280rnb.a(this.oa);
        public final C7349snb t = c("Throwable");
        public final C7280rnb ta = C7280rnb.a(this.pa);
        public final C7349snb u = c("Comparable");
        public final Set<C7694xnb> ua = C7089ovb.b(C5331Tbb.values().length);
        public final C7487unb v = e("IntRange");
        public final Set<C7694xnb> va = C7089ovb.b(C5331Tbb.values().length);
        public final C7487unb w = e("LongRange");
        public final Map<C7487unb, C5331Tbb> wa = C7089ovb.a(C5331Tbb.values().length);
        public final C7349snb x = c("Deprecated");
        public final Map<C7487unb, C5331Tbb> xa = C7089ovb.a(C5331Tbb.values().length);
        public final C7349snb y = c("DeprecationLevel");
        public final C7349snb z = c("ReplaceWith");

        public a() {
            C5331Tbb[] values;
            for (C5331Tbb tbb : C5331Tbb.values()) {
                this.ua.add(tbb.d());
                this.va.add(tbb.b());
                this.wa.put(d(tbb.d().a()), tbb);
                this.xa.put(d(tbb.b().a()), tbb);
            }
        }

        private static C7349snb a(String str) {
            if (str != null) {
                C7349snb a2 = C5301Sbb.c.a(C7694xnb.b(str));
                if (a2 != null) {
                    return a2;
                }
                a(11);
                throw null;
            }
            a(10);
            throw null;
        }

        private static /* synthetic */ void a(int i2) {
            int i3 = i2;
            String str = (i3 == 1 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i3 == 1 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$FqNames";
            if (i3 == 1 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11) {
                objArr[0] = str2;
            } else {
                objArr[0] = "simpleName";
            }
            String str3 = "annotationName";
            String str4 = "reflect";
            String str5 = "rangesFqName";
            String str6 = "collectionsFqName";
            String str7 = "fqName";
            String str8 = "fqNameUnsafe";
            if (i3 == 1) {
                objArr[1] = str8;
            } else if (i3 == 3) {
                objArr[1] = str7;
            } else if (i3 == 5) {
                objArr[1] = str6;
            } else if (i3 == 7) {
                objArr[1] = str5;
            } else if (i3 == 9) {
                objArr[1] = str4;
            } else if (i3 != 11) {
                objArr[1] = str2;
            } else {
                objArr[1] = str3;
            }
            switch (i3) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                    break;
                case 2:
                    objArr[2] = str7;
                    break;
                case 4:
                    objArr[2] = str6;
                    break;
                case 6:
                    objArr[2] = str5;
                    break;
                case 8:
                    objArr[2] = str4;
                    break;
                case 10:
                    objArr[2] = str3;
                    break;
                default:
                    objArr[2] = str8;
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i3 == 1 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        private static C7349snb b(String str) {
            if (str != null) {
                C7349snb a2 = C5301Sbb.d.a(C7694xnb.b(str));
                if (a2 != null) {
                    return a2;
                }
                a(5);
                throw null;
            }
            a(4);
            throw null;
        }

        private static C7349snb c(String str) {
            if (str != null) {
                C7349snb a2 = C5301Sbb.b.a(C7694xnb.b(str));
                if (a2 != null) {
                    return a2;
                }
                a(3);
                throw null;
            }
            a(2);
            throw null;
        }

        private static C7487unb d(String str) {
            if (str != null) {
                C7487unb g2 = c(str).g();
                if (g2 != null) {
                    return g2;
                }
                a(1);
                throw null;
            }
            a(0);
            throw null;
        }

        private static C7487unb e(String str) {
            if (str != null) {
                C7487unb g2 = C5301Sbb.e.a(C7694xnb.b(str)).g();
                if (g2 != null) {
                    return g2;
                }
                a(7);
                throw null;
            }
            a(6);
            throw null;
        }

        private static C7487unb f(String str) {
            if (str != null) {
                C7487unb g2 = C5418Wbb.a().a(C7694xnb.b(str)).g();
                if (g2 != null) {
                    return g2;
                }
                a(9);
                throw null;
            }
            a(8);
            throw null;
        }
    }

    /* renamed from: Sbb$b */
    /* compiled from: KotlinBuiltIns */
    private static class b {
        public final Map<C5331Tbb, Etb> a;
        public final Map<C7706xtb, Etb> b;
        public final Map<Etb, Etb> c;

        /* synthetic */ b(Map map, Map map2, Map map3, C5211Pbb pbb) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private b(Map<C5331Tbb, Etb> map, Map<C7706xtb, Etb> map2, Map<Etb, Etb> map3) {
            if (map == null) {
                a(0);
                throw null;
            } else if (map2 == null) {
                a(1);
                throw null;
            } else if (map3 != null) {
                this.a = map;
                this.b = map2;
                this.c = map3;
            } else {
                a(2);
                throw null;
            }
        }
    }

    protected C5301Sbb(Ssb ssb) {
        if (ssb != null) {
            this.n = ssb;
            this.l = ssb.a((PXa<? extends T>) new C5211Pbb<Object>(this));
            this.k = ssb.a((PXa<? extends T>) new C5241Qbb<Object>(this));
            this.m = ssb.b((_Xa<? super K, ? extends V>) new C5271Rbb<Object,Object>(this));
            return;
        }
        e(0);
        throw null;
    }

    private static /* synthetic */ void e(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 93:
            case 95:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 93:
            case 95:
            case 96:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        String str2 = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
        switch (i2) {
            case 1:
            case 84:
                objArr[0] = "module";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 93:
            case 95:
            case 96:
                objArr[0] = str2;
                break;
            case 8:
            case 9:
            case 89:
            case 90:
            case 98:
            case 105:
            case 110:
            case 114:
            case 115:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 11:
            case 107:
            case 109:
            case 111:
            case 113:
            case 137:
                objArr[0] = "fqName";
                break;
            case 13:
                objArr[0] = "simpleName";
                break;
            case 17:
            case 28:
            case 66:
            case 97:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 106:
            case 108:
            case 112:
            case 116:
            case 117:
            case 118:
            case 120:
            case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /*121*/:
            case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /*122*/:
            case ContentType.USER_GENERATED_LIVE /*123*/:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 162:
                objArr[0] = C1325gg.TYPE;
                break;
            case 59:
                objArr[0] = "classSimpleName";
                break;
            case 79:
                objArr[0] = "arrayType";
                break;
            case 83:
                objArr[0] = "notNullArrayType";
                break;
            case 85:
            case 163:
                objArr[0] = "primitiveType";
                break;
            case 87:
                objArr[0] = "kotlinType";
                break;
            case 88:
                objArr[0] = "arrayFqName";
                break;
            case 91:
                objArr[0] = "projectionType";
                break;
            case 92:
            case 94:
                objArr[0] = "argument";
                break;
            case 119:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        String str3 = "getEnumType";
        String str4 = "getArrayType";
        String str5 = "getPrimitiveArrayKotlinType";
        String str6 = "getArrayElementType";
        String str7 = "getPrimitiveKotlinType";
        String str8 = "getBuiltInTypeByClassName";
        String str9 = "getPrimitiveArrayClassDescriptor";
        String str10 = "getPrimitiveClassDescriptor";
        String str11 = "getBuiltInClassByName";
        String str12 = "getBuiltInClassByFqName";
        switch (i2) {
            case 2:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 3:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 4:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 5:
                objArr[1] = "getStorageManager";
                break;
            case 6:
                objArr[1] = "getBuiltInsModule";
                break;
            case 7:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 10:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 12:
                objArr[1] = str12;
                break;
            case 14:
                objArr[1] = str11;
                break;
            case 15:
                objArr[1] = "getAny";
                break;
            case 16:
                objArr[1] = "getNothing";
                break;
            case 18:
                objArr[1] = str10;
                break;
            case 19:
                objArr[1] = "getByte";
                break;
            case 20:
                objArr[1] = "getShort";
                break;
            case 21:
                objArr[1] = "getInt";
                break;
            case 22:
                objArr[1] = "getLong";
                break;
            case 23:
                objArr[1] = "getFloat";
                break;
            case 24:
                objArr[1] = "getDouble";
                break;
            case 25:
                objArr[1] = "getChar";
                break;
            case 26:
                objArr[1] = "getBoolean";
                break;
            case 27:
                objArr[1] = "getArray";
                break;
            case 29:
                objArr[1] = str9;
                break;
            case 30:
                objArr[1] = "getNumber";
                break;
            case 31:
                objArr[1] = "getUnit";
                break;
            case 32:
                objArr[1] = "getFunctionName";
                break;
            case 33:
                objArr[1] = "getFunctionClassId";
                break;
            case 34:
                objArr[1] = "getFunction";
                break;
            case 35:
                objArr[1] = "getSuspendFunction";
                break;
            case 36:
                objArr[1] = "getThrowable";
                break;
            case 37:
                objArr[1] = "getString";
                break;
            case 38:
                objArr[1] = "getCharSequence";
                break;
            case 39:
                objArr[1] = "getComparable";
                break;
            case 40:
                objArr[1] = "getEnum";
                break;
            case 41:
                objArr[1] = "getAnnotation";
                break;
            case 42:
                objArr[1] = "getKClass";
                break;
            case 43:
                objArr[1] = "getIterator";
                break;
            case 44:
                objArr[1] = "getIterable";
                break;
            case 45:
                objArr[1] = "getMutableIterable";
                break;
            case 46:
                objArr[1] = "getMutableIterator";
                break;
            case 47:
                objArr[1] = "getCollection";
                break;
            case 48:
                objArr[1] = "getMutableCollection";
                break;
            case 49:
                objArr[1] = "getList";
                break;
            case 50:
                objArr[1] = "getMutableList";
                break;
            case 51:
                objArr[1] = "getSet";
                break;
            case 52:
                objArr[1] = "getMutableSet";
                break;
            case 53:
                objArr[1] = "getMap";
                break;
            case 54:
                objArr[1] = "getMutableMap";
                break;
            case 55:
                objArr[1] = "getMapEntry";
                break;
            case 56:
                objArr[1] = "getMutableMapEntry";
                break;
            case 57:
                objArr[1] = "getListIterator";
                break;
            case 58:
                objArr[1] = "getMutableListIterator";
                break;
            case 60:
                objArr[1] = str8;
                break;
            case 61:
                objArr[1] = "getNothingType";
                break;
            case 62:
                objArr[1] = "getNullableNothingType";
                break;
            case 63:
                objArr[1] = "getAnyType";
                break;
            case 64:
                objArr[1] = "getNullableAnyType";
                break;
            case 65:
                objArr[1] = "getDefaultBound";
                break;
            case 67:
                objArr[1] = str7;
                break;
            case 68:
                objArr[1] = "getByteType";
                break;
            case 69:
                objArr[1] = "getShortType";
                break;
            case 70:
                objArr[1] = "getIntType";
                break;
            case 71:
                objArr[1] = "getLongType";
                break;
            case 72:
                objArr[1] = "getFloatType";
                break;
            case 73:
                objArr[1] = "getDoubleType";
                break;
            case 74:
                objArr[1] = "getCharType";
                break;
            case 75:
                objArr[1] = "getBooleanType";
                break;
            case 76:
                objArr[1] = "getUnitType";
                break;
            case 77:
                objArr[1] = "getStringType";
                break;
            case 78:
                objArr[1] = "getIterableType";
                break;
            case 80:
            case 81:
            case 82:
                objArr[1] = str6;
                break;
            case 86:
                objArr[1] = str5;
                break;
            case 93:
                objArr[1] = str4;
                break;
            case 95:
                objArr[1] = str3;
                break;
            case 96:
                objArr[1] = "getAnnotationType";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i2) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 93:
            case 95:
            case 96:
                break;
            case 8:
                objArr[2] = "isBuiltIn";
                break;
            case 9:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 11:
                objArr[2] = str12;
                break;
            case 13:
                objArr[2] = str11;
                break;
            case 17:
                objArr[2] = str10;
                break;
            case 28:
                objArr[2] = str9;
                break;
            case 59:
                objArr[2] = str8;
                break;
            case 66:
                objArr[2] = str7;
                break;
            case 79:
                objArr[2] = str6;
                break;
            case 83:
            case 84:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 85:
                objArr[2] = str5;
                break;
            case 87:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 88:
            case 100:
                objArr[2] = "isPrimitiveArray";
                break;
            case 89:
            case 102:
                objArr[2] = "getPrimitiveType";
                break;
            case 90:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 91:
            case 92:
                objArr[2] = str4;
                break;
            case 94:
                objArr[2] = str3;
                break;
            case 97:
                objArr[2] = "isArray";
                break;
            case 98:
            case 99:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 101:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 103:
                objArr[2] = "isPrimitiveType";
                break;
            case 104:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 105:
                objArr[2] = "isPrimitiveClass";
                break;
            case 106:
            case 107:
            case 108:
            case 109:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 110:
            case 111:
                objArr[2] = "classFqNameEquals";
                break;
            case 112:
            case 113:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 114:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 115:
            case 116:
                objArr[2] = "isAny";
                break;
            case 117:
            case 119:
                objArr[2] = "isBoolean";
                break;
            case 118:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 120:
                objArr[2] = "isNumber";
                break;
            case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /*121*/:
                objArr[2] = "isChar";
                break;
            case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /*122*/:
                objArr[2] = "isCharOrNullableChar";
                break;
            case ContentType.USER_GENERATED_LIVE /*123*/:
                objArr[2] = "isInt";
                break;
            case 124:
                objArr[2] = "isByte";
                break;
            case 125:
                objArr[2] = "isLong";
                break;
            case 126:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 127:
                objArr[2] = "isShort";
                break;
            case 128:
                objArr[2] = "isFloat";
                break;
            case 129:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 130:
                objArr[2] = "isDouble";
                break;
            case 131:
                objArr[2] = "isUByte";
                break;
            case 132:
                objArr[2] = "isUShort";
                break;
            case 133:
                objArr[2] = "isUInt";
                break;
            case 134:
                objArr[2] = "isULong";
                break;
            case 135:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 136:
            case 137:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 138:
                objArr[2] = "isNothing";
                break;
            case 139:
                objArr[2] = "isNullableNothing";
                break;
            case 140:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 141:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 142:
                objArr[2] = "isNullableAny";
                break;
            case 143:
                objArr[2] = "isDefaultBound";
                break;
            case 144:
                objArr[2] = "isUnit";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            case 163:
                objArr[2] = "getPrimitiveFqName";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 93:
            case 95:
            case 96:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public static boolean e(C5272Rcb rcb) {
        if (rcb != null) {
            while (rcb != null) {
                if (rcb instanceof C6790kdb) {
                    return ((C6790kdb) rcb).q().b(a);
                }
                rcb = rcb.e();
            }
            return false;
        }
        e(9);
        throw null;
    }

    /* access modifiers changed from: protected */
    public Ssb A() {
        Ssb ssb = this.n;
        if (ssb != null) {
            return ssb;
        }
        e(5);
        throw null;
    }

    public C5029Jcb B() {
        C5029Jcb a2 = a("String");
        if (a2 != null) {
            return a2;
        }
        e(37);
        throw null;
    }

    public Etb C() {
        Etb z = B().z();
        if (z != null) {
            return z;
        }
        e(77);
        throw null;
    }

    public C5029Jcb D() {
        C5029Jcb a2 = a("Unit");
        if (a2 != null) {
            return a2;
        }
        e(31);
        throw null;
    }

    public Etb E() {
        Etb z = D().z();
        if (z != null) {
            return z;
        }
        e(76);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.j = new C6792kfb(i, this.n, this, null);
        this.j.a(C5028Jbb.a.a().a(this.n, this.j, l(), y(), c()));
        C6792kfb kfb = this.j;
        kfb.a(kfb);
    }

    /* access modifiers changed from: protected */
    public C7478ueb c() {
        defpackage.C7478ueb.a aVar = defpackage.C7478ueb.a.a;
        if (aVar != null) {
            return aVar;
        }
        e(2);
        throw null;
    }

    public C5029Jcb d() {
        C5029Jcb a2 = a("Any");
        if (a2 != null) {
            return a2;
        }
        e(15);
        throw null;
    }

    public C5029Jcb f() {
        C5029Jcb a2 = a("Array");
        if (a2 != null) {
            return a2;
        }
        e(27);
        throw null;
    }

    public Etb g() {
        Etb c2 = c(C5331Tbb.BOOLEAN);
        if (c2 != null) {
            return c2;
        }
        e(75);
        throw null;
    }

    public C6792kfb h() {
        C6792kfb kfb = this.j;
        if (kfb != null) {
            return kfb;
        }
        e(6);
        throw null;
    }

    public Eqb i() {
        Eqb ha = this.j.a(b).ha();
        if (ha != null) {
            return ha;
        }
        e(10);
        throw null;
    }

    public Etb j() {
        Etb c2 = c(C5331Tbb.BYTE);
        if (c2 != null) {
            return c2;
        }
        e(68);
        throw null;
    }

    public Etb k() {
        Etb c2 = c(C5331Tbb.CHAR);
        if (c2 != null) {
            return c2;
        }
        e(74);
        throw null;
    }

    /* access modifiers changed from: protected */
    public Iterable<C7547veb> l() {
        List singletonList = Collections.singletonList(new C5534_bb(this.n, this.j));
        if (singletonList != null) {
            return singletonList;
        }
        e(4);
        throw null;
    }

    public C5029Jcb m() {
        C5029Jcb a2 = a(h.N);
        if (a2 != null) {
            return a2;
        }
        e(47);
        throw null;
    }

    public Etb n() {
        Etb v = v();
        if (v != null) {
            return v;
        }
        e(65);
        throw null;
    }

    public Etb o() {
        Etb c2 = c(C5331Tbb.DOUBLE);
        if (c2 != null) {
            return c2;
        }
        e(73);
        throw null;
    }

    public Etb p() {
        Etb c2 = c(C5331Tbb.FLOAT);
        if (c2 != null) {
            return c2;
        }
        e(72);
        throw null;
    }

    public Etb q() {
        Etb c2 = c(C5331Tbb.INT);
        if (c2 != null) {
            return c2;
        }
        e(70);
        throw null;
    }

    public C5029Jcb r() {
        C5029Jcb a2 = a(h.ba.h());
        if (a2 != null) {
            return a2;
        }
        e(42);
        throw null;
    }

    public Etb s() {
        Etb c2 = c(C5331Tbb.LONG);
        if (c2 != null) {
            return c2;
        }
        e(71);
        throw null;
    }

    public C5029Jcb t() {
        C5029Jcb a2 = a("Nothing");
        if (a2 != null) {
            return a2;
        }
        e(16);
        throw null;
    }

    public Etb u() {
        Etb z = t().z();
        if (z != null) {
            return z;
        }
        e(61);
        throw null;
    }

    public Etb v() {
        Etb a2 = e().a(true);
        if (a2 != null) {
            return a2;
        }
        e(64);
        throw null;
    }

    public Etb w() {
        Etb a2 = u().a(true);
        if (a2 != null) {
            return a2;
        }
        e(62);
        throw null;
    }

    public C5029Jcb x() {
        C5029Jcb a2 = a("Number");
        if (a2 != null) {
            return a2;
        }
        e(30);
        throw null;
    }

    /* access modifiers changed from: protected */
    public C7616web y() {
        defpackage.C7616web.b bVar = defpackage.C7616web.b.a;
        if (bVar != null) {
            return bVar;
        }
        e(3);
        throw null;
    }

    public Etb z() {
        Etb c2 = c(C5331Tbb.SHORT);
        if (c2 != null) {
            return c2;
        }
        e(69);
        throw null;
    }

    public static boolean c(C5272Rcb rcb) {
        if (rcb != null) {
            return C6531gpb.a(rcb, C5059Kbb.class, false) != null;
        }
        e(8);
        throw null;
    }

    private C5029Jcb d(C5331Tbb tbb) {
        if (tbb != null) {
            C5029Jcb a2 = a(tbb.d().a());
            if (a2 != null) {
                return a2;
            }
            e(18);
            throw null;
        }
        e(17);
        throw null;
    }

    public static boolean f(C7706xtb xtb) {
        if (xtb != null) {
            return b(xtb, h.k);
        }
        e(124);
        throw null;
    }

    public static boolean g(C7706xtb xtb) {
        if (xtb != null) {
            return b(xtb, h.j);
        }
        e((int) ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND);
        throw null;
    }

    public static boolean h(C7706xtb xtb) {
        if (xtb != null) {
            return q(xtb);
        }
        e(143);
        throw null;
    }

    public static boolean i(C7706xtb xtb) {
        if (xtb != null) {
            return j(xtb) && !xtb.Aa();
        }
        e(130);
        throw null;
    }

    public static boolean j(C7706xtb xtb) {
        if (xtb != null) {
            return a(xtb, h.p);
        }
        e(135);
        throw null;
    }

    public static boolean k(C7706xtb xtb) {
        if (xtb != null) {
            return l(xtb) && !xtb.Aa();
        }
        e(128);
        throw null;
    }

    public static boolean l(C7706xtb xtb) {
        if (xtb != null) {
            return a(xtb, h.o);
        }
        e(129);
        throw null;
    }

    public static boolean m(C7706xtb xtb) {
        if (xtb != null) {
            return b(xtb, h.m);
        }
        e((int) ContentType.USER_GENERATED_LIVE);
        throw null;
    }

    public static boolean n(C7706xtb xtb) {
        if (xtb != null) {
            return b(xtb, h.n);
        }
        e(125);
        throw null;
    }

    public static boolean o(C7706xtb xtb) {
        if (xtb != null) {
            return p(xtb) && !C5605aub.g(xtb);
        }
        e(138);
        throw null;
    }

    public static boolean p(C7706xtb xtb) {
        if (xtb != null) {
            return a(xtb, h.b);
        }
        e(140);
        throw null;
    }

    public static boolean q(C7706xtb xtb) {
        if (xtb != null) {
            return c(xtb) && xtb.Aa();
        }
        e(142);
        throw null;
    }

    public static boolean r(C7706xtb xtb) {
        if (xtb != null) {
            C5122Mcb c2 = xtb.za().c();
            return (c2 == null || a((C5272Rcb) c2) == null) ? false : true;
        }
        e(100);
        throw null;
    }

    public static boolean s(C7706xtb xtb) {
        if (xtb != null) {
            return !xtb.Aa() && t(xtb);
        }
        e(103);
        throw null;
    }

    public static boolean t(C7706xtb xtb) {
        if (xtb != null) {
            C5122Mcb c2 = xtb.za().c();
            return (c2 instanceof C5029Jcb) && d((C5029Jcb) c2);
        }
        e(104);
        throw null;
    }

    public static boolean u(C7706xtb xtb) {
        if (xtb != null) {
            return b(xtb, h.l);
        }
        e(127);
        throw null;
    }

    public static boolean v(C7706xtb xtb) {
        return xtb != null && c(xtb, h.g);
    }

    public static boolean w(C7706xtb xtb) {
        if (xtb != null) {
            return c(xtb, h.e);
        }
        e(144);
        throw null;
    }

    public static C7280rnb b(int i2) {
        return new C7280rnb(b, C7694xnb.b(c(i2)));
    }

    public static String c(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Function");
        sb.append(i2);
        String sb2 = sb.toString();
        if (sb2 != null) {
            return sb2;
        }
        e(32);
        throw null;
    }

    public C5029Jcb a(C7349snb snb) {
        if (snb != null) {
            C5029Jcb a2 = C5419Wcb.a(this.j, snb, Ffb.FROM_BUILTINS);
            if (a2 != null) {
                return a2;
            }
            e(12);
            throw null;
        }
        e(11);
        throw null;
    }

    public C5029Jcb d(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(c.b.a());
        sb.append(i2);
        C5029Jcb a2 = a(C6531gpb.c.a(C7694xnb.b(sb.toString())));
        if (a2 != null) {
            return a2;
        }
        e(35);
        throw null;
    }

    /* access modifiers changed from: private */
    public Etb b(String str) {
        if (str != null) {
            Etb z = a(str).z();
            if (z != null) {
                return z;
            }
            e(60);
            throw null;
        }
        e(59);
        throw null;
    }

    public Etb c(C5331Tbb tbb) {
        if (tbb != null) {
            Etb z = d(tbb).z();
            if (z != null) {
                return z;
            }
            e(67);
            throw null;
        }
        e(66);
        throw null;
    }

    public Etb e() {
        Etb z = d().z();
        if (z != null) {
            return z;
        }
        e(63);
        throw null;
    }

    public static boolean d(C7706xtb xtb) {
        if (xtb != null) {
            return a(xtb, h.h);
        }
        e(97);
        throw null;
    }

    public static boolean e(C5029Jcb jcb) {
        if (jcb != null) {
            return a((C5122Mcb) jcb, h.a) || a((C5122Mcb) jcb, h.b);
        }
        e(114);
        throw null;
    }

    private C5029Jcb a(String str) {
        if (str != null) {
            C5029Jcb jcb = (C5029Jcb) this.m.invoke(C7694xnb.b(str));
            if (jcb != null) {
                return jcb;
            }
            e(14);
            throw null;
        }
        e(13);
        throw null;
    }

    private static boolean c(C7706xtb xtb, C7487unb unb) {
        if (xtb == null) {
            e(112);
            throw null;
        } else if (unb != null) {
            return !xtb.Aa() && a(xtb, unb);
        } else {
            e(113);
            throw null;
        }
    }

    public Etb b(C7706xtb xtb) {
        if (xtb != null) {
            Etb etb = (Etb) ((b) this.k.d()).b.get(xtb);
            if (etb != null) {
                return etb;
            }
            if (!C5505Zbb.e.a(xtb) || C5605aub.g(xtb)) {
                return null;
            }
            C6450fdb b2 = C6531gpb.b(xtb);
            if (b2 == null) {
                return null;
            }
            C5029Jcb a2 = C5535_cb.a(b2, C5505Zbb.e.a(C7148pqb.a(xtb.za().c())));
            if (a2 == null) {
                return null;
            }
            return a2.z();
        }
        e(87);
        throw null;
    }

    public static boolean d(C5029Jcb jcb) {
        if (jcb != null) {
            return b((C5272Rcb) jcb) != null;
        }
        e(105);
        throw null;
    }

    public static boolean e(C7706xtb xtb) {
        if (xtb != null) {
            return b(xtb, h.i);
        }
        e(117);
        throw null;
    }

    public static boolean c(C7706xtb xtb) {
        if (xtb != null) {
            return a(xtb, h.a);
        }
        e(141);
        throw null;
    }

    public C5029Jcb a(int i2) {
        C5029Jcb a2 = a(c(i2));
        if (a2 != null) {
            return a2;
        }
        e(34);
        throw null;
    }

    public static boolean d(C5272Rcb rcb) {
        if (rcb != null) {
            boolean z = true;
            if (rcb.getOriginal().getAnnotations().b(h.x)) {
                return true;
            }
            if (!(rcb instanceof C7408tdb)) {
                return false;
            }
            C7408tdb tdb = (C7408tdb) rcb;
            boolean V = tdb.V();
            C7477udb b2 = tdb.b();
            C7546vdb c2 = tdb.c();
            if (b2 == null || !d((C5272Rcb) b2) || (V && (c2 == null || !d((C5272Rcb) c2)))) {
                z = false;
            }
            return z;
        }
        e(161);
        throw null;
    }

    public C7706xtb a(C7706xtb xtb) {
        if (xtb == null) {
            e(79);
            throw null;
        } else if (!d(xtb)) {
            C7706xtb i2 = C5605aub.i(xtb);
            C7706xtb xtb2 = (C7706xtb) ((b) this.k.d()).c.get(i2);
            if (xtb2 == null) {
                C6450fdb b2 = C6531gpb.b(i2);
                if (b2 != null) {
                    C7706xtb a2 = a(i2, b2);
                    if (a2 != null) {
                        if (a2 != null) {
                            return a2;
                        }
                        e(82);
                        throw null;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("not array: ");
                sb.append(xtb);
                throw new IllegalStateException(sb.toString());
            } else if (xtb2 != null) {
                return xtb2;
            } else {
                e(81);
                throw null;
            }
        } else if (xtb.ya().size() == 1) {
            C7706xtb type = ((Stb) xtb.ya().get(0)).getType();
            if (type != null) {
                return type;
            }
            e(80);
            throw null;
        } else {
            throw new IllegalStateException();
        }
    }

    public static boolean c(C5029Jcb jcb) {
        if (jcb != null) {
            return a((C5122Mcb) jcb, h.ba);
        }
        e(158);
        throw null;
    }

    public static C5331Tbb b(C5272Rcb rcb) {
        if (rcb == null) {
            e(89);
            throw null;
        } else if (h.ua.contains(rcb.getName())) {
            return (C5331Tbb) h.wa.get(C6531gpb.e(rcb));
        } else {
            return null;
        }
    }

    public static boolean b(C5029Jcb jcb) {
        if (jcb != null) {
            return a((C5122Mcb) jcb, h.h) || a((C5272Rcb) jcb) != null;
        }
        e(98);
        throw null;
    }

    private static boolean b(C7706xtb xtb, C7487unb unb) {
        if (xtb == null) {
            e(136);
            throw null;
        } else if (unb != null) {
            return a(xtb, unb) && !xtb.Aa();
        } else {
            e(137);
            throw null;
        }
    }

    private static C7706xtb a(C7706xtb xtb, C6450fdb fdb) {
        if (xtb == null) {
            e(83);
            throw null;
        } else if (fdb != null) {
            C5122Mcb c2 = xtb.za().c();
            if (c2 == null || !C5505Zbb.e.a(c2.getName())) {
                return null;
            }
            C7280rnb a2 = C7148pqb.a(c2);
            if (a2 == null) {
                return null;
            }
            C7280rnb b2 = C5505Zbb.e.b(a2);
            if (b2 == null) {
                return null;
            }
            C5029Jcb a3 = C5535_cb.a(fdb, b2);
            if (a3 == null) {
                return null;
            }
            return a3.z();
        } else {
            e(84);
            throw null;
        }
    }

    public static C7349snb b(C5331Tbb tbb) {
        if (tbb != null) {
            return b.a(tbb.d());
        }
        e(163);
        throw null;
    }

    public Etb a(C5331Tbb tbb) {
        if (tbb != null) {
            Etb etb = (Etb) ((b) this.k.d()).a.get(tbb);
            if (etb != null) {
                return etb;
            }
            e(86);
            throw null;
        }
        e(85);
        throw null;
    }

    public static boolean a(C7487unb unb) {
        if (unb != null) {
            return h.xa.get(unb) != null;
        }
        e(88);
        throw null;
    }

    public static C5331Tbb a(C5272Rcb rcb) {
        if (rcb == null) {
            e(90);
            throw null;
        } else if (h.va.contains(rcb.getName())) {
            return (C5331Tbb) h.xa.get(C6531gpb.e(rcb));
        } else {
            return null;
        }
    }

    public Etb a(C6473fub fub, C7706xtb xtb) {
        if (fub == null) {
            e(91);
            throw null;
        } else if (xtb != null) {
            Etb a2 = C7775ytb.a(C6723jeb.c.a(), f(), Collections.singletonList(new Utb(fub, xtb)));
            if (a2 != null) {
                return a2;
            }
            e(93);
            throw null;
        } else {
            e(92);
            throw null;
        }
    }

    private static boolean a(C7706xtb xtb, C7487unb unb) {
        if (xtb == null) {
            e(106);
            throw null;
        } else if (unb != null) {
            C5122Mcb c2 = xtb.za().c();
            return (c2 instanceof C5029Jcb) && a(c2, unb);
        } else {
            e(107);
            throw null;
        }
    }

    private static boolean a(C5122Mcb mcb, C7487unb unb) {
        if (mcb == null) {
            e(110);
            throw null;
        } else if (unb != null) {
            return mcb.getName().equals(unb.f()) && unb.equals(C6531gpb.e(mcb));
        } else {
            e(111);
            throw null;
        }
    }

    public static boolean a(C5029Jcb jcb) {
        if (jcb != null) {
            return a((C5122Mcb) jcb, h.a);
        }
        e(115);
        throw null;
    }
}
