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
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                Log.i("interstitialads","ads loaded");
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
            }
        });
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
