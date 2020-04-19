package hitesh.asimplegame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import static hitesh.asimplegame.QuizDBOpenHelper.setDatabaseRandoming;

public class ResultActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);



		TextView textResult = (TextView) findViewById(R.id.textResult);
		Bundle b = getIntent().getExtras();
		int score = b.getInt("score");
        textResult.setText("Your score is " + " " + score + ". Thanks for playing my game.");
	}

	public void playagain(View o) {

		//다시시작시 데이터베이스 갱신
		setDatabaseRandoming();

		Intent intent = new Intent(this, QuestionActivity.class);
		startActivity(intent);
	}
}