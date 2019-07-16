package defpackage;

import java.util.concurrent.Callable;

@EVa(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000  2\u00020\u0001:\u0002 !B9\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0012J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0012J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J@\u0010\u001b\u001a&\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00130\u0013 \u001d*\u0012\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u001c0\u001c*\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017H\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/soundcloud/android/waveform/WaveformOperations;", "", "waveformFetcher", "Lcom/soundcloud/android/waveform/WaveformFetchCommand;", "waveformStorage", "Lcom/soundcloud/android/waveform/WaveformStorage;", "waveformParser", "Lcom/soundcloud/android/waveform/WaveformParser;", "fileHelper", "Lcom/soundcloud/android/utilities/android/io/FileHelper;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/waveform/WaveformFetchCommand;Lcom/soundcloud/android/waveform/WaveformStorage;Lcom/soundcloud/android/waveform/WaveformParser;Lcom/soundcloud/android/utilities/android/io/FileHelper;Lcom/soundcloud/android/error/reporting/ErrorReporter;Lio/reactivex/Scheduler;)V", "clearWaveforms", "", "fetchAndStore", "Lio/reactivex/Single;", "Lcom/soundcloud/android/waveform/ApiWaveform;", "trackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "waveformUrl", "", "fetchDefault", "waveformDataFor", "Lcom/soundcloud/android/player/ui/waveform/WaveformData;", "toValidatedWaveform", "Lio/reactivex/Maybe;", "kotlin.jvm.PlatformType", "source", "key", "Companion", "InvalidWaveformDataException", "base_release"}, mv = {1, 1, 15})
/* renamed from: bKa reason: default package and case insensitive filesystem */
/* compiled from: WaveformOperations.kt */
public class C5630bKa {
    public static final a a = new a(null);
    private final C5412WJa b;
    /* access modifiers changed from: private */
    public final C6838lKa c;
    /* access modifiers changed from: private */
    public final C6634iKa d;
    /* access modifiers changed from: private */
    public final C6494gGa e;
    private final C3469VY f;
    private final HPa g;

    /* renamed from: bKa$a */
    /* compiled from: WaveformOperations.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: bKa$b */
    /* compiled from: WaveformOperations.kt */
    public static final class b extends Exception {
        public b(String str, String str2) {
            C7471uYa.b(str, "source");
            C7471uYa.b(str2, "trackUrn");
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid waveform from ");
            sb.append(str);
            sb.append(" : ");
            sb.append(str2);
            super(sb.toString());
        }
    }

    public C5630bKa(C5412WJa wJa, C6838lKa lka, C6634iKa ika, C6494gGa gga, C3469VY vy, HPa hPa) {
        C7471uYa.b(wJa, "waveformFetcher");
        C7471uYa.b(lka, "waveformStorage");
        C7471uYa.b(ika, "waveformParser");
        C7471uYa.b(gga, "fileHelper");
        C7471uYa.b(vy, "errorReporter");
        C7471uYa.b(hPa, "scheduler");
        this.b = wJa;
        this.c = lka;
        this.d = ika;
        this.e = gga;
        this.f = vy;
        this.g = hPa;
    }

    private IPa<C5325TJa> b(C3508cda cda, String str) {
        if (str == null) {
            return b();
        }
        IPa<C5325TJa> a2 = this.b.c(str).c((C6776kQa<? super T>) new C5698cKa<Object>(this, cda)).a(b());
        C7471uYa.a((Object) a2, "waveformFetcher.toSingle…esumeNext(fetchDefault())");
        return a2;
    }

    public IPa<com.soundcloud.android.player.ui.waveform.b> a(C3508cda cda, String str) {
        C7471uYa.b(cda, "trackUrn");
        IPa<com.soundcloud.android.player.ui.waveform.b> b2 = this.c.b(cda).a((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C6362eKa<Object,Object>(this, cda)).a((C7669xPa<? extends T>) b(cda, str).i()).a((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C6430fKa<Object,Object>(this, str)).h().e(C6498gKa.a).b(this.g);
        C7471uYa.a((Object) b2, "waveformStorage.waveform…  .subscribeOn(scheduler)");
        return b2;
    }

    private IPa<C5325TJa> b() {
        IPa<C5325TJa> c2 = IPa.c((Callable<? extends T>) new C6294dKa<Object>(this));
        C7471uYa.a((Object) c2, "Single.fromCallable { wa…T_WAVEFORM_ASSET_FILE)) }");
        return c2;
    }

    public void a() {
        this.c.a();
    }

    /* access modifiers changed from: private */
    public C7531vPa<C5325TJa> a(C5325TJa tJa, String str, String str2) {
        if (tJa.b != null) {
            return C7531vPa.c(tJa);
        }
        defpackage.C3469VY.a.a(this.f, new b(str, str2), null, 2, null);
        return C7531vPa.c();
    }
}
