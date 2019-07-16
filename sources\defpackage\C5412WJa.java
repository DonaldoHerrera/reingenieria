package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;

@EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0017\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/soundcloud/android/waveform/WaveformFetchCommand;", "Lcom/soundcloud/android/commands/Command;", "", "Lcom/soundcloud/android/waveform/ApiWaveform;", "waveformHttpClient", "Lcom/soundcloud/android/waveform/WaveformHttpClient;", "waveformParser", "Lcom/soundcloud/android/waveform/WaveformParser;", "(Lcom/soundcloud/android/waveform/WaveformHttpClient;Lcom/soundcloud/android/waveform/WaveformParser;)V", "call", "waveformUrl", "WaveformFetchException", "base_release"}, mv = {1, 1, 15})
/* renamed from: WJa reason: default package and case insensitive filesystem */
/* compiled from: WaveformFetchCommand.kt */
public class C5412WJa extends C1255eT<String, C5325TJa> {
    private final C5470YJa a;
    private final C6634iKa b;

    /* renamed from: WJa$a */
    /* compiled from: WaveformFetchCommand.kt */
    public static final class a extends RuntimeException {
        public a(String str) {
            C7471uYa.b(str, "message");
            super(str);
        }

        public a(Throwable th) {
            C7471uYa.b(th, "t");
            super(th);
        }
    }

    public C5412WJa(C5470YJa yJa, C6634iKa ika) {
        C7471uYa.b(yJa, "waveformHttpClient");
        C7471uYa.b(ika, "waveformParser");
        this.a = yJa;
        this.b = ika;
    }

    public C5325TJa a(String str) {
        Cyb a2;
        C7471uYa.b(str, "waveformUrl");
        try {
            Ayb a3 = this.a.a(str);
            if (a3.h()) {
                a2 = a3.a();
                if (a2 != null) {
                    C7471uYa.a((Object) a2, "response.body() ?: throw…ponse with a empty body\")");
                    C6634iKa ika = this.b;
                    InputStream byteStream = a2.byteStream();
                    C7471uYa.a((Object) byteStream, "b.byteStream()");
                    C5325TJa a4 = ika.a(byteStream);
                    BXa.a(a2, null);
                    return a4;
                }
                throw new a("Successful response with a empty body");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid response code: ");
            sb.append(a3.d());
            throw new a(sb.toString());
        } catch (IOException e) {
            throw new a((Throwable) e);
        } catch (JSONException e2) {
            throw new a((Throwable) e2);
        } catch (Throwable th) {
            BXa.a(a2, r0);
            throw th;
        }
    }
}
