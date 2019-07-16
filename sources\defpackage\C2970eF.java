package defpackage;

import java.util.Map;

/* renamed from: eF reason: default package and case insensitive filesystem */
/* compiled from: MultiFormatWriter */
public final class C2970eF implements C3027hF {
    public C3268tF a(String str, C2421_E _e, int i, int i2, Map<C2459bF, ?> map) throws C3046iF {
        C3027hF hFVar;
        switch (C2951dF.a[_e.ordinal()]) {
            case 1:
                hFVar = new C2366XF();
                break;
            case 2:
                hFVar = new C2990fG();
                break;
            case 3:
                hFVar = new C2348WF();
                break;
            case 4:
                hFVar = new C2460bG();
                break;
            case 5:
                hFVar = new C3171oG();
                break;
            case 6:
                hFVar = new C2274SF();
                break;
            case 7:
                hFVar = new C2312UF();
                break;
            case 8:
                hFVar = new C2236QF();
                break;
            case 9:
                hFVar = new C2403ZF();
                break;
            case 10:
                hFVar = new C3009gG();
                break;
            case 11:
                hFVar = new C2198OF();
                break;
            case 12:
                hFVar = new C3368yF();
                break;
            case 13:
                hFVar = new C3065jF();
                break;
            default:
                StringBuilder sb = new StringBuilder("No encoder available for format ");
                sb.append(_e);
                throw new IllegalArgumentException(sb.toString());
        }
        return hFVar.a(str, _e, i, i2, map);
    }
}
