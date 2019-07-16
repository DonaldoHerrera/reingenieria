package com.facebook;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.T;
import com.facebook.internal.W;
import com.facebook.internal.da;
import com.facebook.internal.ia;
import com.facebook.internal.ja;
import com.facebook.stetho.server.http.HttpHeaders;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GraphRequest {
    public static final String a = "GraphRequest";
    /* access modifiers changed from: private */
    public static final String b;
    private static String c;
    private static Pattern d = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    private static volatile String e;
    private AccessToken f;
    private M g;
    private String h;
    private JSONObject i;
    private String j;
    private String k;
    private boolean l;
    private Bundle m;
    private b n;
    private String o;
    private Object p;
    private String q;
    private boolean r;

    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Creator<ParcelableResourceWithMimeType> CREATOR = new I();
        private final String a;
        private final RESOURCE b;

        /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, E e) {
            this(parcel);
        }

        public String a() {
            return this.a;
        }

        public RESOURCE b() {
            return this.b;
        }

        public int describeContents() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeParcelable(this.b, i);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.a = str;
            this.b = resource;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readParcelable(B.e().getClassLoader());
        }
    }

    private static class a {
        private final GraphRequest a;
        private final Object b;

        public a(GraphRequest graphRequest, Object obj) {
            this.a = graphRequest;
            this.b = obj;
        }

        public GraphRequest a() {
            return this.a;
        }

        public Object b() {
            return this.b;
        }
    }

    public interface b {
        void a(L l);
    }

    private interface c {
        void a(String str, String str2) throws IOException;
    }

    public interface d extends b {
        void onProgress(long j, long j2);
    }

    private static class e implements c {
        private final OutputStream a;
        private final W b;
        private boolean c = true;
        private boolean d = false;

        public e(OutputStream outputStream, W w, boolean z) {
            this.a = outputStream;
            this.b = w;
            this.d = z;
        }

        private RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public void a(String str, Object obj, GraphRequest graphRequest) throws IOException {
            OutputStream outputStream = this.a;
            if (outputStream instanceof X) {
                ((X) outputStream).a(graphRequest);
            }
            if (GraphRequest.e(obj)) {
                a(str, GraphRequest.f(obj));
            } else if (obj instanceof Bitmap) {
                a(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                a(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                a(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                a(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable b2 = parcelableResourceWithMimeType.b();
                String a2 = parcelableResourceWithMimeType.a();
                if (b2 instanceof ParcelFileDescriptor) {
                    a(str, (ParcelFileDescriptor) b2, a2);
                } else if (b2 instanceof Uri) {
                    a(str, (Uri) b2, a2);
                } else {
                    throw b();
                }
            } else {
                throw b();
            }
        }

        public void b(String str, Object... objArr) throws IOException {
            a(str, objArr);
            if (!this.d) {
                a("\r\n", new Object[0]);
            }
        }

        public void a(String str, JSONArray jSONArray, Collection<GraphRequest> collection) throws IOException, JSONException {
            OutputStream outputStream = this.a;
            if (!(outputStream instanceof X)) {
                a(str, jSONArray.toString());
                return;
            }
            X x = (X) outputStream;
            a(str, (String) null, (String) null);
            a("[", new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                x.a(graphRequest);
                if (i > 0) {
                    a(",%s", jSONObject.toString());
                } else {
                    a("%s", jSONObject.toString());
                }
                i++;
            }
            a("]", new Object[0]);
            W w = this.b;
            if (w != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                w.a(sb.toString(), (Object) jSONArray.toString());
            }
        }

        public void a(String str, String str2) throws IOException {
            a(str, (String) null, (String) null);
            b("%s", str2);
            a();
            W w = this.b;
            if (w != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                w.a(sb.toString(), (Object) str2);
            }
        }

        public void a(String str, Bitmap bitmap) throws IOException {
            a(str, str, "image/png");
            bitmap.compress(CompressFormat.PNG, 100, this.a);
            b("", new Object[0]);
            a();
            W w = this.b;
            if (w != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                w.a(sb.toString(), (Object) "<Image>");
            }
        }

        public void a(String str, byte[] bArr) throws IOException {
            a(str, str, "content/unknown");
            this.a.write(bArr);
            b("", new Object[0]);
            a();
            W w = this.b;
            if (w != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                w.a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
        }

        public void a(String str, Uri uri, String str2) throws IOException {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            a(str, str, str2);
            if (this.a instanceof U) {
                ((U) this.a).h(ia.a(uri));
                i = 0;
            } else {
                i = ia.a(B.e().getContentResolver().openInputStream(uri), this.a) + 0;
            }
            b("", new Object[0]);
            a();
            W w = this.b;
            if (w != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                w.a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        public void a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            a(str, str, str2);
            OutputStream outputStream = this.a;
            if (outputStream instanceof U) {
                ((U) outputStream).h(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = ia.a((InputStream) new AutoCloseInputStream(parcelFileDescriptor), this.a) + 0;
            }
            b("", new Object[0]);
            a();
            W w = this.b;
            if (w != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                w.a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        public void a() throws IOException {
            if (!this.d) {
                b("--%s", GraphRequest.b);
                return;
            }
            this.a.write("&".getBytes());
        }

        public void a(String str, String str2, String str3) throws IOException {
            if (!this.d) {
                a("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    a("; filename=\"%s\"", str2);
                }
                String str4 = "";
                b(str4, new Object[0]);
                if (str3 != null) {
                    b("%s: %s", HttpHeaders.CONTENT_TYPE, str3);
                }
                b(str4, new Object[0]);
                return;
            }
            this.a.write(String.format("%s=", new Object[]{str}).getBytes());
        }

        public void a(String str, Object... objArr) throws IOException {
            if (!this.d) {
                if (this.c) {
                    this.a.write("--".getBytes());
                    this.a.write(GraphRequest.b.getBytes());
                    this.a.write("\r\n".getBytes());
                    this.c = false;
                }
                this.a.write(String.format(str, objArr).getBytes());
                return;
            }
            this.a.write(URLEncoder.encode(String.format(Locale.US, str, objArr), "UTF-8").getBytes());
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i2 = 0; i2 < nextInt; i2++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        b = sb.toString();
    }

    public GraphRequest() {
        this(null, null, null, null, null);
    }

    private void n() {
        String str = "access_token";
        if (this.f != null) {
            if (!this.m.containsKey(str)) {
                String k2 = this.f.k();
                W.c(k2);
                this.m.putString(str, k2);
            }
        } else if (!this.r && !this.m.containsKey(str)) {
            String f2 = B.f();
            String k3 = B.k();
            if (ia.b(f2) || ia.b(k3)) {
                ia.b(a, "Warning: Request without access token missing application ID or client token.");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(f2);
                sb.append("|");
                sb.append(k3);
                this.m.putString(str, sb.toString());
            }
        }
        this.m.putString("sdk", "android");
        this.m.putString("format", "json");
        String str2 = "debug";
        if (B.a(O.GRAPH_API_DEBUG_INFO)) {
            this.m.putString(str2, "info");
        } else if (B.a(O.GRAPH_API_DEBUG_WARNING)) {
            this.m.putString(str2, "warning");
        }
    }

    private String o() {
        if (d.matcher(this.h).matches()) {
            return this.h;
        }
        return String.format("%s/%s", new Object[]{this.q, this.h});
    }

    private static String p() {
        return String.format("multipart/form-data; boundary=%s", new Object[]{b});
    }

    private static String q() {
        if (e == null) {
            e = String.format("%s.%s", new Object[]{"FBAndroidSDK", "5.0.3"});
            String a2 = T.a();
            if (!ia.b(a2)) {
                e = String.format(Locale.ROOT, "%s/%s", new Object[]{e, a2});
            }
        }
        return e;
    }

    public final void c(Object obj) {
        this.p = obj;
    }

    public final AccessToken d() {
        return this.f;
    }

    public final b e() {
        return this.n;
    }

    public final JSONObject f() {
        return this.i;
    }

    public final String g() {
        return this.h;
    }

    public final M h() {
        return this.g;
    }

    public final Bundle i() {
        return this.m;
    }

    /* access modifiers changed from: 0000 */
    public final String j() {
        if (this.o == null) {
            String format = String.format("%s/%s", new Object[]{da.c(), o()});
            n();
            Uri parse = Uri.parse(a(format, Boolean.valueOf(true)));
            return String.format("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
        }
        throw new C0594t("Can't override URL for a batch request");
    }

    public final Object k() {
        return this.p;
    }

    /* access modifiers changed from: 0000 */
    public final String l() {
        String str;
        String str2 = this.o;
        if (str2 != null) {
            return str2.toString();
        }
        if (h() == M.POST) {
            String str3 = this.h;
            if (str3 != null && str3.endsWith("/videos")) {
                str = da.d();
                String format = String.format("%s/%s", new Object[]{str, o()});
                n();
                return a(format, Boolean.valueOf(false));
            }
        }
        str = da.c();
        String format2 = String.format("%s/%s", new Object[]{str, o()});
        n();
        return a(format2, Boolean.valueOf(false));
    }

    public final String m() {
        return this.q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.h);
        sb.append(", graphObject: ");
        sb.append(this.i);
        sb.append(", httpMethod: ");
        sb.append(this.g);
        sb.append(", parameters: ");
        sb.append(this.m);
        sb.append("}");
        return sb.toString();
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, M m2) {
        this(accessToken, str, bundle, m2, null);
    }

    static final void d(K k2) {
        Iterator it = k2.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            if (M.GET.equals(graphRequest.h()) && b(graphRequest)) {
                Bundle i2 = graphRequest.i();
                String str = "fields";
                if (!i2.containsKey(str) || ia.b(i2.getString(str))) {
                    W.a(O.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", graphRequest.g());
                }
            }
        }
    }

    private static String e(K k2) {
        if (!ia.b(k2.h())) {
            return k2.h();
        }
        Iterator it = k2.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = ((GraphRequest) it.next()).f;
            if (accessToken != null) {
                String b2 = accessToken.b();
                if (b2 != null) {
                    return b2;
                }
            }
        }
        if (!ia.b(c)) {
            return c;
        }
        return B.f();
    }

    private static boolean f(K k2) {
        for (com.facebook.K.a aVar : k2.j()) {
            if (aVar instanceof com.facebook.K.b) {
                return true;
            }
        }
        Iterator it = k2.iterator();
        while (it.hasNext()) {
            if (((GraphRequest) it.next()).e() instanceof d) {
                return true;
            }
        }
        return false;
    }

    private static boolean g(K k2) {
        Iterator it = k2.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            Iterator it2 = graphRequest.m.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (d(graphRequest.m.get((String) it2.next()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final L b() {
        return a(this);
    }

    public final J c() {
        return b(this);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, M m2, b bVar) {
        this(accessToken, str, bundle, m2, bVar, null);
    }

    public static GraphRequest a(AccessToken accessToken, String str, JSONObject jSONObject, b bVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, null, M.POST, bVar);
        graphRequest.a(jSONObject);
        return graphRequest;
    }

    public static J b(GraphRequest... graphRequestArr) {
        ja.a((Object) graphRequestArr, "requests");
        return b((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    public static HttpURLConnection c(K k2) {
        URL url;
        d(k2);
        try {
            if (k2.size() == 1) {
                url = new URL(k2.get(0).l());
            } else {
                url = new URL(da.c());
            }
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = a(url);
                a(k2, httpURLConnection);
                return httpURLConnection;
            } catch (IOException | JSONException e2) {
                ia.a((URLConnection) httpURLConnection);
                throw new C0594t("could not construct request body", e2);
            }
        } catch (MalformedURLException e3) {
            throw new C0594t("could not construct URL for request", (Throwable) e3);
        }
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, M m2, b bVar, String str2) {
        this.l = true;
        this.r = false;
        this.f = accessToken;
        this.h = str;
        this.q = str2;
        a(bVar);
        a(m2);
        if (bundle != null) {
            this.m = new Bundle(bundle);
        } else {
            this.m = new Bundle();
        }
        if (this.q == null) {
            this.q = B.o();
        }
    }

    public static GraphRequest a(AccessToken accessToken, String str, b bVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, null, null, bVar);
        return graphRequest;
    }

    public static J b(Collection<GraphRequest> collection) {
        return b(new K(collection));
    }

    public static J b(K k2) {
        ja.c(k2, "requests");
        J j2 = new J(k2);
        j2.executeOnExecutor(B.m(), new Void[0]);
        return j2;
    }

    /* access modifiers changed from: private */
    public static String f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    public final void a(JSONObject jSONObject) {
        this.i = jSONObject;
    }

    public final void a(M m2) {
        if (this.o == null || m2 == M.GET) {
            if (m2 == null) {
                m2 = M.GET;
            }
            this.g = m2;
            return;
        }
        throw new C0594t("Can't change HTTP method on request with overridden URL.");
    }

    static final boolean b(GraphRequest graphRequest) {
        String m2 = graphRequest.m();
        boolean z = true;
        if (ia.b(m2)) {
            return true;
        }
        if (m2.startsWith("v")) {
            m2 = m2.substring(1);
        }
        String[] split = m2.split("\\.");
        if ((split.length < 2 || Integer.parseInt(split[0]) <= 2) && (Integer.parseInt(split[0]) < 2 || Integer.parseInt(split[1]) < 4)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public static boolean e(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public final void a(String str) {
        this.q = str;
    }

    private static boolean d(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    public final void a(boolean z) {
        this.r = z;
    }

    public final void a(Bundle bundle) {
        this.m = bundle;
    }

    public final void a(b bVar) {
        if (B.a(O.GRAPH_API_DEBUG_INFO) || B.a(O.GRAPH_API_DEBUG_WARNING)) {
            this.n = new F(this, bVar);
        } else {
            this.n = bVar;
        }
    }

    public static L a(GraphRequest graphRequest) {
        List a2 = a(graphRequest);
        if (a2 != null && a2.size() == 1) {
            return (L) a2.get(0);
        }
        throw new C0594t("invalid state: expected a single response");
    }

    private static boolean b(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
        }
        if (str.startsWith("me/") || str.startsWith("/me/")) {
            return true;
        }
        return false;
    }

    public static List<L> a(GraphRequest... graphRequestArr) {
        ja.a((Object) graphRequestArr, "requests");
        return a((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    public static List<L> a(Collection<GraphRequest> collection) {
        return a(new K(collection));
    }

    public static List<L> a(K k2) {
        ja.c(k2, "requests");
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = c(k2);
            return a(httpURLConnection, k2);
        } catch (Exception e2) {
            List<L> a2 = L.a(k2.l(), httpURLConnection, new C0594t((Throwable) e2));
            a(k2, a2);
            return a2;
        } finally {
            ia.a((URLConnection) httpURLConnection);
        }
    }

    public static List<L> a(HttpURLConnection httpURLConnection, K k2) {
        List<L> a2 = L.a(httpURLConnection, k2);
        ia.a((URLConnection) httpURLConnection);
        int size = k2.size();
        if (size == a2.size()) {
            a(k2, a2);
            C0537g.d().b();
            return a2;
        }
        throw new C0594t(String.format(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(a2.size()), Integer.valueOf(size)}));
    }

    static void a(K k2, List<L> list) {
        int size = k2.size();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = k2.get(i2).n;
            if (bVar != null) {
                arrayList.add(new Pair(bVar, list.get(i2)));
            }
        }
        if (arrayList.size() > 0) {
            G g2 = new G(arrayList, k2);
            Handler i3 = k2.i();
            if (i3 == null) {
                g2.run();
            } else {
                i3.post(g2);
            }
        }
    }

    private static HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", q());
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    private String a(String str, Boolean bool) {
        if (!bool.booleanValue() && this.g == M.POST) {
            return str;
        }
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.m.keySet()) {
            Object obj = this.m.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (e(obj)) {
                buildUpon.appendQueryParameter(str2, f(obj).toString());
            } else if (this.g == M.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    private void a(JSONArray jSONArray, Map<String, a> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.j;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.l);
        }
        String str2 = this.k;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String j2 = j();
        jSONObject.put("relative_url", j2);
        jSONObject.put("method", this.g);
        AccessToken accessToken = this.f;
        if (accessToken != null) {
            W.c(accessToken.k());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.m.keySet()) {
            Object obj = this.m.get(str3);
            if (d(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.i != null) {
            ArrayList arrayList2 = new ArrayList();
            a(this.i, j2, (c) new H(this, arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private static void a(HttpURLConnection httpURLConnection, boolean z) {
        String str = HttpHeaders.CONTENT_TYPE;
        if (z) {
            httpURLConnection.setRequestProperty(str, "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            return;
        }
        httpURLConnection.setRequestProperty(str, p());
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [java.io.FilterOutputStream] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r14v5, types: [java.io.FilterOutputStream] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r8v5, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: type inference failed for: r14v9, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARNING: type inference failed for: r14v10 */
    /* JADX WARNING: type inference failed for: r14v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARNING: Unknown variable types count: 6 */
    static final void a(K k2, HttpURLConnection httpURLConnection) throws IOException, JSONException {
        ? r14;
        ? r142;
        W w = new W(O.REQUESTS, "Request");
        int size = k2.size();
        boolean g2 = g(k2);
        boolean z = false;
        M m2 = size == 1 ? k2.get(0).g : M.POST;
        httpURLConnection.setRequestMethod(m2.name());
        a(httpURLConnection, g2);
        URL url = httpURLConnection.getURL();
        w.a("Request:\n");
        w.a("Id", (Object) k2.k());
        w.a("URL", (Object) url);
        w.a("Method", (Object) httpURLConnection.getRequestMethod());
        String str = "User-Agent";
        w.a(str, (Object) httpURLConnection.getRequestProperty(str));
        String str2 = HttpHeaders.CONTENT_TYPE;
        w.a(str2, (Object) httpURLConnection.getRequestProperty(str2));
        httpURLConnection.setConnectTimeout(k2.m());
        httpURLConnection.setReadTimeout(k2.m());
        if (m2 == M.POST) {
            z = true;
        }
        if (!z) {
            w.a();
            return;
        }
        httpURLConnection.setDoOutput(true);
        try {
            ? bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            if (g2) {
                try {
                    r142 = new GZIPOutputStream(bufferedOutputStream);
                } catch (Throwable th) {
                    th = th;
                    r14 = bufferedOutputStream;
                }
            } else {
                r142 = bufferedOutputStream;
            }
            try {
                if (f(k2)) {
                    U u = new U(k2.i());
                    a(k2, null, size, url, u, g2);
                    W w2 = new W(r142, k2, u.b(), (long) u.a());
                    r142 = w2;
                }
                a(k2, w, size, url, r142, g2);
                r142.close();
                w.a();
            } catch (Throwable th2) {
                th = th2;
                r14 = r142;
                if (r14 != 0) {
                    r14.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r14 = 0;
            if (r14 != 0) {
            }
            throw th;
        }
    }

    private static void a(K k2, W w, int i2, URL url, OutputStream outputStream, boolean z) throws IOException, JSONException {
        e eVar = new e(outputStream, w, z);
        String str = "  Attachments:\n";
        if (i2 == 1) {
            GraphRequest graphRequest = k2.get(0);
            HashMap hashMap = new HashMap();
            for (String str2 : graphRequest.m.keySet()) {
                Object obj = graphRequest.m.get(str2);
                if (d(obj)) {
                    hashMap.put(str2, new a(graphRequest, obj));
                }
            }
            if (w != null) {
                w.a("  Parameters:\n");
            }
            a(graphRequest.m, eVar, graphRequest);
            if (w != null) {
                w.a(str);
            }
            a((Map<String, a>) hashMap, eVar);
            JSONObject jSONObject = graphRequest.i;
            if (jSONObject != null) {
                a(jSONObject, url.getPath(), (c) eVar);
                return;
            }
            return;
        }
        String e2 = e(k2);
        if (!ia.b(e2)) {
            eVar.a("batch_app_id", e2);
            HashMap hashMap2 = new HashMap();
            a(eVar, (Collection<GraphRequest>) k2, (Map<String, a>) hashMap2);
            if (w != null) {
                w.a(str);
            }
            a((Map<String, a>) hashMap2, eVar);
            return;
        }
        throw new C0594t("App ID was not specified at the request or Settings.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    private static void a(JSONObject jSONObject, String str, c cVar) throws IOException {
        boolean z;
        Iterator keys;
        if (b(str)) {
            int indexOf = str.indexOf(":");
            int indexOf2 = str.indexOf("?");
            if (indexOf > 3 && (indexOf2 == -1 || indexOf < indexOf2)) {
                z = true;
                keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    a(str2, jSONObject.opt(str2), cVar, z && str2.equalsIgnoreCase("image"));
                }
            }
        }
        z = false;
        keys = jSONObject.keys();
        while (keys.hasNext()) {
        }
    }

    private static void a(String str, Object obj, c cVar, boolean z) throws IOException {
        Class cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    a(String.format("%s[%s]", new Object[]{str, str2}), jSONObject.opt(str2), cVar, z);
                }
                return;
            }
            String str3 = "id";
            if (jSONObject.has(str3)) {
                a(str, (Object) jSONObject.optString(str3), cVar, z);
                return;
            }
            String str4 = ImagesContract.URL;
            if (jSONObject.has(str4)) {
                a(str, (Object) jSONObject.optString(str4), cVar, z);
            } else if (jSONObject.has("fbsdk:create_object")) {
                a(str, (Object) jSONObject.toString(), cVar, z);
            }
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                a(String.format(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i2)}), jSONArray.opt(i2), cVar, z);
            }
        } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            cVar.a(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            cVar.a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        }
    }

    private static void a(Bundle bundle, e eVar, GraphRequest graphRequest) throws IOException {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (e(obj)) {
                eVar.a(str, obj, graphRequest);
            }
        }
    }

    private static void a(Map<String, a> map, e eVar) throws IOException {
        for (String str : map.keySet()) {
            a aVar = (a) map.get(str);
            if (d(aVar.b())) {
                eVar.a(str, aVar.b(), aVar.a());
            }
        }
    }

    private static void a(e eVar, Collection<GraphRequest> collection, Map<String, a> map) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest a2 : collection) {
            a2.a(jSONArray, map);
        }
        eVar.a("batch", jSONArray, collection);
    }
}
