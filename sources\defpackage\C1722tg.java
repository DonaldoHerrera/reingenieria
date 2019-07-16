package defpackage;

import bo.app.bb;
import bo.app.df;
import bo.app.du;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* renamed from: tg reason: default package and case insensitive filesystem */
public final class C1722tg extends C1662rg {
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;

    public C1722tg(JSONObject jSONObject, bb bbVar, df dfVar) {
        super(jSONObject, bbVar, dfVar);
        this.n = jSONObject.getString("description");
        this.o = jSONObject.getString("image");
        this.p = du.a(jSONObject, "title");
        this.q = du.a(jSONObject, ImagesContract.URL);
        this.r = du.a(jSONObject, "domain");
    }

    public String k() {
        return this.q;
    }

    public String o() {
        return this.n;
    }

    public String p() {
        return this.r;
    }

    public String q() {
        return this.o;
    }

    public String r() {
        return this.p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShortNewsCard{mId='");
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
        sb.append(", mDescription='");
        sb.append(this.n);
        sb.append('\'');
        sb.append(", mImageUrl='");
        sb.append(this.o);
        sb.append('\'');
        sb.append(", mTitle='");
        sb.append(this.p);
        sb.append('\'');
        sb.append(", mUrl='");
        sb.append(this.q);
        sb.append('\'');
        sb.append(", mDomain='");
        sb.append(this.r);
        sb.append('\'');
        sb.append("}");
        return sb.toString();
    }
}
