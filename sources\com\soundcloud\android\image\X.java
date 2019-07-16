package com.soundcloud.android.image;

@EVa(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0012J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/image/ImageUrlBuilder;", "", "apiUrlBuilder", "Lcom/soundcloud/android/api/ApiUrlBuilder;", "(Lcom/soundcloud/android/api/ApiUrlBuilder;)V", "buildUrl", "", "urlTemplate", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "apiImageSize", "Lcom/soundcloud/android/image/ApiImageSize;", "buildUrlFromTemplate", "imageResolverUrl", "Companion", "image_release"}, mv = {1, 1, 15})
/* compiled from: ImageUrlBuilder.kt */
public class X {
    public static final a a = new a(null);
    private final C2961dP b;

    /* compiled from: ImageUrlBuilder.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public X(C2961dP dPVar) {
        C7471uYa.b(dPVar, "apiUrlBuilder");
        this.b = dPVar;
    }

    public String a(String str, C3508cda cda, C3721b bVar) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(bVar, "apiImageSize");
        if (str != null) {
            return a(bVar, str);
        }
        if (!(!C7471uYa.a((Object) cda, (Object) C3508cda.a)) || cda.J()) {
            return null;
        }
        return a(cda, bVar);
    }

    private String a(C3508cda cda, C3721b bVar) {
        String a2 = this.b.a(C2226PO.IMAGES, cda, bVar.m).a();
        C7471uYa.a((Object) a2, "apiUrlBuilder\n          …\n                .build()");
        return a2;
    }

    private String a(C3721b bVar, String str) {
        C7162pxb pxb = new C7162pxb("\\{size\\}");
        String str2 = bVar.m;
        C7471uYa.a((Object) str2, "apiImageSize.sizeSpec");
        return pxb.a((CharSequence) str, str2);
    }
}
