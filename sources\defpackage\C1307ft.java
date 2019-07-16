package defpackage;

import com.comscore.streaming.ContentType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ft reason: default package and case insensitive filesystem */
public final class C1307ft {
    static final Map<Character, C1276et> a = new HashMap();

    static {
        C1276et.values();
    }

    private static Map<String, Object> a(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : Ot.c(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null && !Ot.b(value)) {
                linkedHashMap.put((String) entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0201 A[EDGE_INSN: B:85:0x0201->B:83:0x0201 ?: BREAK  
EDGE_INSN: B:85:0x0201->B:83:0x0201 ?: BREAK  , SYNTHETIC] */
    public static String a(String str, String str2, Object obj, boolean z) {
        String str3;
        int length;
        int i;
        Object obj2;
        if (str2.startsWith("/")) {
            C1740ty tyVar = new C1740ty(str);
            tyVar.b(null);
            String valueOf = String.valueOf(tyVar.k());
            String valueOf2 = String.valueOf(str2);
            if (valueOf2.length() != 0) {
                str3 = valueOf.concat(valueOf2);
                Map a2 = a(obj);
                StringBuilder sb = new StringBuilder();
                length = str3.length();
                i = 0;
                while (true) {
                    if (i < length) {
                        break;
                    }
                    int indexOf = str3.indexOf(ContentType.USER_GENERATED_LIVE, i);
                    if (indexOf == -1) {
                        sb.append(str3.substring(i));
                        break;
                    }
                    sb.append(str3.substring(i, indexOf));
                    int indexOf2 = str3.indexOf(125, indexOf + 2);
                    int i2 = indexOf2 + 1;
                    String substring = str3.substring(indexOf + 1, indexOf2);
                    C1276et etVar = (C1276et) a.get(Character.valueOf(substring.charAt(0)));
                    if (etVar == null) {
                        etVar = C1276et.SIMPLE;
                    }
                    ListIterator listIterator = Ou.a(Fu.a(',')).a((CharSequence) substring).listIterator();
                    boolean z2 = true;
                    while (listIterator.hasNext()) {
                        String str4 = (String) listIterator.next();
                        boolean endsWith = str4.endsWith("*");
                        int d = listIterator.nextIndex() == 1 ? etVar.d() : 0;
                        int length2 = str4.length();
                        if (endsWith) {
                            length2--;
                        }
                        String substring2 = str4.substring(d, length2);
                        Object remove = a2.remove(substring2);
                        if (remove != null) {
                            if (!z2) {
                                sb.append(etVar.b());
                            } else {
                                sb.append(etVar.a());
                                z2 = false;
                            }
                            if (remove instanceof Iterator) {
                                obj2 = a(substring2, (Iterator) remove, endsWith, etVar);
                            } else if ((remove instanceof Iterable) || remove.getClass().isArray()) {
                                obj2 = a(substring2, C1431ju.a(remove).iterator(), endsWith, etVar);
                            } else {
                                String str5 = "%s=%s";
                                if (remove.getClass().isEnum()) {
                                    if (Ut.a((Enum) remove).b() != null) {
                                        if (etVar.c()) {
                                            remove = String.format(str5, new Object[]{substring2, remove});
                                        }
                                        remove = C1555nu.c(remove.toString());
                                    }
                                    obj2 = remove;
                                } else if (!Ot.d(remove)) {
                                    Map a3 = a(remove);
                                    if (a3.isEmpty()) {
                                        obj2 = "";
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        String str6 = "=";
                                        String str7 = ",";
                                        if (endsWith) {
                                            str7 = etVar.b();
                                        } else {
                                            if (etVar.c()) {
                                                sb2.append(C1555nu.c(substring2));
                                                sb2.append(str6);
                                            }
                                            str6 = str7;
                                        }
                                        Iterator it = a3.entrySet().iterator();
                                        while (it.hasNext()) {
                                            Entry entry = (Entry) it.next();
                                            String a4 = etVar.a((String) entry.getKey());
                                            String a5 = etVar.a(entry.getValue().toString());
                                            sb2.append(a4);
                                            sb2.append(str6);
                                            sb2.append(a5);
                                            if (it.hasNext()) {
                                                sb2.append(str7);
                                            }
                                        }
                                        obj2 = sb2.toString();
                                    }
                                } else {
                                    if (etVar.c()) {
                                        remove = String.format(str5, new Object[]{substring2, remove});
                                    }
                                    if (etVar.e()) {
                                        obj2 = C1555nu.d(remove.toString());
                                    } else {
                                        obj2 = C1555nu.c(remove.toString());
                                    }
                                }
                            }
                            sb.append(obj2);
                        }
                    }
                    i = i2;
                }
                C1740ty.a(a2.entrySet(), sb);
                return sb.toString();
            }
            str2 = new String(valueOf);
        } else if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf(str2);
            str2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        }
        str3 = str2;
        Map a22 = a(obj);
        StringBuilder sb3 = new StringBuilder();
        length = str3.length();
        i = 0;
        while (true) {
            if (i < length) {
            }
            i = i2;
        }
        C1740ty.a(a22.entrySet(), sb3);
        return sb3.toString();
    }

    private static String a(String str, Iterator<?> it, boolean z, C1276et etVar) {
        String str2;
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str3 = "=";
        if (z) {
            str2 = etVar.b();
        } else {
            if (etVar.c()) {
                sb.append(C1555nu.c(str));
                sb.append(str3);
            }
            str2 = ",";
        }
        while (it.hasNext()) {
            if (z && etVar.c()) {
                sb.append(C1555nu.c(str));
                sb.append(str3);
            }
            sb.append(etVar.a(it.next().toString()));
            if (it.hasNext()) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }
}
