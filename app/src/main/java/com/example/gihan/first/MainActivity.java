package com.example.gihan.first;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_activity_menu,menu);
        return true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"pause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"resume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"restart",Toast.LENGTH_LONG).show();
    }

    @Override
    public void finish() {
        super.finish();
        Toast.makeText(this,"finish",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"start",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"stop",Toast.LENGTH_LONG).show();
    }

    EditText firstName;
    EditText lastName;
    TextView fullName;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"destroy",Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.go_back)
        {Toast.makeText(this,"go back iscklicked",Toast.LENGTH_LONG).show();
            return true;
        }
        if(id==R.id.go_back)
        {Toast.makeText(this,"go back is clicked",Toast.LENGTH_LONG).show();
            return true;
        }
        if(id==R.id.save)
        {Toast.makeText(this,"save is clicked",Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void startActivityFromChild(@NonNull Activity child, Intent intent, int requestCode) {
        super.startActivityFromChild(child, intent, requestCode);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"create",Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
        firstName=(EditText) findViewById(R.id.first_edit_text);
        lastName=(EditText) findViewById(R.id.last_edit_text);
        fullName=(TextView) findViewById(R.id.full_text_view);
        Button login=(Button) findViewById(R.id.login_btn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("full name",fullName.toString());
                startActivity(intent);
            }
        });
    }

    public void putFullName(View view) {
        String fullNameEdit=firstName.getText().toString()+" "+lastName.getText().toString();
        fullName.setText(fullNameEdit);
    }

}
