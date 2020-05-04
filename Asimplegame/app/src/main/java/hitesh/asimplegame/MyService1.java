package hitesh.asimplegame;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyService1 extends Service {
    static boolean isPlay;
    MediaPlayer player;
    public MyService1() {
    }

    @Override
    public void onDestroy() {
        player.stop();
        isPlay=player.isPlaying();
        player.release();
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
            if(!isPlay){
                player.start();
                isPlay=player.isPlaying();
            }
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(this, hitesh.asimplegame.R.raw.sound_bgm_lobby);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
