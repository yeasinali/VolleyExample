package com.example.nayan.volleyexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    TextView nameTextView,User_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextView = (TextView) findViewById(R.id.name_text_view);
        User_name= (TextView) findViewById(R.id.Email_text_view);

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        String url = "http://hitechwebdesign.net/yeasin/mydata.php";

        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Users data = new  Gson().fromJson(response,Users.class);
                String name_data = data.getName();
                String Username = data.getUsername();
                nameTextView.setText(name_data);
                User_name.setText(Username);

//                try {
//                    JSONObject root = new JSONObject(response);
//                    String name = root.getString("name");
//                    nameTextView.setText(name);
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(request);



    }
}
