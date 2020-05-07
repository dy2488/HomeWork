package hitesh.asimplegame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import androidx.annotation.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

public class GradeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_grade);
        super.onCreate(savedInstanceState);
        Button button1 = findViewById(R.id.easy);
        Button button2 = findViewById(R.id.medium);
        Button button3 = findViewById(R.id.hard);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GradeActivity.this,QuestionActivity.class);
//                inputStream=getResources().openRawResource(R.raw.grade);
//                try {
//                    properties.load(inputStream);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }finally {
//                    if(inputStream!=null){
//                        try {
//                            inputStream.close();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//                Bundle bundle =new Bundle();
//                bundle.putInt("x", Integer.parseInt(properties.getProperty("x")));
//                bundle.putInt("hint", Integer.parseInt(properties.getProperty("hint")));
//                intent.putExtras(bundle);
                stopService(new Intent(GradeActivity.this,MyService1.class));
                startActivity(intent);
                finish();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GradeActivity.this,QuestionActivity2.class);
                stopService(new Intent(GradeActivity.this,MyService1.class));

                startActivity(intent);
                finish();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GradeActivity.this,QuestionActivity3.class);
                stopService(new Intent(GradeActivity.this,MyService1.class));

                startActivity(intent);
                finish();
            }
        });
    }
}
