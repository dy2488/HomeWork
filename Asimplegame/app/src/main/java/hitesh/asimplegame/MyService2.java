package hitesh.asimplegame;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService2 extends Service {
    MediaPlayer mediaPlayer;
    static boolean isPlay;
    public MyService2() {
    }

    @Override
    public void onCreate() {
        mediaPlayer= MediaPlayer.create(this, hitesh.asimplegame.R.raw.sound_bgm_stage01);
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(!isPlay){
            mediaPlayer.start();
            isPlay=mediaPlayer.isPlaying();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        mediaPlayer.stop();
        isPlay=mediaPlayer.isPlaying();
        mediaPlayer.release();
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
