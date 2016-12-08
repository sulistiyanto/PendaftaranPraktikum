package id.sulistiyanto.pendaftaranpraktikum;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by sulistiyanto on 07/12/16.
 */

public interface RegisterAPI {

    @FormUrlEncoded
    @POST("/insert.php")
    Call<Value> daftar(@Field("npm") String npm,
                       @Field("nama") String nama,
                       @Field("kelas") String kelas,
                       @Field("sesi") String sesi);

    @GET("/view.php")
    Call<Value> view();

    @FormUrlEncoded
    @POST("/update.php")
    Call<Value> ubah(@Field("npm") String npm,
                     @Field("nama") String nama,
                     @Field("kelas") String kelas,
                     @Field("sesi") String sesi);


    @FormUrlEncoded
    @POST("/delete.php")
    Call<Value> hapus(@Field("npm") String npm);
}
