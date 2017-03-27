package com.example.hoa.nguqua;

import android.graphics.Typeface;
import android.util.DisplayMetrics;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.input.sensor.orientation.OrientationData;
import org.andengine.opengl.font.Font;
import org.andengine.opengl.font.FontFactory;
import org.andengine.ui.IGameInterface;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.ui.activity.SimpleBaseGameActivity;

/**
 * Created by hoa on 27/03/2017.
 */

public class GameActivity extends SimpleBaseGameActivity {

    private Camera mCamera;
    private DisplayMetrics mDisplayMetrics;
    private int mWidth,mHeight;
    private Font mFont;

    @Override
    public EngineOptions onCreateEngineOptions() {
        mDisplayMetrics=getResources().getDisplayMetrics();

        mWidth=mDisplayMetrics.widthPixels;
        mHeight=mDisplayMetrics.heightPixels;
        mCamera =new Camera(0,0,mWidth,mHeight);
        EngineOptions engineOptions=new EngineOptions(true, ScreenOrientation.PORTRAIT_FIXED,new RatioResolutionPolicy(mWidth,mHeight),mCamera);
        return engineOptions;
    }

    @Override
    protected void onCreateResources() {
        mFont= FontFactory.create(getFontManager(),getTextureManager(),256,256, Typeface.create(Typeface.DEFAULT,Typeface.BOLD),32);
        mFont.load();
    }

    @Override
    protected Scene onCreateScene() {
        Scene mScene =new Scene();
        mScene.setBackground(new Background(0.09894f,0.6274f,0.8784f));

        return mScene;
    }
}
