package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: zyb reason: default package and case insensitive filesystem */
/* compiled from: RequestBody */
public abstract class C7854zyb {
    public static C7854zyb a(C7233qyb qyb, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (qyb != null) {
            charset = qyb.a();
            if (charset == null) {
                charset = StandardCharsets.UTF_8;
                StringBuilder sb = new StringBuilder();
                sb.append(qyb);
                sb.append("; charset=utf-8");
                qyb = C7233qyb.b(sb.toString());
            }
        }
        return a(qyb, str.getBytes(charset));
    }

    public abstract long a() throws IOException;

    public abstract void a(C6893mAb mab) throws IOException;

    public abstract C7233qyb b();

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public static C7854zyb a(C7233qyb qyb, byte[] bArr) {
        return a(qyb, bArr, 0, bArr.length);
    }

    public static C7854zyb a(C7233qyb qyb, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            Kyb.a((long) bArr.length, (long) i, (long) i2);
            return new C7716xyb(qyb, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    public static C7854zyb a(C7233qyb qyb, File file) {
        if (file != null) {
            return new C7785yyb(qyb, file);
        }
        throw new NullPointerException("file == null");
    }
}
