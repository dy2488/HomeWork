package hitesh.asimplegame;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService3 extends Service {
    static boolean isplay;
    MediaPlayer mediaPlayer;
    public MyService3() {
    }

    @Override
    public void onCreate() {
        mediaPlayer= MediaPlayer.create(this, hitesh.asimplegame.R.raw.sound_bgm_gameover);
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(!isplay){
            mediaPlayer.start();
            isplay=mediaPlayer.isPlaying();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        mediaPlayer.stop();
        isplay=mediaPlayer.isPlaying();
        mediaPlayer.release();
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
