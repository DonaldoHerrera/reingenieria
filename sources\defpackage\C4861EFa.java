package defpackage;

import com.google.android.gms.common.Scopes;
import com.google.common.base.Predicate;
import com.soundcloud.android.ia.h;
import java.util.Arrays;

/* renamed from: EFa reason: default package and case insensitive filesystem */
/* compiled from: Network */
public enum C4861EFa {
    APPLE_MUSIC("itunes_podcast", C4928GKa.c("iTunes Podcast"), h.favicon_applemusic),
    BANDCAMP("bandcamp", C4928GKa.c("Bandcamp"), h.favicon_bandcamp),
    BANDS_IN_TOWN("bandsintown", C4928GKa.c("Bandsintown"), h.favicon_bandsintown),
    DISCOGS("discogs", C4928GKa.c("Discogs"), h.favicon_discogs),
    EMAIL(Scopes.EMAIL, C4928GKa.a(), h.favicon_email),
    FACEBOOK("facebook", C4928GKa.c("Facebook"), h.favicon_fb),
    FLICKR("flickr", C4928GKa.c("Flickr"), h.favicon_flickr),
    GOOGLE_PLUS("google_plus", C4928GKa.c("Google+"), h.favicon_gplus),
    INSTAGRAM("instagram", C4928GKa.c("Instagram"), h.favicon_instagram),
    LASTFM("lastfm", C4928GKa.c("Last.fm"), h.favicon_lastfm),
    MIXCLOUD("mixcloud", C4928GKa.c("Mixcloud"), h.favicon_mixcloud),
    PINTEREST("pinterest", C4928GKa.c("Pinterest"), h.favicon_pinterest),
    RESIDENTADVISOR("residentadvisor", C4928GKa.c("Resident Advisor"), h.favicon_residentadvisor),
    REVERBNATION("reverbnation", C4928GKa.c("ReverbNation"), h.favicon_reverbnation),
    SONGKICK("songkick", C4928GKa.c("Songkick"), h.favicon_songkick),
    SOUNDCLOUD("soundcloud", C4928GKa.c("SoundCloud"), h.favicon_sc),
    SNAPCHAT("snapchat", C4928GKa.c("Snapchat"), h.favicon_snap),
    SPOTIFY("spotify", C4928GKa.c("Spotify"), h.favicon_spotify),
    TUMBLR("tumblr", C4928GKa.c("Tumblr"), h.favicon_tumblr),
    TWITTER("twitter", C4928GKa.c("Twitter"), h.favicon_twitter),
    VIMEO("vimeo", C4928GKa.c("Vimeo"), h.favicon_vimeo),
    YOUTUBE("youtube", C4928GKa.c("YouTube"), h.favicon_youtube),
    PERSONAL("personal", C4928GKa.a(), h.favicon_generic);
    
    private final int A;
    private final String y;
    private final C4928GKa<String> z;

    private C4861EFa(String str, C4928GKa<String> gKa, int i) {
        this.y = str;
        this.z = gKa;
        this.A = i;
    }

    static C4861EFa a(String str) {
        return (C4861EFa) C1943BD.a((Iterable<? extends T>) Arrays.asList(values()), (Predicate<? super T>) new C6425fFa<Object>(str), PERSONAL);
    }

    public int b() {
        return this.A;
    }

    public C4928GKa<String> a() {
        return this.z;
    }
}
