package com.example.abc.test18;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class Question extends AppCompatActivity {
    String text="With drooping heads and tremulous tails, they mashed their way through the thick mud, floundering and stumbling he between whiles, as if they were falling to pieces at the large joints. As often as the driver rested them and brought them to a stand, with a wary `Wo-ho! so-ho then!' the near leader violently shook his head and everything upon it--like an unusually emphatic horse, ";
    ImageButton btn1;
    ImageButton hidebtn;
    EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        editText1=(EditText)findViewById(R.id.edittext1);
        btn1=(ImageButton)findViewById(R.id.btn1) ;
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setVisibility(editText1.VISIBLE);
                hidebtn.setVisibility(hidebtn.VISIBLE);
            }
        });
        hidebtn=(ImageButton)findViewById(R.id.hidebtn) ;
        hidebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setVisibility(editText1.GONE);
                hidebtn.setVisibility(hidebtn.GONE);
            }
        });
        View item1=findViewById(R.id.item1);
        ExpandableTextView item1text=(ExpandableTextView)item1.findViewById(R.id.expand_text_view);
        item1text.setText(text);

        View item2=findViewById(R.id.item2);
        ExpandableTextView item2text=(ExpandableTextView)item2.findViewById(R.id.expand_text_view);
        item2text.setText(text);

        TextView Title=(TextView)findViewById(R.id.title);
        Title.setText("Question");
        ExpandableTextView Text=(ExpandableTextView)findViewById(R.id.expand_text_view);
        Text.setText(text);

        View item3=findViewById(R.id.item3);
        ExpandableTextView item3text=(ExpandableTextView)item3.findViewById(R.id.expand_text_view);
        item3text.setText(text);

        View item4=findViewById(R.id.item4);
        ExpandableTextView item4text=(ExpandableTextView)item4.findViewById(R.id.expand_text_view);
        item4text.setText(text);
    }
}
