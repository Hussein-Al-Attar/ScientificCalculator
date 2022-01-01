package com.example.cb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.ims.RcsUceAdapter;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.math.MathContext;
public class MainActivity extends AppCompatActivity {

    ListView listview;
    Spinner spinnerForm;
    Spinner spinnerTo;
    TextView textView;
    LinearLayout linearLayout;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  listview =(ListView)findViewById(R.id.listview);
        spinnerForm=(Spinner) findViewById(R.id.spinnerForm);
        spinnerTo=(Spinner) findViewById(R.id.spinnerTo);
        textView=(TextView) findViewById(R.id.text);
        linearLayout =(LinearLayout) findViewById(R.id.linearLayout);

        arrayList=new ArrayList();
        arrayList.add("normal");
        arrayList.add("binary");

        String SpinnerForm[]={"form Normal","form Binary","form Decimal","form Octal"};
        String SpinnerTo[]={"TO Normal","To Binary","To Decimal","To Octal"};

        ArrayAdapter arrayAdapterForm=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,SpinnerForm);
        ArrayAdapter arrayAdapterTo=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,SpinnerTo);

        spinnerForm.setAdapter(arrayAdapterForm);
        spinnerTo.setAdapter(arrayAdapterTo);

    }

    public void buEqul(View view) {
        String result="hvhvgv";
        Intent intent=new Intent(this,RseultActivity.class);
        intent.putExtra("result",result);
        startActivity(intent);

    }

    public void buA(View view) {
        textView.setText(textView.getText()+"A");
    }

    public void buB(View view) {
        textView.setText(textView.getText()+"B");
    }

    public void buC(View view) {
        textView.setText(textView.getText()+"C");
    }

    public void buAc(View view) {
        textView.setText("");
    }

    public void buD(View view) {
        textView.setText(textView.getText()+"D");
    }

    public void buE(View view) {
        textView.setText(textView.getText()+"E");
    }

    public void buF(View view) {
        textView.setText(textView.getText()+"F");
    }

    public void buMult(View view) {
        textView.setText(textView.getText()+"×");
    }

    public void bu7(View view) {
        textView.setText(textView.getText()+"7");
    }

    public void bu8(View view) {
        textView.setText(textView.getText()+"8");
    }

    public void bu9(View view) {
        textView.setText(textView.getText()+"9");
    }

    public void buDiv(View view) {
        textView.setText(textView.getText()+"÷");
    }

    public void bu4(View view) {
        textView.setText(textView.getText()+"4");
    }

    public void bu5(View view) {
        textView.setText(textView.getText()+"5");
    }

    public void bu6(View view) {
        textView.setText(textView.getText()+"6");
    }

     public void buSub(View view) {
         textView.setText(textView.getText()+"-");
    }

    public void bu1(View view) {
        textView.setText(textView.getText()+"1");
    }

    public void bu2(View view) {
        textView.setText(textView.getText()+"2");
    }

    public void bu3(View view) {
        textView.setText(textView.getText()+"3");
    }

    public void buPlus(View view) {
        textView.setText(textView.getText()+"+");
    }

    public void buPonit(View view) {
        int i;
        for ( i=0;i<textView.getText().length();i++)
        if(textView.getText().charAt(i)=='.'){
            Toast.makeText(this,"can not use point two",Toast.LENGTH_LONG).show();
            break;
        }
        if(i==textView.getText().length()) {
            textView.setText(textView.getText() + ".");
        }

    }

    public void buZero(View view) {
        textView.setText(textView.getText()+"0");
    }

    public void buClear(View view) {
       textView.setText(myMathod.deletListChar(textView.getText().toString()));
    }

    public void buEndBrikets(View view) {
        textView.setText(textView.getText()+")");
    }



    public void buStartBrikets(View view) {
        textView.setText(textView.getText()+"(");
    }
// menu code
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_t:{
                Intent intent=new Intent(this,Redevelop.class);
                startActivity(intent);
                Toast.makeText(getBaseContext(),"تم التحديث",Toast.LENGTH_LONG).show();}
            return true;
        }
        return false;


    }

    public void buSqrt(View view) {
    }
}