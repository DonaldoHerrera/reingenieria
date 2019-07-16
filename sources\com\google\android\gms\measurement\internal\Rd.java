package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.C0920aa;
import com.google.android.gms.internal.measurement.C0920aa.a;
import com.google.android.gms.internal.measurement.D;
import com.google.android.gms.internal.measurement.E;
import com.google.android.gms.internal.measurement.F;
import com.google.android.gms.internal.measurement.G;
import com.google.android.gms.internal.measurement.H;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.internal.measurement.V;
import com.google.android.gms.internal.measurement.W;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.Z;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class Rd extends Ld {
    Rd(Kd kd) {
        super(kd);
    }

    static Object b(S s, String str) {
        U a = a(s, str);
        if (a != null) {
            if (a.q()) {
                return a.r();
            }
            if (a.s()) {
                return Long.valueOf(a.t());
            }
            if (a.u()) {
                return Double.valueOf(a.x());
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(a aVar, Object obj) {
        Preconditions.checkNotNull(obj);
        aVar.k();
        aVar.l();
        aVar.m();
        if (obj instanceof String) {
            aVar.b((String) obj);
        } else if (obj instanceof Long) {
            aVar.b(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.a(((Double) obj).doubleValue());
        } else {
            e().s().a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    public final byte[] c(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e().s().a("Failed to gzip content", e);
            throw e;
        }
    }

    public final /* bridge */ /* synthetic */ Gb d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C1124ib e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ce f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ C1097d j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ C1114gb k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Vd l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Rd m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ ae n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ he o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ Hb p() {
        return super.p();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final List<Integer> u() {
        Map a = C1127j.a(this.b.getContext());
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) C1127j.X.a(null)).intValue();
        Iterator it = a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            e().v().a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    e().v().a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public final byte[] b(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            e().s().a("Failed to ungzip content", e);
            throw e;
        }
    }

    public final /* bridge */ /* synthetic */ Clock c() {
        return super.c();
    }

    /* access modifiers changed from: 0000 */
    public final void a(U.a aVar, Object obj) {
        Preconditions.checkNotNull(obj);
        aVar.k();
        aVar.l();
        aVar.m();
        if (obj instanceof String) {
            aVar.b((String) obj);
        } else if (obj instanceof Long) {
            aVar.a(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.a(((Double) obj).doubleValue());
        } else {
            e().s().a("Ignoring invalid (type) event param value", obj);
        }
    }

    static U a(S s, String str) {
        for (U u : s.s()) {
            if (u.p().equals(str)) {
                return u;
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ C1168rb b() {
        return super.b();
    }

    static void a(S.a aVar, String str, Object obj) {
        List m = aVar.m();
        int i = 0;
        while (true) {
            if (i >= m.size()) {
                i = -1;
                break;
            } else if (str.equals(((U) m.get(i)).p())) {
                break;
            } else {
                i++;
            }
        }
        U.a y = U.y();
        y.a(str);
        if (obj instanceof Long) {
            y.a(((Long) obj).longValue());
        } else if (obj instanceof String) {
            y.b((String) obj);
        } else if (obj instanceof Double) {
            y.a(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            aVar.a(i, y);
        } else {
            aVar.a(y);
        }
    }

    /* access modifiers changed from: 0000 */
    public final String a(V v) {
        if (v == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        Iterator it = v.p().iterator();
        while (true) {
            String str = "}\n";
            if (it.hasNext()) {
                W w = (W) it.next();
                if (w != null) {
                    a(sb, 1);
                    sb.append("bundle {\n");
                    if (w.J()) {
                        a(sb, 1, "protocol_version", (Object) Integer.valueOf(w.K()));
                    }
                    a(sb, 1, "platform", (Object) w.T());
                    if (w.X()) {
                        a(sb, 1, "gmp_version", (Object) Long.valueOf(w.y()));
                    }
                    if (w.Y()) {
                        a(sb, 1, "uploading_gmp_version", (Object) Long.valueOf(w.Z()));
                    }
                    if (w.ua()) {
                        a(sb, 1, "dynamite_version", (Object) Long.valueOf(w.A()));
                    }
                    if (w.na()) {
                        a(sb, 1, "config_version", (Object) Long.valueOf(w.oa()));
                    }
                    a(sb, 1, "gmp_app_id", (Object) w.r());
                    a(sb, 1, "admob_app_id", (Object) w.ta());
                    a(sb, 1, "app_id", (Object) w.t());
                    a(sb, 1, "app_version", (Object) w.u());
                    if (w.ka()) {
                        a(sb, 1, "app_version_major", (Object) Integer.valueOf(w.la()));
                    }
                    a(sb, 1, "firebase_instance_id", (Object) w.q());
                    if (w.da()) {
                        a(sb, 1, "dev_cert_hash", (Object) Long.valueOf(w.z()));
                    }
                    a(sb, 1, "app_store", (Object) w.x());
                    if (w.L()) {
                        a(sb, 1, "upload_timestamp_millis", (Object) Long.valueOf(w.M()));
                    }
                    if (w.N()) {
                        a(sb, 1, "start_timestamp_millis", (Object) Long.valueOf(w.H()));
                    }
                    if (w.O()) {
                        a(sb, 1, "end_timestamp_millis", (Object) Long.valueOf(w.I()));
                    }
                    if (w.P()) {
                        a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) Long.valueOf(w.Q()));
                    }
                    if (w.R()) {
                        a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) Long.valueOf(w.S()));
                    }
                    a(sb, 1, "app_instance_id", (Object) w.p());
                    a(sb, 1, "resettable_device_id", (Object) w.aa());
                    a(sb, 1, "device_id", (Object) w.ma());
                    a(sb, 1, "ds_id", (Object) w.qa());
                    if (w.ba()) {
                        a(sb, 1, "limited_ad_tracking", (Object) Boolean.valueOf(w.ca()));
                    }
                    a(sb, 1, "os_version", (Object) w.s());
                    a(sb, 1, "device_model", (Object) w.U());
                    a(sb, 1, "user_default_language", (Object) w.C());
                    if (w.V()) {
                        a(sb, 1, "time_zone_offset_minutes", (Object) Integer.valueOf(w.W()));
                    }
                    if (w.ea()) {
                        a(sb, 1, "bundle_sequential_index", (Object) Integer.valueOf(w.fa()));
                    }
                    if (w.ha()) {
                        a(sb, 1, "service_upload", (Object) Boolean.valueOf(w.ia()));
                    }
                    a(sb, 1, "health_monitor", (Object) w.ga());
                    if (w.pa() && w.B() != 0) {
                        a(sb, 1, "android_id", (Object) Long.valueOf(w.B()));
                    }
                    if (w.ra()) {
                        a(sb, 1, "retry_counter", (Object) Integer.valueOf(w.sa()));
                    }
                    List<C0920aa> F = w.F();
                    String str2 = "double_value";
                    String str3 = "int_value";
                    String str4 = "string_value";
                    String str5 = "name";
                    int i = 2;
                    if (F != null) {
                        for (C0920aa aaVar : F) {
                            if (aaVar != null) {
                                a(sb, 2);
                                sb.append("user_property {\n");
                                a(sb, 2, "set_timestamp_millis", (Object) aaVar.y() ? Long.valueOf(aaVar.z()) : null);
                                a(sb, 2, str5, (Object) k().c(aaVar.p()));
                                a(sb, 2, str4, (Object) aaVar.r());
                                a(sb, 2, str3, (Object) aaVar.s() ? Long.valueOf(aaVar.t()) : null);
                                a(sb, 2, str2, (Object) aaVar.u() ? Double.valueOf(aaVar.x()) : null);
                                a(sb, 2);
                                sb.append(str);
                            }
                        }
                    }
                    List<P> ja = w.ja();
                    String t = w.t();
                    if (ja != null) {
                        for (P p : ja) {
                            if (p != null) {
                                a(sb, i);
                                sb.append("audience_membership {\n");
                                if (p.s()) {
                                    a(sb, i, "audience_id", (Object) Integer.valueOf(p.t()));
                                }
                                if (p.u()) {
                                    a(sb, i, "new_audience", (Object) Boolean.valueOf(p.x()));
                                }
                                StringBuilder sb2 = sb;
                                String str6 = t;
                                a(sb2, 2, "current_data", p.p(), str6);
                                a(sb2, 2, "previous_data", p.r(), str6);
                                a(sb, 2);
                                sb.append(str);
                                i = 2;
                            }
                        }
                    }
                    List<S> D = w.D();
                    if (D != null) {
                        for (S s : D) {
                            if (s != null) {
                                a(sb, 2);
                                sb.append("event {\n");
                                a(sb, 2, str5, (Object) k().a(s.q()));
                                if (s.u()) {
                                    a(sb, 2, "timestamp_millis", (Object) Long.valueOf(s.r()));
                                }
                                if (s.y()) {
                                    a(sb, 2, "previous_timestamp_millis", (Object) Long.valueOf(s.x()));
                                }
                                if (s.z()) {
                                    a(sb, 2, "count", (Object) Integer.valueOf(s.p()));
                                }
                                if (s.t() != 0) {
                                    List<U> s2 = s.s();
                                    if (s2 != null) {
                                        for (U u : s2) {
                                            if (u != null) {
                                                a(sb, 3);
                                                sb.append("param {\n");
                                                a(sb, 3, str5, (Object) k().b(u.p()));
                                                a(sb, 3, str4, (Object) u.r());
                                                a(sb, 3, str3, (Object) u.s() ? Long.valueOf(u.t()) : null);
                                                a(sb, 3, str2, (Object) u.u() ? Double.valueOf(u.x()) : null);
                                                a(sb, 3);
                                                sb.append(str);
                                            }
                                        }
                                    }
                                }
                                a(sb, 2);
                                sb.append(str);
                            }
                        }
                    }
                    a(sb, 1);
                    sb.append(str);
                }
            } else {
                sb.append(str);
                return sb.toString();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final String a(D d) {
        if (d == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (d.s()) {
            a(sb, 0, "filter_id", (Object) Integer.valueOf(d.p()));
        }
        a(sb, 0, "event_name", (Object) k().a(d.q()));
        String a = a(d.y(), d.z(), d.B());
        if (!a.isEmpty()) {
            a(sb, 0, "filter_type", (Object) a);
        }
        a(sb, 1, "event_count_filter", d.x());
        sb.append("  filters {\n");
        for (E a2 : d.t()) {
            a(sb, 2, a2);
        }
        a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final String a(G g) {
        if (g == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (g.r()) {
            a(sb, 0, "filter_id", (Object) Integer.valueOf(g.p()));
        }
        a(sb, 0, "property_name", (Object) k().c(g.q()));
        String a = a(g.s(), g.t(), g.x());
        if (!a.isEmpty()) {
            a(sb, 0, "filter_type", (Object) a);
        }
        a(sb, 1, g.z());
        sb.append("}\n");
        return sb.toString();
    }

    private static String a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private final void a(StringBuilder sb, int i, String str, Y y, String str2) {
        if (y != null) {
            a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            String str3 = ", ";
            if (y.s() != 0) {
                a(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : y.r()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(str3);
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (y.q() != 0) {
                a(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : y.p()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(str3);
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append(10);
            }
            boolean i6 = f().i(str2);
            String str4 = "}\n";
            if (i6) {
                if (y.u() != 0) {
                    a(sb, 4);
                    sb.append("dynamic_filter_timestamps: {");
                    int i7 = 0;
                    for (Q q : y.t()) {
                        int i8 = i7 + 1;
                        if (i7 != 0) {
                            sb.append(str3);
                        }
                        sb.append(q.q() ? Integer.valueOf(q.p()) : null);
                        sb.append(":");
                        sb.append(q.r() ? Long.valueOf(q.s()) : null);
                        i7 = i8;
                    }
                    sb.append(str4);
                }
                if (y.y() != 0) {
                    a(sb, 4);
                    sb.append("sequence_filter_timestamps: {");
                    int i9 = 0;
                    for (Z z : y.x()) {
                        int i10 = i9 + 1;
                        if (i9 != 0) {
                            sb.append(str3);
                        }
                        sb.append(z.q() ? Integer.valueOf(z.p()) : null);
                        sb.append(": [");
                        int i11 = 0;
                        for (Long longValue : z.r()) {
                            long longValue2 = longValue.longValue();
                            int i12 = i11 + 1;
                            if (i11 != 0) {
                                sb.append(str3);
                            }
                            sb.append(longValue2);
                            i11 = i12;
                        }
                        sb.append("]");
                        i9 = i10;
                    }
                    sb.append(str4);
                }
            }
            a(sb, 3);
            sb.append(str4);
        }
    }

    private final void a(StringBuilder sb, int i, String str, F f) {
        if (f != null) {
            a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (f.p()) {
                a(sb, i, "comparison_type", (Object) f.q().name());
            }
            if (f.r()) {
                a(sb, i, "match_as_float", (Object) Boolean.valueOf(f.s()));
            }
            a(sb, i, "comparison_value", (Object) f.u());
            a(sb, i, "min_comparison_value", (Object) f.y());
            a(sb, i, "max_comparison_value", (Object) f.A());
            a(sb, i);
            sb.append("}\n");
        }
    }

    private final void a(StringBuilder sb, int i, E e) {
        if (e != null) {
            a(sb, i);
            sb.append("filter {\n");
            if (e.t()) {
                a(sb, i, "complement", (Object) Boolean.valueOf(e.u()));
            }
            a(sb, i, "param_name", (Object) k().b(e.x()));
            int i2 = i + 1;
            H q = e.q();
            String str = "}\n";
            if (q != null) {
                a(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (q.p()) {
                    a(sb, i2, "match_type", (Object) q.q().name());
                }
                a(sb, i2, "expression", (Object) q.s());
                if (q.t()) {
                    a(sb, i2, "case_sensitive", (Object) Boolean.valueOf(q.u()));
                }
                if (q.y() > 0) {
                    a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : q.x()) {
                        a(sb, i2 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append(str);
                }
                a(sb, i2);
                sb.append(str);
            }
            a(sb, i2, "number_filter", e.s());
            a(sb, i);
            sb.append(str);
        }
    }

    private static void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        e().s().a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    public final <T extends Parcelable> T a(byte[] bArr, Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t = (Parcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(zzai zzai, zzn zzn) {
        Preconditions.checkNotNull(zzai);
        Preconditions.checkNotNull(zzn);
        if (!TextUtils.isEmpty(zzn.b) || !TextUtils.isEmpty(zzn.r)) {
            return true;
        }
        a();
        return false;
    }

    static boolean a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean a(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            if (((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0) {
                return true;
            }
        }
        return false;
    }

    static List<Long> a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public final List<Long> a(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                e().v().a("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    e().v().a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(c().currentTimeMillis() - j) > j2;
    }

    /* access modifiers changed from: 0000 */
    public final long a(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        l().i();
        MessageDigest s = Vd.s();
        if (s != null) {
            return Vd.a(s.digest(bArr));
        }
        e().s().a("Failed to get MD5");
        return 0;
    }

    public final /* bridge */ /* synthetic */ be a() {
        return super.a();
    }
}
