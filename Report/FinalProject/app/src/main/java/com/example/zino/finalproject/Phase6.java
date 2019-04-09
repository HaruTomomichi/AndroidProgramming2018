package com.example.zino.finalproject;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static android.view.Gravity.CENTER;


public class Phase6 extends AppCompatActivity {

    private TextView final_time;
    private TextView final_score;
    private TextView final_word;
    private EditText final_input;
    private MediaPlayer music4;
    private MediaPlayer music5;
    private MediaPlayer music6;
    private CountDownTimer countDownTimer;

    int score = 0;
    int hit = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phase6);

        LinearLayout layout6 = findViewById(R.id.layout6);
        AnimationDrawable animationDrawable = (AnimationDrawable) layout6.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        final_time = (TextView) findViewById(R.id.final_time);
        final_score = (TextView) findViewById(R.id.final_score);
        final_word = (TextView) findViewById(R.id.final_word);
        final_input = (EditText) findViewById(R.id.final_input);

        Intent intent = new Intent(this.getIntent());
        String s = intent.getStringExtra("name");
        TextView final_name = (TextView) findViewById(R.id.final_name);
        final_name.setText(s);

        music4 = MediaPlayer.create(this, R.raw.play);
        music4.setLooping(true);
        music5 = MediaPlayer.create(this, R.raw.coin);
        music6 = MediaPlayer.create(this, R.raw.combo);

        final Button start_button = (Button) findViewById(R.id.okay4);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_button.setVisibility(View.INVISIBLE);
                music4.start();
                time_start();
                game_start();
            }
        });
    }

    final private void time_start() {
        final_time.setText("100");

        countDownTimer = new CountDownTimer(100 * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                final_time.setText("" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                music4.stop();
                Intent intent = new Intent(Phase6.this, Phase7.class);
                intent.putExtra("score", score);
                startActivity(intent);
            }
        };
        countDownTimer.start();
    }

    final private void game_start() {

        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.showSoftInput(final_input, 0);
        final_input.setText("");

        final_score.setText(Integer.toString(score));

        List<String> words = new ArrayList<String>() {{
            add("놓치다");
            add("대기");
            add("독립");
            add("돌아보다");
            add("또다시");
            add("머릿속");
            add("북쪽");
            add("불안하다");
            add("쇠고기");
            add("위반");
            add("카드");
            add("평생");
            add("해당하다");
            add("간부");
            add("관념");
            add("굉장히");
            add("단어");
            add("덮다");
            add("도와주다");
            add("도입");
            add("몰다");
            add("배우");
            add("비추다");
            add("신발");
            add("앞서다");
            add("여건");
            add("오래전");
            add("자격");
            add("통제");
            add("계단");
            add("김치");
            add("끄덕이다");
            add("낯설다");
            add("높이");
            add("닮다");
            add("마음속");
            add("반영하다");
            add("성장하다");
            add("소속");
            add("연결되다");
            add("장사");
            add("제작");
            add("제한");
            add("차다");
            add("추진");
            add("취하다");
            add("한숨");
            add("헤어지다");
            add("구입하다");
            add("거짓말");
            add("비판적");
            add("뺏다");
            add("사전");
            add("서랍");
            add("소나기");
            add("소중하게");
            add("손잡이");
            add("수도꼭지");
            add("실례");
            add("싸구려");
            add("안녕");
            add("커피");
            add("안되다");
            add("약국");
            add("어찌나");
            add("엉터리");
            add("원숭이");
            add("연하다");
            add("위법");
            add("육체적");
            add("음력");
            add("이혼");
            add("일회용");
            add("잔디밭");
            add("저기");
            add("전문직");
            add("전화기");
            add("제출");
            add("지난주");
            add("진달래");
            add("찌다");
            add("차남");
            add("채점");
            add("침착하다");
            add("캄캄하다");
            add("타자기");
            add("팬티");
            add("편히");
            add("포인트");
            add("포크");
            add("한밤중");
            add("효도");
            add("가구");
            add("간호사");
            add("개나리");
            add("고등학생");
            add("골목길");
            add("관람객");
            add("귀가");
            add("그리워하다");
        }};
        Collections.shuffle(words);

        final String[] final_answer = new String[words.size()];

        final int i = (int) (Math.random() * 100);

        final_answer[i] = words.get(i);
        final_word.setText(final_answer[i]);

        final Button anal = (Button) findViewById(R.id.analysis);

        anal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (final_input.getText().toString().equals(final_answer[i]) && hit % 4 == 0 && hit != 0) {
                    score += 100;
                    hit++;
                    final_score.setText(Integer.toString(score));

                    music6.start();

                    Toast toast = Toast.makeText(getApplicationContext(), "정답! - 콤보 + 50", Toast.LENGTH_SHORT);

                    toast.setGravity(Gravity.BOTTOM,0,1080);
                    toast.show();

                    game_start();
                }
                else if (final_input.getText().toString().equals(final_answer[i])) {

                    score += 50;
                    hit++;
                    final_score.setText(Integer.toString(score));

                    music5.start();

                    Toast toast = Toast.makeText(getApplicationContext(), "정답!", Toast.LENGTH_SHORT);

                    toast.setGravity(Gravity.BOTTOM,0,1080);
                    toast.show();

                    game_start();
                }
                else {
                    hit = 0;
                    Toast toast = Toast.makeText(getApplicationContext(), "오답!", Toast.LENGTH_SHORT);

                    toast.setGravity(Gravity.BOTTOM,0,1080);
                    toast.show();

                    game_start();
                }
            }
        });
    }
}


