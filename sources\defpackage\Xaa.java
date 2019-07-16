package defpackage;

import com.soundcloud.android.features.record.Recording;

/* renamed from: Xaa reason: default package */
/* compiled from: UploadEvent */
public final class Xaa {
    private final String a;
    private final Recording b;
    private final int c;

    private Xaa(String str) {
        this(str, null);
    }

    public static Xaa a(Recording recording) {
        return new Xaa("cancelled", recording);
    }

    public static Xaa b(Recording recording) {
        return new Xaa("error", recording);
    }

    public static Xaa c() {
        return new Xaa("idle");
    }

    public static Xaa d(Recording recording) {
        return new Xaa("processing_started", recording, -1);
    }

    public static Xaa e(Recording recording) {
        return new Xaa("processing_success", recording, 100);
    }

    public static Xaa f(Recording recording) {
        return new Xaa("resize_started", recording);
    }

    public static Xaa g(Recording recording) {
        return new Xaa("resize_success", recording);
    }

    public static Xaa h(Recording recording) {
        return new Xaa("upload_start", recording);
    }

    public static Xaa i(Recording recording) {
        return new Xaa("upload_success", recording);
    }

    public static Xaa j(Recording recording) {
        return new Xaa("transfer_started", recording, -1);
    }

    public static Xaa k(Recording recording) {
        return new Xaa("transfer_success", recording, 100);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Xaa.class != obj.getClass()) {
            return false;
        }
        Xaa xaa = (Xaa) obj;
        if (!C4804CKa.a(xaa.a, this.a) || !C4804CKa.a(xaa.b, this.b) || !C4804CKa.a(Integer.valueOf(xaa.c), Integer.valueOf(this.c))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C4804CKa.a(this.a, this.b, Integer.valueOf(this.c));
    }

    public boolean l() {
        return this.a.equals("resize_started");
    }

    public boolean m() {
        return this.a.equals("resize_success");
    }

    public boolean n() {
        return this.a.equals("upload_start");
    }

    public boolean o() {
        return r() || q() || s();
    }

    public boolean p() {
        return this.a.equals("transfer_cancelled");
    }

    public boolean q() {
        return this.a.equals("transfer_progress");
    }

    public boolean r() {
        return this.a.equals("transfer_started");
    }

    public boolean s() {
        return this.a.equals("transfer_success");
    }

    public boolean t() {
        return this.a.equals("upload_cancelled");
    }

    public String toString() {
        return C4804CKa.a((Object) this).a("kind", (Object) this.a).a("progress", this.c).toString();
    }

    public boolean u() {
        return this.a.equals("upload_success");
    }

    public boolean v() {
        return !this.a.equals("idle") && !d() && !e() && !u();
    }

    private Xaa(String str, Recording recording) {
        this(str, recording, 0);
    }

    public static Xaa a(Recording recording, int i) {
        return new Xaa("processing_progress", recording, i);
    }

    public static Xaa b(Recording recording, int i) {
        return new Xaa("transfer_progress", recording, i);
    }

    public static Xaa c(Recording recording) {
        return new Xaa("error_quota", recording);
    }

    public boolean d() {
        return this.a.equals("cancelled") || p() || t();
    }

    public boolean e() {
        return this.a.equals("error") || this.a.equals("error_quota");
    }

    public boolean f() {
        return this.a.equals("error_quota");
    }

    public boolean g() {
        return u() || e();
    }

    public boolean h() {
        return i() || j() || k();
    }

    public boolean i() {
        return this.a.equals("processing_progress");
    }

    public boolean j() {
        return this.a.equals("processing_started");
    }

    public boolean k() {
        return this.a.equals("processing_success");
    }

    private Xaa(String str, Recording recording, int i) {
        this.a = str;
        this.b = recording;
        this.c = i;
    }

    public int a() {
        return this.c;
    }

    public Recording b() {
        return this.b;
    }
}
