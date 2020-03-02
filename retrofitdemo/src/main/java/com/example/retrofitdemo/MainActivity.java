package com.example.retrofitdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;

import com.example.retrofitdemo.domain.EmployeeResponse;
import com.example.retrofitdemo.rest.GetDataService;
import com.example.retrofitdemo.rest.RetrofitClientInstance;



