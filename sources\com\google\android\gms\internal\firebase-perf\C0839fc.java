package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.d;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.firebase-perf.fc reason: case insensitive filesystem */
final class C0839fc {
    static String a(C0835ec ecVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        a(ecVar, sb, 0);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f2, code lost:
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0204, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0215, code lost:
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0227, code lost:
        if (((java.lang.Double) r11).doubleValue() == com.google.firebase.remoteconfig.FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) goto L_0x01f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x025d  */
    private static void a(C0835ec ecVar, StringBuilder sb, int i) {
        String str;
        boolean z;
        C0835ec ecVar2 = ecVar;
        StringBuilder sb2 = sb;
        int i2 = i;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        Method[] declaredMethods = ecVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            str = "get";
            if (i3 >= length) {
                break;
            }
            Method method = declaredMethods[i3];
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith(str)) {
                    treeSet.add(method.getName());
                }
            }
            i3++;
        }
        for (String str2 : treeSet) {
            String str3 = "";
            String replaceFirst = str2.replaceFirst(str, str3);
            String str4 = "List";
            boolean z2 = true;
            if (replaceFirst.endsWith(str4) && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals(str4)) {
                String valueOf = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb2, i2, a(concat), C0889sb.a(method2, (Object) ecVar2, new Object[0]));
                }
            }
            String str5 = "Map";
            if (replaceFirst.endsWith(str5) && !replaceFirst.equals(str5)) {
                String valueOf3 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(replaceFirst.substring(1, replaceFirst.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb2, i2, a(concat2), C0889sb.a(method3, (Object) ecVar2, new Object[0]));
                }
            }
            String str6 = "set";
            String valueOf5 = String.valueOf(replaceFirst);
            if (((Method) hashMap2.get(valueOf5.length() != 0 ? str6.concat(valueOf5) : new String(str6))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(replaceFirst.substring(0, replaceFirst.length() - 5));
                    if (hashMap.containsKey(valueOf6.length() != 0 ? str.concat(valueOf6) : new String(str))) {
                    }
                }
                String valueOf7 = String.valueOf(replaceFirst.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(replaceFirst.substring(1));
                String concat3 = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7);
                String valueOf9 = String.valueOf(replaceFirst);
                Method method4 = (Method) hashMap.get(valueOf9.length() != 0 ? str.concat(valueOf9) : new String(str));
                String str7 = "has";
                String valueOf10 = String.valueOf(replaceFirst);
                Method method5 = (Method) hashMap.get(valueOf10.length() != 0 ? str7.concat(valueOf10) : new String(str7));
                if (method4 != null) {
                    Object a = C0889sb.a(method4, (Object) ecVar2, new Object[0]);
                    if (method5 == null) {
                        if (!(a instanceof Boolean)) {
                            if (!(a instanceof Integer)) {
                                if (!(a instanceof Float)) {
                                    if (!(a instanceof Double)) {
                                        z = a instanceof String ? a.equals(str3) : a instanceof Oa ? a.equals(Oa.a) : !(a instanceof C0835ec) ? false : false;
                                        if (z) {
                                            z2 = false;
                                        }
                                    }
                                }
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    } else {
                        z2 = ((Boolean) C0889sb.a(method5, (Object) ecVar2, new Object[0])).booleanValue();
                    }
                    if (z2) {
                        a(sb2, i2, a(concat3), a);
                    }
                }
            }
        }
        if (ecVar2 instanceof d) {
            Iterator d = ((d) ecVar2).zzrg.d();
            if (d.hasNext()) {
                ((Entry) d.next()).getKey();
                throw new NoSuchMethodError();
            }
        }
        Nc nc = ((C0889sb) ecVar2).zzql;
        if (nc != null) {
            nc.a(sb2, i2);
        }
    }

    static final void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                a(sb, i, str, a);
            }
        } else if (obj instanceof Map) {
            for (Entry a2 : ((Map) obj).entrySet()) {
                a(sb, i, str, a2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            String str2 = ": \"";
            if (obj instanceof String) {
                sb.append(str2);
                sb.append(Gc.a(Oa.a((String) obj)));
                sb.append('\"');
            } else if (obj instanceof Oa) {
                sb.append(str2);
                sb.append(Gc.a((Oa) obj));
                sb.append('\"');
            } else {
                String str3 = "}";
                String str4 = "\n";
                String str5 = " {";
                if (obj instanceof C0889sb) {
                    sb.append(str5);
                    a((C0889sb) obj, sb, i + 2);
                    sb.append(str4);
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                    sb.append(str3);
                } else if (obj instanceof Entry) {
                    sb.append(str5);
                    Entry entry = (Entry) obj;
                    int i4 = i + 2;
                    a(sb, i4, "key", entry.getKey());
                    a(sb, i4, "value", entry.getValue());
                    sb.append(str4);
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                    sb.append(str3);
                } else {
                    sb.append(": ");
                    sb.append(obj.toString());
                }
            }
        }
    }

    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
