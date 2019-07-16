package defpackage;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: gt reason: default package and case insensitive filesystem */
public final class C1338gt implements C1246du {
    public static final String a;

    static {
        C1890yy yyVar = new C1890yy("application/x-www-form-urlencoded");
        yyVar.a(Jt.a);
        a = yyVar.a();
    }

    public static void a(String str, Object obj) {
        String str2 = str;
        Object obj2 = obj;
        if (str2 != null) {
            try {
                StringReader stringReader = new StringReader(str2);
                Class cls = obj.getClass();
                Mt a2 = Mt.a(cls);
                List asList = Arrays.asList(new Type[]{cls});
                Tt tt = Tt.class.isAssignableFrom(cls) ? (Tt) obj2 : null;
                Map map = Map.class.isAssignableFrom(cls) ? (Map) obj2 : null;
                It it = new It(obj2);
                StringWriter stringWriter = new StringWriter();
                StringWriter stringWriter2 = new StringWriter();
                StringWriter stringWriter3 = stringWriter;
                boolean z = true;
                while (true) {
                    int read = stringReader.read();
                    if (read == -1 || read == 38) {
                        String b = C1555nu.b(stringWriter3.toString());
                        if (b.length() != 0) {
                            String b2 = C1555nu.b(stringWriter2.toString());
                            Ut a3 = a2.a(b);
                            if (a3 != null) {
                                Type a4 = Ot.a(asList, a3.a());
                                if (C1431ju.a(a4)) {
                                    Class a5 = C1431ju.a(asList, C1431ju.b(a4));
                                    it.a(a3.d(), a5, a(a5, asList, b2));
                                } else if (C1431ju.a(C1431ju.a(asList, a4), Iterable.class)) {
                                    Collection collection = (Collection) a3.a(obj2);
                                    if (collection == null) {
                                        collection = Ot.b(a4);
                                        a3.a(obj2, (Object) collection);
                                    }
                                    collection.add(a(a4 == Object.class ? null : C1431ju.c(a4), asList, b2));
                                } else {
                                    a3.a(obj2, a(a4, asList, b2));
                                }
                            } else if (map != null) {
                                ArrayList arrayList = (ArrayList) map.get(b);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    if (tt != null) {
                                        tt.a(b, arrayList);
                                    } else {
                                        map.put(b, arrayList);
                                    }
                                }
                                arrayList.add(b2);
                            }
                        }
                        StringWriter stringWriter4 = new StringWriter();
                        StringWriter stringWriter5 = new StringWriter();
                        if (read == -1) {
                            it.a();
                            return;
                        }
                        stringWriter3 = stringWriter4;
                        stringWriter2 = stringWriter5;
                        z = true;
                    } else if (read != 61) {
                        if (z) {
                            stringWriter3.write(read);
                        } else {
                            stringWriter2.write(read);
                        }
                    } else if (z) {
                        z = false;
                    } else {
                        stringWriter2.write(read);
                    }
                }
            } catch (IOException e) {
                Yu.a(e);
                throw null;
            }
        }
    }

    private static Object a(Type type, List<Type> list, String str) {
        return Ot.a(Ot.a(list, type), str);
    }
}
