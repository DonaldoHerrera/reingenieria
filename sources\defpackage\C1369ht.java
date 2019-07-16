package defpackage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Map.Entry;

/* renamed from: ht reason: default package and case insensitive filesystem */
public final class C1369ht extends C1621py {
    private Object c;

    public C1369ht(Object obj) {
        super(C1338gt.a);
        Pu.a(obj);
        this.c = obj;
    }

    private static boolean a(boolean z, Writer writer, String str, Object obj) throws IOException {
        if (obj != null && !Ot.b(obj)) {
            if (z) {
                z = false;
            } else {
                writer.write("&");
            }
            writer.write(str);
            String a = C1555nu.a(obj instanceof Enum ? Ut.a((Enum) obj).b() : obj.toString());
            if (a.length() != 0) {
                writer.write("=");
                writer.write(a);
            }
        }
        return z;
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, b()));
        boolean z = true;
        for (Entry entry : Ot.c(this.c).entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String a = C1555nu.a((String) entry.getKey());
                Class cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object a2 : C1431ju.a(value)) {
                        z = a(z, bufferedWriter, a, a2);
                    }
                } else {
                    z = a(z, bufferedWriter, a, value);
                }
            }
        }
        bufferedWriter.flush();
    }
}
