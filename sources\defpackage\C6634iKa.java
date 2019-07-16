package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/soundcloud/android/waveform/WaveformParser;", "", "()V", "parse", "Lcom/soundcloud/android/waveform/ApiWaveform;", "data", "Ljava/io/InputStream;", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: iKa reason: default package and case insensitive filesystem */
/* compiled from: WaveformParser.kt */
public class C6634iKa {
    public static final a a = new a(null);

    /* renamed from: iKa$a */
    /* compiled from: WaveformParser.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C5325TJa a(InputStream inputStream) throws JSONException, IOException {
        C7471uYa.b(inputStream, "data");
        JSONObject jSONObject = new JSONObject(C6698jGa.a(inputStream));
        int i = jSONObject.getInt("width");
        int i2 = jSONObject.getInt("height");
        int[] iArr = new int[i];
        JSONArray jSONArray = jSONObject.getJSONArray("samples");
        if (jSONArray == null || jSONArray.length() == 0) {
            throw new IOException("no samples provided");
        } else if (jSONArray.length() == i) {
            for (int i3 = 0; i3 < i; i3++) {
                double d = (double) i2;
                iArr[i3] = (int) (d * Math.pow(jSONArray.getDouble(i3) / d, 1.5d));
            }
            return new C5325TJa(i2, iArr);
        } else {
            throw new IOException("incomplete sample data");
        }
    }
}
