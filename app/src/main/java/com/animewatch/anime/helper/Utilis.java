package com.animewatch.anime.helper;

import android.content.Context;
import android.util.Log;

import com.animewatch.anime.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import static android.provider.Settings.System.getString;

public class Utilis {
    private  InterstitialAd mInterstitialAd;

    public InterstitialAd getInterstitialObj() {
        return mInterstitialAd;
    }

    public void loadInterstitialAds(Context context){
        mInterstitialAd = new InterstitialAd(context);
        mInterstitialAd.setAdUnitId(context.getString(R.string.interstitial_ad_unit_id));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }

    public void showInterstitialAds(){
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }
    public boolean isLoaded(){
        if(mInterstitialAd.isLoaded())
            return true;
        return false;
    }
}
