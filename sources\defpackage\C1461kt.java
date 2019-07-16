package defpackage;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: kt reason: default package and case insensitive filesystem */
final class C1461kt extends C1215ct {
    private final HttpURLConnection a;
    private final int b;
    private final String c;
    private final ArrayList<String> d = new ArrayList<>();
    private final ArrayList<String> e = new ArrayList<>();

    C1461kt(HttpURLConnection httpURLConnection) throws IOException {
        this.a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == -1) {
            responseCode = 0;
        }
        this.b = responseCode;
        this.c = httpURLConnection.getResponseMessage();
        ArrayList<String> arrayList = this.d;
        ArrayList<String> arrayList2 = this.e;
        for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                for (String str2 : (List) entry.getValue()) {
                    if (str2 != null) {
                        arrayList.add(str);
                        arrayList2.add(str2);
                    }
                }
            }
        }
    }

    public final String a(int i) {
        return (String) this.d.get(i);
    }

    public final InputStream b() throws IOException {
        InputStream inputStream;
        try {
            inputStream = this.a.getInputStream();
        } catch (IOException unused) {
            inputStream = this.a.getErrorStream();
        }
        if (inputStream == null) {
            return null;
        }
        return new C1554nt(this, inputStream);
    }

    public final String c() {
        return this.a.getContentEncoding();
    }

    public final String d() {
        return this.a.getHeaderField(HttpHeaders.CONTENT_TYPE);
    }

    public final String e() {
        return this.c;
    }

    public final int f() {
        return this.b;
    }

    public final String g() {
        String headerField = this.a.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }

    public final int h() {
        return this.d.size();
    }

    public final long i() {
        String headerField = this.a.getHeaderField(HttpHeaders.CONTENT_LENGTH);
        if (headerField == null) {
            return -1;
        }
        return Long.parseLong(headerField);
    }

    public final void a() {
        this.a.disconnect();
    }

    public final String b(int i) {
        return (String) this.e.get(i);
    }
}
