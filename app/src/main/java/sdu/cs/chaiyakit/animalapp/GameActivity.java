package sdu.cs.chaiyakit.animalapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class GameActivity extends AppCompatActivity {
    //Explicit ประกาศตัวแปร
    Button btn1, btn2, btn3, btn4;
    ImageView questionImageView;
    ImageButton volumeImageButton;
    MediaPlayer mediaPlayer; //ตัวแปรเอาไว้เล่นเสียง
    int questionCount = 10; //กำหนดจำนวนข้อ
    ArrayList<Integer> qid = new ArrayList<Integer>(); // ตัวแปรสำหรับ random ใช้ตัวนี้
    String answer; //ตัวแปรไว้เก็บคำตอบ
    int score = 0; //ตัวแปรไว้เก็บคะแนน

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //ผูกตัวแปรบนJava กับ ID บน XML
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        questionImageView = findViewById(R.id.imvQuestion);
        volumeImageButton = findViewById(R.id.imbVolume);

        //กำหนดคำสั่งในการ random โจทย์
        for (int i = 1; i <= questionCount; i++){
            qid.add(i); //จองพื้นที่หน่วยความจำ Memory

    }//end for
         Collections.shuffle(qid); //set การ random โจทย์
        setQuestion(qid.remove(0)); //เมื่อ random โจทย์แล้วให้ ให้ pop ออกจาก array


    }//end onCreate

    private void setQuestion(int qid) {// method setQuestion สำหรับแสดงคำถามนะ
        if (qid == 1) {
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.bird);//แสดงเสียงสัตว์ที่ตรงกับภาพ

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("นก");
            choice.add("วัว");
            choice.add("หมู");
            choice.add("ม้า");

            Collections.shuffle(choice);//กำหนดให้ random choice ***
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 2) {
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.cat);//แสดงเสียงสัตว์ที่ตรงกับภาพ

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("แมว");
            choice.add("นก");
            choice.add("แกะ");
            choice.add("ม้า");

            Collections.shuffle(choice);//กำหนดให้ random choice ***
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.cow);//แสดงเสียงสัตว์ที่ตรงกับภาพ

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("วัว");
            choice.add("แมว");
            choice.add("สิงโต");
            choice.add("หมา");

            Collections.shuffle(choice);//กำหนดให้ random choice ***
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 4) {
            answer = "หมา";
            questionImageView.setImageResource(R.drawable.dog);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.dog);//แสดงเสียงสัตว์ที่ตรงกับภาพ

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("หมา");
            choice.add("แมว");
            choice.add("ยุง");
            choice.add("ช้าง");

            Collections.shuffle(choice);//กำหนดให้ random choice ***
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant);//แสดงเสียงสัตว์ที่ตรงกับภาพ

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("ช้าง");
            choice.add("สิงโต");
            choice.add("นก");
            choice.add("ม้า");

            Collections.shuffle(choice);//กำหนดให้ random choice ***
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.horse);//แสดงเสียงสัตว์ที่ตรงกับภาพ

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("ม้า");
            choice.add("หมู");
            choice.add("แกะ");
            choice.add("แมว");

            Collections.shuffle(choice);//กำหนดให้ random choice ***
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 7) {
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.lion);//แสดงเสียงสัตว์ที่ตรงกับภาพ

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("สิงโต");
            choice.add("หมา");
            choice.add("ช้าง");
            choice.add("นก");

            Collections.shuffle(choice);//กำหนดให้ random choice ***
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 8) {
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito);//แสดงเสียงสัตว์ที่ตรงกับภาพ

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("ยุง");
            choice.add("สิงโต");
            choice.add("แกะ");
            choice.add("แมว");

            Collections.shuffle(choice);//กำหนดให้ random choice ***
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.pig);//แสดงเสียงสัตว์ที่ตรงกับภาพ

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("หมู");
            choice.add("หมา");
            choice.add("นก");
            choice.add("ช้าง");

            Collections.shuffle(choice);//กำหนดให้ random choice ***
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if

        if (qid == 10) {
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep);//แสดงรูปเงาที่เป็นคำถาม
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep);//แสดงเสียงสัตว์ที่ตรงกับภาพ

            ArrayList<String> choice = new ArrayList<String>();//ตัวแปร choice เป็น array สำหรับ random choice
            choice.add("แกะ");
            choice.add("ช้าง");
            choice.add("แมว");
            choice.add("สิงโต");

            Collections.shuffle(choice);//กำหนดให้ random choice ***
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }//end if
    }//end setQustion()method


    public void playSound(View view) {//เป็น method สำหรับแสดงเสียง
        mediaPlayer.start();
    }//end playSound() method

    public void choiceAns(View view) {//เป็น method สำหรับตรวจคำตอบและรวมคะแนน

        Button button = (Button) view;
        String buttonString = button.getText().toString();//เก็บข้อความบนปุ่มที่เลือก

        if (buttonString.equals(answer)) {//ถ้าคำตอบที่เลือกตรงกับ answer  //equals แปลว่า เท่ากันเปะๆ
            score ++;//ถ้าคำตอบถูก ก็เพิ่ม 1 คะแนนครับผม
        }

        if (qid.isEmpty()) {//ถ้าทำครบทุกข้าแล้ว  //empty = ว่าง
            //Toast.makeText(getApplicationContext(), "คุณได้ " + score + "คะแนน", Toast.LENGTH_SHORT).show();
            dialogboxScore();
        } else {//ถ้าทำไม่ครบ 10 ข้อ ก็ทำต่อสิ
            setQuestion(qid.remove(0));
        }

    }//end choiceAns() method

    private void dialogboxScore() { //แสดงคะแนนในรูป Dialogbox
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("คุณได้ " + score + " คะแนน ")
            .setCancelable(false)
            .setPositiveButton("เล่นอีกมะ ?", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            })
            .setNegativeButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }//end dialogboxScore()Method
}//end Class
