package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by aruna on 1/1/18.
 */

public interface ApiInterface {

    @POST("readContact.php")
    Call<List<Contact>> getContacts();
}
