package com.rnandroidxdemo;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.rozpierog.prompt.PromptPackage;
import com.cmcewen.blurview.BlurViewPackage;
import com.razorpay.rn.RazorpayPackage;
import com.airbnb.android.react.maps.MapsPackage;
import com.facebook.CallbackManager;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.clipsub.rnbottomsheet.RNBottomSheetPackage;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import net.rhogan.rnsecurerandom.RNSecureRandomPackage;
import com.dieam.reactnativepushnotification.ReactNativePushNotificationPackage;
import com.rnfs.RNFSPackage;
import org.reactnative.camera.RNCameraPackage;
import com.reactnativecommunity.slider.ReactSliderPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new PromptPackage(),
            new BlurViewPackage(),
            new RazorpayPackage(),
            new MapsPackage(),
            new FBSDKPackage(CallbackManager.Factory.create()),
            new RNBottomSheetPackage(),
            new RNFetchBlobPackage(),
            new RNGestureHandlerPackage(),
            new VectorIconsPackage(),
            new RNSecureRandomPackage(),
            new ReactNativePushNotificationPackage(),
            new RNFSPackage(),
            new RNCameraPackage(),
            new ReactSliderPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
