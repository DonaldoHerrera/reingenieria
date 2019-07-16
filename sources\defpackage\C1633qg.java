package defpackage;

import bo.app.bb;
import bo.app.df;
import bo.app.du;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONObject;

/* renamed from: qg reason: default package and case insensitive filesystem */
public final class C1633qg extends C1662rg {
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final float s;

    public C1633qg(JSONObject jSONObject, bb bbVar, df dfVar) {
        super(jSONObject, bbVar, dfVar);
        this.n = jSONObject.getString("image");
        this.o = jSONObject.getString("title");
        this.p = jSONObject.getString("description");
        this.q = du.a(jSONObject, ImagesContract.URL);
        this.r = du.a(jSONObject, "domain");
        this.s = (float) jSONObject.optDouble("aspect_ratio", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public String k() {
        return this.q;
    }

    public float o() {
        return this.s;
    }

    public String p() {
        return this.p;
    }

    public String q() {
        return this.r;
    }

    public String r() {
        return this.n;
    }

    public String s() {
        return this.o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CaptionedImageCard{mId='");
        sb.append(this.d);
        sb.append('\'');
        sb.append(", mViewed='");
        sb.append(this.e);
        sb.append('\'');
        sb.append(", mCreated='");
        sb.append(this.g);
        sb.append('\'');
        sb.append(", mUpdated='");
        sb.append(this.h);
        sb.append('\'');
        sb.append(", mImageUrl='");
        sb.append(this.n);
        sb.append('\'');
        sb.append(", mTitle='");
        sb.append(this.o);
        sb.append('\'');
        sb.append(", mDescription='");
        sb.append(this.p);
        sb.append('\'');
        sb.append(", mUrl='");
        sb.append(this.q);
        sb.append('\'');
        sb.append(", mDomain='");
        sb.append(this.r);
        sb.append('\'');
        sb.append(", mAspectRatio='");
        sb.append(this.s);
        sb.append('\'');
        sb.append("}");
        return sb.toString();
    }
}
