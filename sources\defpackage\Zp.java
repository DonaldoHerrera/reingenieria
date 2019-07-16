package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: Zp reason: default package */
/* compiled from: DataSource */
public interface Zp {

    /* renamed from: Zp$a */
    /* compiled from: DataSource */
    public interface a {
        Zp a();
    }

    long a(C0470aq aqVar) throws IOException;

    Map<String, List<String>> a();

    void a(C1702sq sqVar);

    void close() throws IOException;

    Uri getUri();

    int read(byte[] bArr, int i, int i2) throws IOException;
}
