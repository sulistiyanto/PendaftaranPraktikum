package id.sulistiyanto.pendaftaranpraktikum;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
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
}
