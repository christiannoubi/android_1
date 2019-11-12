package mobile.project.de.myapplication;

import android.app.Application;

import androidx.annotation.Nullable;

public class HelloApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        //Logging stuff
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree(){
                @Override
                protected @Nullable String createStackElementTag (@NotNull StackTraceElement element) {
                    return super.createStackElementTag (element) + ":" + element.getLineNumber();
                }
            });
        }
    }
}
