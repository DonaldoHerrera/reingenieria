package com.soundcloud.android.sync;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Collections;
import java.util.List;

public final class SyncJobResult implements Parcelable, _aa {
    public static final Creator<SyncJobResult> CREATOR = new X();
    public static final C7256rQa<SyncJobResult> a = C6121d.a;
    private final String b;
    private final boolean c;
    private final Exception d;
    private final List<C3508cda> e;

    /* synthetic */ SyncJobResult(Parcel parcel, X x) {
        this(parcel);
    }

    static /* synthetic */ boolean a(SyncJobResult syncJobResult) throws Exception {
        return na.PLAYLIST.name().equals(syncJobResult.a()) && syncJobResult.e() && syncJobResult.d().booleanValue();
    }

    public Exception b() {
        return this.d;
    }

    public C3508cda c() {
        return (C3508cda) this.e.iterator().next();
    }

    public Boolean d() {
        return Boolean.valueOf(!this.e.isEmpty());
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncJobResult)) {
            return false;
        }
        SyncJobResult syncJobResult = (SyncJobResult) obj;
        if (!C4804CKa.a(Boolean.valueOf(this.c), Boolean.valueOf(syncJobResult.c)) || !C4804CKa.a(this.b, syncJobResult.b) || !C4804CKa.a(this.d, syncJobResult.d) || !C4804CKa.a(this.e, syncJobResult.e)) {
            z = false;
        }
        return z;
    }

    public boolean f() {
        return this.d == null;
    }

    public int hashCode() {
        return C4804CKa.a(Boolean.valueOf(this.c), this.b, this.d, this.e);
    }

    public String toString() {
        return C4804CKa.a((Object) this).a("action", (Object) this.b).a("wasChanged", this.c).a("exception", (Object) this.d).a("entitiesSynced", (Object) this.e).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeSerializable(this.d);
        C5526_Ha.a(parcel, this.e);
    }

    private SyncJobResult(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.d = (Exception) parcel.readSerializable();
        this.e = C5526_Ha.a(parcel);
    }

    public static SyncJobResult a(String str, boolean z) {
        return new SyncJobResult(str, z, null, Collections.emptyList());
    }

    public static SyncJobResult a(String str, boolean z, C3508cda cda) {
        return a(str, z, Collections.singletonList(cda));
    }

    public static SyncJobResult a(String str, boolean z, List<C3508cda> list) {
        return new SyncJobResult(str, z, null, list);
    }

    private SyncJobResult(String str, boolean z, Exception exc, List<C3508cda> list) {
        this.b = str;
        this.c = z;
        this.d = exc;
        this.e = list;
    }

    public static SyncJobResult a(String str, Exception exc) {
        return new SyncJobResult(str, false, exc, Collections.emptyList());
    }

    public String a() {
        return this.b;
    }
}
