package com.soundcloud.android.foundation.playqueue;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.soundcloud.android.foundation.events.B;
import com.soundcloud.android.foundation.events.N;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;

public class PlaySessionSource implements Parcelable {
    public static final Creator<PlaySessionSource> CREATOR = new s();
    public static final PlaySessionSource a = new PlaySessionSource();
    private final String b;
    private C4928GKa<String> c;
    private C3508cda d;
    private C3508cda e;
    private int f;
    private SearchQuerySourceInfo g;
    private PromotedSourceInfo h;
    /* access modifiers changed from: private */
    public B i;
    private m j;

    public PlaySessionSource(Parcel parcel) {
        this.c = C4928GKa.a();
        C3508cda cda = C3508cda.a;
        this.d = cda;
        this.e = cda;
        this.f = -1;
        this.b = parcel.readString();
        this.f = parcel.readInt();
        this.d = N.a.a(parcel);
        this.e = N.a.a(parcel);
        this.g = (SearchQuerySourceInfo) parcel.readParcelable(SearchQuerySourceInfo.class.getClassLoader());
        this.h = (PromotedSourceInfo) parcel.readParcelable(PromotedSourceInfo.class.getClassLoader());
        this.j = (m) parcel.readSerializable();
    }

    public static PlaySessionSource a(String str, C3508cda cda, C3508cda cda2, int i2) {
        PlaySessionSource playSessionSource = new PlaySessionSource(str);
        playSessionSource.d = cda;
        playSessionSource.e = cda2;
        playSessionSource.f = i2;
        return playSessionSource;
    }

    private boolean r() {
        return this.j != null;
    }

    private boolean s() {
        return d().u();
    }

    private boolean t() {
        return this.b.equals(Yca.STREAM.a()) && !s();
    }

    public C3508cda b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public C3508cda d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public m e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || PlaySessionSource.class != obj.getClass()) {
            return false;
        }
        PlaySessionSource playSessionSource = (PlaySessionSource) obj;
        if (!C4804CKa.a(this.d, playSessionSource.d) || !C4804CKa.a(this.e, playSessionSource.e) || this.f != playSessionSource.f || !C4804CKa.a(this.b, playSessionSource.b) || !C4804CKa.a(this.h, playSessionSource.h) || !C4804CKa.a(this.i, playSessionSource.i) || !C4804CKa.a(this.j, playSessionSource.j)) {
            z = false;
        }
        return z;
    }

    public String f() {
        if (t()) {
            return m.STREAM.a();
        }
        if (r()) {
            return this.j.a();
        }
        return this.c.c() ? (String) this.c.b() : "";
    }

    public String g() {
        return this.b;
    }

    public PromotedSourceInfo h() {
        return this.h;
    }

    public int hashCode() {
        return C4804CKa.a(this.d, this.e, Integer.valueOf(this.f), this.b, this.i, this.j);
    }

    public B i() {
        return this.i;
    }

    public SearchQuerySourceInfo j() {
        return this.g;
    }

    public boolean k() {
        return this.i != null;
    }

    public boolean l() {
        return this.j == m.HISTORY;
    }

    public boolean m() {
        return this.h != null;
    }

    public boolean n() {
        return this.g != null;
    }

    public boolean o() {
        return d().v();
    }

    public boolean p() {
        return this.b.equals(Yca.DEEPLINK.a());
    }

    public boolean q() {
        return this.b.startsWith(Yca.SEARCH_SUGGESTIONS.a());
    }

    public String toString() {
        return C4804CKa.a((Object) this).a("originScreen", (Object) this.b).a("collectionUrn", (Object) this.d).a("collectionOwnerUrn", (Object) this.e).a("searchQuerySourceInfo", (Object) this.g).a("promotedSourceInfo", (Object) this.h).a("discoverySource", (Object) this.j).toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.b);
        parcel.writeInt(this.f);
        parcel.writeString(this.d.b());
        parcel.writeString(this.e.b());
        parcel.writeParcelable(this.g, 0);
        parcel.writeParcelable(this.h, 0);
        parcel.writeSerializable(this.j);
    }

    public void b(Editor editor) {
        editor.putString("origin_url", this.b);
        editor.putString("collection_urn", this.d.toString());
        editor.putString("collection_owner_urn", this.e.toString());
        editor.putInt("collection_size", this.f);
    }

    public static PlaySessionSource a(String str, C3508cda cda, m mVar) {
        PlaySessionSource playSessionSource = new PlaySessionSource(str);
        playSessionSource.j = mVar;
        playSessionSource.d = cda;
        return playSessionSource;
    }

    public static PlaySessionSource a() {
        PlaySessionSource playSessionSource = new PlaySessionSource();
        playSessionSource.j = m.CAST;
        return playSessionSource;
    }

    public static PlaySessionSource a(Yca yca, C3508cda cda) {
        return a(yca.a(), cda);
    }

    private static PlaySessionSource a(String str, C3508cda cda) {
        PlaySessionSource playSessionSource = new PlaySessionSource(str);
        playSessionSource.d = cda;
        return playSessionSource;
    }

    public PlaySessionSource(SharedPreferences sharedPreferences) {
        this.c = C4928GKa.a();
        C3508cda cda = C3508cda.a;
        this.d = cda;
        this.e = cda;
        this.f = -1;
        this.b = sharedPreferences.getString("origin_url", "");
        this.d = a(sharedPreferences, "collection_urn");
        this.e = a(sharedPreferences, "collection_owner_urn");
        this.f = sharedPreferences.getInt("collection_size", -1);
    }

    public static PlaySessionSource a(String str, C4928GKa<String> gKa, int i2, C4928GKa<C3508cda> gKa2, C3508cda cda, int i3) {
        PlaySessionSource playSessionSource = new PlaySessionSource(str);
        gKa2.a((C7733yKa<? super T>) new C3716c<Object>(playSessionSource, i2));
        playSessionSource.d = cda;
        playSessionSource.f = i3;
        playSessionSource.c = gKa;
        return playSessionSource;
    }

    public static PlaySessionSource a(Yca yca) {
        PlaySessionSource playSessionSource = new PlaySessionSource(yca);
        playSessionSource.j = m.HISTORY;
        return playSessionSource;
    }

    public static PlaySessionSource a(String str) {
        PlaySessionSource playSessionSource = new PlaySessionSource(str);
        playSessionSource.j = m.PLAY_NEXT;
        return playSessionSource;
    }

    private PlaySessionSource() {
        this("");
    }

    public PlaySessionSource(Yca yca) {
        this(yca.a());
    }

    private C3508cda a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(str, "");
        if (string.isEmpty()) {
            return C3508cda.a;
        }
        return new C3508cda(string);
    }

    public PlaySessionSource(String str) {
        this.c = C4928GKa.a();
        C3508cda cda = C3508cda.a;
        this.d = cda;
        this.e = cda;
        this.f = -1;
        this.b = str;
    }

    public static void a(Editor editor) {
        editor.remove("origin_url");
        editor.remove("collection_urn");
        editor.remove("collection_owner_urn");
        editor.remove("collection_size");
    }

    public void a(SearchQuerySourceInfo searchQuerySourceInfo) {
        this.g = searchQuerySourceInfo;
    }

    public void a(PromotedSourceInfo promotedSourceInfo) {
        this.h = promotedSourceInfo;
    }
}
